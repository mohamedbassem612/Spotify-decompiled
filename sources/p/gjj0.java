package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gjj0 {
    public final Context a;
    public String b;
    public String c;
    public int d;
    public byte e = 0;

    public gjj0(Context context) {
        this.a = context;
    }

    public static String b(wi20 wi20Var) {
        wi20Var.a();
        pj20 pj20Var = wi20Var.c;
        String str = pj20Var.e;
        if (str != null) {
            return str;
        }
        wi20Var.a();
        String str2 = pj20Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.b == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x001e, B:15:0x0024, B:17:0x0036, B:19:0x003c, B:24:0x0043, B:26:0x0056, B:28:0x005c, B:31:0x0061, B:33:0x0067, B:34:0x006b), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x001e, B:15:0x0024, B:17:0x0036, B:19:0x003c, B:24:0x0043, B:26:0x0056, B:28:0x005c, B:31:0x0061, B:33:0x0067, B:34:0x006b), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x0041, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x001e, B:15:0x0024, B:17:0x0036, B:19:0x003c, B:24:0x0043, B:26:0x0056, B:28:0x005c, B:31:0x0061, B:33:0x0067, B:34:0x006b), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x001e, B:15:0x0024, B:17:0x0036, B:19:0x003c, B:24:0x0043, B:26:0x0056, B:28:0x005c, B:31:0x0061, B:33:0x0067, B:34:0x006b), top: B:42:0x0001 }] */
    public final boolean c() {
        byte b;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            b = this.e;
            if (b == 0) {
                PackageManager packageManager = this.a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    b = 0;
                } else if (wyo1.j()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null) {
                        if (wyo1.j()) {
                            this.e = (byte) 2;
                            b = 2;
                        } else {
                            this.e = (byte) 1;
                            b = 1;
                        }
                    } else if (wyo1.j()) {
                        this.e = (byte) 2;
                        b = 2;
                    } else {
                        this.e = (byte) 1;
                        b = 1;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers == null && listQueryBroadcastReceivers.size() > 0) {
                            this.e = (byte) 2;
                            b = 2;
                        } else if (wyo1.j()) {
                            this.e = (byte) 2;
                            b = 2;
                        } else {
                            this.e = (byte) 1;
                            b = 1;
                        }
                    } else {
                        this.e = (byte) 1;
                        b = 1;
                    }
                }
            }
        }
        return b != 0;
    }

    public final synchronized void d() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.b = Integer.toString(packageInfo.versionCode);
            this.c = packageInfo.versionName;
        }
    }
}

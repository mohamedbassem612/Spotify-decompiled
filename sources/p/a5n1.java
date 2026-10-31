package p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a5n1 extends v7n1 {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public a5n1(v7y v7yVar, IBinder iBinder) {
        this.c = iBinder;
        this.d = v7yVar;
    }

    @Override // p.v7n1
    public final void b() {
        o7n1 k7n1Var;
        int length;
        byte b = this.b;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                c5n1 c5n1Var = (c5n1) ((v7y) obj).b;
                IBinder iBinder = (IBinder) obj2;
                c5n1Var.i.getClass();
                int i2 = m7n1.l;
                if (iBinder == null) {
                    k7n1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                    k7n1Var = iInterfaceQueryLocalInterface instanceof o7n1 ? (o7n1) iInterfaceQueryLocalInterface : new k7n1(iBinder);
                }
                c5n1Var.n = k7n1Var;
                u7n1 u7n1Var = c5n1Var.b;
                u7n1Var.b("linkToDeath", new Object[0]);
                try {
                    c5n1Var.n.asBinder().linkToDeath(c5n1Var.k, 0);
                } catch (RemoteException e) {
                    u7n1Var.a(e, "linkToDeath failed", new Object[0]);
                }
                c5n1Var.g = false;
                Iterator it = c5n1Var.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                c5n1Var.d.clear();
                break;
            default:
                Context context = (Context) obj2;
                bsd1 bsd1Var = ((y5n1) obj).c;
                u7n1 u7n1Var2 = d5n1.a;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        Signature[] signatureArr = packageInfo.signatures;
                        u7n1 u7n1Var3 = d5n1.a;
                        if (signatureArr == null || (length = signatureArr.length) == 0) {
                            Object[] objArr = new Object[0];
                            u7n1Var3.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                u7n1.c(u7n1Var3.a, "Play Store package is not signed -- possibly self-built package. Could not verify.", objArr);
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    String strJ = bzn1.j(signatureArr[i3].toByteArray());
                                    arrayList.add(strJ);
                                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strJ)) {
                                        String str = Build.TAGS;
                                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strJ)) {
                                            i3++;
                                        }
                                    }
                                    i = packageInfo.versionCode;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    Iterator it2 = arrayList.iterator();
                                    if (it2.hasNext()) {
                                        while (true) {
                                            sb.append((CharSequence) it2.next());
                                            if (it2.hasNext()) {
                                                sb.append((CharSequence) ", ");
                                            }
                                        }
                                    }
                                    String strF = f4i1.f("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "].");
                                    Object[] objArr2 = new Object[0];
                                    u7n1Var3.getClass();
                                    if (Log.isLoggable("PlayCore", 5)) {
                                        u7n1.c(u7n1Var3.a, strF, objArr2);
                                    }
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                bsd1Var.d(Integer.valueOf(i));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5n1(y5n1 y5n1Var, bsd1 bsd1Var, Context context) {
        super(bsd1Var);
        this.c = context;
        this.d = y5n1Var;
    }
}

package p;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class at7 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public at7(s19 s19Var) {
        this.a = (byte) 1;
        this.c = s19Var.a;
        this.b = s19Var.b;
        this.d = s19Var.c;
        this.e = s19Var.d;
        this.f = Long.valueOf(s19Var.e);
        this.g = Long.valueOf(s19Var.f);
        this.h = s19Var.g;
    }

    public static /* synthetic */ Handler a(at7 at7Var) {
        return (Handler) at7Var.e;
    }

    public s19 b() {
        String strConcat = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            strConcat = strConcat.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            strConcat = strConcat.concat(" tokenCreationEpochInSecs");
        }
        if (strConcat.isEmpty()) {
            return new s19(this.b, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.c, (String) this.d, (String) this.e, (String) this.h);
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    public void c() {
        int iA = ((cq21) this.d).a((Context) this.f);
        if (this.b != iA) {
            this.b = iA;
            ((xxu) ((thn) this.c).b).b(this, iA);
        }
    }

    public int d(int i) {
        return Integer.valueOf(String.format(vah.a, "%06X", Arrays.copyOf(new Object[]{Integer.valueOf(((Context) this.f).getColor(i) & 16777215)}, 1)), 16).intValue();
    }

    public void e(String str) {
        this.d = str;
    }

    public void f(long j) {
        this.f = Long.valueOf(j);
    }

    public void g(String str) {
        this.c = str;
    }

    public void h(String str) {
        this.h = str;
    }

    public void i(String str) {
        this.e = str;
    }

    public void j(int i) {
        if (i != 0) {
            this.b = i;
        } else {
            bhn0.i("Null registrationStatus");
        }
    }

    public void k(long j) {
        this.g = Long.valueOf(j);
    }

    public int l() {
        cq21 cq21Var = (cq21) this.d;
        Context context = (Context) this.f;
        this.b = cq21Var.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = cq21Var.a;
        if ((i & 1) != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            eq21 eq21Var = new eq21(this);
            this.h = eq21Var;
            connectivityManager.registerDefaultNetworkCallback(eq21Var);
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        jlb jlbVar = new jlb(this, (byte) 17);
        this.g = jlbVar;
        context.registerReceiver(jlbVar, intentFilter, null, (Handler) this.e);
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return ((h6b0) this.c) + " version=" + ((joj0) this.d);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ at7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.b = i;
    }

    public at7(String str, int i, String str2, Context context, v0x0 v0x0Var, v5n v5nVar) {
        this.a = (byte) 2;
        this.c = str;
        this.b = i;
        this.d = str2;
        this.f = context;
        this.e = v0x0Var;
        this.g = v5nVar;
        this.h = new idd1(new pr90(this, (byte) 16));
    }

    public at7(Context context, thn thnVar, cq21 cq21Var) {
        this.a = (byte) 4;
        this.f = context.getApplicationContext();
        this.c = thnVar;
        this.d = cq21Var;
        this.e = zoi1.s((Handler.Callback) null);
    }
}

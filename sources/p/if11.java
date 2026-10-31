package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class if11 extends rvh0 implements ServiceConnection {
    public static final /* synthetic */ int Q0 = 0;
    public df11 N0;
    public boolean O0;
    public jf11 P0;
    public final ArrayList X;
    public boolean Y;
    public boolean Z;
    public final ComponentName i;
    public final jim0 t;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public if11(Context context, ComponentName componentName) {
        super(context, new hod0(componentName, (byte) 13));
        this.X = new ArrayList();
        this.i = componentName;
        this.t = new jim0();
    }

    @Override // p.rvh0
    public final mvh0 b(String str, ovh0 ovh0Var) {
        if (str == null) {
            hhg1.n("initialMemberRouteId cannot be null.");
            return null;
        }
        jqd0 jqd0Var = this.g;
        if (jqd0Var != null) {
            List listV = jqd0Var.v();
            int size = listV.size();
            for (int i = 0; i < size; i++) {
                if (((gvh0) listV.get(i)).g().equals(str)) {
                    gf11 gf11Var = new gf11(this, str, ovh0Var);
                    this.X.add(gf11Var);
                    if (this.O0) {
                        gf11Var.c(this.N0);
                    }
                    m();
                    return gf11Var;
                }
            }
        }
        return null;
    }

    @Override // p.rvh0
    public final nvh0 d(String str, String str2) {
        if (str == null) {
            hhg1.n("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return j(str, str2, ovh0.b);
        }
        hhg1.n("routeGroupId cannot be null");
        return null;
    }

    @Override // p.rvh0
    public final nvh0 e(String str, ovh0 ovh0Var) {
        if (str != null) {
            return j(str, null, ovh0Var);
        }
        hhg1.n("routeId cannot be null");
        return null;
    }

    @Override // p.rvh0
    public final void f(hvh0 hvh0Var) {
        if (this.O0) {
            df11 df11Var = this.N0;
            int i = df11Var.d;
            df11Var.d = i + 1;
            df11Var.b(10, i, 0, hvh0Var != null ? hvh0Var.a : null, null);
        }
        m();
    }

    public final void i() {
        if (this.Z) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.i);
        try {
            this.Z = this.a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final hf11 j(String str, String str2, ovh0 ovh0Var) {
        jqd0 jqd0Var = this.g;
        if (jqd0Var == null) {
            return null;
        }
        List listV = jqd0Var.v();
        int size = listV.size();
        for (int i = 0; i < size; i++) {
            if (((gvh0) listV.get(i)).g().equals(str)) {
                hf11 hf11Var = new hf11(this, str, str2, ovh0Var);
                this.X.add(hf11Var);
                if (this.O0) {
                    hf11Var.c(this.N0);
                }
                m();
                return hf11Var;
            }
        }
        return null;
    }

    public final void k() {
        if (this.N0 != null) {
            g(null);
            this.O0 = false;
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ef11) arrayList.get(i)).b();
            }
            df11 df11Var = this.N0;
            df11Var.b(2, 0, 0, null, null);
            df11Var.b.a();
            df11Var.a.getBinder().unlinkToDeath(df11Var, 0);
            df11Var.i.t.post(new cf11(df11Var, (byte) 0));
            this.N0 = null;
        }
    }

    public final void l() {
        if (this.Z) {
            this.Z = false;
            k();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    public final void m() {
        boolean zIsEmpty;
        if (this.Y) {
            zIsEmpty = true;
            if (this.e == null) {
                zIsEmpty = true ^ this.X.isEmpty();
            }
        } else {
            zIsEmpty = false;
        }
        if (zIsEmpty) {
            i();
        } else {
            l();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.Z) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!mmo1.I(messenger)) {
                toString();
                return;
            }
            df11 df11Var = new df11(this, messenger);
            int i = df11Var.d;
            df11Var.d = i + 1;
            df11Var.g = i;
            if (df11Var.b(1, i, 4, null, null)) {
                try {
                    df11Var.a.getBinder().linkToDeath(df11Var, 0);
                    this.N0 = df11Var;
                } catch (RemoteException unused) {
                    df11Var.binderDied();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k();
    }

    public final String toString() {
        return "Service connection " + this.i.flattenToShortString();
    }
}

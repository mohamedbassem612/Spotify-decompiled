package p;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sgp1 extends px40 {
    public static final pue0 T = new pue0("CastClientImpl", (String) null);
    public static final Object U = new Object();
    public static final Object V = new Object();
    public yz5 B;
    public final CastDevice C;
    public final zdp1 D;
    public final HashMap E;
    public final Bundle F;
    public efp1 G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public double L;
    public kkn1 M;
    public int N;
    public int O;
    public String P;
    public String Q;
    public Bundle R;
    public final HashMap S;

    public sgp1(Context context, Looper looper, d520 d520Var, CastDevice castDevice, zdp1 zdp1Var, Bundle bundle, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 10, d520Var, h8n1Var, h8n1Var2);
        this.C = castDevice;
        this.D = zdp1Var;
        this.F = bundle;
        this.E = new HashMap();
        new AtomicLong(0L);
        this.S = new HashMap();
        this.N = -1;
        this.O = -1;
        this.B = null;
        this.H = null;
        this.L = 0.0d;
        T();
        this.I = false;
        this.M = null;
        T();
    }

    public final void T() {
        CastDevice castDevice = this.C;
        zod.t(castDevice, "device should not be null");
        ho41 ho41Var = castDevice.i;
        if (ho41Var.c(2048) || !ho41Var.c(4) || ho41Var.c(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }

    public final void U() {
        T.a("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap map = this.E;
        synchronized (map) {
            map.clear();
        }
    }

    public final void V(int i, long j) {
        zaa zaaVar;
        HashMap map = this.S;
        synchronized (map) {
            zaaVar = (zaa) map.remove(Long.valueOf(j));
        }
        if (zaaVar != null) {
            zaaVar.a(new Status(i, (String) null, (PendingIntent) null, (lal) null));
        }
    }

    public final void W(int i) {
        synchronized (V) {
        }
    }

    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof cgn1 ? (cgn1) iInterfaceQueryLocalInterface : new cgn1(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Object[] objArr = {this.G, Boolean.valueOf(u())};
        pue0 pue0Var = T;
        pue0Var.a("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        efp1 efp1Var = this.G;
        sgp1 sgp1Var = null;
        this.G = null;
        if (efp1Var != null) {
            sgp1 sgp1Var2 = (sgp1) efp1Var.l.getAndSet(null);
            if (sgp1Var2 != null) {
                sgp1Var2.N = -1;
                sgp1Var2.O = -1;
                sgp1Var2.B = null;
                sgp1Var2.H = null;
                sgp1Var2.L = 0.0d;
                sgp1Var2.T();
                sgp1Var2.I = false;
                sgp1Var2.M = null;
                sgp1Var = sgp1Var2;
            }
            if (sgp1Var != null) {
                U();
                try {
                    try {
                        cgn1 cgn1Var = (cgn1) n();
                        hi5 hi5VarA = oho1.A();
                        Parcel parcelA1 = cgn1Var.a1();
                        osn1.b(parcelA1, hi5VarA);
                        cgn1Var.d1(1, parcelA1);
                    } catch (RemoteException | IllegalStateException unused) {
                        pue0Var.b("Error while disconnecting the controller interface", new Object[0]);
                    }
                    return;
                } finally {
                    super/*p.xaa*/.c();
                }
            }
        }
        pue0Var.a("already disposed, so short-circuiting", new Object[0]);
    }

    public final Bundle g() {
        Bundle bundle = this.R;
        if (bundle == null) {
            return null;
        }
        this.R = null;
        return bundle;
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        T.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[]{this.P, this.Q});
        CastDevice castDevice = this.C;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        Bundle bundle2 = this.F;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        efp1 efp1Var = new efp1(this);
        this.G = efp1Var;
        bundle.putParcelable("listener", new BinderWrapper(efp1Var));
        String str = this.P;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.Q;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    public final int l() {
        return 12800000;
    }

    public final String o() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(lal lalVar) {
        super/*p.xaa*/.w(lalVar);
        U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(int i, IBinder iBinder, Bundle bundle, int i2) {
        T.a("in onPostInitHandler; statusCode=%d", new Object[]{Integer.valueOf(i)});
        if (i == 0 || i == 2300) {
            this.J = true;
            this.K = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.R = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super/*p.xaa*/.y(i, iBinder, bundle, i2);
    }
}

package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vqn1 extends fwh0 {
    public static final pue0 d = new pue0("MediaRouterCallback", null);
    public final dqn1 a;
    public final fsn1 b;
    public final ytn1 c;

    public vqn1(dqn1 dqn1Var, fsn1 fsn1Var, ytn1 ytn1Var) {
        zod.s(dqn1Var);
        this.a = dqn1Var;
        this.b = fsn1Var;
        this.c = ytn1Var;
    }

    @Override // p.fwh0
    public final void d(owh0 owh0Var, lwh0 lwh0Var) {
        try {
            dqn1 dqn1Var = this.a;
            String str = lwh0Var.c;
            Bundle bundle = lwh0Var.s;
            Parcel parcelA1 = dqn1Var.a1();
            parcelA1.writeString(str);
            osn1.b(parcelA1, bundle);
            dqn1Var.c1(1, parcelA1);
        } catch (RemoteException unused) {
            d.b("Unable to call %s on %s.", "onRouteAdded", dqn1.class.getSimpleName());
        }
        l(owh0Var);
    }

    @Override // p.fwh0
    public final void e(owh0 owh0Var, lwh0 lwh0Var) {
        if (lwh0Var.f()) {
            try {
                dqn1 dqn1Var = this.a;
                String str = lwh0Var.c;
                Bundle bundle = lwh0Var.s;
                Parcel parcelA1 = dqn1Var.a1();
                parcelA1.writeString(str);
                osn1.b(parcelA1, bundle);
                dqn1Var.c1(2, parcelA1);
            } catch (RemoteException unused) {
                d.b("Unable to call %s on %s.", "onRouteChanged", dqn1.class.getSimpleName());
            }
            l(owh0Var);
        }
    }

    @Override // p.fwh0
    public final void f(lwh0 lwh0Var, lwh0 lwh0Var2) {
        int i = lwh0Var.l;
        String str = lwh0Var.c;
        pue0 pue0Var = d;
        if (i != 1) {
            pue0Var.c("ignore onRouteConnected for non-remote connected routeId: %s", str);
            return;
        }
        pue0Var.c("onRouteConnected with connectedRouteId = %s", str);
        this.b.r = true;
        try {
            dqn1 dqn1Var = this.a;
            Parcel parcelB1 = dqn1Var.b1(7, dqn1Var.a1());
            int i2 = parcelB1.readInt();
            parcelB1.recycle();
            String str2 = lwh0Var2.c;
            if (i2 >= 251600000) {
                Bundle bundle = lwh0Var.s;
                Parcel parcelA1 = dqn1Var.a1();
                parcelA1.writeString(str2);
                parcelA1.writeString(str);
                osn1.b(parcelA1, bundle);
                dqn1Var.c1(9, parcelA1);
                return;
            }
            Bundle bundle2 = lwh0Var.s;
            Parcel parcelA2 = dqn1Var.a1();
            parcelA2.writeString(str2);
            parcelA2.writeString(str);
            osn1.b(parcelA2, bundle2);
            dqn1Var.c1(8, parcelA2);
        } catch (RemoteException unused) {
            pue0Var.b("Unable to call %s on %s.", "onRouteConnected", dqn1.class.getSimpleName());
        }
    }

    @Override // p.fwh0
    public final void g(lwh0 lwh0Var, lwh0 lwh0Var2, int i) {
        String str = lwh0Var2.c;
        pue0 pue0Var = d;
        if (lwh0Var != null) {
            String str2 = lwh0Var.c;
            if (lwh0Var.l == 1) {
                pue0Var.c("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str2, str, Integer.valueOf(i));
                this.b.r = false;
                try {
                    dqn1 dqn1Var = this.a;
                    Parcel parcelB1 = dqn1Var.b1(7, dqn1Var.a1());
                    int i2 = parcelB1.readInt();
                    parcelB1.recycle();
                    if (i2 < 251600000) {
                        Bundle bundle = lwh0Var.s;
                        Parcel parcelA1 = dqn1Var.a1();
                        parcelA1.writeString(str2);
                        osn1.b(parcelA1, bundle);
                        parcelA1.writeInt(i);
                        dqn1Var.c1(6, parcelA1);
                        return;
                    }
                    Bundle bundle2 = lwh0Var.s;
                    Parcel parcelA2 = dqn1Var.a1();
                    parcelA2.writeString(str);
                    parcelA2.writeString(str2);
                    osn1.b(parcelA2, bundle2);
                    parcelA2.writeInt(i);
                    dqn1Var.c1(10, parcelA2);
                    return;
                } catch (RemoteException unused) {
                    pue0Var.b("Unable to call %s on %s.", "onRouteDisconnected", dqn1.class.getSimpleName());
                    return;
                }
            }
        }
        pue0Var.c("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]);
    }

    @Override // p.fwh0
    public final void h(owh0 owh0Var, lwh0 lwh0Var) {
        try {
            dqn1 dqn1Var = this.a;
            String str = lwh0Var.c;
            Bundle bundle = lwh0Var.s;
            Parcel parcelA1 = dqn1Var.a1();
            parcelA1.writeString(str);
            osn1.b(parcelA1, bundle);
            dqn1Var.c1(3, parcelA1);
        } catch (RemoteException unused) {
            d.b("Unable to call %s on %s.", "onRouteRemoved", dqn1.class.getSimpleName());
        }
        l(owh0Var);
    }

    @Override // p.fwh0
    public final void i(owh0 owh0Var, lwh0 lwh0Var, int i, lwh0 lwh0Var2) {
        int i2 = lwh0Var.l;
        String str = lwh0Var.c;
        pue0 pue0Var = d;
        if (i2 != 1) {
            pue0Var.c("ignore onRouteSelected for non-remote selected routeId: %s", str);
            return;
        }
        pue0Var.c("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), str);
        try {
            dqn1 dqn1Var = this.a;
            Parcel parcelB1 = dqn1Var.b1(7, dqn1Var.a1());
            int i3 = parcelB1.readInt();
            parcelB1.recycle();
            if (i3 >= 220400000) {
                String str2 = lwh0Var2.c;
                Bundle bundle = lwh0Var.s;
                Parcel parcelA1 = dqn1Var.a1();
                parcelA1.writeString(str2);
                parcelA1.writeString(str);
                osn1.b(parcelA1, bundle);
                dqn1Var.c1(8, parcelA1);
            } else {
                String str3 = lwh0Var2.c;
                Bundle bundle2 = lwh0Var.s;
                Parcel parcelA2 = dqn1Var.a1();
                parcelA2.writeString(str3);
                osn1.b(parcelA2, bundle2);
                dqn1Var.c1(4, parcelA2);
            }
        } catch (RemoteException unused) {
            pue0Var.b("Unable to call %s on %s.", "onRouteSelected", dqn1.class.getSimpleName());
        }
        l(owh0Var);
    }

    @Override // p.fwh0
    public final void k(owh0 owh0Var, lwh0 lwh0Var, int i) {
        int i2 = lwh0Var.l;
        String str = lwh0Var.c;
        pue0 pue0Var = d;
        if (i2 != 1) {
            pue0Var.c("ignore onRouteUnselected for non-remote routeId: %s", str);
            return;
        }
        pue0Var.c("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), str);
        try {
            dqn1 dqn1Var = this.a;
            Bundle bundle = lwh0Var.s;
            Parcel parcelA1 = dqn1Var.a1();
            parcelA1.writeString(str);
            osn1.b(parcelA1, bundle);
            parcelA1.writeInt(i);
            dqn1Var.c1(6, parcelA1);
        } catch (RemoteException unused) {
            pue0Var.b("Unable to call %s on %s.", "onRouteUnselected", dqn1.class.getSimpleName());
        }
        l(owh0Var);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    public final void l(owh0 owh0Var) {
        b4e b4eVar;
        ytn1 ytn1Var = this.c;
        if (ytn1Var != null && ytn1Var.e && ytn1Var.a.Q0) {
            wf61 wf61Var = ytn1Var.f;
            if (wf61Var != null) {
                zod.n("Must be called from the main thread.");
                ca61 ca61VarC = wf61Var.c();
                if (ca61VarC == null || !(ca61VarC instanceof b4e)) {
                    b4eVar = null;
                } else {
                    b4eVar = (b4e) ca61VarC;
                }
            } else {
                b4eVar = null;
            }
            if (b4eVar == null) {
                owh0.g(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            owh0.b();
            for (lwh0 lwh0Var : owh0.c().i) {
                if (CastDevice.F(lwh0Var.s) != null) {
                    yr31 yr31Var = new yr31(lwh0Var.c);
                    yr31Var.m();
                    arrayList.add(yr31Var.a());
                }
            }
            ytn1.g.a("updateRouteListingPreference with %d available routes", Integer.valueOf(arrayList.size()));
            jqd0 jqd0Var = new jqd0();
            jqd0Var.A(arrayList);
            owh0.g(jqd0Var.j());
        }
    }
}

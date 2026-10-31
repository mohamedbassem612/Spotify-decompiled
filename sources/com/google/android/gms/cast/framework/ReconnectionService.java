package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p.b3e;
import p.iln1;
import p.jbn1;
import p.jnn1;
import p.osn1;
import p.pon1;
import p.pue0;
import p.qfp0;
import p.rjn1;
import p.tpn1;
import p.vh70;
import p.wf61;
import p.xon1;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class ReconnectionService extends Service {
    public static final pue0 b = new pue0("ReconnectionService", (String) null);
    public jnn1 a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        jnn1 jnn1Var = this.a;
        if (jnn1Var != null) {
            try {
                iln1 iln1Var = (iln1) jnn1Var;
                Parcel parcelA1 = iln1Var.a1();
                osn1.b(parcelA1, intent);
                Parcel parcelB1 = iln1Var.b1(3, parcelA1);
                IBinder strongBinder = parcelB1.readStrongBinder();
                parcelB1.recycle();
                return strongBinder;
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", new Object[]{"onBind", jnn1.class.getSimpleName()});
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        vh70 vh70VarB1;
        vh70 vh70VarB2;
        b3e b3eVarA = b3e.a(this);
        b3eVarA.getClass();
        zod.n("Must be called from the main thread.");
        wf61 wf61Var = b3eVarA.b;
        wf61Var.getClass();
        jnn1 jnn1VarI1 = null;
        try {
            pon1 pon1Var = wf61Var.a;
            Parcel parcelB1 = pon1Var.b1(7, pon1Var.a1());
            vh70VarB1 = qfp0.b1(parcelB1.readStrongBinder());
            parcelB1.recycle();
        } catch (RemoteException unused) {
            wf61.c.b("Unable to call %s on %s.", new Object[]{"getWrappedThis", pon1.class.getSimpleName()});
            vh70VarB1 = null;
        }
        zod.n("Must be called from the main thread.");
        jbn1 jbn1Var = b3eVarA.c;
        jbn1Var.getClass();
        try {
            rjn1 rjn1Var = jbn1Var.a;
            Parcel parcelB2 = rjn1Var.b1(5, rjn1Var.a1());
            vh70VarB2 = qfp0.b1(parcelB2.readStrongBinder());
            parcelB2.recycle();
        } catch (RemoteException unused2) {
            jbn1.b.b("Unable to call %s on %s.", new Object[]{"getWrappedThis", rjn1.class.getSimpleName()});
            vh70VarB2 = null;
        }
        pue0 pue0Var = xon1.a;
        if (vh70VarB1 != null && vh70VarB2 != null) {
            try {
                jnn1VarI1 = xon1.b(getApplicationContext()).i1(new qfp0(this), vh70VarB1, vh70VarB2);
            } catch (RemoteException | ModuleUnavailableException unused3) {
                xon1.a.b("Unable to call %s on %s.", new Object[]{"newReconnectionServiceImpl", tpn1.class.getSimpleName()});
            }
        }
        this.a = jnn1VarI1;
        if (jnn1VarI1 != null) {
            try {
                iln1 iln1Var = (iln1) jnn1VarI1;
                iln1Var.c1(1, iln1Var.a1());
            } catch (RemoteException unused4) {
                b.b("Unable to call %s on %s.", new Object[]{"onCreate", jnn1.class.getSimpleName()});
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        jnn1 jnn1Var = this.a;
        if (jnn1Var != null) {
            try {
                iln1 iln1Var = (iln1) jnn1Var;
                iln1Var.c1(4, iln1Var.a1());
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", new Object[]{"onDestroy", jnn1.class.getSimpleName()});
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        jnn1 jnn1Var = this.a;
        if (jnn1Var != null) {
            try {
                iln1 iln1Var = (iln1) jnn1Var;
                Parcel parcelA1 = iln1Var.a1();
                osn1.b(parcelA1, intent);
                parcelA1.writeInt(i);
                parcelA1.writeInt(i2);
                Parcel parcelB1 = iln1Var.b1(2, parcelA1);
                int i3 = parcelB1.readInt();
                parcelB1.recycle();
                return i3;
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", new Object[]{"onStartCommand", jnn1.class.getSimpleName()});
            }
        }
        return 2;
    }
}

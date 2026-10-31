package p;

import android.os.Bundle;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class egs0 extends hab0 implements iu30 {
    public static final egs0 N0;
    public static final egs0 O0;
    public static final egs0 P0;
    public static final egs0 Q0;
    public static final egs0 R0;
    public static final egs0 S0;
    public static final egs0 T0;
    public static final egs0 U0;
    public static final egs0 V0;
    public static final egs0 W0;
    public static final egs0 X;
    public static final egs0 X0;
    public static final egs0 Y;
    public static final egs0 Y0;
    public static final egs0 Z;
    public static final egs0 Z0;
    public static final egs0 a1;
    public static final egs0 b;
    public static final egs0 b1;
    public static final egs0 c;
    public static final egs0 c1;
    public static final egs0 d;
    public static final egs0 d1;
    public static final egs0 e;
    public static final egs0 e1;
    public static final egs0 f;
    public static final egs0 g;
    public static final egs0 h;
    public static final egs0 i;
    public static final egs0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new egs0(i2, (byte) 0);
        c = new egs0(i2, (byte) 1);
        d = new egs0(i2, (byte) 2);
        e = new egs0(i2, (byte) 3);
        f = new egs0(i2, (byte) 4);
        g = new egs0(i2, (byte) 5);
        h = new egs0(i2, (byte) 6);
        i = new egs0(i2, (byte) 7);
        t = new egs0(i2, (byte) 8);
        X = new egs0(i2, (byte) 9);
        Y = new egs0(i2, (byte) 10);
        Z = new egs0(i2, (byte) 11);
        N0 = new egs0(i2, (byte) 12);
        O0 = new egs0(i2, (byte) 13);
        P0 = new egs0(i2, (byte) 14);
        Q0 = new egs0(i2, (byte) 15);
        R0 = new egs0(i2, (byte) 16);
        S0 = new egs0(i2, (byte) 17);
        T0 = new egs0(i2, (byte) 18);
        U0 = new egs0(i2, (byte) 19);
        V0 = new egs0(i2, (byte) 20);
        W0 = new egs0(i2, (byte) 21);
        X0 = new egs0(i2, (byte) 22);
        Y0 = new egs0(i2, (byte) 23);
        Z0 = new egs0(i2, (byte) 24);
        a1 = new egs0(i2, (byte) 25);
        b1 = new egs0(i2, (byte) 26);
        c1 = new egs0(i2, (byte) 27);
        d1 = new egs0(i2, (byte) 28);
        e1 = new egs0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egs0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        b1t0 parcelable;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                evs0 evs0VarK = ((kb61) obj).K();
                ReentrantLock reentrantLock = evs0VarK.f;
                reentrantLock.lock();
                try {
                    if (evs0VarK.d != null) {
                        z = false;
                    }
                    if (z) {
                        n57.e("Called outside of the lifecycle");
                    }
                    CompletableFromAction completableFromAction = new CompletableFromAction(new cvs0(evs0VarK, (byte) 0));
                    w9u0 w9u0Var = evs0VarK.d;
                    w9u0Var.getClass();
                    evs0VarK.e.a(completableFromAction.c(w9u0Var.a(new d9u0("PiPPlayerService", false)).ignoreElement()).subscribe());
                    return rih1Var;
                } finally {
                    reentrantLock.unlock();
                }
            case 1:
                evs0 evs0VarK2 = ((kb61) obj).K();
                ReentrantLock reentrantLock2 = evs0VarK2.f;
                reentrantLock2.lock();
                try {
                    if (evs0VarK2.d != null) {
                        z = false;
                    }
                    if (z) {
                        n57.e("Called outside of the lifecycle");
                    }
                    evs0VarK2.e.a(evs0VarK2.a(-15000, new dvs0(evs0VarK2, (byte) 0)).subscribe());
                    return rih1Var;
                } finally {
                    reentrantLock2.unlock();
                }
            case 2:
                evs0 evs0VarK3 = ((kb61) obj).K();
                ReentrantLock reentrantLock3 = evs0VarK3.f;
                reentrantLock3.lock();
                try {
                    if (evs0VarK3.d == null) {
                        n57.e("Called outside of the lifecycle");
                    }
                    evs0VarK3.e.a(evs0VarK3.a(15000, new dvs0(evs0VarK3, (byte) 1)).subscribe());
                    return rih1Var;
                } finally {
                    reentrantLock3.unlock();
                }
            case 3:
                c1y c1yVarG = ((kb61) obj).g();
                aod aodVar = c1yVarG.b;
                l0l l0lVarC = c1yVarG.c.c();
                String str = (l0lVarC == null || l0lVarC.l()) ? "local_device" : l0lVarC.G().a;
                i8h1 i8h1Var = (i8h1) aodVar.b;
                g5l0 g5l0Var = (g5l0) aodVar.c;
                x6h1 x6h1VarC = g5l0Var.c.c();
                x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("change_segment_action", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC2.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null);
                c1yVarG.d.b(zq51.a(c1yVarG.a).subscribe(ps4.X, dxu.i));
                return rih1Var;
            case 4:
                ((r2t) obj).a().b();
                return rih1Var;
            case 5:
                rgs0 rgs0Var = (rgs0) obj;
                ArrayList arrayList = rgs0Var.b;
                return !arrayList.isEmpty() ? new tgs0(rgs0Var.a, arrayList, rgs0Var.c) : sgs0.a;
            case 6:
                return rih1Var;
            case 7:
                return new nis0((lis0) obj, false, false);
            case 8:
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                return mms0.a;
            case 11:
                return vrs0.a;
            case 12:
                return new rus0(((lus0) obj).a, "", "", "", "", "", "", false, false, false);
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                b261.c((e261) obj);
                return rih1Var;
            case 15:
                b261.c((e261) obj);
                return rih1Var;
            case 16:
                b261.c((e261) obj);
                return rih1Var;
            case 17:
                Bundle bundle = (Bundle) obj;
                return (bundle == null || (parcelable = bundle.getParcelable("pin_gate_model")) == null) ? new b1t0(g1t0.a) : parcelable;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("pin_gate_model", (b1t0) obj);
                return bundle2;
            case 19:
                b261.c((e261) obj);
                return rih1Var;
            case 20:
                return new x2l0((i3l0) obj);
            case 21:
                return new q2t0(a3t0.b, false);
            case 22:
                b261.c((e261) obj);
                return rih1Var;
            case 23:
                return new j3t0(false, false, false);
            case 24:
                return b7xVar;
            case 25:
                return rih1Var;
            case 26:
                return new ubt0(null);
            case 27:
                return Boolean.valueOf(((in4) obj).b());
            case 28:
                return Boolean.valueOf(((in4) obj).b());
            default:
                return Boolean.valueOf(((in4) obj).b());
        }
    }
}

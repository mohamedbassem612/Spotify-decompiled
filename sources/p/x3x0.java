package p;

import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x3x0 implements h0r0 {
    public final c4n0 a;
    public final k3x0 b;
    public final t5w c;
    public final q5w d;
    public final Scheduler e;
    public final y3x0 f;
    public final zjq g;
    public final bkq h;
    public final cdx0 i;
    public final ynb0 j;
    public final ynb0 k;
    public final gdx0 l;
    public final ynb0 m;
    public final ynb0 n;
    public final ynb0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ckq f95p;
    public final kt91 q;
    public final cbr0 r;

    public x3x0(c4n0 c4n0Var, k3x0 k3x0Var, t5w t5wVar, q5w q5wVar, Scheduler scheduler, y3x0 y3x0Var, zjq zjqVar, bkq bkqVar, cdx0 cdx0Var, ynb0 ynb0Var, ynb0 ynb0Var2, gdx0 gdx0Var, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, ckq ckqVar, kt91 kt91Var) {
        this.a = c4n0Var;
        this.b = k3x0Var;
        this.c = t5wVar;
        this.d = q5wVar;
        this.e = scheduler;
        this.f = y3x0Var;
        this.g = zjqVar;
        this.h = bkqVar;
        this.i = cdx0Var;
        this.j = ynb0Var;
        this.k = ynb0Var2;
        this.l = gdx0Var;
        this.m = ynb0Var3;
        this.n = ynb0Var4;
        this.o = ynb0Var5;
        this.f95p = ckqVar;
        this.q = kt91Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarK4 = yon1.k4();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.r = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarK4, oap1.i(y3x0Var.b()), (nar0) null), new j0c0(mno1.k0), new qod1(y3x0Var.g()), u17.b, new t1r0(true), new s9h1(14, true, false, false), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.r;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        boolean zJ = this.l.a.j();
        c4n0 c4n0Var = this.a;
        cdx0 cdx0Var = this.i;
        ynb0 ynb0Var = this.k;
        y3x0 y3x0Var = this.f;
        if (zJ) {
            udx0 udx0Var = new udx0(y3x0Var.g(), y3x0Var.a(), y3x0Var.h(), c4n0Var, y3x0Var.j());
            sdx0 sdx0Var = (sdx0) ynb0Var.get();
            return ((yuj) this.m.get()).a(f4p1.g(cdx0Var.a(sdx0Var, udx0Var, c())), apo.j(-1839558408, new wh(sdx0Var, this, (byte) 27), true), new n7e0(new q3x0(this), gbw0.t, r3x0.b, k1x0.d), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
        }
        edx0 edx0VarA = cdx0Var.a((sdx0) ynb0Var.get(), new udx0(y3x0Var.g(), y3x0Var.a(), y3x0Var.h(), c4n0Var, y3x0Var.j()), c());
        z7e0 z7e0Var = (z7e0) this.j.get();
        mwv0 mwv0Var = new mwv0(this, (byte) 19);
        j391 j391Var = z391.t;
        m391 m391Var = z391.Z;
        u7r0 u7r0Var = new u7r0(a4p1.v(new e491[]{z391.a, z391.e, j391Var, m391Var, m391Var, m391Var, j391Var, m391Var, m391Var, m391Var}), new awj(this, (byte) 6), null, false, false, 124);
        z7e0Var.getClass();
        return new w6e0(edx0VarA, z7e0Var, u7r0Var, mwv0Var, (byte) 3);
    }

    public final Observable c() {
        Set set = s4b1.f;
        y3x0 y3x0Var = this.f;
        String strS = uic.x(y3x0Var.g()).s();
        if (strS == null) {
            eg.m("Required value was null.");
            return null;
        }
        Observable observableA = this.b.a(strS, y3x0Var.a(), y3x0Var.h());
        c1v0 c1v0Var = new c1v0(this.c.a(y3x0Var.g()), (byte) 23);
        o6x o6xVar = o6x.a;
        return Observable.combineLatest(observableA, yoi1.i(c1v0Var, o6xVar).onErrorReturnItem(Boolean.FALSE), yoi1.i(new c1v0(this.d.a(y3x0Var.g()), (byte) 24), o6xVar).onErrorReturnItem("").startWithItem(""), u3x0.b).observeOn(this.e).doOnNext(new jkt0(this, (byte) 2)).filter(new vhc(this));
    }
}

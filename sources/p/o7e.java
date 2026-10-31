package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o7e implements h0r0 {
    public final a8e0 a;
    public final i8e b;
    public final ge8 c;
    public final pnv0 d;
    public final Scheduler e;
    public final oto0 f;
    public final cbr0 g;

    public o7e(a8e0 a8e0Var, i8e i8eVar, ge8 ge8Var, pnv0 pnv0Var, Scheduler scheduler, ekb ekbVar, oto0 oto0Var) {
        this.a = a8e0Var;
        this.b = i8eVar;
        this.c = ge8Var;
        this.d = pnv0Var;
        this.e = scheduler;
        this.f = oto0Var;
        bi90 bi90VarA = i8eVar.a();
        yxe1 yxe1Var = new yxe1(new ehc1(bi90VarA instanceof rh90 ? ((rh90) bi90VarA).c : bi90VarA instanceof mh90 ? ((mh90) bi90VarA).c : i8eVar.b() != null ? i8eVar.b() : ""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.f5(), nik1.I2, (nar0) null), new j0c0(mno1.L)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        m6e0 m6e0VarC;
        i8e i8eVar = this.b;
        bi90 bi90VarA = i8eVar.a();
        String strB = i8eVar.b();
        if (bi90VarA != null) {
            m6e0VarC = bbp1.g(Single.just(bi90VarA));
        } else if (strB != null) {
            m6e0VarC = bbp1.g(this.d.d(upn1.m(), jup0.c(1), nik1.I2.a, this.f.a.g()).subscribeOn(this.e).map(new k9p1(this, strB)));
        } else {
            m6e0VarC = f610.c(Observable.just(q3p1.o(new IllegalArgumentException("Category details page requires item or itemKey"))));
        }
        return a8e0.b(this.a, m6e0VarC, new m4d(this, (byte) 12));
    }
}

package p;

import com.spotify.kidsaccount.api.v2.proto.NotEmpty;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nwa0 implements h0r0 {
    public final yuj a;
    public final swa0 b;
    public final m2c0 c;
    public final pwa0 d;
    public final pe e;

    public nwa0(yuj yujVar, swa0 swa0Var, m2c0 m2c0Var, pwa0 pwa0Var, pe peVar) {
        this.a = yujVar;
        this.b = swa0Var;
        this.c = m2c0Var;
        this.d = pwa0Var;
        this.e = peVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        pwa0 pwa0Var = this.d;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(ozn1.u(pwa0Var.a()), ozn1.v(pwa0Var.a()), (nar0) null), new t1r0(true), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        swa0 swa0Var = this.b;
        bza0 bza0Var = swa0Var.b;
        iza0 iza0Var = bza0Var.a;
        bgo0 bgo0VarO = NotEmpty.o();
        bgo0VarO.n();
        return yuj.b(this.a, bbp1.g(new CompletableToSingle(Completable.k(iza0Var.a((NotEmpty) bgo0VarO.build()).map(new t2b(bza0Var, (byte) 14)).doOnSuccess(new rwa0(swa0Var, (byte) 0))), new yj1(this, (byte) 12), null)), nui.a, new n7e0(new mwa0(this), new gs90(this, (byte) 14), yj20.g, jqa0.i));
    }
}

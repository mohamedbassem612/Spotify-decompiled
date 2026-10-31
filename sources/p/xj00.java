package p;

import com.spotify.home.evopage.mobius.e;
import com.spotify.home.evopage.mobius.g;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xj00 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj00(e eVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = eVar;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        xj00 xj00Var = new xj00(this.b, lnmVar);
        xj00Var.a = obj;
        return xj00Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((xj00) create((at71) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        at71 at71Var = (at71) this.a;
        hm5.M(obj);
        e eVar = this.b;
        ezc ezcVar = eVar.n;
        ezc ezcVar2 = eVar.o;
        mr20 mr20VarB = g.b(eVar.e, eVar.d);
        nsp0 nsp0Var = (nsp0) ((hsp0) eVar.g.get());
        nsp0Var.getClass();
        return hu20.d(ezcVar, ezcVar2, mr20VarB, x4p1.h(hu20.e(rqt0.u(new sii0(at71Var, nsp0Var, (byte) 23)), new t4o0((lnm) null, nsp0Var, (byte) 6)), new lsp0(3, null)), g.a(at71Var, eVar.c));
    }
}

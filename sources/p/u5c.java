package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u5c implements rjm0 {
    public final Function0 a;
    public final zwg b = new zwg((byte) 18);

    public u5c(Function0 function0) {
        this.a = function0;
    }

    public final /* bridge */ m8n A(n8n n8nVar) {
        return lvx.j(this, n8nVar);
    }

    public final /* bridge */ o8n C(n8n n8nVar) {
        return lvx.o(this, n8nVar);
    }

    @Override // p.rjm0
    public final Object D(iu30 iu30Var, lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        t5c t5cVar = new t5c();
        t5cVar.a = ohdVar;
        t5cVar.b = iu30Var;
        ohdVar.n(new p5(this.b.c(t5cVar, this.a), (byte) 7));
        return ohdVar.r();
    }

    public final /* bridge */ Object o(Object obj, vu30 vu30Var) {
        return lvx.i(this, obj, vu30Var);
    }

    public final /* bridge */ o8n y(o8n o8nVar) {
        return lvx.p(this, o8nVar);
    }
}

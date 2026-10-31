package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fut implements a4l {
    public final Observable a;
    public final uya b;
    public final ak9 c;
    public final q8n d;
    public llm e;
    public final llm f;
    public final bpb1 g = gio1.b(Boolean.FALSE);
    public final bpb1 h = gio1.b(b7x.a);
    public ve01 i;

    public fut(Observable observable, uya uyaVar, ak9 ak9Var, q8n q8nVar) {
        this.a = observable;
        this.b = uyaVar;
        this.c = ak9Var;
        this.d = q8nVar;
        this.f = l1d.x(q8nVar);
    }

    @Override // p.a4l
    public final void a() {
        this.g.m((Object) null, Boolean.FALSE);
        llm llmVar = this.e;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.e = null;
        this.i = null;
    }

    @Override // p.a4l
    public final void b() {
        llm llmVarE = smo1.e(ha71.A(guo1.B(), this.d));
        this.e = llmVarE;
        this.i = d5p1.r(u4p1.a0(u4p1.b0(new pzs(this.h, this, (byte) 3), new n3s(this, (lnm) null, (byte) 5)), new xx0(this, (lnm) null, (byte) 5)), llmVarE, new alb1(0L, 0L), 1);
        this.g.m((Object) null, Boolean.TRUE);
    }
}

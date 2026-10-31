package p;

import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hir implements a4l {
    public final jo20 a;
    public final fuf0 b;
    public final o4o0 c;
    public final mks d;
    public final q8n e;
    public llm f;
    public final mr20 g;
    public final bpb1 h;
    public final List i;

    public hir(jo20 jo20Var, o7s o7sVar, g0l g0lVar, fuf0 fuf0Var, o4o0 o4o0Var, mks mksVar, q8n q8nVar, q8n q8nVar2) {
        this.a = jo20Var;
        this.b = fuf0Var;
        this.c = o4o0Var;
        this.d = mksVar;
        this.e = q8nVar;
        this.g = Build.VERSION.SDK_INT >= 34 ? f5p1.q(hu20.e(o4p1.r(new qer(o4p1.r(h5p1.t(u4p1.b0(f5p1.q(new wef(yoi1.g(((inr) g0lVar).d()), (byte) 19), new jte((byte) 18)), new sd0((byte) 28)), u4p1.b0(o4p1.r(h4p1.f(new n5s(o7sVar, (lnm) null, (byte) 2)), o7sVar.c), new sd0((byte) 29)), new mnl()), q8nVar2), this, (byte) 2), q8nVar), new b7c((lnm) null, this, (byte) 24)), new jte((byte) 17)) : r6x.a;
        bpb1 bpb1VarB = gio1.b(z6x.a);
        this.h = bpb1VarB;
        yoi1.j(bpb1VarB);
        this.i = (List) bpb1VarB.getValue();
    }

    @Override // p.a4l
    public final void a() {
        llm llmVar = this.f;
        if (llmVar == null) {
            u890.C("scope");
            throw null;
        }
        smo1.q(llmVar);
        bpb1 bpb1Var = this.h;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, z6x.a);
    }

    @Override // p.a4l
    public final void b() {
        this.f = cy30.t(this.e);
        if (this.a.isEnabled()) {
            llm llmVar = this.f;
            if (llmVar != null) {
                c921.y(llmVar, (o8n) null, 0, new n1o(this, (lnm) null, (byte) 8), 3);
            } else {
                u890.C("scope");
                throw null;
            }
        }
    }
}

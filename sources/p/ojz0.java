package p;

import android.app.Activity;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ojz0 implements byf0 {
    public final Set X;
    public final bbr0 a;
    public final Flowable b;
    public final c3s c;
    public final j0d1 d;
    public final llm e;
    public Boolean f;
    public Boolean g;
    public n6r0 h;
    public final gj5 i;
    public final cyp t;

    public ojz0(bbr0 bbr0Var, Flowable flowable, c3s c3sVar, q8n q8nVar, t8u0 t8u0Var, Activity activity) {
        this.a = bbr0Var;
        this.b = flowable;
        this.c = c3sVar;
        j0d1 j0d1VarB = guo1.B();
        this.d = j0d1VarB;
        this.e = smo1.e(ha71.A(j0d1VarB, q8nVar));
        gj5 gj5Var = (gj5) activity;
        this.i = gj5Var;
        this.t = t8u0Var.a(((f0i) gj5Var).a);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.X = dm61.z0(yon1.x4(), yon1.A4(), yon1.y4(), yon1.z4(), yon1.w4());
    }

    @Override // p.byf0
    public final void c() {
        vse0 vse0Var = new vse0(this, (lnm) null, (byte) 13);
        llm llmVar = this.e;
        c921.y(llmVar, (o8n) null, 0, vse0Var, 3);
        c921.y(llmVar, (o8n) null, 0, new njz0(this, (lnm) null, (byte) 1), 3);
    }

    @Override // p.byf0
    public final void d() {
        this.h = null;
        op71.s(this.d);
    }

    @Override // p.byf0
    public final void g(ViewGroup viewGroup) {
    }
}

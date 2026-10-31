package p;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rfs {
    public final lik1 a;
    public final tzo b;
    public final pfs c;
    public final sfs d;
    public final eqo e;
    public final qhe0 f;
    public final AtomicBoolean g = new AtomicBoolean(false);

    public rfs(lik1 lik1Var, tzo tzoVar, pfs pfsVar, sfs sfsVar, eqo eqoVar, qhe0 qhe0Var) {
        this.a = lik1Var;
        this.b = tzoVar;
        this.c = pfsVar;
        this.d = sfsVar;
        this.e = eqoVar;
        this.f = qhe0Var;
    }

    public final void a(iam iamVar, boolean z) {
        int i;
        p6r0 p6r0VarG1;
        if (this.g.getAndSet(true)) {
            return;
        }
        int iC = l1d.C(iamVar.a);
        if (iC == 5) {
            i = 3;
        } else if (iC != 7) {
            i = 0;
        } else {
            i = z ? 2 : 1;
        }
        if (i == 0) {
            return;
        }
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG1 = yon1.G1("PODCAST_SHOW_AUDIOBOOK", "podcast/show/audiobook", 1493, "podcast");
        } else if (iC2 == 1) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG1 = yon1.G1("PRERELEASE_AUDIOBOOK", "prerelease/audiobook", 1560, "prerelease");
        } else if (iC2 != 2) {
            eg.o();
            return;
        } else {
            AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
            p6r0VarG1 = yon1.j5();
        }
        String str = p6r0VarG1.c;
        t8h1.n(this.f, p6r0VarG1);
        lik1 lik1Var = this.a;
        qir0 qir0VarA = lik1Var.a();
        String str2 = lik1Var.a;
        this.e.a.accept(new eir0(p6r0VarG1, qir0VarA, 4));
        pfs pfsVar = this.c;
        pfsVar.a.set(new yol0(str, str2));
        this.d.a.set(new bpl0(str, str2, pfsVar.a().b()));
    }

    public final void b() {
        p6r0 p6r0Var = (p6r0) this.b.b;
        t8h1.n(this.f, p6r0Var);
        lik1 lik1Var = this.a;
        this.e.a.accept(new eir0(p6r0Var, lik1Var.a(), 4));
        String str = p6r0Var.c;
        String str2 = lik1Var.a;
        pfs pfsVar = this.c;
        pfsVar.a.set(new yol0(str, str2));
        this.d.a.set(new bpl0(str, str2, pfsVar.a().b()));
    }
}

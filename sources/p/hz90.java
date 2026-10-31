package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hz90 implements h0r0 {
    public final qyj a;
    public final c9c0 b;
    public final up90 c;
    public final ikp d;
    public final b0a0 e;
    public final cbr0 f;

    public hz90(qyj qyjVar, c9c0 c9c0Var, up90 up90Var, ikp ikpVar, b0a0 b0a0Var, Resources resources) {
        this.a = qyjVar;
        this.b = c9c0Var;
        this.c = up90Var;
        this.d = ikpVar;
        this.e = b0a0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("JAM_PARTICIPANTSETTINGSSHEET", "jam/participantsettingssheet", 866, "jam");
        lik1 lik1Var = nik1.u5;
        pp90 pp90Var = (pp90) c9c0Var.b.current().getValue();
        this.f = new cbr0(new dbr0[]{new bn70(p6r0VarG1, lik1Var, new tbl0(pp90Var != null ? pp90Var.a : null)), new nxb(null, ixb.b, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 0, null, null, false, false, false, null, 4089), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1473834284, new gs90(this, (byte) 4), true));
    }
}

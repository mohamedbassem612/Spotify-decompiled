package p;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yyc0 implements h0r0 {
    public final l5d0 a;
    public final qzu0 b;
    public final z7e0 c;
    public final bve0 d;
    public final byp e;
    public final cbr0 f;

    public yyc0(q7r0 q7r0Var, l5d0 l5d0Var, qzu0 qzu0Var, z7e0 z7e0Var, bve0 bve0Var, byp bypVar) {
        this.a = l5d0Var;
        this.b = qzu0Var;
        this.c = z7e0Var;
        this.d = bve0Var;
        this.e = bypVar;
        l5d0Var.a();
        q7r0Var.d.c.getLifecycle().a(new tus(this, (byte) 1));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, new zh10(yon1.I3(), bve0Var.getViewUri()), new zp71(Uri.EMPTY), new p8r("List Entity Page\n\nLoading...."), new j0c0(mno1.O), new q1r0(true), new t1r0(true), new s9h1(14, true, false, false)}, true);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        zou0 zou0VarD = this.b.d();
        xy50 xy50Var = new xy50(this, (byte) 8);
        return new w6e0(zou0VarD, this.c, new u7r0(a4p1.n(), null, new pdb0(this, (byte) 26), false, false, 122), xy50Var, (byte) 3);
    }
}

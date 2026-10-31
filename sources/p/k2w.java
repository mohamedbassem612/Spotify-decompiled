package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k2w implements h0r0 {
    public final f1n0 a;
    public final do70 b;
    public final yuj c;
    public final n3w d;
    public final jut e;
    public final cbr0 f;

    public k2w(f1n0 f1n0Var, do70 do70Var, yuj yujVar, n3w n3wVar, jut jutVar) {
        this.a = f1n0Var;
        this.b = do70Var;
        this.c = yujVar;
        this.d = n3wVar;
        this.e = jutVar;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{t1r0Var, s9h1Var, new bn70(yon1.o4(), nik1.K0, (nar0) null), new yxe1(new jx21(2131955366)), new hgr0(egr0.a, 0, 2)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.c, f610.j(this.d.getUsername()), apo.j(-727805083, new k9s(this, (byte) 18), true), new n7e0(new j2w(this), new utt(this, (byte) 22), mm10.g1));
    }
}

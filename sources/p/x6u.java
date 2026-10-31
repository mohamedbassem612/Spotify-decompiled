package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x6u implements gtf1 {
    public final byte[] a = new byte[SemanticState.Obscured];

    @Override // p.gtf1
    public final void c(izr0 izr0Var, int i, int i2) {
        izr0Var.S(i);
    }

    @Override // p.gtf1
    public final int d(z0r z0rVar, int i, boolean z) {
        byte[] bArr = this.a;
        int i2 = z0rVar.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        eg.l();
        return 0;
    }

    @Override // p.gtf1
    public final void a(ie30 ie30Var) {
    }

    @Override // p.gtf1
    public final void b(long j, int i, int i2, int i3, ftf1 ftf1Var) {
    }
}

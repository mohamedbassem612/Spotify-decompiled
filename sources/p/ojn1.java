package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ojn1 extends k5n1 {
    public final kng0 b;
    public k5n1 c;

    public ojn1(pjn1 pjn1Var) {
        super((byte) 2);
        this.b = new kng0(pjn1Var);
        this.c = a();
    }

    public final shn1 a() {
        kng0 kng0Var = this.b;
        if (kng0Var.hasNext()) {
            return new shn1(kng0Var.b());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // p.k5n1
    public final byte zza() {
        k5n1 k5n1Var = this.c;
        if (k5n1Var == null) {
            hhg1.k();
            return (byte) 0;
        }
        byte bZza = k5n1Var.zza();
        if (!this.c.hasNext()) {
            this.c = a();
        }
        return bZza;
    }
}

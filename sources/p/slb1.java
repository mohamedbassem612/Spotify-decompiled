package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class slb1 implements gob1 {
    public final String a;
    public final Throwable b;

    public slb1(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    @Override // p.gob1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slb1)) {
            return false;
        }
        slb1 slb1Var = (slb1) obj;
        return this.a.equals(slb1Var.a) && this.b.equals(slb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class imj1 {
    public final l4r a;
    public final l4r b;

    public imj1(l4r l4rVar, l4r l4rVar2) {
        this.a = l4rVar;
        this.b = l4rVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imj1)) {
            return false;
        }
        imj1 imj1Var = (imj1) obj;
        return this.a.equals(imj1Var.a) && this.b.equals(imj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

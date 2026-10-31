package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kk91 extends yk91 {
    public final int a;
    public final d7e b;

    public kk91(int i, d7e d7eVar) {
        this.a = i;
        this.b = d7eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk91)) {
            return false;
        }
        kk91 kk91Var = (kk91) obj;
        return this.a == kk91Var.a && this.b.equals(kk91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hh9 implements jh9 {
    public final String a;
    public final int b;

    public hh9(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // p.jh9
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh9)) {
            return false;
        }
        hh9 hh9Var = (hh9) obj;
        return this.a.equals(hh9Var.a) && this.b == hh9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

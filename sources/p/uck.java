package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uck implements wck {
    public final String a;
    public final int b;

    public uck(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // p.wck
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uck)) {
            return false;
        }
        uck uckVar = (uck) obj;
        return u890.j(this.a, uckVar.a) && this.b == uckVar.b;
    }

    @Override // p.wck
    public final String getLabel() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(this.b) + ab80.k(3, this.a.hashCode() * 31, 31);
    }
}

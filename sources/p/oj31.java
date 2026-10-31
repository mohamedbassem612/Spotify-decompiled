package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oj31 implements uj31 {
    public final String a;
    public final int b;

    public oj31(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj31)) {
            return false;
        }
        oj31 oj31Var = (oj31) obj;
        return this.a.equals(oj31Var.a) && this.b == oj31Var.b;
    }

    @Override // p.uj31
    public final String getPath() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

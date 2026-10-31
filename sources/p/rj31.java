package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rj31 implements uj31 {
    public final String a;
    public final float b;

    public rj31(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj31)) {
            return false;
        }
        rj31 rj31Var = (rj31) obj;
        return u890.j(this.a, rj31Var.a) && Float.compare(this.b, rj31Var.b) == 0;
    }

    @Override // p.uj31
    public final String getPath() {
        return this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d750 {
    public final String a;
    public final float b;

    public d750(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d750)) {
            return false;
        }
        d750 d750Var = (d750) obj;
        return this.a.equals(d750Var.a) && Float.compare(this.b, d750Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

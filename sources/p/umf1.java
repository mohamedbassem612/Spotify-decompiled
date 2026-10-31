package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class umf1 {
    public final String a;
    public final float b;
    public final String c;

    public umf1(String str, float f, String str2) {
        this.a = str;
        this.b = f;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umf1)) {
            return false;
        }
        umf1 umf1Var = (umf1) obj;
        return this.a.equals(umf1Var.a) && Float.compare(this.b, umf1Var.b) == 0 && this.c.equals(umf1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.f(this.a.hashCode() * 31, 31, this.b);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f070 {
    public final ji0 a;
    public final String b;
    public final float c;

    public f070(ji0 ji0Var, String str, float f) {
        this.a = ji0Var;
        this.b = str;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f070)) {
            return false;
        }
        f070 f070Var = (f070) obj;
        return this.a.equals(f070Var.a) && u890.j(this.b, f070Var.b) && Float.compare(this.c, f070Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fw10 {
    public final tv10 a;
    public final String b;
    public final int c;

    public fw10(tv10 tv10Var, String str, int i) {
        this.a = tv10Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw10)) {
            return false;
        }
        fw10 fw10Var = (fw10) obj;
        return this.a.equals(fw10Var.a) && this.b.equals(fw10Var.b) && this.c == fw10Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}

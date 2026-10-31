package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f920 implements h920 {
    public final String a;
    public final boolean b;

    public f920(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f920)) {
            return false;
        }
        f920 f920Var = (f920) obj;
        return this.a.equals(f920Var.a) && this.b == f920Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 961);
    }
}

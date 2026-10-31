package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v171 extends w171 {
    public final String a;
    public final boolean b;

    public v171(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v171)) {
            return false;
        }
        v171 v171Var = (v171) obj;
        return this.a.equals(v171Var.a) && this.b == v171Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

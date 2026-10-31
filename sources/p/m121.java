package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m121 implements q121 {
    public final String a;
    public final boolean b;

    public m121(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m121)) {
            return false;
        }
        m121 m121Var = (m121) obj;
        return u890.j(this.a, m121Var.a) && this.b == m121Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

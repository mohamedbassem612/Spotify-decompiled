package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gg20 {
    public final String a;
    public final fg20 b;

    public gg20(String str, fg20 fg20Var) {
        this.a = str;
        this.b = fg20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg20)) {
            return false;
        }
        gg20 gg20Var = (gg20) obj;
        return u890.j(this.a, gg20Var.a) && this.b.equals(gg20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

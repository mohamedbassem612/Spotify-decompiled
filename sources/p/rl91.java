package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rl91 extends tl91 {
    public final String a;
    public final int b;

    public rl91(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl91)) {
            return false;
        }
        rl91 rl91Var = (rl91) obj;
        return u890.j(this.a, rl91Var.a) && this.b == rl91Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}

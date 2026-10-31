package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tk91 extends yk91 {
    public final String a;
    public final shs0 b;

    public tk91(String str, shs0 shs0Var) {
        this.a = str;
        this.b = shs0Var;
    }

    public final String a() {
        return this.a;
    }

    public final shs0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk91)) {
            return false;
        }
        tk91 tk91Var = (tk91) obj;
        return u890.j(this.a, tk91Var.a) && this.b.equals(tk91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

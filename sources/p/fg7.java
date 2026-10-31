package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fg7 {
    public final String a;
    public final r620 b;

    public fg7(String str, r620 r620Var) {
        this.a = str;
        this.b = r620Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg7)) {
            return false;
        }
        fg7 fg7Var = (fg7) obj;
        return u890.j(this.a, fg7Var.a) && this.b == fg7Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

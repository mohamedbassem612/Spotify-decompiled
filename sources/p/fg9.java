package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fg9 extends qg9 {
    public final String a;
    public final fi9 b;

    public fg9(String str, fi9 fi9Var) {
        this.a = str;
        this.b = fi9Var;
    }

    public final String a() {
        return this.a;
    }

    public final fi9 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg9)) {
            return false;
        }
        fg9 fg9Var = (fg9) obj;
        return u890.j(this.a, fg9Var.a) && this.b == fg9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

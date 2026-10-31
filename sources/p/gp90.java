package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gp90 {
    public final String a;

    public static final boolean a(String str, String str2) {
        return u890.j(str, str2);
    }

    public static int b(String str) {
        return str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gp90) {
            return u890.j(this.a, ((gp90) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("JoinToken(value=", this.a, ")");
    }
}

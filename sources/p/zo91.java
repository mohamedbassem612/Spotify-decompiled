package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zo91 {
    public final String a;
    public final long b;

    public zo91(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo91)) {
            return false;
        }
        zo91 zo91Var = (zo91) obj;
        return u890.j(this.a, zo91Var.a) && this.b == zo91Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

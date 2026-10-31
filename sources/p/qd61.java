package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qd61 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public qd61(int i, String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd61)) {
            return false;
        }
        qd61 qd61Var = (qd61) obj;
        return u890.j(this.a, qd61Var.a) && u890.j(this.b, qd61Var.b) && this.c == qd61Var.c && this.d == qd61Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}

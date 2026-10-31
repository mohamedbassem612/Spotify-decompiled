package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qa41 extends ha71 {
    public final String c;
    public final boolean d;

    public qa41(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa41)) {
            return false;
        }
        qa41 qa41Var = (qa41) obj;
        return u890.j(this.c, qa41Var.c) && this.d == qa41Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}

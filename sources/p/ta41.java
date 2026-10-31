package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ta41 extends ha71 {
    public final String c;
    public final String d;

    public ta41(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta41)) {
            return false;
        }
        ta41 ta41Var = (ta41) obj;
        return u890.j(this.c, ta41Var.c) && u890.j(this.d, ta41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}

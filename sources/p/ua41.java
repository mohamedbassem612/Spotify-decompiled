package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ua41 extends ha71 {
    public final String c;
    public final String d;

    public ua41(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua41)) {
            return false;
        }
        ua41 ua41Var = (ua41) obj;
        return u890.j(this.c, ua41Var.c) && u890.j(this.d, ua41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}

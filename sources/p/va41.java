package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class va41 extends ha71 {
    public final String c;
    public final String d;

    public va41(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va41)) {
            return false;
        }
        va41 va41Var = (va41) obj;
        return u890.j(this.c, va41Var.c) && u890.j(this.d, va41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}

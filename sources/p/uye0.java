package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uye0 extends d7e {
    public final String c;
    public final String d;

    public uye0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uye0)) {
            return false;
        }
        uye0 uye0Var = (uye0) obj;
        return u890.j(this.c, uye0Var.c) && u890.j(this.d, uye0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}

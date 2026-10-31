package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sb81 extends zb81 {
    public final String a;
    public final String b;
    public final String c;

    public sb81(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb81)) {
            return false;
        }
        sb81 sb81Var = (sb81) obj;
        return this.a.equals(sb81Var.a) && this.b.equals(sb81Var.b) && this.c.equals(sb81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}

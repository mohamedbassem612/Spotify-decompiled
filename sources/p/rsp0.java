package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rsp0 {
    public final String a;
    public final String b;
    public final int c;

    public rsp0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsp0)) {
            return false;
        }
        rsp0 rsp0Var = (rsp0) obj;
        return this.a.equals(rsp0Var.a) && this.b.equals(rsp0Var.b) && this.c == rsp0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}

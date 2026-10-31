package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gj0 implements ki0 {
    public final String a;
    public final ji0 b;

    public gj0(String str, ji0 ji0Var) {
        this.a = str;
        this.b = ji0Var;
    }

    public final String a() {
        return this.b.a;
    }

    public final boolean b() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj0)) {
            return false;
        }
        gj0 gj0Var = (gj0) obj;
        return u890.j(this.a, gj0Var.a) && this.b.equals(gj0Var.b);
    }

    public final String g() {
        return this.b.e;
    }

    public final String h() {
        return this.b.t;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String j() {
        return this.b.c;
    }

    public final String k() {
        return this.b.h;
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lqd0 {
    public final String a;
    public final String b;

    public lqd0(String str, String str2) {
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof lqd0)) {
            return false;
        }
        lqd0 lqd0Var = (lqd0) obj;
        return this.a.equals(lqd0Var.a) && u890.j(this.b, lqd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

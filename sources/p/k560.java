package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k560 extends m560 {
    public final String a;
    public final String b;

    public k560(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k560)) {
            return false;
        }
        k560 k560Var = (k560) obj;
        return u890.j(this.a, k560Var.a) && u890.j(this.b, k560Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

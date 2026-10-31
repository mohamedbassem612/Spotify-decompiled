package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q56 {
    public final String a;
    public final String b;

    public q56(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q56)) {
            return false;
        }
        q56 q56Var = (q56) obj;
        return u890.j(this.a, q56Var.a) && u890.j(this.b, q56Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

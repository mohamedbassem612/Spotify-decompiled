package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gjg1 {
    public final String a;
    public final String b;

    public gjg1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjg1)) {
            return false;
        }
        gjg1 gjg1Var = (gjg1) obj;
        return u890.j(this.a, gjg1Var.a) && u890.j(this.b, gjg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

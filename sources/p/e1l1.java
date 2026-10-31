package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e1l1 extends f1l1 {
    public final String a;
    public final String b;

    public e1l1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1l1)) {
            return false;
        }
        e1l1 e1l1Var = (e1l1) obj;
        return u890.j(this.a, e1l1Var.a) && u890.j(this.b, e1l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661(with = ukb1.class)
public final class qkb1 {
    public static final pkb1 Companion = new pkb1();
    public final String a;
    public final String b;

    public qkb1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkb1)) {
            return false;
        }
        qkb1 qkb1Var = (qkb1) obj;
        return u890.j(this.a, qkb1Var.a) && u890.j(this.b, qkb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

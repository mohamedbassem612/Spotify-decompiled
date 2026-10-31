package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class moh1 implements ooh1 {
    public final String a;
    public final String b;

    public moh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moh1)) {
            return false;
        }
        moh1 moh1Var = (moh1) obj;
        return u890.j(this.a, moh1Var.a) && u890.j(this.b, moh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

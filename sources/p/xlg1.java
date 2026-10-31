package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xlg1 extends ylg1 {
    public final String a;
    public final String b;

    public xlg1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlg1)) {
            return false;
        }
        xlg1 xlg1Var = (xlg1) obj;
        return this.a.equals(xlg1Var.a) && this.b.equals(xlg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

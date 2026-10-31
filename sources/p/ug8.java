package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ug8 {
    public final Integer a;
    public final String b;

    public ug8(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug8)) {
            return false;
        }
        ug8 ug8Var = (ug8) obj;
        return u890.j(this.a, ug8Var.a) && u890.j(this.b, ug8Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}

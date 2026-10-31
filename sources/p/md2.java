package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class md2 {
    public static final md2 c = new md2(null, false);
    public final boolean a;
    public final Integer b;

    public md2(Integer num, boolean z) {
        this.a = z;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md2)) {
            return false;
        }
        md2 md2Var = (md2) obj;
        return this.a == md2Var.a && u890.j(this.b, md2Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}

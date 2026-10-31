package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lv10 implements rv10 {
    public final String a;
    public final boolean b;

    public lv10(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv10)) {
            return false;
        }
        lv10 lv10Var = (lv10) obj;
        return u890.j(this.a, lv10Var.a) && this.b == lv10Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

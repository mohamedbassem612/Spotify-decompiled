package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cc10 {
    public final Integer a;
    public final boolean b;

    public cc10(Integer num, boolean z) {
        this.a = num;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc10)) {
            return false;
        }
        cc10 cc10Var = (cc10) obj;
        return u890.j(this.a, cc10Var.a) && this.b == cc10Var.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }
}

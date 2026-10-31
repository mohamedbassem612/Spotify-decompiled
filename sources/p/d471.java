package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d471 extends hyo1 {
    public final int c;
    public final boolean d;

    public d471(int i, boolean z) {
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d471)) {
            return false;
        }
        d471 d471Var = (d471) obj;
        return this.c == d471Var.c && this.d == d471Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }
}

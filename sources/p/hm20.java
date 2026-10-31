package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hm20 extends tm20 {
    public final ol20 a;

    public hm20(ol20 ol20Var) {
        this.a = ol20Var;
    }

    @Override // p.tm20
    public final ol20 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm20) && this.a.equals(((hm20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

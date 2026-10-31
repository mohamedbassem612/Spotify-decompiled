package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oxm0 implements pxm0, fgb1 {
    public final int a;

    public oxm0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxm0) && this.a == ((oxm0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (l1d.C(this.a) * 31);
    }
}

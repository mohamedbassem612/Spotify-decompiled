package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h901 implements i901 {
    public final int a;

    public h901(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h901) && this.a == ((h901) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

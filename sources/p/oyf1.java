package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oyf1 implements qyf1 {
    public final int a;

    public oyf1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyf1) && this.a == ((oyf1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

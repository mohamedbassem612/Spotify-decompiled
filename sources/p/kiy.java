package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kiy implements niy {
    public final int a;

    public kiy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kiy) && this.a == ((kiy) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

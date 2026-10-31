package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ind1 extends knd1 {
    public final int a;

    public ind1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ind1) && this.a == ((ind1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cbv0 extends ebv0 {
    public final int a;

    public cbv0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbv0) && this.a == ((cbv0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

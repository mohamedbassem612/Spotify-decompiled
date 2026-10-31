package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class etn implements ftn {
    public final int a;

    public etn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof etn) && this.a == ((etn) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

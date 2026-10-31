package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mdh0 extends ndh0 {
    public final int a;

    public mdh0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdh0) && this.a == ((mdh0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

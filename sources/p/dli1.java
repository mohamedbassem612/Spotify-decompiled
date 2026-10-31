package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dli1 implements eli1 {
    public final int a;

    public dli1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dli1) && this.a == ((dli1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

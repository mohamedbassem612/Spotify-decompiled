package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dws0 implements ews0 {
    public final int a;

    public dws0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dws0) && this.a == ((dws0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

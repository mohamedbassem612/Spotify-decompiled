package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aqc1 implements rij0 {
    public final int a;

    public aqc1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqc1) && this.a == ((aqc1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

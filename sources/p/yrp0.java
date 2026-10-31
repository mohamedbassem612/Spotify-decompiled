package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yrp0 {
    public final int a;

    public yrp0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrp0) && this.a == ((yrp0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

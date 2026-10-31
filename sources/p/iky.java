package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iky implements jky {
    public final int a;

    public iky(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iky) && this.a == ((iky) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}

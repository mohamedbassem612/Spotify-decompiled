package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u510 extends w510 {
    public final boolean a;

    public u510(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u510) && this.a == ((u510) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

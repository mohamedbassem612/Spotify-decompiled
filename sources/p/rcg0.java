package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rcg0 extends fdg0 {
    public final boolean a;

    public rcg0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcg0) && this.a == ((rcg0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ri80 implements si80 {
    public final boolean a;

    public ri80(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri80) && this.a == ((ri80) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

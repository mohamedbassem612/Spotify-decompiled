package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f171 implements i171 {
    public final boolean a;

    public f171(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f171) && this.a == ((f171) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

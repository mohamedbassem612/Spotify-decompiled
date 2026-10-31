package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class erh0 implements lrh0 {
    public final boolean a;

    public erh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erh0) && this.a == ((erh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

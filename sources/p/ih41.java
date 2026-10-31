package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ih41 {
    public final boolean a;

    public ih41(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih41) && this.a == ((ih41) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

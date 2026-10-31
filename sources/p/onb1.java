package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class onb1 {
    public final boolean a;

    public onb1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onb1) && this.a == ((onb1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yak implements abk {
    public final boolean a;

    public yak(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yak) && this.a == ((yak) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pwz implements c700 {
    public final boolean a;

    public pwz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pwz) && this.a == ((pwz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

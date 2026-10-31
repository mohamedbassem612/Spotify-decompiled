package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gwh implements hwh {
    public final boolean a;

    public gwh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwh) && this.a == ((gwh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

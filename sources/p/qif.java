package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qif implements uif {
    public final boolean a;

    public qif(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qif) && this.a == ((qif) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

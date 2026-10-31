package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a591 {
    public final boolean a;

    public a591(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a591) && this.a == ((a591) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

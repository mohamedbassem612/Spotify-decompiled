package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kbk implements mbk {
    public final boolean a;

    public kbk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbk) && this.a == ((kbk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

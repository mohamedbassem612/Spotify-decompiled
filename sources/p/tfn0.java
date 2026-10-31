package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tfn0 {
    public final boolean a;

    public tfn0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfn0) && this.a == ((tfn0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

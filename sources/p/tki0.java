package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tki0 extends eli0 {
    public final boolean a;

    public tki0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tki0) && this.a == ((tki0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

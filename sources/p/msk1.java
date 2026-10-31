package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class msk1 implements qsk1 {
    public final boolean a;

    public msk1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msk1) && this.a == ((msk1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

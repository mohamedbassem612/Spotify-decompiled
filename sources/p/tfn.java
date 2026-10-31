package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tfn implements ugn {
    public final boolean a;

    public tfn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfn) && this.a == ((tfn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

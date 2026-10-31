package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class luv0 implements tuv0 {
    public final boolean a;

    public luv0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luv0) && this.a == ((luv0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

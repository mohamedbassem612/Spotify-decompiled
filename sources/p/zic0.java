package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zic0 implements djc0 {
    public final int a;

    public zic0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zic0) && this.a == ((zic0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

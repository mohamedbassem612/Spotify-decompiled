package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p3h1 implements Comparable {
    public final byte a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return u890.q(this.a & 255, ((p3h1) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p3h1) {
            return this.a == ((p3h1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}

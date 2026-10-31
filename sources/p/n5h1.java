package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n5h1 implements Comparable {
    public final short a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return u890.q(this.a & 65535, ((n5h1) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n5h1) {
            return this.a == ((n5h1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}

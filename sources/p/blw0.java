package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class blw0 implements elw0 {
    public final int a;

    public blw0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blw0) && this.a == ((blw0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}

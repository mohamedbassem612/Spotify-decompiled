package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pu01 implements ru01 {
    public final long a;

    public pu01(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu01) && this.a == ((pu01) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}

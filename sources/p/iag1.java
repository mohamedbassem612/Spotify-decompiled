package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iag1 implements kag1 {
    public final long a;

    public iag1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iag1) && this.a == ((iag1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}

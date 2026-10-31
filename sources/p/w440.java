package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w440 implements x440 {
    public final boolean a;

    public w440(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w440) && this.a == ((w440) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}

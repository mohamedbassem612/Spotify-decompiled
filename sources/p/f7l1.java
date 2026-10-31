package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f7l1 implements ez00 {
    public final sqe a;

    public f7l1(sqe sqeVar) {
        this.a = sqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7l1) && this.a.equals(((f7l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

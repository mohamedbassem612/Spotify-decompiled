package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q1l1 extends j2l1 {
    public final Object a;

    public q1l1(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1l1) && this.a.equals(((q1l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

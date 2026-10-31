package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w0l1 extends f1l1 {
    public final b4l1 a;

    public w0l1(b4l1 b4l1Var) {
        this.a = b4l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0l1) && this.a.equals(((w0l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

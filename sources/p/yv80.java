package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yv80 extends zv80 {
    public final ug8 a;

    public yv80(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv80) && this.a.equals(((yv80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

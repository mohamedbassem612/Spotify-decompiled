package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oy21 extends py21 {
    public final Object a;

    public oy21(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy21) && u890.j(this.a, ((oy21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i6w {
    public final qtw a;
    public final Object b;

    public i6w(qtw qtwVar, Object obj) {
        this.a = qtwVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i6w) {
            i6w i6wVar = (i6w) obj;
            if (this.a == i6wVar.a && this.b.equals(i6wVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

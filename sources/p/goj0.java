package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class goj0 extends hoj0 {
    public final Object a;

    public goj0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof goj0) && u890.j(this.a, ((goj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

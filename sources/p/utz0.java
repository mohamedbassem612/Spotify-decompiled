package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class utz0 implements wtz0 {
    public final ytz0 a;

    public utz0(ytz0 ytz0Var) {
        this.a = ytz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utz0) && u890.j(this.a, ((utz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

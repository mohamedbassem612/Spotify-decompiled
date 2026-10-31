package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c231 extends i231 {
    public final gnp0 a;

    public c231(gnp0 gnp0Var) {
        this.a = gnp0Var;
    }

    @Override // p.i231
    public final int b() {
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c231) && u890.j(this.a, ((c231) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

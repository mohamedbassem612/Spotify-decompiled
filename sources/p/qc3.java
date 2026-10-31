package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qc3 extends uc3 {
    public final hpe0 a;

    public qc3(hpe0 hpe0Var) {
        this.a = hpe0Var;
    }

    public final hpe0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc3) && u890.j(this.a, ((qc3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

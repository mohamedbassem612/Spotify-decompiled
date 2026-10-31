package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class etc0 extends htc0 {
    public final fqq0 a;

    public etc0(fqq0 fqq0Var) {
        this.a = fqq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof etc0) && this.a.equals(((etc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

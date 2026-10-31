package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class up61 implements bq61 {
    public final tv80 a;

    public up61(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up61) && u890.j(this.a, ((up61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

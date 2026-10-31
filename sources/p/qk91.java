package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qk91 extends yk91 {
    public final jdu0 a;

    public qk91(jdu0 jdu0Var) {
        this.a = jdu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qk91) && this.a.equals(((qk91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uqf0 implements xqf0 {
    public final csf0 a;

    public uqf0(csf0 csf0Var) {
        this.a = csf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqf0) && this.a.equals(((uqf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

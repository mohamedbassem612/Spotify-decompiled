package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pkc extends jlc {
    public final ml5 a;

    public pkc(ml5 ml5Var) {
        this.a = ml5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkc) && this.a.equals(((pkc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

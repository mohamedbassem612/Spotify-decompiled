package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class quk extends t890 {
    public final va71 d;

    public quk(va71 va71Var) {
        this.d = va71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quk) && this.d.equals(((quk) obj).d);
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}

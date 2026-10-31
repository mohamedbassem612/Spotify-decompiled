package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class olh implements slh {
    public final Exception a;
    public final int b;

    public olh(Exception exc, int i) {
        this.a = exc;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olh)) {
            return false;
        }
        olh olhVar = (olh) obj;
        return this.a.equals(olhVar.a) && this.b == olhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

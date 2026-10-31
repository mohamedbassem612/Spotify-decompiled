package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ei91 {
    public final lcc a;

    public ei91(lcc lccVar) {
        this.a = lccVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei91) && this.a.equals(((ei91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

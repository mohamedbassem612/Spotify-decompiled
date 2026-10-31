package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wig0 extends ern1 {
    public final fpt c;

    public wig0(fpt fptVar) {
        this.c = fptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wig0) && u890.j(this.c, ((wig0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

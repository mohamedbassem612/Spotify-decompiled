package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class egf0 extends t890 {
    public final cay d;

    public egf0(cay cayVar) {
        this.d = cayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egf0) && u890.j(this.d, ((egf0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}

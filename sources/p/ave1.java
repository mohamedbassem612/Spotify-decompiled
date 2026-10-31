package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ave1 extends si1 {
    public final int e;

    public ave1(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ave1) && this.e == ((ave1) obj).e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    @Override // p.si1
    public final int o() {
        return this.e;
    }
}

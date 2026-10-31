package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tfk extends nln {
    public final k6k e;

    public tfk(k6k k6kVar) {
        super((byte) 4);
        this.e = k6kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfk) && this.e.equals(((tfk) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}

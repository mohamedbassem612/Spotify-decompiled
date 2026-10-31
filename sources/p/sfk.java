package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sfk extends nln {
    public final String e;

    public sfk(String str, int i) {
        super((byte) 4);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfk) && u890.j(this.e, ((sfk) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode() * 31;
    }
}

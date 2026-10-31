package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ggk extends nln {
    public final String e;

    public ggk(String str) {
        super((byte) 4);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggk) && u890.j(this.e, ((ggk) obj).e);
    }

    public final int hashCode() {
        String str = this.e;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}

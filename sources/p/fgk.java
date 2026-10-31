package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fgk extends nln {
    public final String e;
    public final String f;

    public fgk(String str, String str2) {
        super((byte) 4);
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgk)) {
            return false;
        }
        fgk fgkVar = (fgk) obj;
        return this.e.equals(fgkVar.e) && this.f.equals(fgkVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}

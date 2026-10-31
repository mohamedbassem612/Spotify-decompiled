package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class egk extends nln {
    public final int e;
    public final String f;

    public egk(int i, String str) {
        super((byte) 4);
        this.e = i;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egk)) {
            return false;
        }
        egk egkVar = (egk) obj;
        return this.e == egkVar.e && u890.j(this.f, egkVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (l1d.C(this.e) * 31);
    }
}

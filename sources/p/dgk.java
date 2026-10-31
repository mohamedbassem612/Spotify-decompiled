package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dgk extends nln {
    public final String e;
    public final String f;

    public dgk(String str, String str2) {
        super((byte) 4);
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgk)) {
            return false;
        }
        dgk dgkVar = (dgk) obj;
        return this.e.equals(dgkVar.e) && this.f.equals(dgkVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ofo {
    public final String a;
    public final int b;

    public ofo(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofo)) {
            return false;
        }
        ofo ofoVar = (ofo) obj;
        return this.a.equals(ofoVar.a) && this.b == ofoVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

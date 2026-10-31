package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class orl {
    public final String a;
    public final String b;

    public orl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orl)) {
            return false;
        }
        orl orlVar = (orl) obj;
        return this.a.equals(orlVar.a) && this.b.equals(orlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

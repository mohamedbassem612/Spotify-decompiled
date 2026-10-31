package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vyy extends dem1 {
    public final String b;
    public final String c;
    public final String d;

    public vyy(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyy)) {
            return false;
        }
        vyy vyyVar = (vyy) obj;
        return this.b.equals(vyyVar.b) && this.c.equals(vyyVar.c) && this.d.equals(vyyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(this.b.hashCode() * 31, 31, this.c);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ooh implements iph {
    public final String a;
    public final String b;

    public ooh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooh)) {
            return false;
        }
        ooh oohVar = (ooh) obj;
        return this.a.equals(oohVar.a) && this.b.equals(oohVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

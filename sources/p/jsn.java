package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jsn extends ti {
    public final String b;
    public final String c;

    public jsn(String str, String str2) {
        super(str);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsn)) {
            return false;
        }
        jsn jsnVar = (jsn) obj;
        return this.b.equals(jsnVar.b) && this.c.equals(jsnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}

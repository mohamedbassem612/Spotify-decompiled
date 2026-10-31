package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kwk implements fxk {
    public final String a;
    public final String b;

    public kwk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwk)) {
            return false;
        }
        kwk kwkVar = (kwk) obj;
        return this.a.equals(kwkVar.a) && this.b.equals(kwkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

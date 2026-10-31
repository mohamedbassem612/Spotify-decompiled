package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class exk implements fxk {
    public final String a;
    public final String b;

    public exk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exk)) {
            return false;
        }
        exk exkVar = (exk) obj;
        return u890.j(this.a, exkVar.a) && u890.j(this.b, exkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

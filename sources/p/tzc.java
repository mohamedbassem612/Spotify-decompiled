package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tzc {
    public final String a;
    public final String b;

    public tzc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzc)) {
            return false;
        }
        tzc tzcVar = (tzc) obj;
        return u890.j(this.a, tzcVar.a) && u890.j(this.b, tzcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

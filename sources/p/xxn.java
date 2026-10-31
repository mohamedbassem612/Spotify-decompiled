package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xxn implements ayn {
    public final String a;
    public final String b;

    public xxn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxn)) {
            return false;
        }
        xxn xxnVar = (xxn) obj;
        return u890.j(this.a, xxnVar.a) && u890.j(this.b, xxnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

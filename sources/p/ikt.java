package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ikt extends m87 {
    public final String d;
    public final String e;
    public final String f;

    public ikt(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikt)) {
            return false;
        }
        ikt iktVar = (ikt) obj;
        return u890.j(this.d, iktVar.d) && u890.j(this.e, iktVar.e) && u890.j(this.f, iktVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(this.d.hashCode() * 31, 31, this.e);
    }
}

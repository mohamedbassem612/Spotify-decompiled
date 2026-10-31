package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ojz {
    public final String a;
    public final String b;
    public final String c;

    public ojz(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojz)) {
            return false;
        }
        ojz ojzVar = (ojz) obj;
        return u890.j(this.a, ojzVar.a) && u890.j(this.b, ojzVar.b) && u890.j(this.c, ojzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}

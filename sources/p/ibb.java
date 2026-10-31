package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ibb implements vbb {
    public final String a;
    public final String b;

    public ibb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibb)) {
            return false;
        }
        ibb ibbVar = (ibb) obj;
        return u890.j(this.a, ibbVar.a) && this.b.equals(ibbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

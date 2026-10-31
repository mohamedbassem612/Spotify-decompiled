package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class svn implements awn {
    public final String a;
    public final String b;
    public final bwn c;

    public svn(String str, String str2) {
        b7x b7xVar = b7x.a;
        bwn bwnVar = new bwn(b7xVar, b7xVar);
        this.a = str;
        this.b = str2;
        this.c = bwnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svn)) {
            return false;
        }
        svn svnVar = (svn) obj;
        return u890.j(this.a, svnVar.a) && u890.j(this.b, svnVar.b) && this.c.equals(svnVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(false) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 961)) * 31);
    }
}

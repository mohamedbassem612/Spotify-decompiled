package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t2w {
    public final String a;
    public final String b;

    public t2w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2w)) {
            return false;
        }
        t2w t2wVar = (t2w) obj;
        return this.a.equals(t2wVar.a) && u890.j(this.b, t2wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h9w implements j9w {
    public final String a;
    public final String b;

    public h9w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9w)) {
            return false;
        }
        h9w h9wVar = (h9w) obj;
        return u890.j(this.a, h9wVar.a) && u890.j(this.b, h9wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

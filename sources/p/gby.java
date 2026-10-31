package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gby {
    public final String a;
    public final String b;
    public final boolean c;

    public gby(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gby)) {
            return false;
        }
        gby gbyVar = (gby) obj;
        return this.a.equals(gbyVar.a) && this.b.equals(gbyVar.b) && this.c == gbyVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}

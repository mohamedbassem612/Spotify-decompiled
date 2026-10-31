package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eka {
    public final String a;
    public final String b;
    public final String d;
    public final String c = "";
    public final String e = "";

    public eka(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eka)) {
            return false;
        }
        eka ekaVar = (eka) obj;
        return this.a.equals(ekaVar.a) && this.b.equals(ekaVar.b) && this.c.equals(ekaVar.c) && this.d.equals(ekaVar.d) && this.e.equals(ekaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, false);
    }
}

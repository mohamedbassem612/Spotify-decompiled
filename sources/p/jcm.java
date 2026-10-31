package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jcm {
    public final gcm a;
    public final int b;
    public final boolean c;
    public final String d;

    public jcm(gcm gcmVar, int i, boolean z, String str) {
        this.a = gcmVar;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcm)) {
            return false;
        }
        jcm jcmVar = (jcm) obj;
        return this.a.equals(jcmVar.a) && this.b == jcmVar.b && this.c == jcmVar.c && u890.j(this.d, jcmVar.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pju extends rju {
    public final String a;
    public final String b;
    public final int c;

    public pju(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pju)) {
            return false;
        }
        pju pjuVar = (pju) obj;
        return u890.j(this.a, pjuVar.a) && u890.j(this.b, pjuVar.b) && this.c == pjuVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cno {
    public final String a;
    public final ano b;
    public final boolean c;
    public final boolean d;

    public cno(String str, ano anoVar, boolean z, boolean z2) {
        this.a = str;
        this.b = anoVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cno)) {
            return false;
        }
        cno cnoVar = (cno) obj;
        return this.a.equals(cnoVar.a) && this.b.equals(cnoVar.b) && this.c == cnoVar.c && this.d == cnoVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iem {
    public final boolean a;
    public final String b;
    public final int c;

    public iem(String str, int i, boolean z) {
        this.a = z;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iem)) {
            return false;
        }
        iem iemVar = (iem) obj;
        return this.a == iemVar.a && this.b.equals(iemVar.b) && this.c == iemVar.c;
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i = this.c;
        return iD + (i == 0 ? 0 : l1d.C(i));
    }
}

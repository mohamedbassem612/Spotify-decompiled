package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class afx {
    public final icx a;
    public final yxx b;
    public final ohx c;
    public final wgx d;

    public afx(icx icxVar, yxx yxxVar, ohx ohxVar, wgx wgxVar) {
        this.a = icxVar;
        this.b = yxxVar;
        this.c = ohxVar;
        this.d = wgxVar;
    }

    public static afx a(afx afxVar, icx icxVar, yxx yxxVar, int i) {
        if ((i & 1) != 0) {
            icxVar = afxVar.a;
        }
        if ((i & 2) != 0) {
            yxxVar = afxVar.b;
        }
        ohx ohxVar = afxVar.c;
        wgx wgxVar = afxVar.d;
        afxVar.getClass();
        return new afx(icxVar, yxxVar, ohxVar, wgxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afx)) {
            return false;
        }
        afx afxVar = (afx) obj;
        return this.a.equals(afxVar.a) && this.b.equals(afxVar.b) && this.c.equals(afxVar.c) && this.d.equals(afxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}

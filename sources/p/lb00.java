package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lb00 implements kb00 {
    public final kb00 a;

    public lb00(kb00 kb00Var) {
        this.a = kb00Var;
    }

    @Override // p.kb00
    public final String a() {
        String strA = this.a.a();
        if (strA == null || strA.length() <= 0) {
            return null;
        }
        return strA;
    }
}

package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tf5 implements s6b {
    public static final tf5 a = new tf5();

    @Override // p.s6b
    public final y6b a(cqu cquVar, lqr lqrVar) {
        int i = cquVar.f;
        CharSequence charSequence = cquVar.a.a;
        if (cquVar.h >= 4) {
            return null;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String ? ((String) charSequence).startsWith("::: ", i) : ihc1.G0(charSequence, i, "::: ", 0, 4, false))) {
            return null;
        }
        y6b y6bVar = new y6b(new s5[]{new sf5(new jf5(), cquVar.a.a(i + 4, charSequence.length()))});
        y6bVar.a = charSequence.length();
        return y6bVar;
    }
}

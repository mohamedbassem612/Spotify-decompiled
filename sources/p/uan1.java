package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uan1 implements agp1, vcp1, acp1, ijp1 {
    public static final /* synthetic */ uan1 a = new uan1();
    public static final /* synthetic */ uan1 b = new uan1();

    @Override // p.vcp1
    public /* synthetic */ pno1 a(kap1 kap1Var, a2x0 a2x0Var) {
        return hgn1.b(kap1Var);
    }

    public Object zza(Object obj) {
        String str = (String) ((o5) ((szd1) obj)).b;
        return str == null ? "" : str;
    }

    public boolean zzb(Class cls) {
        return false;
    }

    public tjp1 zzc(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}

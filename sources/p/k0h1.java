package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k0h1 implements iu30 {
    public final /* synthetic */ byte a;
    public final mxa1 b;

    public /* synthetic */ k0h1(mxa1 mxa1Var, byte b) {
        this.a = b;
        this.b = mxa1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        mxa1 mxa1Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                byp bypVar = (byp) mxa1Var.b;
                heg hegVarX = dem1.x((zjn0) bypVar.c, iIntValue);
                boolean z = hegVarX.c;
                ks6 ks6Var = (ks6) bypVar.b;
                return z ? ks6Var.a(hegVarX) : x1p1.i((zim0) ks6Var.b, hegVarX);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                byp bypVar2 = (byp) mxa1Var.b;
                heg hegVarX2 = dem1.x((zjn0) bypVar2.c, iIntValue2);
                if (!hegVarX2.c) {
                    jfg jfgVarI = x1p1.i((zim0) ((ks6) bypVar2.b).b, hegVarX2);
                    if (jfgVarI instanceof jit) {
                        return (jit) jfgVarI;
                    }
                }
                return null;
            default:
                return p2o1.z((rgy0) obj, (l141) ((byp) mxa1Var.b).d);
        }
    }
}

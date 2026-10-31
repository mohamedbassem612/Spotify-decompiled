package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class y3d1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b4d1 b;

    public /* synthetic */ y3d1(b4d1 b4d1Var, byte b) {
        this.a = b;
        this.b = b4d1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        float fT = 0.0f;
        b4d1 b4d1Var = this.b;
        switch (b) {
            case 0:
                qqb qqbVar = b4d1Var.Q0;
                if (qqbVar != null) {
                    float f = qqbVar.a;
                    n8b1 n8b1Var = x3d1.a;
                    o95 o95Var = b4d1Var.g1;
                    fT = dm5.T(f, 5.0f, o95Var != null ? ((Number) o95Var.e()).floatValue() : 0.0f);
                }
                return new p3v(fT);
            default:
                qqb qqbVar2 = b4d1Var.Q0;
                return new p3v(qqbVar2 != null ? qqbVar2.a : 0.0f);
        }
    }
}

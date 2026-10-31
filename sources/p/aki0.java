package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aki0 implements Function0 {
    public final /* synthetic */ byte a;
    public final eki0 b;
    public final ggy0 c;
    public final hit d;

    public /* synthetic */ aki0(eki0 eki0Var, ggy0 ggy0Var, hit hitVar, byte b) {
        this.a = b;
        this.b = eki0Var;
        this.c = ggy0Var;
        this.d = hitVar;
    }

    public final Object invoke() {
        byte b = this.a;
        hit hitVar = this.d;
        ggy0 ggy0Var = this.c;
        eki0 eki0Var = this.b;
        switch (b) {
            case 0:
                s1c1 s1c1Var = (s1c1) ((ks6) eki0Var.a.b).a;
                aki0 aki0Var = new aki0(eki0Var, ggy0Var, hitVar, (byte) 2);
                voe0 voe0Var = (voe0) s1c1Var;
                voe0Var.getClass();
                return new soe0(voe0Var, aki0Var);
            case 1:
                s1c1 s1c1Var2 = (s1c1) ((ks6) eki0Var.a.b).a;
                aki0 aki0Var2 = new aki0(eki0Var, ggy0Var, hitVar, (byte) 3);
                voe0 voe0Var2 = (voe0) s1c1Var2;
                voe0Var2.getClass();
                return new soe0(voe0Var2, aki0Var2);
            case 2:
                byp bypVar = eki0Var.a;
                o5 o5VarA = eki0Var.a((n9r) bypVar.a);
                o5VarA.getClass();
                return (sgl) ((kf5) ((ks6) bypVar.b).e).m(o5VarA, ggy0Var, hitVar.getReturnType());
            default:
                byp bypVar2 = eki0Var.a;
                o5 o5VarA2 = eki0Var.a((n9r) bypVar2.a);
                o5VarA2.getClass();
                return (sgl) ((kf5) ((ks6) bypVar2.b).e).q(o5VarA2, ggy0Var, hitVar.getReturnType());
        }
    }
}

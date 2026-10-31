package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jao extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ yqg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jao(yqg yqgVar, iu30 iu30Var) {
        super(3);
        this.a = (byte) 2;
        this.c = yqgVar;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        yqg yqgVar = this.c;
        switch (b) {
            case 0:
                iao iaoVar = (iao) obj;
                tqw tqwVar = (tqw) obj3;
                if (((hao) obj2).equals(hao.a)) {
                    iu30Var.invoke(new v051(new z951(iaoVar.a, 3, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, iaoVar.c, (String) null, false, 0, false, false, false, 259568), tqwVar != null ? n3o1.y(tqwVar) : null, yqgVar.b()));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                qw01 qw01Var = (qw01) obj;
                tqw tqwVar2 = (tqw) obj3;
                if (((pw01) obj2).equals(pw01.a)) {
                    iu30Var.invoke(new v051(new z951(qw01Var.a, 3, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, qw01Var.c, (String) null, false, 0, false, false, false, 259568), tqwVar2 != null ? n3o1.y(tqwVar2) : null, yqgVar.b()));
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                aa80 aa80Var = (aa80) obj;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.f0(2117966916, Integer.valueOf(aa80Var.a));
                rje1.i(aa80Var, yqgVar, iu30Var, x340Var, iIntValue & 14);
                x340Var.r(false);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jao(iu30 iu30Var, yqg yqgVar, byte b) {
        super(3);
        this.a = b;
        this.b = iu30Var;
        this.c = yqgVar;
    }
}

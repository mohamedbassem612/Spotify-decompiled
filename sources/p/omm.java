package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class omm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ so41 b;
    public final /* synthetic */ pmm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ omm(so41 so41Var, pmm pmmVar, byte b) {
        super(0);
        this.a = b;
        this.b = so41Var;
        this.c = pmmVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        so41 so41Var = this.b;
        pmm pmmVar = this.c;
        switch (b) {
            case 0:
                String str = so41Var.a;
                if (str != null) {
                    dc31.f(pmmVar.c, str, false).subscribe();
                    ((ks3) pmmVar.b).a(new ip41(0, 3));
                }
                break;
            default:
                String str2 = so41Var.a;
                if (str2 != null) {
                    dc31.f(pmmVar.c, str2, true).subscribe();
                    ((ks3) pmmVar.b).a(new ip41(0, 3));
                }
                break;
        }
        return rih1Var;
    }
}

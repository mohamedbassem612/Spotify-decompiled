package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hvi extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ dhy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hvi(iu30 iu30Var, dhy dhyVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = dhyVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dhy dhyVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                n6c0 n6c0Var = dhyVar.b;
                iu30Var.invoke(new l6a(n6c0Var.f, n6c0Var.a));
                break;
            case 1:
                String str = dhyVar.a;
                n6c0 n6c0Var2 = dhyVar.b;
                sco scoVar = n6c0Var2.d;
                String str2 = scoVar != null ? scoVar.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                iu30Var.invoke(new m6a(str, str2, n6c0Var2.f, n6c0Var2.a));
                break;
            case 2:
                iu30Var.invoke(new n6a(dhyVar.a, dhyVar.b.a));
                break;
            default:
                String str3 = dhyVar.a;
                n6c0 n6c0Var3 = dhyVar.b;
                iu30Var.invoke(new k6a(str3, n6c0Var3.f, n6c0Var3.a));
                break;
        }
        return rih1Var;
    }
}

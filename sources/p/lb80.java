package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lb80 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ c10 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb80(iu30 iu30Var, c10 c10Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = c10Var;
    }

    public final Object invoke() {
        String str;
        String str2;
        byte b = this.a;
        String str3 = "";
        rih1 rih1Var = rih1.a;
        c10 c10Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(c10Var);
                break;
            case 1:
                iu30Var.invoke(c10Var);
                break;
            case 2:
                if (c10Var != null && (str = c10Var.e) != null) {
                    str3 = str;
                }
                iu30Var.invoke(new abt0(str3));
                break;
            case 3:
                if (c10Var != null && (str2 = c10Var.e) != null) {
                    str3 = str2;
                }
                iu30Var.invoke(new zat0(str3));
                break;
            default:
                iu30Var.invoke(c10Var.e);
                break;
        }
        return rih1Var;
    }
}

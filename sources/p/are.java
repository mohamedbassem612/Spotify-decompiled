package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class are extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public are(String str, iu30 iu30Var) {
        super(0);
        this.a = (byte) 5;
        this.c = str;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new ape(str));
                break;
            case 1:
                iu30Var.invoke(new oho0(str));
                break;
            case 2:
                iu30Var.invoke(new qjt0(str));
                break;
            case 3:
                iu30Var.invoke(new zb41(str));
                break;
            case 4:
                iu30Var.invoke(new d1c1(str));
                break;
            case 5:
                if (str != null) {
                    iu30Var.invoke(str);
                }
                break;
            case 6:
                iu30Var.invoke(str);
                break;
            case 7:
                iu30Var.invoke(new ar10(str));
                break;
            case 8:
                iu30Var.invoke(str);
                break;
            case 9:
                iu30Var.invoke(str);
                break;
            case 10:
                iu30Var.invoke(str);
                break;
            case 11:
                iu30Var.invoke(new y8q0(str));
                break;
            case 12:
                iu30Var.invoke(new j8r0(str));
                break;
            case 13:
                iu30Var.invoke(str);
                break;
            case 14:
                iu30Var.invoke(new it81(str, 2));
                break;
            case 15:
                iu30Var.invoke(str);
                break;
            default:
                iu30Var.invoke(new rxi1(str));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ are(iu30 iu30Var, String str, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = str;
    }
}

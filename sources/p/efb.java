package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class efb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ y7e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ efb(iu30 iu30Var, y7e1 y7e1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = y7e1Var;
    }

    public final Object invoke() {
        CharSequence charSequence;
        String string;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y7e1 y7e1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(y7e1Var.d().d.toString());
                break;
            case 1:
                iu30Var.invoke(y7e1Var.d().d.toString());
                break;
            case 2:
                iu30Var.invoke(new f6f(y7e1Var.d().d.toString()));
                c4p1.q(y7e1Var);
                break;
            case 3:
                iu30Var.invoke(new f6f(y7e1Var.d().d.toString()));
                c4p1.q(y7e1Var);
                break;
            case 4:
                String str = null;
                if (y7e1Var != null && (charSequence = y7e1Var.d().d) != null && (string = charSequence.toString()) != null && !ihc1.y0(string)) {
                    str = string;
                }
                iu30Var.invoke(new qkn(str));
                break;
            case 5:
                iu30Var.invoke(y7e1Var.d().d.toString());
                break;
            case 6:
                iu30Var.invoke(y7e1Var.d().d.toString());
                break;
            case 7:
                iu30Var.invoke(new g251(y7e1Var.d().d.toString()));
                break;
            case 8:
                c4p1.q(y7e1Var);
                iu30Var.invoke(e251.a);
                break;
            case 9:
                c4p1.q(y7e1Var);
                iu30Var.invoke(b451.a);
                break;
            case 10:
                String string2 = y7e1Var.d().d.toString();
                if (!ihc1.y0(string2)) {
                    iu30Var.invoke(string2);
                    c4p1.q(y7e1Var);
                }
                break;
            case 11:
                c4p1.q(y7e1Var);
                iu30Var.invoke(h2f1.a);
                break;
            case 12:
                c4p1.q(y7e1Var);
                iu30Var.invoke(f2f1.a);
                break;
            case 13:
                iu30Var.invoke(new eph1(y7e1Var.d().d.toString()));
                break;
            default:
                iu30Var.invoke(new srh1(y7e1Var.d().d.toString()));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ efb(y7e1 y7e1Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.c = y7e1Var;
        this.b = iu30Var;
    }
}

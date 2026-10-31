package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rc21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc21(iu30 iu30Var, ven0 ven0Var) {
        super(0);
        this.a = (byte) 3;
        this.c = ven0Var;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        c3j1 c3j1Var = c3j1.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                iu30Var.invoke(new lc21((String) ven0Var.getValue()));
                break;
            case 1:
                ven0Var.setValue(Boolean.TRUE);
                iu30Var.invoke(mu41.a);
                break;
            case 2:
                ven0Var.setValue(new c8e1(0L, 7, (String) null));
                iu30Var.invoke(e251.a);
                break;
            case 3:
                ven0Var.setValue(Boolean.TRUE);
                iu30Var.invoke(scv.a);
                break;
            case 4:
                iu30Var.invoke(((Boolean) ven0Var.getValue()).booleanValue() ? jc61.a : jc61.b);
                break;
            case 5:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.booleanValue();
                iu30Var.invoke(bool);
                break;
            case 6:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(i3f1.a);
                break;
            case 7:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(i3f1.b);
                break;
            case 8:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(i3f1.c);
                break;
            case 9:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(i3f1.d);
                break;
            case 10:
                Boolean bool2 = (Boolean) ven0Var.getValue();
                bool2.booleanValue();
                iu30Var.invoke(bool2);
                break;
            case 11:
                Boolean bool3 = (Boolean) ven0Var.getValue();
                bool3.booleanValue();
                iu30Var.invoke(bool3);
                break;
            case 12:
                ven0Var.setValue(Boolean.valueOf(!no80.c(ven0Var)));
                Boolean bool4 = (Boolean) ven0Var.getValue();
                bool4.booleanValue();
                iu30Var.invoke(bool4);
                break;
            case 13:
                iu30Var.invoke(((Boolean) ven0Var.getValue()).booleanValue() ? qpg1.a : rpg1.a);
                break;
            case 14:
                iu30Var.invoke(c3j1Var);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 15:
                iu30Var.invoke(c3j1Var);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 16:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                iu30Var.invoke(mv7.b);
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(dek1.a);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc21(iu30 iu30Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
    }
}

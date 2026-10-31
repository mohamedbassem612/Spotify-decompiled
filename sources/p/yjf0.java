package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yjf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yjf0(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        wm21 um21Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke((fjf0) obj);
                return rih1Var;
            case 1:
                gff0 gff0Var = (gff0) obj;
                if (gff0Var instanceof fff0) {
                    um21Var = new vm21(((fff0) gff0Var).a);
                } else {
                    if (!(gff0Var instanceof eff0)) {
                        eg.o();
                        return null;
                    }
                    um21Var = new um21(((eff0) gff0Var).a);
                }
                iu30Var.invoke(new ejf0(um21Var));
                return rih1Var;
            case 2:
                iu30Var.invoke(new flm1((List) obj));
                return rih1Var;
            case 3:
                iu30Var.invoke((glm1) obj);
                return rih1Var;
            case 4:
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                iu30Var.invoke(new eqf0(str));
                return rih1Var;
            case 5:
                iu30Var.invoke(new bqf0((String) obj));
                return rih1Var;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    iu30Var.invoke(dqf0.a);
                }
                return rih1Var;
            case 7:
                iu30Var.invoke(new fqf0((String) obj));
                return rih1Var;
            case 8:
                int iOrdinal = ((g4g0) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var.invoke(suv.a);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(ruv.a);
                }
                return rih1Var;
            case 9:
                iu30Var.invoke(new f6g0((i7g0) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(new uki0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 11:
                iu30Var.invoke(new xki0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 12:
                iu30Var.invoke(new cli0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 13:
                iu30Var.invoke(new pag0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 14:
                iu30Var.invoke(new tag0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 15:
                iu30Var.invoke(new qcg0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 16:
                iu30Var.invoke(new ddg0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 17:
                iu30Var.invoke(new adg0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 18:
                iu30Var.invoke(new xcg0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 19:
                iu30Var.invoke(new ucg0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 20:
                iu30Var.invoke(new svm0((hji0) obj));
                return rih1Var;
            case 21:
                iu30Var.invoke(rvm0.b);
                return rih1Var;
            case 22:
                iu30Var.invoke(rvm0.f);
                return rih1Var;
            case 23:
                iu30Var.invoke(rvm0.c);
                return rih1Var;
            case 24:
                iu30Var.invoke(rvm0.e);
                return rih1Var;
            case 25:
                iu30Var.invoke(new wvm0((hji0) obj));
                return rih1Var;
            case 26:
                iu30Var.invoke(vvm0.b);
                return rih1Var;
            case 27:
                iu30Var.invoke(vvm0.g);
                return rih1Var;
            case 28:
                iu30Var.invoke(vvm0.c);
                return rih1Var;
            default:
                iu30Var.invoke(vvm0.d);
                return rih1Var;
        }
    }
}

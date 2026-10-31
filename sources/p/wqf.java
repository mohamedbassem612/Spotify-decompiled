package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wqf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqf(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new v5f((m5f) obj));
                return rih1Var;
            case 1:
                iu30Var.invoke(new t4g(((Number) obj).intValue()));
                return rih1Var;
            case 2:
                wz20 wz20Var = (wz20) obj;
                if (iu30Var != null) {
                    iu30Var.invoke(Boolean.valueOf(wz20Var.b()));
                }
                return rih1Var;
            case 3:
                b671 b671Var = (b671) obj;
                if (b671Var instanceof x571) {
                    iu30Var.invoke(new oog(((x571) b671Var).a));
                    return rih1Var;
                }
                if (b671Var.equals(y571.a)) {
                    return rih1Var;
                }
                if (b671Var.equals(z571.a)) {
                    iu30Var.invoke(rog.a);
                    return rih1Var;
                }
                if (b671Var.equals(a671.a)) {
                    iu30Var.invoke(new oog(true));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 4:
                iu30Var.invoke(new wyg(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 5:
                iu30Var.invoke(Integer.valueOf((int) (((elb0) obj).b() >> 32)));
                return rih1Var;
            case 6:
                iu30Var.invoke(Integer.valueOf((int) (((elb0) obj).b() & 4294967295L)));
                return rih1Var;
            case 7:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(i300.a);
                return rih1Var;
            case 8:
                iu30Var.invoke(new gwh(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 9:
                iu30Var.invoke(new fwh((String) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(new rwh((String) obj));
                return rih1Var;
            case 11:
                iu30Var.invoke(new wyh((String) obj));
                return rih1Var;
            case 12:
                iu30Var.invoke(new wyh((String) obj));
                return rih1Var;
            case 13:
                iu30Var.invoke(new q40((x40) obj));
                return rih1Var;
            case 14:
                iu30Var.invoke(new ql0((gax) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke(new lx2(((kx2) obj).a));
                return rih1Var;
            case 16:
                iu30Var.invoke(new tt3((String) obj));
                return rih1Var;
            case 17:
                iu30Var.invoke(new dy3((String) obj));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                iu30Var.invoke(new cy3((String) obj));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                iu30Var.invoke(new y17(((Number) obj).intValue()));
                return rih1Var;
            case 20:
                iu30Var.invoke((ao7) obj);
                return rih1Var;
            case 21:
                iu30Var.invoke(new zl9(((Number) obj).floatValue()));
                return rih1Var;
            case 22:
                iu30Var.invoke(new yl9(((Number) obj).floatValue()));
                return rih1Var;
            case 23:
                iu30Var.invoke(new xm9(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 24:
                iu30Var.invoke(new ps9(((Number) obj).floatValue()));
                return rih1Var;
            case 25:
                iu30Var.invoke(new os9(((Number) obj).floatValue()));
                return rih1Var;
            case 26:
                iu30Var.invoke(new zqc(((Number) obj).intValue()));
                return rih1Var;
            case 27:
                iu30Var.invoke(new arc(((Number) obj).intValue()));
                return rih1Var;
            case 28:
                iu30Var.invoke(new vqc((gax) obj));
                return rih1Var;
            default:
                iu30Var.invoke(new y4f((w4i1) obj));
                return rih1Var;
        }
    }
}

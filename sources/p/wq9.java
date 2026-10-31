package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wq9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq9(iu30 iu30Var, ven0 ven0Var) {
        super(0);
        this.a = (byte) 0;
        this.c = ven0Var;
        this.b = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final Object invoke() {
        orf orfVar;
        mh91 mh91Var;
        byte b = this.a;
        qv10 qv10Var = qv10.a;
        bdf bdfVar = bdf.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                Long l = (Long) ven0Var.getValue();
                if (l != null) {
                    iu30Var.invoke(new sq9(l.longValue()));
                }
                break;
            case 1:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.booleanValue();
                iu30Var.invoke(bool);
                break;
            case 2:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                iu30Var.invoke(((Boolean) ven0Var.getValue()).booleanValue() ? q7x0.O0 : q7x0.P0);
                break;
            case 3:
                iu30Var.invoke(q2f.a);
                ven0Var.setValue((Object) null);
                break;
            case 4:
                ((s3f) ven0Var.getValue()).b(bdfVar, iu30Var);
                break;
            case 5:
                ((s3f) ven0Var.getValue()).b(fdf.a, iu30Var);
                break;
            case 6:
                ((s3f) ven0Var.getValue()).b(bdfVar, iu30Var);
                break;
            case 7:
                ((s3f) ven0Var.getValue()).b(bdfVar, iu30Var);
                break;
            case 8:
                ehd0 ehd0Var = (ehd0) ven0Var.getValue();
                if (ehd0Var instanceof ahd0) {
                    ahd0 ahd0Var = (ahd0) ehd0Var;
                    orfVar = new orf(ahd0Var.f, ahd0Var.c, ahd0Var.d, ahd0Var.e);
                } else {
                    orfVar = new orf(null, null, null, false);
                }
                iu30Var.invoke(orfVar);
                break;
            case 9:
                Object obj = (o16) ven0Var.getValue();
                if (obj == null) {
                    obj = n16.a;
                }
                iu30Var.invoke(obj);
                break;
            case 10:
                iu30Var.invoke(new dyj((sw31) ven0Var.getValue()));
                break;
            case 11:
                iu30Var.invoke(((g660) ven0Var.getValue()).a);
                break;
            case 12:
                ah91 ah91Var = (ah91) ven0Var.getValue();
                if (ah91Var != null && (mh91Var = ah91Var.b) != null) {
                    mh91Var.a();
                }
                iu30Var.invoke(zml.a);
                break;
            case 13:
                iu30Var.invoke(ss81.a);
                ven0Var.setValue(new pfu(true, false));
                break;
            case 14:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(uru.a);
                break;
            case 15:
                iu30Var.invoke(new e3y((String) ven0Var.getValue()));
                break;
            case 16:
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    iu30Var.invoke(qj10.a);
                }
                break;
            case 17:
                iu30Var.invoke(qv10Var);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                iu30Var.invoke(vu10.a);
                ven0Var.setValue(Boolean.FALSE);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                iu30Var.invoke(qv10Var);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 20:
                iu30Var.invoke(c3j1.a);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 21:
                boolean z2 = !((Boolean) ven0Var.getValue()).booleanValue();
                ven0Var.setValue(Boolean.valueOf(z2));
                iu30Var.invoke(new ri80(z2));
                break;
            case 22:
                ven0Var.setValue(Boolean.TRUE);
                iu30Var.invoke(vfg0.a);
                break;
            case 23:
                iu30Var.invoke(jmh0.a);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 24:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(kmh0.a);
                break;
            case 25:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(lmh0.a);
                break;
            case 26:
                i091 i091Var = (i091) ven0Var.getValue();
                if (i091Var != null) {
                    if (!i091Var.g || ebp1.q(i091Var)) {
                        z = false;
                    } else {
                        o091 o091Var = i091Var.h;
                        if ((o091Var instanceof j091) || (o091Var instanceof k091)) {
                            z = false;
                        }
                    }
                }
                iu30Var.invoke(new m300(z));
                break;
            case 27:
                iu30Var.invoke("core");
                nln.j(ven0Var, false);
                break;
            case 28:
                iu30Var.invoke("backend");
                nln.j(ven0Var, false);
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(piz0.a);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq9(iu30 iu30Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
    }
}

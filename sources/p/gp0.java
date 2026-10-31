package p;

import android.net.Uri;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp0(iu30 iu30Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        int i;
        bbr0 string;
        byte b = this.a;
        j8k0 j8k0Var = j8k0.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                gxb gxbVar = (hxb) obj;
                if (gxbVar instanceof gxb) {
                    int iC = l1d.C(gxbVar.a);
                    i = 1;
                    if (iC != 0) {
                        if (iC != 1) {
                            i = 2;
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                        } else {
                            i = 3;
                        }
                    }
                } else {
                    if (!gxbVar.equals(exb.a) && !gxbVar.equals(fxb.a)) {
                        eg.o();
                        return null;
                    }
                    i = 0;
                }
                if (i != 0) {
                    iu30Var.invoke(new oo0(i, (String) ven0Var.getValue()));
                }
                return rih1Var;
            case 1:
                c8e1 c8e1Var = (c8e1) obj;
                af5 af5Var = c8e1Var.a;
                if (af5Var.b.length() <= 500) {
                    ven0Var.setValue(c8e1Var);
                    iu30Var.invoke(af5Var.b);
                }
                return rih1Var;
            case 2:
                elb0 elb0Var = (elb0) obj;
                elb0 elb0Var2 = (elb0) ven0Var.getValue();
                if (elb0Var2 != null) {
                    iu30Var.invoke(Float.valueOf(Float.intBitsToFloat((int) (elb0Var2.K(elb0Var, 0L) & 4294967295L))));
                }
                return rih1Var;
            case 3:
                ven0Var.setValue((Throwable) obj);
                iu30Var.invoke(Boolean.TRUE);
                return rih1Var;
            case 4:
                ((s3f) ven0Var.getValue()).b((bef) obj, iu30Var);
                return rih1Var;
            case 5:
                ((s3f) ven0Var.getValue()).b(new cdf(((Boolean) obj).booleanValue()), iu30Var);
                return rih1Var;
            case 6:
                ((s3f) ven0Var.getValue()).b(new cdf(((Boolean) obj).booleanValue()), iu30Var);
                return rih1Var;
            case 7:
                ((s3f) ven0Var.getValue()).b(new cdf(((Boolean) obj).booleanValue()), iu30Var);
                return rih1Var;
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = ((pz20) ven0Var.getValue()).b;
                if (zBooleanValue) {
                    i2++;
                }
                ven0Var.setValue(new pz20(i2, zBooleanValue));
                if (zBooleanValue) {
                    iu30Var.invoke(kng.a);
                }
                return rih1Var;
            case 9:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                int i3 = ((pz20) ven0Var.getValue()).b;
                if (zBooleanValue2) {
                    i3++;
                }
                ven0Var.setValue(new pz20(i3, zBooleanValue2));
                if (zBooleanValue2) {
                    iu30Var.invoke(hng.a);
                }
                return rih1Var;
            case 10:
                yie1 yie1Var = (yie1) obj;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    iu30Var.invoke(yie1Var);
                }
                return rih1Var;
            case 11:
                String str = (String) obj;
                Uri uri = ((frn) ven0Var.getValue()).a;
                string = uri != null ? uri.toString() : null;
                if (string == null) {
                    string = "";
                }
                iu30Var.invoke(new kwk(str, string));
                return rih1Var;
            case 12:
                Boolean bool = Boolean.TRUE;
                ven0Var.setValue(bool);
                iu30Var.invoke(bool);
                return rih1Var;
            case 13:
                Boolean bool2 = Boolean.FALSE;
                ven0Var.setValue(bool2);
                iu30Var.invoke(bool2);
                return rih1Var;
            case 14:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ven0Var.setValue(bool3);
                iu30Var.invoke(bool3);
                return rih1Var;
            case 15:
                g3j1 g3j1Var = (g3j1) obj;
                if ((g3j1Var instanceof d3j1) || (g3j1Var instanceof e3j1)) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                iu30Var.invoke(g3j1Var);
                return rih1Var;
            case 16:
                ven0Var.setValue(Boolean.FALSE);
                if (((tad) obj) instanceof qad) {
                    iu30Var.invoke(qyz.a);
                }
                return rih1Var;
            case 17:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                ven0Var.setValue(bool4);
                iu30Var.invoke(bool4);
                return rih1Var;
            case 18:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                ven0Var.setValue(bool5);
                iu30Var.invoke(bool5);
                return rih1Var;
            case 19:
                no90 no90Var = (no90) obj;
                iu30Var.invoke(no90Var);
                ven0Var.setValue(no90Var);
                return rih1Var;
            case 20:
                String str2 = (String) obj;
                ven0Var.setValue(str2);
                iu30Var.invoke(str2);
                return rih1Var;
            case 21:
                ven0Var.setValue((Object) null);
                iu30Var.invoke(new aah0((bbh0) obj));
                return rih1Var;
            case 22:
                ven0Var.setValue(j8k0Var);
                iu30Var.invoke(new x7k0((tv80) obj));
                return rih1Var;
            case 23:
                ven0Var.setValue(j8k0Var);
                iu30Var.invoke(new x7k0((tv80) obj));
                return rih1Var;
            case 24:
                btn0 btn0Var = (btn0) obj;
                if (btn0Var.f instanceof zsn0) {
                    c380<btn0> c380Var = (c380) ven0Var.getValue();
                    ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                    for (btn0 btn0Var2 : c380Var) {
                        arrayList.add(new btn0(btn0Var2.a, btn0Var2.b, btn0Var2.c, btn0Var2.d, btn0Var2.e, u890.j(btn0Var2, btn0Var) ? ysn0.a : zsn0.a));
                    }
                    ven0Var.setValue(mqo1.F(arrayList));
                }
                iu30Var.invoke(new tsn0(btn0Var));
                return rih1Var;
            case 25:
                Boolean bool6 = (Boolean) obj;
                bool6.getClass();
                ven0Var.setValue(bool6);
                iu30Var.invoke(bool6);
                return rih1Var;
            case 26:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                ven0Var.setValue(bool7);
                iu30Var.invoke(bool7);
                return rih1Var;
            case 27:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                ven0Var.setValue(bool8);
                iu30Var.invoke(bool8);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                bbr0 bbr0Var = (zf30) obj;
                ven0Var.setValue(bbr0Var instanceof hcr0 ? (hcr0) bbr0Var : null);
                iu30Var.invoke(bbr0Var);
                return rih1Var;
            default:
                bbr0 bbr0Var2 = (zf30) obj;
                iu30Var.invoke(bbr0Var2);
                string = bbr0Var2 instanceof bbr0 ? bbr0Var2 : null;
                if (string != null) {
                    ven0Var.setValue(string);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp0(ven0 ven0Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.c = ven0Var;
        this.b = iu30Var;
    }
}

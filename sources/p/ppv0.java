package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ppv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppv0(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        exb exbVar = exb.a;
        fxb fxbVar = fxb.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (str.equals("https://www.spotify.com/safetyandprivacy/parental-guide/plain/")) {
                    iu30Var.invoke(new k000(str));
                } else if (str.equals("https://support.spotify.com/article/managed-accounts/plain/")) {
                    iu30Var.invoke(new i100(str));
                }
                return rih1Var;
            case 1:
                ux30 ux30Var = (wx30) obj;
                if (ux30Var instanceof tx30) {
                    iu30Var.invoke(qsv0.a);
                } else if (ux30Var instanceof vx30) {
                    iu30Var.invoke(qsv0.b);
                } else {
                    if (!(ux30Var instanceof ux30)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new psv0(ux30Var.a));
                }
                return rih1Var;
            case 2:
                iu30Var.invoke(wsv0.a);
                return rih1Var;
            case 3:
                iu30Var.invoke(((Boolean) obj).booleanValue() ? cxv0.a : bxv0.a);
                return rih1Var;
            case 4:
                ban banVar = (fan) obj;
                if (banVar.equals(can.a)) {
                    iu30Var.invoke(qzv0.a);
                } else if (banVar instanceof ban) {
                    iu30Var.invoke(new pzv0(banVar.a));
                } else if (!banVar.equals(dan.a) && !banVar.equals(ean.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 5:
                ryv0 ryv0Var = (ryv0) obj;
                if (ryv0Var instanceof pyv0) {
                    iu30Var.invoke(p0w0.a);
                } else {
                    if (!(ryv0Var instanceof qyv0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(p0w0.b);
                }
                return rih1Var;
            case 6:
                iu30Var.invoke(waw0.a);
                return rih1Var;
            case 7:
                iu30Var.invoke((xiw0) obj);
                return rih1Var;
            case 8:
                iu30Var.invoke(new z5x0((tv80) obj));
                return rih1Var;
            case 9:
                iu30Var.invoke(new d6x0((tv80) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(new qwz(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 11:
                iu30Var.invoke(new r100(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 12:
                iu30Var.invoke(new znx0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 13:
                iu30Var.invoke(new uzx0((String) obj));
                return rih1Var;
            case 14:
                iu30Var.invoke(new y1y0((tv80) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke(new z1y0((tv80) obj));
                return rih1Var;
            case 16:
                iu30Var.invoke(new w3y0((tv80) obj));
                return rih1Var;
            case 17:
                iu30Var.invoke(new x3y0((tv80) obj));
                return rih1Var;
            case 18:
                l4g0 l4g0Var = (l4g0) obj;
                iu30Var.invoke(aoy0.a);
                if (l4g0Var == l4g0.b) {
                    iu30Var.invoke(boy0.a);
                }
                return rih1Var;
            case 19:
                iu30Var.invoke(new m1z0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 20:
                iu30Var.invoke((gax) obj);
                return rih1Var;
            case 21:
                iu30Var.invoke(new qiz0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 22:
                hxb hxbVar = (hxb) obj;
                if (!hxbVar.equals(fxbVar) && !hxbVar.equals(exbVar)) {
                    if (!(hxbVar instanceof gxb)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(vjz0.a);
                }
                return rih1Var;
            case 23:
                gxb gxbVar = (hxb) obj;
                if (!gxbVar.equals(fxbVar) && !gxbVar.equals(exbVar)) {
                    if (!(gxbVar instanceof gxb)) {
                        eg.o();
                        return null;
                    }
                    int iC = l1d.C(gxbVar.a);
                    if (iC != 0 && iC != 1 && iC != 2) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(alz0.a);
                }
                return rih1Var;
            case 24:
                iu30Var.invoke(new blz0((String) obj));
                return rih1Var;
            case 25:
                iu30Var.invoke((jsz0) obj);
                return rih1Var;
            case 26:
                iu30Var.invoke(Integer.valueOf(yoi1.p(jch0.U(((Number) obj).floatValue()), 0, 5)));
                return Boolean.TRUE;
            case 27:
                iu30Var.invoke(Integer.valueOf((int) (((elb0) obj).b() & 4294967295L)));
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                iu30Var.invoke((r201) obj);
                return rih1Var;
            default:
                iu30Var.invoke(new k601(((Boolean) obj).booleanValue()));
                return rih1Var;
        }
    }
}

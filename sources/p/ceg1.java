package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ceg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ceg1(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = r7j1.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new tdg1((String) obj));
                return rih1Var;
            case 1:
                ((Boolean) obj).getClass();
                iu30Var.invoke(exz.b);
                return rih1Var;
            case 2:
                elb0 elb0Var = (elb0) obj;
                iu30Var.invoke(Integer.valueOf((int) (Float.intBitsToFloat((int) (nho1.A(elb0Var) & 4294967295L)) + ((int) (elb0Var.b() & 4294967295L)))));
                return rih1Var;
            case 3:
                int iOrdinal = ((flh1) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var.invoke(new dvv(1));
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new dvv(2));
                }
                return rih1Var;
            case 4:
                if (((bs11) obj).equals(bs11.a)) {
                    iu30Var.invoke(knh1.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                iu30Var.invoke(syh1.c);
                return rih1Var;
            case 6:
                iu30Var.invoke(new uci1((String) obj));
                return rih1Var;
            case 7:
                iu30Var.invoke(new cvi1((String) obj));
                return rih1Var;
            case 8:
                iu30Var.invoke(bvi1.a);
                return rih1Var;
            case 9:
                iu30Var.invoke((rvi1) obj);
                return rih1Var;
            case 10:
                ((qtr) obj).b(new k8y0(iu30Var, (lnm) null, (byte) 29));
                return rih1Var;
            case 11:
                iu30Var.invoke(cyi1.b);
                return rih1Var;
            case 12:
                iu30Var.invoke(new nzi1((String) obj));
                return rih1Var;
            case 13:
                iu30Var.invoke(new nzi1((String) obj));
                return rih1Var;
            case 14:
                iu30Var.invoke(new nzi1((String) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke(new nzi1((String) obj));
                return rih1Var;
            case 16:
                iu30Var.invoke(new q1j1((String) obj));
                return rih1Var;
            case 17:
                iu30Var.invoke(new q1j1((String) obj));
                return rih1Var;
            case 18:
                iu30Var.invoke(new v2j1((String) obj));
                return rih1Var;
            case 19:
                iu30Var.invoke(new f3j1("https://support.spotify.com/article/ai-persona-badge/"));
                return rih1Var;
            case 20:
                iu30Var.invoke(new e3j1());
                return rih1Var;
            case 21:
                iu30Var.invoke(new f3j1("https://support.spotify.com/article/verified-by-spotify/"));
                return rih1Var;
            case 22:
                iu30Var.invoke(new i6j1(((Boolean) obj).booleanValue()));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                int iOrdinal2 = ((h2x) obj).ordinal();
                if (iOrdinal2 == 0) {
                    obj2 = q7j1.a;
                } else if (iOrdinal2 == 1) {
                    obj2 = p7j1.a;
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        obj2 = x7j1.a;
                    } else {
                        if (iOrdinal2 != 4) {
                            eg.o();
                            return null;
                        }
                        obj2 = y7j1.a;
                    }
                }
                iu30Var.invoke(obj2);
                return rih1Var;
            case 24:
                xx10 xx10Var = (xx10) obj;
                if ((xx10Var instanceof sx10) || (xx10Var instanceof vx10) || (xx10Var instanceof wx10)) {
                    iu30Var.invoke(obj2);
                } else if (!(xx10Var instanceof tx10) && !(xx10Var instanceof ux10) && !(xx10Var instanceof rx10)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(new jjs0(((Number) obj).intValue()));
                return rih1Var;
            case 26:
                iu30Var.invoke(new jjs0(((Number) obj).intValue()));
                return rih1Var;
            case 27:
                iu30Var.invoke(new vr10((xx10) obj));
                return rih1Var;
            case 28:
                return new hnj1((String) iu30Var.invoke(obj));
            default:
                return new rxc0((String) iu30Var.invoke(obj));
        }
    }
}

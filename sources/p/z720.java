package p;

import android.view.KeyEvent;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z720 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z720(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public final Object invoke(Object obj) throws jgo0 {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                KeyEvent keyEvent = ((cpa0) obj).a;
                boolean z = true;
                if (ern1.t(keyEvent) == 1 && (toa0.a(mno1.d(keyEvent.getKeyCode()), toa0.r) || toa0.a(mno1.d(keyEvent.getKeyCode()), toa0.s))) {
                    iu30Var.invoke(p720.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                iix iixVar = (mix) obj;
                if (iixVar.equals(gix.a)) {
                    iu30Var.invoke(hd20.a);
                } else {
                    if (iixVar.equals(hix.a)) {
                        throw new jgo0();
                    }
                    if (iixVar instanceof iix) {
                        iu30Var.invoke(new id20(iixVar.a.a));
                    } else {
                        if (!(iixVar instanceof jix)) {
                            if (iixVar instanceof kix) {
                                throw new jgo0();
                            }
                            if (iixVar instanceof lix) {
                                throw new jgo0();
                            }
                            eg.o();
                            return null;
                        }
                        iu30Var.invoke(new gd20(((jix) iixVar).a.a));
                    }
                }
                return rih1Var;
            case 2:
                iu30Var.invoke(mdo.a);
                return rih1Var;
            case 3:
                iu30Var.invoke(mdo.b);
                return rih1Var;
            case 4:
                iu30Var.invoke(new yqw0((kj80) obj));
                return rih1Var;
            case 5:
                iu30Var.invoke(new xqw0((cav) obj));
                return rih1Var;
            case 6:
                iu30Var.invoke(new vqw0((o4g) obj));
                return rih1Var;
            case 7:
                iu30Var.invoke(new uqw0((ivf) obj));
                return rih1Var;
            case 8:
                iu30Var.invoke(new arw0((ces0) obj));
                return rih1Var;
            case 9:
                iu30Var.invoke(new k000((String) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(new h200((String) obj));
                return rih1Var;
            case 11:
                iu30Var.invoke(new i100((String) obj));
                return rih1Var;
            case 12:
                hxb hxbVar = (hxb) obj;
                if ((hxbVar instanceof gxb) || (hxbVar instanceof fxb)) {
                    iu30Var.invoke(ym30.b);
                } else if (!(hxbVar instanceof exb)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 13:
                if (((hxb) obj) instanceof gxb) {
                    iu30Var.invoke(in30.c);
                }
                return rih1Var;
            case 14:
                iu30Var.invoke(new ux30((String) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke(new s100(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 16:
                dj50 dj50Var = (dj50) obj;
                if (dj50Var.equals(bj50.a)) {
                    iu30Var.invoke(xm50.a);
                } else if (dj50Var.equals(aj50.a)) {
                    iu30Var.invoke(vm50.a);
                } else {
                    if (!dj50Var.equals(cj50.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(ym50.a);
                }
                return rih1Var;
            case 17:
                km50 km50Var = (km50) obj;
                if (km50Var instanceof jm50) {
                    iu30Var.invoke(rp50.a);
                } else if (km50Var instanceof hm50) {
                    iu30Var.invoke(pp50.a);
                } else {
                    if (!(km50Var instanceof im50)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(qp50.a);
                }
                return rih1Var;
            case 18:
                elb0 elb0Var = (elb0) obj;
                iu30Var.invoke(Float.valueOf(Float.intBitsToFloat((int) (elb0Var.O(0L) & 4294967295L)) + ((int) (4294967295L & elb0Var.b()))));
                return rih1Var;
            case 19:
                iu30Var.invoke(new zsi0((vcm) obj));
                return rih1Var;
            case 20:
                iu30Var.invoke(new oa60((String) obj));
                return rih1Var;
            case 21:
                iu30Var.invoke(new ma60((String) obj));
                return rih1Var;
            case 22:
                ((qtr) obj).b(new k1(iu30Var, (lnm) null, (byte) 12));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                a0n a0nVar = (c0n) obj;
                if (a0nVar instanceof a0n) {
                    iu30Var.invoke(new oh60(a0nVar.a));
                } else {
                    if (!(a0nVar instanceof b0n)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new ph60(((b0n) a0nVar).a));
                }
                return rih1Var;
            case 24:
                iu30Var.invoke(pv60.b);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(new k070((xx10) obj));
                return rih1Var;
            case 26:
                iu30Var.invoke(new wr70((String) obj));
                return rih1Var;
            case 27:
                iu30Var.invoke(new us70(((Number) obj).intValue()));
                return rih1Var;
            case 28:
                iu30Var.invoke(new kyd(((Boolean) obj).booleanValue()));
                return rih1Var;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                iu30Var.invoke(bool);
                return rih1Var;
        }
    }
}

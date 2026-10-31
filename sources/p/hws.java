package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hws extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hws(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object rguVar = qgu.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((a20) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var.invoke(pzf1.f);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(pzf1.c);
                }
                return rih1Var;
            case 1:
                iu30Var.invoke(nxi1.a);
                return rih1Var;
            case 2:
                iu30Var.invoke(new ntk1(((Number) obj).floatValue()));
                return rih1Var;
            case 3:
                iu30Var.invoke(new r7l1(((Number) obj).intValue()));
                return rih1Var;
            case 4:
                iu30Var.invoke(new e8l1(((e3k1) obj).a));
                return rih1Var;
            case 5:
                mix mixVar = (mix) obj;
                if (mixVar.equals(gix.a)) {
                    iu30Var.invoke(wtm1.a);
                } else {
                    if (!mixVar.equals(hix.a)) {
                        eg.m("Only ClearFilters and MoreFilters events are expected here");
                        return null;
                    }
                    iu30Var.invoke(xtm1.a);
                }
                return rih1Var;
            case 6:
                int iOrdinal2 = ((u8t) obj).ordinal();
                if (iOrdinal2 == 0) {
                    iu30Var.invoke(nuv.a);
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(muv.a);
                }
                return rih1Var;
            case 7:
                if (((xy71) obj) == xy71.a) {
                    iu30Var.invoke(ivt.a);
                }
                return Boolean.TRUE;
            case 8:
                if (c7u.a[((k7u) obj).ordinal()] == 1) {
                    iu30Var.invoke(b8t0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                f1x f1xVar = (h1x) obj;
                if (f1xVar.equals(e1x.a)) {
                    rguVar = ogu.a;
                } else if (f1xVar.equals(e1x.b)) {
                    rguVar = pgu.a;
                } else if (!f1xVar.equals(e1x.c)) {
                    if (f1xVar instanceof f1x) {
                        rguVar = new rgu(f1xVar.a);
                    } else {
                        if (!(f1xVar instanceof g1x)) {
                            eg.o();
                            return null;
                        }
                        rguVar = sgu.a;
                    }
                }
                iu30Var.invoke(rguVar);
                return rih1Var;
            case 10:
                xx10 xx10Var = (xx10) obj;
                if ((xx10Var instanceof sx10) || (xx10Var instanceof vx10) || (xx10Var instanceof wx10)) {
                    iu30Var.invoke(rguVar);
                } else if (!(xx10Var instanceof tx10) && !(xx10Var instanceof ux10) && !(xx10Var instanceof rx10)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 11:
                iu30Var.invoke(new ur10((xx10) obj));
                return rih1Var;
            case 12:
                return (ez00) iu30Var.invoke((String) obj);
            case 13:
                iu30Var.invoke(new it81((String) obj, 2));
                return rih1Var;
            case 14:
                iu30Var.invoke(new ucv((lia1) obj));
                return rih1Var;
            case 15:
                return new ge8((g4h1) iu30Var.invoke((cir0) obj), (byte) 2);
            case 16:
                int iOrdinal3 = ((flh1) obj).ordinal();
                if (iOrdinal3 == 0) {
                    iu30Var.invoke(new tsv(1));
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new tsv(2));
                }
                return rih1Var;
            case 17:
                iu30Var.invoke(new cvv(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 18:
                int iOrdinal4 = ((g4g0) obj).ordinal();
                if (iOrdinal4 != 0) {
                    if (iOrdinal4 != 1) {
                        eg.o();
                        return null;
                    }
                    z = false;
                }
                iu30Var.invoke(new xvv(z));
                return rih1Var;
            case 19:
                iu30Var.invoke(e3w.a);
                return rih1Var;
            case 20:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 21:
                iu30Var.invoke(new wq80((rtb0) obj));
                return rih1Var;
            case 22:
                iu30Var.invoke(new wq80((rtb0) obj));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Collections.singletonMap(rih1Var, iu30Var.invoke(obj));
            case 24:
                return Collections.singletonMap(rih1Var, iu30Var.invoke(obj));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(new e57(((yr80) obj).a));
                return rih1Var;
            case 26:
                iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a & 4294967295L)));
                return rih1Var;
            case 27:
                iu30Var.invoke(hm5.H(nho1.l((elb0) obj)));
                return rih1Var;
            case 28:
                iu30Var.invoke(hm5.H(nho1.l((elb0) obj)));
                return rih1Var;
            default:
                iu30Var.invoke((fem) obj);
                return rih1Var;
        }
    }
}

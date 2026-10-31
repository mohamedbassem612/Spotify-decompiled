package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xkb1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;

    public /* synthetic */ xkb1(mr20 mr20Var, byte b) {
        this.a = b;
        this.b = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        wkb1 wkb1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ph11 ph11Var = this.b;
        switch (b) {
            case 0:
                if (lnmVar instanceof wkb1) {
                    wkb1Var = (wkb1) lnmVar;
                    int i = wkb1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wkb1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        wkb1Var = new wkb1(this, lnmVar);
                    }
                } else {
                    wkb1Var = new wkb1(this, lnmVar);
                }
                Object obj = wkb1Var.a;
                int i2 = wkb1Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mib mibVar = new mib((byte) 19, l1d.y(obj), vr20Var);
                wkb1Var.b = 1;
                ((foc1) ph11Var).collect(mibVar, wkb1Var);
                return d9nVar;
            case 1:
                Object objCollect = ((ks4) ph11Var).collect(new cza1(vr20Var, (byte) 28), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 2:
                Object objCollect2 = ((mgb) ph11Var).collect(new qmd1(vr20Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 3:
                Object objCollect3 = ((jha1) ph11Var).collect(new qmd1(vr20Var, (byte) 3), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 4:
                Object objCollect4 = ((pya) ph11Var).collect(new qmd1(vr20Var, (byte) 27), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 5:
                Object objCollect5 = ((cly0) ph11Var).collect(new yhg1(vr20Var, (byte) 2), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 6:
                Object objCollect6 = ((h4f1) ph11Var).collect(new yhg1(vr20Var, (byte) 6), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 7:
                Object objCollect7 = ((jha1) ph11Var).collect(new yhg1(vr20Var, (byte) 12), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 8:
                Object objCollect8 = ((ycd0) ph11Var).collect(new yhg1(vr20Var, (byte) 17), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 9:
                Object objCollect9 = ((a1b1) ph11Var).collect(new yhg1(vr20Var, (byte) 22), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 10:
                Object objCollect10 = ((jha1) ph11Var).collect(new qzh1(vr20Var, (byte) 3), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 11:
                Object objCollect11 = ((jha1) ph11Var).collect(new qzh1(vr20Var, (byte) 6), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 12:
                Object objCollect12 = ((phd) ph11Var).collect(new qzh1(vr20Var, (byte) 12), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 13:
                Object objCollect13 = ((uji1) ph11Var).collect(new qzh1(vr20Var, (byte) 16), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 14:
                Object objCollect14 = ((uji1) ph11Var).collect(new qzh1(vr20Var, (byte) 20), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 15:
                Object objCollect15 = ((uji1) ph11Var).collect(new zmj1(vr20Var, (byte) 1), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 16:
                Object objCollect16 = ((ik) ph11Var).collect(new zmj1(vr20Var, (byte) 11), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 17:
                Object objCollect17 = ((tf2) ph11Var).collect(new zmj1(vr20Var, (byte) 14), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 18:
                Object objCollect18 = ph11Var.collect(new zmj1(vr20Var, (byte) 19), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 19:
                Object objCollect19 = ((uji1) ph11Var).collect(new zmj1(vr20Var, (byte) 26), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case 20:
                Object objCollect20 = ((xkb1) ph11Var).collect(new zmj1(vr20Var, (byte) 27), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect21 = ((uji1) ph11Var).collect(new zmj1(vr20Var, (byte) 29), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case 22:
                Object objCollect22 = ((xkb1) ph11Var).collect(new lpl1(vr20Var, (byte) 0), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect23 = ph11Var.collect(new lpl1(vr20Var, (byte) 21), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            default:
                Object objCollect24 = ((ek) ph11Var).collect(new lpl1(vr20Var, (byte) 29), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
        }
    }
}

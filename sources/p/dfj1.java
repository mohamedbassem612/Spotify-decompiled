package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class dfj1 extends tv30 implements vu30 {
    public static final dfj1 a = new dfj1(2, vpb1.class, "mapDataResultToState", "mapDataResultToState(Lcom/spotify/watchfeed/pivotspage/elements/videocard/VideoCardElement$Props;Lcom/spotify/kodiak/dataloader/DataResult;)Lcom/spotify/watchfeed/pivotspage/elements/videocard/VideoCardElement$State;", 1);

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    public final Object invoke(Object obj, Object obj2) {
        sqj1 sqj1Var;
        String str;
        String str2;
        kjj1 jjj1Var;
        yej1 yej1Var = (yej1) obj;
        i1r i1rVar = (k1r) obj2;
        if (!(i1rVar instanceof i1r)) {
            if (i1rVar instanceof h1r) {
                return new afj1(yej1Var);
            }
            if (i1rVar.equals(j1r.a)) {
                return new afj1(yej1Var);
            }
            eg.o();
            return null;
        }
        xej1 xej1Var = (xej1) i1rVar.a;
        bbl1 bbl1Var = xej1Var.a;
        bbl1 bbl1Var2 = xej1Var.b;
        String str3 = bbl1Var2.b;
        if (str3.length() <= 0) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = bbl1Var.b;
        }
        String str4 = str3;
        abl1 abl1Var = bbl1Var.d;
        if (abl1Var != null) {
            String str5 = abl1Var.a;
            int iC = l1d.C(abl1Var.b);
            if (iC == 0) {
                jjj1Var = new jjj1(abl1Var.c, abl1Var.d, str5);
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                jjj1Var = new kjj1(abl1Var.c, abl1Var.d, str5);
            }
            sqj1Var = new sqj1(jjj1Var, "watch-feed-pivots-video-card", new rqj1(15, false));
        } else {
            sqj1Var = null;
        }
        if (sqj1Var != null) {
            zal1 zal1Var = bbl1Var.c;
            if (zal1Var != null) {
                str = zal1Var.a;
                str2 = str;
            } else {
                str2 = null;
            }
        } else {
            zal1 zal1Var2 = bbl1Var.e;
            if (zal1Var2 != null) {
                str = zal1Var2.a;
                str2 = str;
            } else {
                str2 = null;
            }
        }
        Double d = bbl1Var.f;
        Float fValueOf = d != null ? Float.valueOf((float) d.doubleValue()) : null;
        String str6 = bbl1Var2.g;
        String str7 = str6.length() > 0 ? str6 : null;
        if (str7 == null) {
            str7 = bbl1Var.g;
        }
        return new afj1(yej1Var, str4, sqj1Var, str2, fValueOf, str7);
    }
}

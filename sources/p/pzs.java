package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pzs implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pzs(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((xy0) obj2).collect(new nzs(vr20Var, (stk1) obj, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((mr20) obj2).collect(new ryr(vr20Var, (p9t) obj, (byte) 13), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((wa3) obj2).collect(new ryr(vr20Var, (aqt) obj, (byte) 14), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                ((bpb1) obj2).collect(new k9t((byte) 13, (fut) obj, vr20Var), lnmVar);
                return d9nVar;
            case 4:
                Object objCollect4 = ((ht20) obj2).collect(new st(vr20Var, (String) obj, (byte) 29), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 5:
                mr20[] mr20VarArr = (mr20[]) obj2;
                Object objS = fc11.s(new b69(mr20VarArr, (byte) 11), lnmVar, vr20Var, new uls((lnm) null, (nwt) obj, (byte) 4), mr20VarArr);
                return objS == d9nVar ? objS : rih1Var;
            case 6:
                Object objCollect5 = ((mr20) obj2).collect(new ryr(vr20Var, (g0l) obj, (byte) 15), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 7:
                Object objCollect6 = ((pzs) obj2).collect(new g7u(vr20Var, (yjq) obj, (byte) 0), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 8:
                Object objCollect7 = ((xy0) obj2).collect(new g7u(vr20Var, (yjq) obj, (byte) 1), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 9:
                Object objCollect8 = ((xy0) obj2).collect(new k9t((byte) 28, (zmu) obj, vr20Var), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 10:
                Object objCollect9 = ((kge) obj2).collect(new inu(vr20Var, (p5y) obj), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 11:
                Object objCollect10 = ((mr20) obj2).collect(new ryr(vr20Var, (ttw0) obj, (byte) 17), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 12:
                Object objCollect11 = ((mr20) obj2).collect(new ryr(vr20Var, (bbv) obj, (byte) 18), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 13:
                Object objCollect12 = ((any) obj2).collect(new ryr(vr20Var, (dfv) obj, (byte) 19), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 14:
                Object objCollect13 = ((p3t) obj2).collect(new ryr(vr20Var, (uhv) obj, (byte) 20), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 15:
                Object objCollect14 = ((mr20) obj2).collect(new ryr(vr20Var, (jut) obj, (byte) 21), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 16:
                Object objCollect15 = ((ve01) obj2).a.collect(new ryr(vr20Var, (lwv) obj, (byte) 22), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 17:
                Object objCollect16 = ((fu20) obj2).collect(new t1x(vr20Var, (z1x) obj, (byte) 2), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 18:
                Object objCollect17 = ((ezc) obj2).collect(new ryr(vr20Var, (u5x) obj, (byte) 24), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 19:
                Object objCollect18 = ((mr20) obj2).collect(new ryr(vr20Var, (Integer) obj, (byte) 25), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 20:
                Object objCollect19 = ((mr20) obj2).collect(new ryr(vr20Var, (e1y) obj, (byte) 26), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect20 = ((ht20) obj2).collect(new ryr(vr20Var, (myq0) obj, (byte) 27), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case 22:
                Object objCollect21 = ((mr20) obj2).collect(new zr1(vr20Var, (c380) obj, (byte) 1), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect22 = ((mr20) obj2).collect(new ryr(vr20Var, (uvy) obj, (byte) 29), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect23 = ((zob1) obj2).collect(new u5z(vr20Var, (d281) obj, (byte) 0), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                ((ay8) obj2).collect(new u5z(vr20Var, (q6z) obj, (byte) 1), lnmVar);
                return d9nVar;
            case 26:
                Object objCollect24 = ((mr20) obj2).collect(new u5z(vr20Var, (o811) obj, (byte) 2), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 27:
                Object objCollect25 = ((hs6) obj2).collect(new l6z((byte) 4, (laz) obj, vr20Var), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 28:
                Object objCollect26 = ((m441) obj2).collect(new u5z(vr20Var, (itz) obj, (byte) 3), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            default:
                Object objCollect27 = ((nwd) obj2).collect(new l6z((byte) 8, (ttz) obj, vr20Var), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
        }
    }
}

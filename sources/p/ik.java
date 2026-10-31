package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ik implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;

    public /* synthetic */ ik(mr20 mr20Var, byte b) {
        this.a = b;
        this.b = mr20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 8;
        byte b3 = 11;
        byte b4 = 13;
        byte b5 = 15;
        byte b6 = 20;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mgb mgbVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((ek) mgbVar).collect(new mf(vr20Var, (byte) 3), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((any) mgbVar).collect(new mf(vr20Var, (byte) 15), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((ik) mgbVar).collect(new mf(vr20Var, (byte) 16), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((xy0) mgbVar).collect(new pl1(vr20Var, (byte) 8), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((gk) mgbVar).collect(new w93(vr20Var, (byte) 5), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((ik) mgbVar).collect(new w93(vr20Var, (byte) 6), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((xy0) mgbVar).collect(new w93(vr20Var, (byte) 12), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((u70) mgbVar).collect(new w93(vr20Var, (byte) 13), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ((u70) mgbVar).collect(new w93(vr20Var, (byte) 16), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ((u70) mgbVar).collect(new w93(vr20Var, (byte) 19), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ((u70) mgbVar).collect(new w93(vr20Var, (byte) 22), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = ((nf) mgbVar).collect(new tv5(vr20Var, (byte) 0), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = ((g16) mgbVar).collect(new tv5(vr20Var, (byte) 4), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = ((hs6) mgbVar).collect(new nz7(vr20Var, (byte) 13), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                Object objCollect15 = mgbVar.collect(new nz7(vr20Var, (byte) 15), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 15:
                Object objCollect16 = ((nf) mgbVar).collect(new nz7(vr20Var, (byte) 18), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 16:
                Object objCollect17 = ((nf) mgbVar).collect(new nz7(vr20Var, (byte) 25), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 17:
                Object objCollect18 = ((ir9) mgbVar).collect(new nz7(vr20Var, (byte) 29), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 18:
                Object objCollect19 = ((ir9) mgbVar).collect(new bt9(vr20Var, (byte) 2), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case 19:
                Object objCollect20 = ((yc2) mgbVar).collect(new bt9(vr20Var, (byte) 12), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case 20:
                Object objCollect21 = ((c64) mgbVar).collect(new bt9(vr20Var, (byte) 20), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect22 = ((uji1) mgbVar).collect(new vnb(vr20Var, (byte) 9), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 22:
                Object objCollect23 = ((lt0) mgbVar).collect(new vnb(vr20Var, (byte) 11), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect24 = ((ped) mgbVar).collect(new vnb(vr20Var, (byte) 20), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect25 = ((nwd) mgbVar).collect(new y3e(vr20Var, b2), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect26 = ((te1) mgbVar).collect(new y3e(vr20Var, b3), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            case 26:
                Object objCollect27 = ((te1) mgbVar).collect(new y3e(vr20Var, b4), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
            case 27:
                Object objCollect28 = ((te1) mgbVar).collect(new y3e(vr20Var, b5), lnmVar);
                return objCollect28 == d9nVar ? objCollect28 : rih1Var;
            case 28:
                Object objCollect29 = ((xy0) mgbVar).collect(new y3e(vr20Var, b6), lnmVar);
                return objCollect29 == d9nVar ? objCollect29 : rih1Var;
            default:
                Object objCollect30 = mgbVar.collect(new kmf(vr20Var, (byte) 25), lnmVar);
                return objCollect30 == d9nVar ? objCollect30 : rih1Var;
        }
    }
}

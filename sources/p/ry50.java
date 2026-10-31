package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ry50 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;

    public /* synthetic */ ry50(mr20 mr20Var, byte b) {
        this.a = b;
        this.b = mr20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 16;
        byte b4 = 24;
        byte b5 = 26;
        byte b6 = 17;
        byte b7 = 18;
        byte b8 = 28;
        byte b9 = 6;
        byte b10 = 7;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new uk50(vr20Var, b9), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = mr20Var.collect(new uk50(vr20Var, b10), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = mr20Var.collect(new uk50(vr20Var, (byte) 13), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = mr20Var.collect(new uk50(vr20Var, (byte) 20), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = mr20Var.collect(new gw60(vr20Var, (byte) 6), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = mr20Var.collect(new gw60(vr20Var, (byte) 7), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = mr20Var.collect(new gw60(vr20Var, (byte) 8), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = mr20Var.collect(new gw60(vr20Var, (byte) 10), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = mr20Var.collect(new gw60(vr20Var, (byte) 14), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = mr20Var.collect(new gw60(vr20Var, (byte) 15), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = mr20Var.collect(new gw60(vr20Var, (byte) 16), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = mr20Var.collect(new gw60(vr20Var, (byte) 24), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = mr20Var.collect(new gw60(vr20Var, (byte) 25), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = mr20Var.collect(new gw60(vr20Var, (byte) 26), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                Object objCollect15 = mr20Var.collect(new cg90(vr20Var, b9), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 15:
                Object objCollect16 = mr20Var.collect(new cg90(vr20Var, b10), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 16:
                Object objCollect17 = mr20Var.collect(new cg90(vr20Var, b2), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 17:
                Object objCollect18 = mr20Var.collect(new cg90(vr20Var, (byte) 11), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 18:
                Object objCollect19 = mr20Var.collect(new cg90(vr20Var, (byte) 12), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case 19:
                Object objCollect20 = mr20Var.collect(new cg90(vr20Var, b3), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case 20:
                Object objCollect21 = mr20Var.collect(new cg90(vr20Var, b6), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect22 = mr20Var.collect(new cg90(vr20Var, b7), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 22:
                Object objCollect23 = mr20Var.collect(new cg90(vr20Var, b4), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect24 = mr20Var.collect(new cg90(vr20Var, b5), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect25 = mr20Var.collect(new cg90(vr20Var, b8), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect26 = mr20Var.collect(new cg90(vr20Var, (byte) 29), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            case 26:
                Object objCollect27 = mr20Var.collect(new w0b0(vr20Var, (byte) 17), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
            case 27:
                Object objCollect28 = mr20Var.collect(new w0b0(vr20Var, (byte) 18), lnmVar);
                return objCollect28 == d9nVar ? objCollect28 : rih1Var;
            case 28:
                Object objCollect29 = mr20Var.collect(new w0b0(vr20Var, (byte) 27), lnmVar);
                return objCollect29 == d9nVar ? objCollect29 : rih1Var;
            default:
                Object objCollect30 = mr20Var.collect(new w0b0(vr20Var, (byte) 28), lnmVar);
                return objCollect30 == d9nVar ? objCollect30 : rih1Var;
        }
    }
}

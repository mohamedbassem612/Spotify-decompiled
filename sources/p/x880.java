package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x880 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x880(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 9;
        byte b3 = 13;
        byte b4 = 19;
        byte b5 = 3;
        byte b6 = 26;
        byte b7 = 28;
        byte b8 = 0;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((mr20) obj2).collect(new om70(vr20Var, (y880) obj, b5), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((huz) obj2).collect(new om70(vr20Var, (uh80) obj, (byte) 5), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((mr20) obj2).collect(new gw60(vr20Var, (bz80) obj), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((any) obj2).collect(new om70(vr20Var, (t290) obj, (byte) 6), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((ezc) obj2).collect(new cg90(b8, (dg90) obj, vr20Var), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((mr20) obj2).collect(new cg90(b2, (cs90) obj, vr20Var), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                ((dt71) obj2).collect(new om70(vr20Var, (ov90) obj, (byte) 7), lnmVar);
                return d9nVar;
            case 7:
                Object objCollect7 = ((mr20) obj2).collect(new cg90((byte) 15, (cs90) obj, vr20Var), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 8:
                Object objCollect8 = ((mr20) obj2).collect(new om70(vr20Var, (y2a0) obj, (byte) 8), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 9:
                Object objCollect9 = ((mr20) obj2).collect(new om70(vr20Var, (b0a0) obj, b2), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 10:
                Object objCollect10 = ((mr20) obj2).collect(new cg90(b4, (pt) obj, vr20Var), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 11:
                Object objCollect11 = ((mr20) obj2).collect(new om70(vr20Var, (g6a0) obj, (byte) 10), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 12:
                Object objCollect12 = ((x880) obj2).collect(new dzt(vr20Var, (String) obj, (byte) 28), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 13:
                Object objCollect13 = ((ry50) obj2).collect(new om70(vr20Var, (rqa0) obj, (byte) 11), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 14:
                Object objCollect14 = ((mr20) obj2).collect(new om70(vr20Var, (oza0) obj, b3), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 15:
                Object objCollect15 = ((ezc) obj2).collect(new om70(vr20Var, (s0b0) obj, (byte) 14), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 16:
                ((ay8) obj2).collect(new v6w(vr20Var, (ArrayList) obj, (byte) 1), lnmVar);
                return d9nVar;
            case 17:
                Object objCollect16 = ((any) obj2).collect(new nw9(vr20Var, (Set) obj, (byte) 13), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 18:
                Object objCollect17 = ((ezc) obj2).collect(new om70(vr20Var, (ffb0) obj, (byte) 16), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 19:
                Object objCollect18 = ((mr20) obj2).collect(new om70(vr20Var, (r6c0) obj, (byte) 18), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 20:
                Object objCollect19 = ((fu20) obj2).collect(new om70(vr20Var, (zdc0) obj, b4), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect20 = ((mr20) obj2).collect(new om70(vr20Var, (uqg) obj, (byte) 20), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case 22:
                mr20[] mr20VarArr = (mr20[]) obj2;
                Object objS = fc11.s(new ua3(mr20VarArr, (byte) 26), lnmVar, vr20Var, new zz90((lnm) null, (boolean[]) obj, (byte) 3), mr20VarArr);
                return objS == d9nVar ? objS : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect21 = ((mr20) obj2).collect(new om70(vr20Var, (ouc0) obj, (byte) 24), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect22 = ((mr20) obj2).collect(new om70(vr20Var, (wsc0) obj, (byte) 25), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect23 = ((mr20) obj2).collect(new om70(vr20Var, (qoa0) obj, b6), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 26:
                Object objCollect24 = ((mr20) obj2).collect(new om70(vr20Var, (g4d0) obj, b7), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 27:
                Object objCollect25 = ((jge) obj2).collect(new om70(vr20Var, (k1a0) obj, (byte) 29), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 28:
                Object objCollect26 = ((vvu) obj2).collect(new i7d0(vr20Var, (wj3) obj, (byte) 0), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            default:
                Object objCollect27 = ((x880) obj2).collect(new i7d0(vr20Var, (wj3) obj, (byte) 1), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
        }
    }
}

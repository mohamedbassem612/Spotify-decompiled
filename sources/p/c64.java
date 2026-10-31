package p;

import android.net.nsd.NsdManager;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c64 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c64(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 8;
        byte b3 = 0;
        byte b4 = 1;
        byte b5 = 22;
        byte b6 = 24;
        byte b7 = 2;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((any) obj2).collect(new vt(vr20Var, (g23) obj, (byte) 29), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((lt20) obj2).collect(new f64(vr20Var, (qie) obj, b3), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((ezc) obj2).collect(new f64(vr20Var, (jj4) obj, b4), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                mr20[] mr20VarArr = (mr20[]) obj2;
                Object objS = fc11.s(new ua3(mr20VarArr, (byte) 2), lnmVar, vr20Var, new qt((lnm) null, (Map) obj, (byte) 8), mr20VarArr);
                return objS == d9nVar ? objS : rih1Var;
            case 4:
                Object objCollect4 = ((mr20) obj2).collect(new f64(vr20Var, (ys4) obj, b7), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 5:
                Object objCollect5 = ((ezc) obj2).collect(new f64(vr20Var, (NsdManager) obj, (byte) 3), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 6:
                Object objCollect6 = ((fu20) obj2).collect(new f64(vr20Var, (my5) obj, (byte) 4), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 7:
                Object objCollect7 = ((f5y0) obj2).collect(new q86(vr20Var, (x86) obj, (byte) 2), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 8:
                ((ay8) obj2).collect(new f64(vr20Var, (ey81) obj, (byte) 6), lnmVar);
                return d9nVar;
            case 9:
                Object objCollect8 = ((mr20) obj2).collect(new f64(vr20Var, (jr6) obj, (byte) 7), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 10:
                Object objCollect9 = ((vd0) obj2).collect(new f64(vr20Var, (d520) obj, b2), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 11:
                Object objCollect10 = ((te1) obj2).collect(new f64(vr20Var, (bv6) obj, (byte) 9), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 12:
                Object objCollect11 = ((xe01) obj2).a.collect(new f64(vr20Var, (vv6) obj, (byte) 10), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 13:
                ((ay8) obj2).collect(new f64(vr20Var, (x27) obj, (byte) 11), lnmVar);
                return d9nVar;
            case 14:
                Object objCollect12 = ((ezc) obj2).collect(new tv5((byte) 22, (y87) obj, vr20Var), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 15:
                ((bpb1) obj2).collect(new tv5((byte) 24, (ec7) obj, vr20Var), lnmVar);
                return d9nVar;
            case 16:
                Object objCollect13 = ((mfe) obj2).collect(new qz7(vr20Var, (yqg) obj, (byte) 0), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 17:
                Object objCollect14 = ((huz) obj2).collect(new f64(vr20Var, (kr60) obj, (byte) 13), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 18:
                Object objCollect15 = ((plu) obj2).collect(new f64(vr20Var, (z38) obj, (byte) 14), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 19:
                Object objCollect16 = ((ezc) obj2).collect(new f64(vr20Var, (yc8) obj, (byte) 15), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 20:
                Object objCollect17 = ((vd0) obj2).collect(new f64(vr20Var, (em0) obj, (byte) 16), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect18 = ((ik) obj2).collect(new f64(vr20Var, (ic9) obj, (byte) 18), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 22:
                Object objCollect19 = ((ezc) obj2).collect(new f64(vr20Var, (r65) obj, (byte) 19), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect20 = ((c64) obj2).collect(new qz7(vr20Var, (yqg) obj, (byte) 1), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect21 = ((ezc) obj2).collect(new nz7(vr20Var, (zo8) obj), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect22 = ((mr20) obj2).collect(new f64(vr20Var, (zjd1) obj, (byte) 21), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 26:
                Object objCollect23 = ((huz) obj2).collect(new f64(vr20Var, (ic9) obj, b5), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 27:
                Object objCollect24 = ((ik) obj2).collect(new f64(vr20Var, (n1b) obj, b6), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 28:
                Object objCollect25 = ((x72) obj2).collect(new f64(vr20Var, (x1b) obj, (byte) 25), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            default:
                Object objCollect26 = ((any) obj2).collect(new f64(vr20Var, (h3b) obj, (byte) 26), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
        }
    }
}

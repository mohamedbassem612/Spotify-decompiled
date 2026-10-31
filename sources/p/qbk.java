package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qbk implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qbk(mr20 mr20Var, Object obj, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 28;
        byte b3 = 3;
        byte b4 = 1;
        byte b5 = 0;
        byte b6 = 11;
        byte b7 = 10;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new g4c(vr20Var, (nbk) obj, (byte) 25), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((nwd) ezcVar).collect(new g4c(vr20Var, (djk) obj, (byte) 27), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ezcVar.collect(new g4c(vr20Var, (k1r) obj, (byte) 28), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((lt20) ezcVar).collect(new g4c(vr20Var, (z2h) obj, (byte) 29), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ezcVar.collect(new x1h(b2, (u0l) obj, vr20Var), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ezcVar.collect(new t0l(vr20Var, (u0l) obj, b5), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((xe01) ezcVar).a.collect(new t0l(vr20Var, (p1l) obj, b4), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((wef) ezcVar).collect(new t0l(vr20Var, (j2l) obj, (byte) 2), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ((nwd) ezcVar).collect(new t0l(vr20Var, (c3l) obj, b3), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ezcVar.collect(new t0l(vr20Var, (d4l) obj, (byte) 4), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ((xe01) ezcVar).a.collect(new mib(vr20Var, (lls0) obj, (byte) 3), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                ((ay8) ezcVar).collect(new y0l(vr20Var, (xll) obj), lnmVar);
                return d9nVar;
            case 12:
                Object objCollect12 = ((any) ezcVar).collect(new t0l(vr20Var, (rsl) obj, (byte) 6), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 13:
                Object objCollect13 = ezcVar.collect(new iwl(vr20Var, (k8g1) obj), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 14:
                ((ay8) ezcVar).collect(new t0l(vr20Var, (iun0) obj, (byte) 7), lnmVar);
                return d9nVar;
            case 15:
                Object objCollect14 = ((m441) ezcVar).collect(new st(vr20Var, (String) obj, (byte) 23), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 16:
                Object objCollect15 = ezcVar.collect(new t0l(vr20Var, (dom) obj, (byte) 9), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 17:
                ((ay8) ezcVar).collect(new ulm((byte) 1, (d82) obj, vr20Var), lnmVar);
                return d9nVar;
            case 18:
                Object objCollect16 = ((ve01) ezcVar).a.collect(new d7n(vr20Var, (iu30) obj, (byte) 0), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 19:
                Object objCollect17 = ((xe01) ezcVar).a.collect(new t0l(vr20Var, (cp11) obj, b7), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 20:
                Object objCollect18 = ((jge) ezcVar).collect(new ulm((byte) 10, (cp31) obj, vr20Var), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect19 = ((te1) ezcVar).collect(new ulm((byte) 11, (cp31) obj, vr20Var), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case 22:
                Object objCollect20 = ezcVar.collect(new t0l(vr20Var, (ddo) obj, b6), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect21 = ezcVar.collect(new t0l(vr20Var, (yjo) obj, (byte) 13), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect22 = ezcVar.collect(new ulm((byte) 26, (dlo) obj, vr20Var), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect23 = ((kge) ezcVar).collect(new wmo(b7, (gal) obj, vr20Var), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 26:
                Object objCollect24 = ((any) ezcVar).collect(new wmo((byte) 17, (fb3) obj, vr20Var), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 27:
                Object objCollect25 = ((m441) ezcVar).collect(new mib(vr20Var, (vdr) obj, (byte) 5), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 28:
                Object objCollect26 = ezcVar.collect(new t0l(vr20Var, (her) obj, (byte) 15), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            default:
                Object objCollect27 = ezcVar.collect(new t0l(vr20Var, (rer) obj, (byte) 16), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
        }
    }
}

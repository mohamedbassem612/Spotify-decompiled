package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f5y0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f5y0(mr20 mr20Var, Object obj, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) throws Throwable {
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 8;
        byte b4 = 10;
        byte b5 = 13;
        byte b6 = 9;
        byte b7 = 12;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((c1v0) ezcVar).collect(new z4y0(vr20Var, (i5y0) obj, (byte) 2), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((x72) ezcVar).collect(new s4q0((Object) vr20Var, obj, (byte) 27), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ezcVar.collect(new v4y0((byte) 10, (l0x0) obj, vr20Var), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ezcVar.collect(new v4y0((byte) 21, (dpy0) obj, vr20Var), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((evz) ezcVar).collect(new s4q0((Object) vr20Var, obj, (byte) 28), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ezcVar.collect(new s4q0((Object) vr20Var, obj, (byte) 29), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ezcVar.collect(new tzy0((Object) vr20Var, obj, (byte) 0), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ezcVar.collect(new tzy0((Object) vr20Var, obj, (byte) 1), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ezcVar.collect(new tzy0(vr20Var, (oez0) obj, b2), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ((xe01) ezcVar).a.collect(new g6z0(b7, (dxz0) obj, vr20Var), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ((ek) ezcVar).collect(new ku2(vr20Var, (List) obj, b3), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                ((ay8) ezcVar).collect(new tzy0((Object) vr20Var, obj, (byte) 3), lnmVar);
                return d9nVar;
            case 12:
                Object objCollect12 = ((mt) ezcVar).collect(new tzy0((Object) vr20Var, obj, (byte) 4), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 13:
                Object objCollect13 = ezcVar.collect(new tzy0((Object) vr20Var, obj, (byte) 7), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 14:
                ((ay8) ezcVar).collect(new tzy0(vr20Var, (Locale) obj, b3), lnmVar);
                return d9nVar;
            case 15:
                ((ay8) ezcVar).collect(new tzy0(vr20Var, (cm0) obj, b6), lnmVar);
                return d9nVar;
            case 16:
                Object objCollect14 = ((iib) ezcVar).collect(new wl01((byte) 5, (dw01) obj, vr20Var), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 17:
                Object objCollect15 = ((wen0) ezcVar).collect(new tzy0(vr20Var, (a511) obj, b4), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 18:
                ((ay8) ezcVar).collect(new tzy0((Object) vr20Var, obj, (byte) 11), lnmVar);
                return d9nVar;
            case 19:
                Object objCollect16 = ezcVar.collect(new wl01((byte) 12, (hi11) obj, vr20Var), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 20:
                Object objCollect17 = ((f5y0) ezcVar).collect(new wl01((byte) 13, (hi11) obj, vr20Var), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect18 = ((plu) ezcVar).collect(new tzy0(vr20Var, (hi11) obj, b7), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 22:
                Object objCollect19 = ((kge) ezcVar).collect(new mib(vr20Var, (yqg) obj, (byte) 16), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect20 = ezcVar.collect(new tzy0(vr20Var, (o021) obj, b5), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect21 = ((any) ezcVar).collect(new tzy0((Object) vr20Var, obj, (byte) 17), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect22 = ezcVar.collect(new tzy0((Object) vr20Var, obj, (byte) 18), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 26:
                Object objCollect23 = ((dwv) ezcVar).collect(new tzy0((Object) vr20Var, obj, (byte) 19), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 27:
                Object objCollect24 = ((lt20) ezcVar).collect(new ml21(vr20Var, (ne) obj), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 28:
                Object objCollect25 = ezcVar.collect(new tzy0((Object) vr20Var, obj, (byte) 20), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            default:
                Object objCollect26 = ezcVar.collect(new ku2(vr20Var, (List) obj, b6), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
        }
    }
}

package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ipr implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ipr(byte b, Object obj, String str, mr20 mr20Var) {
        this.a = b;
        this.c = mr20Var;
        this.b = str;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        vu20 vu20Var;
        vr20 vr20Var2;
        p811 p811Var;
        byte b = this.a;
        byte b2 = 5;
        int i = 0;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                Object objCollect = ((kge) obj3).collect(new wem(vr20Var, (lpr) obj, (String) obj2, b2), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((mr20) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 6), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                ((ay8) obj3).collect(new tls(vr20Var, (ams) obj, (String) obj2, (byte) 0), lnmVar);
                return d9nVar;
            case 3:
                Object objCollect3 = ((xs4) obj3).collect(new tls(vr20Var, (ams) obj, (String) obj2, (byte) 1), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 4:
                Object objCollect4 = ((mr20) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 7), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 5:
                Object objCollect5 = ((m441) obj3).collect(new iwl(vr20Var, (oi) obj, (k8g1) obj2), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 6:
                Object objCollect6 = ((syt) obj3).collect(new uyt(vr20Var, (ezt) obj, (oxt) obj2, (byte) 1), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 7:
                Object objCollect7 = ((ezc) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 8), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 8:
                Object objCollect8 = ((mr20) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 10), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 9:
                Object objCollect9 = ((mr20) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 11), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 10:
                ((ay8) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 13), lnmVar);
                return d9nVar;
            case 11:
                Object objCollect10 = ((ht20) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 14), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 12:
                Object objCollect11 = ((mr20) obj3).collect(new w010(vr20Var, (iu30) obj, obj2, (byte) 1), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 13:
                Object objCollect12 = ((mr20) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 15), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 14:
                Object objCollect13 = ((mr20) obj3).collect(new wem((Object) vr20Var, obj2, obj, (byte) 16), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 15:
                ((ay8) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 17), lnmVar);
                return d9nVar;
            case 16:
                if (lnmVar instanceof vu20) {
                    vu20Var = (vu20) lnmVar;
                    int i2 = vu20Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        vu20Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        vu20Var = new vu20(this, lnmVar);
                    }
                } else {
                    vu20Var = new vu20(this, lnmVar);
                }
                Object obj4 = vu20Var.a;
                int i3 = vu20Var.b;
                if (i3 == 0) {
                    p811 p811VarU = cy30.u(obj4);
                    p811VarU.a = obj3;
                    vu20Var.d = vr20Var;
                    vu20Var.e = p811VarU;
                    vu20Var.f = 0;
                    vu20Var.b = 1;
                    if (vr20Var.emit(obj3, vu20Var) != d9nVar) {
                        vr20Var2 = vr20Var;
                        p811Var = p811VarU;
                    }
                    return d9nVar;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = vu20Var.f;
                p811Var = vu20Var.e;
                vr20Var2 = vu20Var.d;
                hm5.M(obj4);
                e8m e8mVar = new e8m(p811Var, (xu30) obj2, vr20Var2, (byte) 3);
                vu20Var.d = null;
                vu20Var.e = null;
                vu20Var.f = i;
                vu20Var.b = 2;
                if (((mr20) obj).collect(e8mVar, vu20Var) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 17:
                Object objCollect14 = ((ld2) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 22), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 18:
                Object objCollect15 = ((ezc) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 23), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 19:
                Object objCollect16 = ((xs4) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 24), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 20:
                Object objCollect17 = ((mr20) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 26), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                Object objCollect18 = ((uji1) obj3).collect(new wem((Object) vr20Var, obj, obj2, (byte) 27), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 22:
                Object objCollect19 = ((xe01) obj3).a.collect(new wem((Object) vr20Var, obj, obj2, (byte) 28), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                Object objCollect20 = ((kge) obj3).collect(new ap70(vr20Var, (jl1) obj, (hti0) obj2, (byte) 0), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Object objCollect21 = ((ezc) obj3).collect(new v880(vr20Var, (y880) obj, (gpt) obj2, (byte) 0), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                Object objCollect22 = ((mr20) obj3).collect(new ap70(vr20Var, (hm90) obj, (List) obj2, (byte) 3), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 26:
                Object objCollect23 = ((ezc) obj3).collect(new ap70(vr20Var, (m7c0) obj, (dma1) obj2, (byte) 4), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 27:
                Object objCollect24 = ((lt0) obj3).collect(new lsc0(vr20Var, (String) obj2, (rsc0) obj, (byte) 0), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 28:
                Object objCollect25 = ((lt0) obj3).collect(new ap70(vr20Var, (qvc0) obj, (rsc0) obj2, (byte) 5), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            default:
                Object objCollect26 = ((php0) obj3).collect(new lsc0(vr20Var, (String) obj2, (rsc0) obj, (byte) 1), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
        }
    }

    public /* synthetic */ ipr(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}

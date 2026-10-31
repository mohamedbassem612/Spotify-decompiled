package p;

import com.spotify.concertcampaignview.v1.CampaignRoutingWithStatus;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c2i extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2i(jd6 jd6Var, v6o v6oVar, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 25;
        this.b = jd6Var;
        this.c = v6oVar;
        this.f = qim0Var;
        this.d = iu30Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                ((cce) obj6).a(iP, (o0i) obj5, (z0i) obj4, (b0k) obj, (qim0) obj3);
                break;
            case 1:
                ((Number) obj2).intValue();
                ((cce) obj6).c((o0i) obj5, (z0i) obj4, (w0i) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ((luj) obj6).c((lzn0) obj5, (gw70) obj4, (mhq0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                ((luj) obj6).e((xfx) obj5, (lzn0) obj4, (jzg1) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                fae1.a((vme0) obj6, (iu30) obj5, (fad0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                fq7.o((uyl) obj6, (uyl) obj5, (qyl) obj4, (vu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                fq7.p((qyl) obj6, (uyl) obj5, (uyl) obj4, (uyl) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                ((p2o0) obj6).f((CampaignRoutingWithStatus) obj5, (tyq) obj4, (u7h) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                ((p2o0) obj6).j((String) obj5, (String) obj4, (u7h) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                ((g1i) obj6).e((upb0) obj5, (String) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                mp10.d((zbm) obj6, (String) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                ((etl) obj6).c((dtl) obj5, (iu30) obj4, (ksw) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                zpn1.c((w0m) obj6, (cx0) obj5, (ujo) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                ((f8m) obj6).a((k7m) obj5, (kes) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                q0o1.a((qim0) obj3, (ut9) obj6, (j2i) obj5, (xu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                fxm.c((ywm) obj6, (d0r) obj5, (o3r) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 16:
                ((Number) obj2).intValue();
                oho1.b((jym) obj6, (tyq) obj5, (d0r) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 17:
                ((Number) obj2).intValue();
                oho1.q((gym) obj6, (tyq) obj5, (d0r) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 18:
                ((Number) obj2).intValue();
                ((f70) obj6).k((v9n) obj5, (iu30) obj4, (ksw) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 19:
                ((Number) obj2).intValue();
                ((ldo) obj6).o((ann) obj5, (qnn) obj4, (gbx) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 20:
                ((Number) obj2).intValue();
                ((ham) obj6).a((ihm0) obj5, (iu30) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                ((ham) obj6).b((ihm0) obj5, (iu30) obj4, (vzq0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 22:
                ((Number) obj2).intValue();
                ((ham) obj6).c((ihm0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                ((w0o) obj6).c((t0o) obj4, (o0i) obj5, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                ((Number) obj2).intValue();
                ((sd5) obj6).d((e3o) obj4, (o0i) obj5, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                ((jd6) obj6).f((v6o) obj5, (qim0) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 26:
                ((Number) obj2).intValue();
                ((ldo) obj6).i((edo) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 27:
                ((Number) obj2).intValue();
                ((ldo) obj6).s((fdo) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 28:
                ((Number) obj2).intValue();
                tyo1.b((puo) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                g2p1.n((h2r) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2i(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = obj4;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2i(o1i o1iVar, z0i z0iVar, o0i o0iVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = o1iVar;
        this.d = z0iVar;
        this.c = o0iVar;
        this.f = qim0Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2i(qim0 qim0Var, ut9 ut9Var, j2i j2iVar, xu30 xu30Var, int i) {
        super(2);
        this.a = (byte) 14;
        this.f = qim0Var;
        this.b = ut9Var;
        this.c = j2iVar;
        this.d = xu30Var;
        this.e = i;
    }
}

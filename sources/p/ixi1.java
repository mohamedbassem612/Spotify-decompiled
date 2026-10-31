package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ixi1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixi1(d5m1 d5m1Var, quc0 quc0Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 17;
        this.c = d5m1Var;
        this.d = quc0Var;
        this.e = function0;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qyo1.h((oyi1) obj5, (xfx) obj3, (Function0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                qyo1.j((xtb0) obj5, (kyi1) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                tyo1.d((zxi1) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                i0p1.i((qn30) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                ((g2z) obj5).q((zej1) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                ((yxb0) obj5).g((vhj1) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                int i2 = this.b;
                b2p1.j((jlw0) obj5, (jlw0) obj3, i2, (String) obj4, (b0k) obj, iP);
                break;
            case 7:
                ((Number) obj2).intValue();
                f2p1.n((g2c) obj5, (adj1) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                o4p1.h((cwj1) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                r4p1.g((hwj1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                ((oxj1) obj5).f((i2c) obj3, (ycl1) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                bbp1.e((zeu) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                c97.f((qwk1) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                ((hyk1) obj5).c((vwv0) obj3, (String) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                brl.d((jkr0) obj5, (idn0) obj3, (Function0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                jch0.i((float[]) obj5, (qim0) obj3, (ldl1) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 16:
                ((Number) obj2).intValue();
                pxd0.t((i63) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                mue1.s((d5m1) obj5, (quc0) obj3, (Function0) obj4, nim0.a, (b0k) obj, iP2);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                ((suh1) obj5).f((s5m1) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                dem1.h((c7m1) obj5, (Function0) obj4, (vu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                vvm1.p((VideoSurfaceView) obj5, (ejj1) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                ((avp0) obj5).e((String) obj3, (String) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 22:
                ((Number) obj2).intValue();
                yhm1.a(obj5, (iu30) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                zpn1.h((aom1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixi1(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixi1(jlw0 jlw0Var, jlw0 jlw0Var2, int i, String str, int i2) {
        super(2);
        this.a = (byte) 6;
        this.c = jlw0Var;
        this.d = jlw0Var2;
        this.b = i;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixi1(oyi1 oyi1Var, xfx xfxVar, Function0 function0, int i) {
        super(2);
        this.a = (byte) 0;
        this.c = oyi1Var;
        this.d = xfxVar;
        this.e = function0;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixi1(byte b, int i, Object obj, Object obj2, Function0 function0) {
        super(2);
        this.a = b;
        this.c = obj;
        this.e = function0;
        this.d = obj2;
        this.b = i;
    }
}

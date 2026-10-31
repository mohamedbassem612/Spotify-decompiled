package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bkh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkh(txm txmVar, vu30 vu30Var, int i) {
        super(2);
        this.a = (byte) 12;
        this.c = txmVar;
        this.d = vu30Var;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                d7p1.b((akh) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                p8p1.c((rph) obj4, (xtb0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                s9p1.e((adj1) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                ((luj) obj4).a((x360) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                fq7.n((qyl) obj4, (vu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                fq7.r((qyl) obj4, (uyl) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                x2g0.u((oxk) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                xpn1.h((maa) obj4, obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                xpn1.i((laa) obj4, obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                ((q7m) obj4).e((iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                ((q7m) obj4).f((qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                ((cfm) obj4).f((pem) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                dym.d((txm) obj4, (vu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                epo1.e((zkn) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                ((dyn) obj4).e((cyn) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                vjo.a((sjo) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 16:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                v820 v820Var = (v820) obj3;
                pix pixVar = v820Var.a;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c((x0t) ((y0t) obj4).d.getValue(), new vtm1(pixVar, v820Var.b, v820Var.d), anm1.N("filter_chip_position_" + pixVar.b() + "_" + i, nim0.a), (ipb1) null, x340Var2, 0, 8);
                }
                break;
            case 17:
                ((Number) obj2).intValue();
                fae1.b((rat) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 18:
                ((Number) obj2).intValue();
                ((ldo) obj4).g((bqt) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 19:
                ((Number) obj2).intValue();
                ((ldo) obj4).l((hd80) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 20:
                ((Number) obj2).intValue();
                qxd0.p((rm0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 21:
                ((Number) obj2).intValue();
                hqq0.n((p1v) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 22:
                ((Number) obj2).intValue();
                ((vpv) obj4).a((jwq) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                ((qvv) obj4).a(i, (iu30) obj3, (b0k) obj, czo1.p(1));
                break;
            case 24:
                ((Number) obj2).intValue();
                ((bxv) obj4).a(i, (iu30) obj3, (b0k) obj, czo1.p(1));
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                rrn1.i((d6w) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 26:
                ((Number) obj2).intValue();
                nyn1.y((d7w) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 27:
                ((Number) obj2).intValue();
                ujo1.b((rtm1) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 28:
                ((Number) obj2).intValue();
                poo1.d((lex) obj4, (vu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                ywo1.a((r5f1) obj4, (String) obj3, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bkh(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bkh(Object obj, int i, iu30 iu30Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkh(d6w d6wVar, Function0 function0, int i) {
        super(2);
        this.a = (byte) 25;
        this.c = d6wVar;
        this.d = function0;
        this.b = i;
    }
}

package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q9j0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9j0(byte b, long j) {
        super(2);
        this.a = b;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long jR = this.b;
        switch (b) {
            case 0:
                return new u7h(jR);
            case 1:
                return new u7h(jR);
            case 2:
                return new u7h(jR);
            case 3:
                return new u7h(jR);
            case 4:
                return new u7h(jR);
            case 5:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xto1.e((qim0) null, 1, this.b, 0L, x340Var2, 48, 9);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 6:
                return new u7h(jR);
            case 7:
                return new u7h(jR);
            case 8:
                return new u7h(jR);
            case 9:
                return new u7h(jR);
            case 10:
                return new u7h(jR);
            case 11:
                return new u7h(jR);
            case 12:
                return new u7h(jR);
            case 13:
                ((Number) obj2).intValue();
                fiw0.e(jR, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                return new u7h(jR);
            case 15:
                return new u7h(jR);
            case 16:
                return new u7h(jR);
            case 17:
                return new u7h(jR);
            case 18:
                return new u7h(jR);
            case 19:
                return new u7h(jR);
            case 20:
                return new u7h(jR);
            case 21:
                return new u7h(jR);
            case 22:
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        jR = who1.r(jR);
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new u7h(jR);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                bpo1.j(jR, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                return new u7h(jR);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new u7h(jR);
            case 26:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fux fuxVar = fux.c;
                    qim0 qim0VarS = u291.s(nim0.a, u1p1.v(x340Var4), u1p1.v(x340Var4));
                    u1p1.w(x340Var4);
                    u1p1.w(x340Var4);
                    w0h1.a(fuxVar, isl.a, u291.a(qim0VarS, 24.0f, 24.0f), this.b, 0L, false, x340Var4, fux.d | 48, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 27:
                return new u7h(jR);
            case 28:
                return new u7h(jR);
            default:
                return new u7h(jR);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9j0(long j, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j;
    }
}

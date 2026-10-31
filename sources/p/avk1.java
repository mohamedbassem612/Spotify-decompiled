package p;

import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class avk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ avk1(String str, byte b) {
        super(2);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        jsl jslVar = isl.a;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var2).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                rc2.m(str, (b0k) obj, czo1.p(1));
                break;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var6).g;
                    qim0 qim0VarX = uyn1.x(dug.f(u291.r(nim0.a, 32.0f), cbx.a(x340Var6).a.c, er31.a), 6.0f);
                    fsx fsxVar = fsx.c;
                    if (!ihc1.y0(str)) {
                        jslVar = new jsl(str);
                    }
                    w0h1.a(fsxVar, jslVar, qim0VarX, 0L, 0L, false, x340Var6, fsx.d, 56);
                }
                break;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    fux fuxVar = fux.c;
                    if (!ihc1.y0(str)) {
                        jslVar = new jsl(str);
                    }
                    uwr uwrVar3 = cbx.a;
                    w0h1.a(fuxVar, jslVar, (qim0) null, cbx.a(x340Var8).b.a, 0L, false, x340Var8, fux.d, 52);
                }
                break;
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 6:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else {
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(this.b, (qim0) null, (lee1) null, cbx.a(x340Var12).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2038);
                }
                break;
            case 7:
                ((Number) obj2).intValue();
                bqn1.n(str, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                bqn1.n(str, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ avk1(String str, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
    }
}

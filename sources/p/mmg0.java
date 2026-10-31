package p;

import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mmg0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gbx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmg0(gbx gbxVar, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = gbxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        gbx gbxVar = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = ujf0.a1;
                        x340Var2.s0(objT);
                    }
                    kgx kgxVar = new kgx(0, (vu30) objT, (vu30) null, (vu30) null, 13);
                    vzq0.a.getClass();
                    cwl1.b((qim0) null, (tl3) null, d4o1.a, kgxVar, uzq0.b, (max) null, false, (idn0) null, (ga80) null, this.b, (gbx) null, lzi.b, x340Var2, 100663296, 48, 1251);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                poo1.j(gbxVar, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwo1.e(gbxVar.c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mmg0(gbx gbxVar, byte b) {
        super(2);
        this.a = b;
        this.b = gbxVar;
    }
}

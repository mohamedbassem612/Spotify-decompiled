package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d61(float f, xtb0 xtb0Var, c380 c380Var, vzq0 vzq0Var, vu30 vu30Var, txj txjVar, int i, int i2) {
        super(2);
        this.a = (byte) 3;
        this.e = f;
        this.b = xtb0Var;
        this.c = c380Var;
        this.d = vzq0Var;
        this.f = vu30Var;
        this.g = txjVar;
        this.h = i;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(49);
                byte b2 = this.i;
                float f = this.e;
                c4p1.b((List) obj7, (qim0) obj6, (nl3) obj5, f, (gdx) obj4, (lee1) obj3, this.h, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(49);
                byte b3 = this.i;
                float f2 = this.e;
                c4p1.b((List) obj7, (qim0) obj6, (nl3) obj5, f2, (gdx) obj4, (lee1) obj3, this.h, (b0k) obj, iP2, b3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(49);
                byte b4 = this.i;
                float f3 = this.e;
                c4p1.b((List) obj7, (qim0) obj6, (nl3) obj5, f3, (gdx) obj4, (lee1) obj3, this.h, (b0k) obj, iP3, b4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(this.h | 1);
                byte b5 = this.i;
                float f4 = this.e;
                j82.p(f4, (xtb0) obj7, (c380) obj6, (vzq0) obj5, (vu30) obj4, (txj) obj3, (b0k) obj, iP4, b5);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d61(List list, qim0 qim0Var, nl3 nl3Var, float f, gdx gdxVar, lee1 lee1Var, int i, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = qim0Var;
        this.d = nl3Var;
        this.e = f;
        this.f = gdxVar;
        this.g = lee1Var;
        this.h = i;
        this.i = i3;
    }
}

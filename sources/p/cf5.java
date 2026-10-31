package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class cf5 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cf5(int i, Object obj, esb0 esb0Var) {
        this.a = (byte) 6;
        this.c = esb0Var;
        this.b = i;
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                df5.a((af5) obj4, (List) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iP = czo1.p(i | 1);
                j0o1.b(iP, (b0k) obj, (iu30) obj3, (qim0) obj4);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((j2i) obj4).k(obj3, (b0k) obj, czo1.p(i) | 1);
                break;
            case 3:
                ((Integer) obj2).intValue();
                mod.b((ely0) obj4, (vu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                mod.c((ely0[]) obj4, (vu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((fpb0) obj4).e(i, obj3, (b0k) obj, czo1.p(1));
                break;
            case 6:
                esb0 esb0Var = (esb0) obj4;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    esb0Var.e(i, obj3, x340Var2, 0);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((ktb0) obj4).e(i, obj3, (b0k) obj, czo1.p(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((qub0) obj4).e(i, obj3, (b0k) obj, czo1.p(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((sjr0) obj4).e(i, obj3, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((mhg1) obj4).a(obj3, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ cf5(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ cf5(esb0 esb0Var, int i, Object obj, int i2, byte b) {
        this.a = b;
        this.c = esb0Var;
        this.b = i;
        this.d = obj;
    }
}

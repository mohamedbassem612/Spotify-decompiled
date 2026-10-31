package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h57 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h57(qim0 qim0Var, float f, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = (byte) 0;
        this.b = qim0Var;
        this.c = f;
        this.f = j2iVar;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.e;
                float f = this.c;
                upo1.j(f, iP, b2, (j2i) obj3, (b0k) obj, this.b);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.e;
                ern1.c((List) obj3, this.b, this.c, (b0k) obj, iP2, b3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                byte b4 = this.e;
                qim0 qim0Var = this.b;
                int i2 = this.d;
                buo1.f(qim0Var, i2, (String) obj3, this.c, (b0k) obj, iP3, b4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                byte b5 = this.e;
                n871.b((hux) obj3, this.b, this.c, (b0k) obj, iP4, b5);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h57(Object obj, qim0 qim0Var, float f, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.b = qim0Var;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h57(qim0 qim0Var, int i, String str, float f, int i2, int i3) {
        super(2);
        this.a = (byte) 2;
        this.b = qim0Var;
        this.d = i;
        this.f = str;
        this.c = f;
        this.e = i3;
    }
}

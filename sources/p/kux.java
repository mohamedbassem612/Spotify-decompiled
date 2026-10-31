package p;

import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kux extends hab0 implements vu30 {
    public final /* synthetic */ short X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ ksl b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ p3v d;
    public final /* synthetic */ zvx e;
    public final /* synthetic */ ecx f;
    public final /* synthetic */ j6m g;
    public final /* synthetic */ tl3 h;
    public final /* synthetic */ ColorFilter i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kux(Object obj, ksl kslVar, qim0 qim0Var, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.Y = obj;
        this.b = kslVar;
        this.c = qim0Var;
        this.d = p3vVar;
        this.e = zvxVar;
        this.f = ecxVar;
        this.g = j6mVar;
        this.h = tl3Var;
        this.i = colorFilter;
        this.t = i;
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.X;
                eso1.h((jmr0) obj3, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.X;
                eso1.f((yk4) obj3, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP2, s2);
                break;
        }
        return rih1Var;
    }
}

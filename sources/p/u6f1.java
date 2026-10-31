package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u6f1 extends hab0 implements vu30 {
    public final /* synthetic */ j2i a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ tzd g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6f1(j2i j2iVar, float f, float f2, float f3, float f4, float f5, tzd tzdVar, float f6, float f7) {
        super(2);
        this.a = j2iVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = tzdVar;
        this.h = f6;
        this.i = f7;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.f1(new p3v(this.b), new p3v(this.c), new p3v(this.d), new p3v(this.e), new p3v(this.f), Boolean.valueOf(this.g.d), new p3v(this.h), new p3v(this.i), x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

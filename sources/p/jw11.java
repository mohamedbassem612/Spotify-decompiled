package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jw11 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ j2i g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jw11(String str, float f, qim0 qim0Var, float f2, float f3, float f4, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = str;
        this.b = f;
        this.c = qim0Var;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = j2iVar;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1572919);
        byte b = this.h;
        x4p1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP, b);
        return rih1.a;
    }
}

package p;

import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hne1 extends hab0 implements vu30 {
    public final /* synthetic */ h290 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Paragraph e;
    public final /* synthetic */ String f;
    public final /* synthetic */ xtb0 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ qim0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hne1(h290 h290Var, int i, String str, String str2, Paragraph paragraph, String str3, xtb0 xtb0Var, float f, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.a = h290Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = paragraph;
        this.f = str3;
        this.g = xtb0Var;
        this.h = f;
        this.i = iu30Var;
        this.t = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ine1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP);
        return rih1.a;
    }
}

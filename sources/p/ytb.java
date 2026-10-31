package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ytb extends hab0 implements vu30 {
    public final /* synthetic */ j2i X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ gqb d;
    public final /* synthetic */ zd60 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ qim0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytb(Function0 function0, long j, long j2, gqb gqbVar, zd60 zd60Var, String str, float f, boolean z, Function0 function1, qim0 qim0Var, j2i j2iVar, int i) {
        super(2);
        this.a = function0;
        this.b = j;
        this.c = j2;
        this.d = gqbVar;
        this.e = zd60Var;
        this.f = str;
        this.g = f;
        this.h = z;
        this.i = function1;
        this.t = qim0Var;
        this.X = j2iVar;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        kub.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP);
        return rih1.a;
    }
}

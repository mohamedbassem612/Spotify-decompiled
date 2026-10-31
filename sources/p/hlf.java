package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hlf extends hab0 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ ctf a;
    public final /* synthetic */ String b;
    public final /* synthetic */ jwm c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ flf i;
    public final /* synthetic */ qim0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlf(ctf ctfVar, String str, jwm jwmVar, List list, boolean z, boolean z2, boolean z3, boolean z4, flf flfVar, qim0 qim0Var, boolean z5, boolean z6, boolean z7, int i) {
        super(2);
        this.a = ctfVar;
        this.b = str;
        this.c = jwmVar;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = flfVar;
        this.t = qim0Var;
        this.X = z5;
        this.Y = z6;
        this.Z = z7;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        buo1.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, iP);
        return rih1.a;
    }
}

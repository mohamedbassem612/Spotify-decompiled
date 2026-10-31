package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oc01 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ qim0 Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ lee1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ yae1 f;
    public final /* synthetic */ hc01 g;
    public final /* synthetic */ wux h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ z680 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc01(String str, lee1 lee1Var, int i, int i2, boolean z, yae1 yae1Var, hc01 hc01Var, wux wuxVar, Function0 function0, z680 z680Var, int i3, List list, qim0 qim0Var, int i4) {
        super(2);
        this.a = str;
        this.b = lee1Var;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = yae1Var;
        this.g = hc01Var;
        this.h = wuxVar;
        this.i = function0;
        this.t = z680Var;
        this.X = i3;
        this.Y = list;
        this.Z = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        zc01.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, iP);
        return rih1.a;
    }
}

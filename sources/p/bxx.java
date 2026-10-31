package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bxx extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ksg f;
    public final /* synthetic */ List g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ swx t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxx(float f, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, boolean z, ksg ksgVar, List list, Function0 function0, Function0 function1, swx swxVar, int i, String str, boolean z2, int i2, int i3) {
        super(2);
        j2i j2iVar2 = pej.a;
        this.a = f;
        this.b = iu30Var;
        this.c = j2iVar;
        this.d = qim0Var;
        this.e = z;
        this.f = ksgVar;
        this.g = list;
        this.h = function0;
        this.i = function1;
        this.t = swxVar;
        this.X = i;
        this.Y = str;
        this.Z = z2;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j2i j2iVar = pej.a;
        int iP = czo1.p(this.N0 | 1);
        int iP2 = czo1.p(this.O0);
        kuo1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}

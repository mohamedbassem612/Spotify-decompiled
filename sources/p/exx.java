package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class exx extends hab0 implements vu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ int P0;
    public final /* synthetic */ swx X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ksg f;
    public final /* synthetic */ List g;
    public final /* synthetic */ ro51 h;
    public final /* synthetic */ ur80 i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exx(float f, iu30 iu30Var, Function0 function0, Function0 function1, boolean z, ksg ksgVar, List list, ro51 ro51Var, ur80 ur80Var, iu30 iu30Var2, swx swxVar, int i, String str, boolean z2, int i2, int i3) {
        super(2);
        this.a = f;
        this.b = iu30Var;
        this.c = function0;
        this.d = function1;
        this.e = z;
        this.f = ksgVar;
        this.g = list;
        this.h = ro51Var;
        this.i = ur80Var;
        this.t = iu30Var2;
        this.X = swxVar;
        this.Y = i;
        this.Z = str;
        this.N0 = z2;
        this.O0 = i2;
        this.P0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.O0 | 1);
        int iP2 = czo1.p(this.P0);
        kuo1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}

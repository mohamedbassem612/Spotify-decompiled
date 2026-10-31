package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y51 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ float O0;
    public final /* synthetic */ int P0;
    public final /* synthetic */ byte Q0;
    public final /* synthetic */ short R0;
    public final /* synthetic */ String X;
    public final /* synthetic */ vu30 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ nl3 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ gdx g;
    public final /* synthetic */ lee1 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y51(j2i j2iVar, qim0 qim0Var, List list, nl3 nl3Var, float f, gdx gdxVar, lee1 lee1Var, float f2, String str, String str2, vu30 vu30Var, boolean z, int i, float f3, int i2, int i3, int i4, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = qim0Var;
        this.d = list;
        this.e = nl3Var;
        this.f = f;
        this.g = gdxVar;
        this.h = lee1Var;
        this.i = f2;
        this.t = str;
        this.X = str2;
        this.Y = vu30Var;
        this.Z = z;
        this.N0 = i;
        this.O0 = f3;
        this.P0 = i2;
        this.Q0 = i3;
        this.R0 = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.Q0;
        int i = this.P0;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int iP2 = czo1.p(b2);
                short s = this.R0;
                c4p1.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, (b0k) obj, iP, iP2, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                int iP4 = czo1.p(b2);
                short s2 = this.R0;
                c4p1.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, (b0k) obj, iP3, iP4, s2);
                break;
        }
        return rih1Var;
    }
}

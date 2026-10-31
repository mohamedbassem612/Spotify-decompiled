package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cxx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ksg c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ur80 e;
    public final /* synthetic */ ur80 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ j2i h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxx(float f, ksg ksgVar, boolean z, ur80 ur80Var, ur80 ur80Var2, int i, j2i j2iVar, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = ksgVar;
        this.d = z;
        this.e = ur80Var;
        this.f = ur80Var2;
        this.g = i;
        this.h = j2iVar;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                kuo1.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                kuo1.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}

package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dbf extends hab0 implements vu30 {
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ zks0 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ c380 e;
    public final /* synthetic */ abf f;
    public final /* synthetic */ xpi0 g;
    public final /* synthetic */ veq h;
    public final /* synthetic */ xeq i;
    public final /* synthetic */ pte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dbf(zks0 zks0Var, c380 c380Var, c380 c380Var2, c380 c380Var3, abf abfVar, xpi0 xpi0Var, veq veqVar, xeq xeqVar, pte pteVar, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = zks0Var;
        this.c = c380Var;
        this.d = c380Var2;
        this.e = c380Var3;
        this.f = abfVar;
        this.g = xpi0Var;
        this.h = veqVar;
        this.i = xeqVar;
        this.t = pteVar;
        this.X = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                Function0 function0 = this.X;
                int iP = czo1.p(1);
                pro1.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, function0, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                Function0 function1 = this.X;
                int iP2 = czo1.p(1);
                pro1.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, function1, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}

package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f9g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b9g0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ vzq0 d;
    public final /* synthetic */ bjx e;
    public final /* synthetic */ d0r f;
    public final /* synthetic */ v8l0 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9g0(b9g0 b9g0Var, iu30 iu30Var, vzq0 vzq0Var, bjx bjxVar, d0r d0rVar, v8l0 v8l0Var, iu30 iu30Var2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = b9g0Var;
        this.c = iu30Var;
        this.d = vzq0Var;
        this.e = bjxVar;
        this.f = d0rVar;
        this.g = v8l0Var;
        this.h = iu30Var2;
        this.i = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                jon1.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                jon1.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}

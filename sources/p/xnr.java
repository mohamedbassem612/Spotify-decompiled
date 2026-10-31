package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xnr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aor b;
    public final /* synthetic */ g3l c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzq0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xnr(aor aorVar, g3l g3lVar, String str, zzq0 zzq0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = aorVar;
        this.c = g3lVar;
        this.d = str;
        this.e = zzq0Var;
        this.f = function0;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.g(this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.h(this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}

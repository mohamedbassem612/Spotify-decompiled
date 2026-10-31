package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class bsh implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x6e1 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ int d;

    public /* synthetic */ bsh(x6e1 x6e1Var, j2i j2iVar, int i, byte b) {
        this.a = b;
        this.b = x6e1Var;
        this.c = j2iVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        j2i j2iVar = this.c;
        x6e1 x6e1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                w8p1.c(x6e1Var, j2iVar, b0kVar, czo1.p(i | 1));
                break;
            default:
                d1o1.b(x6e1Var, j2iVar, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}

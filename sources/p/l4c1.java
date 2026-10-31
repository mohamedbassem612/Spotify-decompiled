package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l4c1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4c1(c380 c380Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = j2iVar;
        this.d = j2iVar2;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                iho1.k(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(27649));
                break;
            default:
                ((Number) obj2).intValue();
                m87.i(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(433));
                break;
        }
        return rih1Var;
    }
}

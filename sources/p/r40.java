package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r40(List list, iu30 iu30Var, qim0 qim0Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                boolean z = this.e;
                int iP = czo1.p(1);
                wyo1.a(this.b, this.c, this.d, z, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z2 = this.e;
                int iP2 = czo1.p(1);
                wyo1.a(this.b, this.c, this.d, z2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}

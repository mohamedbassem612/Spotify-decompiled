package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vc0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc0(ArrayList arrayList, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = arrayList;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        ArrayList arrayList = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                j1p1.c(arrayList, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                qmo1.a(arrayList, qim0Var, b0kVar, czo1.p(9));
                break;
            case 2:
                if50.b(arrayList, qim0Var, b0kVar, czo1.p(1));
                break;
            case 3:
                l8h0.b(arrayList, qim0Var, b0kVar, czo1.p(49));
                break;
            default:
                iqo1.k(arrayList, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}

package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h37 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ hcx c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ qim0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h37(List list, hcx hcxVar, float f, float f2, long j, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = hcxVar;
        this.d = f;
        this.e = f2;
        this.f = j;
        this.g = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.g;
                int iP = czo1.p(3505);
                voo1.a(this.b, this.c, this.d, this.e, this.f, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.g;
                int iP2 = czo1.p(3505);
                voo1.a(this.b, this.c, this.d, this.e, this.f, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}

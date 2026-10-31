package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y5w extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d6w b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5w(d6w d6wVar, qim0 qim0Var, byte b) {
        super(3);
        this.a = b;
        this.b = d6wVar;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d6w d6wVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = d6wVar.g;
                String str2 = d6wVar.h;
                Integer num = d6wVar.i;
                rrn1.k(str, str2, num != null ? new u7h(z4p1.e(num.intValue())) : null, this.c, b0kVar, 0);
                break;
            default:
                ((Number) obj3).intValue();
                rrn1.n(0, d6wVar.b, (b0k) obj2, this.c);
                break;
        }
        return rih1Var;
    }
}

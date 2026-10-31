package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kt extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt(pt ptVar, byte b) {
        super(4);
        this.a = b;
        this.b = ptVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        pt ptVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                uzl0 uzl0Var = (uzl0) ptVar.e;
                uzl0Var.getClass();
                return new jzl0(uzl0Var);
            default:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                maa maaVar = (maa) ((ynb0) ptVar.i).get();
                rih1 rih1Var = rih1.a;
                otw.c(maaVar, rih1Var, (qim0) null, (ipb1) null, (b0k) obj3, 48, 12);
                return rih1Var;
        }
    }
}

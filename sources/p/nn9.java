package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nn9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn9(hw2 hw2Var, byte b) {
        super(1);
        this.a = b;
        this.b = hw2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hw2 hw2Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                d0r d0rVar = hw2Var.b;
                o3r o3rVar = hw2Var.c;
                String str = ((rm9) hw2Var.f).a.h;
                if (str == null) {
                    str = "";
                }
                ay8 ay8VarH = d3p1.H(d0rVar, o3rVar, str);
                Flowable flowable = (Flowable) hw2Var.g;
                flowable.getClass();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowable.t(Functions.a);
                vbm[] vbmVarArr = q601.a;
                return new x010(ay8VarH, new kge(flowableDistinctUntilChangedT), new l2(3, (lnm) null, (byte) 15), (byte) 1);
            default:
                ((qtr) obj).b(new ep0(hw2Var, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}

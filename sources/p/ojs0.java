package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ojs0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ObservableEmitter b;
    public final /* synthetic */ ox41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojs0(ox41 ox41Var, ObservableEmitter observableEmitter) {
        super(1);
        this.c = ox41Var;
        this.b = observableEmitter;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ox41 ox41Var = this.c;
        ObservableEmitter observableEmitter = this.b;
        switch (b) {
            case 0:
                p7w p7wVar = (p7w) obj;
                z951 z951Var = ox41Var.b;
                Set set = s4b1.f;
                String strB = uic.x(p7wVar.b).B(p7wVar.a);
                if (strB == null) {
                    strB = z951Var.e;
                }
                String str = z951Var.o;
                if (str == null) {
                    str = z951Var.e;
                }
                observableEmitter.onNext(new oz41(strB, str, ox41Var.c));
                break;
            default:
                observableEmitter.onNext(new nz41(ox41Var.b, ox41Var.c));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojs0(ObservableEmitter observableEmitter, ox41 ox41Var) {
        super(1);
        this.b = observableEmitter;
        this.c = ox41Var;
    }
}

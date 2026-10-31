package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bbf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ jwm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bbf(ven0 ven0Var, jwm jwmVar, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
        this.c = jwmVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jwm jwmVar = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                c380 c380Var = (c380) ven0Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    if (!u890.j(((jwm) obj).a.a, jwmVar.a.a)) {
                        arrayList.add(obj);
                    }
                }
                ven0Var.setValue(mqo1.A(arrayList));
                break;
            default:
                c380 c380Var2 = (c380) ven0Var.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : c380Var2) {
                    if (!u890.j(((jwm) obj2).a.a, jwmVar.a.a)) {
                        arrayList2.add(obj2);
                    }
                }
                ven0Var.setValue(mqo1.A(arrayList2));
                break;
        }
        return rih1Var;
    }
}

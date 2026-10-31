package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ou2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou2(qu2 qu2Var, byte b) {
        super(0);
        this.a = b;
        this.b = qu2Var;
    }

    public final Object invoke() {
        byte b = this.a;
        qu2 qu2Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                s4p0 s4p0Var = (s4p0) ((ynb0) qu2Var.f).get();
                jp80 jp80Var = new jp80(ou1.Y);
                eq80 eq80Var = new eq80(new e3h1(s4p0Var.e(), s4p0Var.f(), s4p0Var.d()));
                wch wchVar = q6x.b;
                if (!jp80Var.equals(wchVar) || !eq80Var.equals(wchVar)) {
                    if (jp80Var.equals(wchVar)) {
                        return eq80Var;
                    }
                    if (eq80Var.equals(wchVar)) {
                        return jp80Var;
                    }
                    wchVar = new wch(jp80Var, eq80Var);
                }
                return wchVar;
            case 1:
                ((yo2) ((ynb0) qu2Var.d).get()).i();
                return rih1.a;
            default:
                return ((cqe) ((ynb0) qu2Var.e).get()).a(new ou2(qu2Var, (byte) 1));
        }
    }
}

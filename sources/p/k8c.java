package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k8c extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ o5e0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8c(cp31 cp31Var, Context context, o5e0 o5e0Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = context;
        this.c = o5e0Var;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        o5e0 o5e0Var = this.c;
        Context context = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                cp31.H(context, o5e0Var, function0);
                break;
            default:
                cp31.H(context, o5e0Var, function0);
                break;
        }
        return rih1Var;
    }
}

package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mpo extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ o8n d;
    public final /* synthetic */ upo e;
    public final /* synthetic */ iu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mpo(Function0 function0, c9n c9nVar, o8n o8nVar, upo upoVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = c9nVar;
        this.d = o8nVar;
        this.e = upoVar;
        this.f = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.f;
        upo upoVar = this.e;
        o8n o8nVar = this.d;
        c9n c9nVar = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                function0.invoke();
                fn31.T(c9nVar, o8nVar, 0, new rv1(upoVar, iu30Var, null, (byte) 1), 2);
                break;
            default:
                function0.invoke();
                fn31.T(c9nVar, o8nVar, 0, new rv1(upoVar, iu30Var, null, (byte) 2), 2);
                break;
        }
        return rih1Var;
    }
}

package defpackage;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;
import p.c9n;
import p.fn31;
import p.hab0;
import p.lnm;
import p.o8n;
import p.rih1;
import p.vy71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ vy71 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(c9n c9nVar, vy71 vy71Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = c9nVar;
        this.c = vy71Var;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        vy71 vy71Var = this.c;
        c9n c9nVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                fn31.T(c9nVar, (o8n) null, 0, new g(vy71Var, (lnm) null, (byte) 0), 3).L(new h(vy71Var, function0, (byte) 0));
                break;
            default:
                fn31.T(c9nVar, (o8n) null, 0, new g(vy71Var, (lnm) null, (byte) 1), 3).L(new h(vy71Var, function0, (byte) 1));
                break;
        }
        return rih1Var;
    }
}

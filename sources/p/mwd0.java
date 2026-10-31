package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mwd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb50 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwd0(lb50 lb50Var, boolean z, String str, byte b) {
        super(0);
        this.a = b;
        this.b = lb50Var;
        this.c = z;
        this.d = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        boolean z = this.c;
        lb50 lb50Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                lb50Var.invoke(new gyd0(z, str, (String) null));
                break;
            default:
                lb50Var.invoke(new eyd0(z, str, false, 12));
                break;
        }
        return rih1Var;
    }
}

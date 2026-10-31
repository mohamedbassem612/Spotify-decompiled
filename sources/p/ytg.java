package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ytg extends k01 implements Function0 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ytg(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    public final Object invoke() {
        byte b = this.h;
        rih1 rih1Var = rih1.a;
        Object obj = ((k01) this).a;
        switch (b) {
            case 0:
                ((cug) obj).f(true);
                break;
            default:
                ((faa0) obj).d((CancellationException) null);
                break;
        }
        return rih1Var;
    }
}

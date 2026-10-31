package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t9f extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y9f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9f(y9f y9fVar, byte b) {
        super(0);
        this.a = b;
        this.b = y9fVar;
    }

    public final Object invoke() {
        byte b = this.a;
        y9f y9fVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return y9fVar.g.a(2);
            default:
                return y9fVar.h.a(y9fVar.d, new eao0(1));
        }
    }
}

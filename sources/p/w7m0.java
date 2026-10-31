package p;

import com.spotify.mobius.disposables.Disposable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w7m0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Disposable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7m0(Disposable disposable, byte b) {
        super(0);
        this.a = b;
        this.b = disposable;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Disposable disposable = this.b;
        switch (b) {
            case 0:
                disposable.dispose();
                break;
            default:
                disposable.dispose();
                break;
        }
        return rih1Var;
    }
}

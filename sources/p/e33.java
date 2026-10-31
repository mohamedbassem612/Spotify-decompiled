package p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e33 implements Cancellable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ MobiusLoop b;

    public e33(MobiusLoop mobiusLoop) {
        this.b = mobiusLoop;
    }

    public final void cancel() {
        byte b = this.a;
        MobiusLoop mobiusLoop = this.b;
        switch (b) {
            case 0:
                mobiusLoop.dispose();
                break;
            default:
                mobiusLoop.dispose();
                break;
        }
    }

    public e33(MobiusLoop mobiusLoop, p811 p811Var) {
        this.b = mobiusLoop;
    }
}

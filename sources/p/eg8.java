package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateResult;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eg8 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ eg8(AtomicReference atomicReference, byte b) {
        this.a = b;
        this.b = atomicReference;
    }

    public final void accept(Object obj) {
        Disposable disposable;
        byte b = this.a;
        AtomicReference atomicReference = this.b;
        switch (b) {
            case 0:
                EsAuthenticateResult.AuthenticateResult authenticateResult = (EsAuthenticateResult.AuthenticateResult) obj;
                if ((authenticateResult.s() == 1 || authenticateResult.s() == 2 || authenticateResult.s() == 4) && (disposable = (Disposable) atomicReference.get()) != null) {
                    disposable.dispose();
                }
                break;
            case 1:
                Disposable disposable2 = (Disposable) atomicReference.get();
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                break;
            case 2:
                atomicReference.set((ij91) obj);
                break;
            default:
                atomicReference.set((kl91) obj);
                break;
        }
    }
}

package p;

import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o1v0 implements Transport {
    public final /* synthetic */ p1v0 a;
    public final /* synthetic */ nup0 b;

    public o1v0(p1v0 p1v0Var, nup0 nup0Var) {
        this.a = p1v0Var;
        this.b = nup0Var;
    }

    public final Single callSingle(String str, String str2, byte[] bArr) {
        Single singleCallSingle = this.b.callSingle(str, str2, bArr);
        AtomicReference atomicReference = new AtomicReference();
        p1v0 p1v0Var = this.a;
        return singleCallSingle.doOnSubscribe(new m1v0(atomicReference, p1v0Var, (byte) 0)).doFinally(new n1v0(atomicReference, p1v0Var, (byte) 0));
    }

    public final Observable callStream(String str, String str2, byte[] bArr) {
        Observable observableCallStream = this.b.callStream(str, str2, bArr);
        AtomicReference atomicReference = new AtomicReference();
        p1v0 p1v0Var = this.a;
        return observableCallStream.doOnSubscribe(new m1v0(atomicReference, p1v0Var, (byte) 1)).doFinally(new n1v0(atomicReference, p1v0Var, (byte) 1));
    }

    public final byte[] callSync(String str, String str2, byte[] bArr) {
        this.b.callSync(str, str2, bArr);
        throw null;
    }
}

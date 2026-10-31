package p;

import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class th70 implements Transport {
    public Transport a;
    public final ReentrantLock b = new ReentrantLock();

    public th70(kly0 kly0Var) {
        sam0 sam0Var = (xm41) kly0Var.get();
        sam0 sam0Var2 = sam0Var;
        sam0Var2.e(new cc00(this, (byte) 16), new xy50(this, (byte) 3));
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Single callSingle(String str, String str2, byte[] bArr) {
        Single<byte[]> singleError;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Transport transport = this.a;
            if (transport == null || (singleError = transport.callSingle(str, str2, bArr)) == null) {
                singleError = Single.error(new NullTransportException("[callSingle] transport not available"));
            }
            return singleError;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Observable callStream(String str, String str2, byte[] bArr) {
        Observable<byte[]> observableError;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Transport transport = this.a;
            if (transport == null || (observableError = transport.callStream(str, str2, bArr)) == null) {
                observableError = Observable.error(new NullTransportException("[callStream] transport not available"));
            }
            return observableError;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final byte[] callSync(String str, String str2, byte[] bArr) {
        byte[] bArrCallSync;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Transport transport = this.a;
            if (transport == null || (bArrCallSync = transport.callSync(str, str2, bArr)) == null) {
                throw new NullTransportException("[callSync] transport not available");
            }
            reentrantLock.unlock();
            return bArrCallSync;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

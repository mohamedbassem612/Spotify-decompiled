package p;

import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u7o implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7o b;

    public /* synthetic */ u7o(v7o v7oVar, byte b) {
        this.a = b;
        this.b = v7oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t7o t7oVar;
        t7o t7oVar2;
        byte b = this.a;
        t7o t7oVar3 = t7o.e;
        v7o v7oVar = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = v7oVar.f;
                do {
                    t7oVar = t7o.b;
                    if (atomicReference.compareAndSet(t7oVar, t7oVar3)) {
                        UrlRequest urlRequest = (UrlRequest) v7oVar.g.get();
                        if (urlRequest != null) {
                            urlRequest.cancel();
                        }
                        break;
                    }
                } while (atomicReference.get() == t7oVar);
                break;
            default:
                AtomicReference atomicReference2 = v7oVar.f;
                do {
                    t7oVar2 = t7o.c;
                    if (atomicReference2.compareAndSet(t7oVar2, t7oVar3)) {
                        UrlRequest urlRequest2 = (UrlRequest) v7oVar.g.get();
                        if (urlRequest2 != null) {
                            urlRequest2.cancel();
                        }
                        break;
                    }
                } while (atomicReference2.get() == t7oVar2);
                break;
        }
    }
}

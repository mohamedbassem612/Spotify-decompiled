package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface faa0 extends m8n {
    qku F(boolean z, boolean z2, v6a v6aVar);

    qku L(iu30 iu30Var);

    n561 a();

    void d(CancellationException cancellationException);

    CancellationException g();

    boolean isActive();

    boolean isCancelled();

    Object j(lnm lnmVar);

    boolean start();

    boolean v();

    m0g w(saa0 saa0Var);
}

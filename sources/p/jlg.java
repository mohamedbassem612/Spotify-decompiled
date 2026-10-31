package p;

import com.google.protobuf.Empty;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jlg {
    public final flg a;
    public final hlg b;
    public final rku c = new rku();
    public final PublishSubject d = new PublishSubject();
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final AtomicReference f = new AtomicReference();

    public jlg(flg flgVar, hlg hlgVar) {
        this.a = flgVar;
        this.b = hlgVar;
    }

    public final Observable a(int i) {
        long j = i;
        flg flgVar = this.a;
        return flgVar.a.o(Empty.n()).map(een.W0).timeout(j, TimeUnit.MILLISECONDS, flgVar.b, Single.just(new elg(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NULL_SKIP_BYTE_COUNTS, "Timeout while requesting client token"))).toObservable().takeUntil(this.d).firstOrError().onErrorReturn(t9w.Q0).toObservable();
    }

    public final dlg b(int i) {
        if (this.e.get()) {
            return new elg(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NULL_SKIP_BYTE_COUNTS, "Client token requested while core is stopped");
        }
        try {
            return (dlg) a(i).blockingFirst();
        } catch (RuntimeException e) {
            if (e.getCause() != null) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause.getClass().equals(InterruptedException.class)) {
                    this.d.onNext(sih1.a);
                    Thread.currentThread().interrupt();
                    return new elg(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NULL_SKIP_BYTE_COUNTS, "Client token request interrupted");
                }
            }
            throw e;
        }
    }
}

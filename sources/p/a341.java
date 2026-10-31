package p;

import android.speech.tts.UtteranceProgressListener;
import io.reactivex.rxjava3.core.CompletableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a341 extends UtteranceProgressListener {
    public final /* synthetic */ b341 a;

    public a341(b341 b341Var) {
        this.a = b341Var;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        b341 b341Var = this.a;
        if (u890.j(b341Var.c, str)) {
            CompletableEmitter completableEmitter = b341Var.d;
            completableEmitter.getClass();
            completableEmitter.onComplete();
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        b341 b341Var = this.a;
        if (u890.j(b341Var.c, str)) {
            CompletableEmitter completableEmitter = b341Var.d;
            completableEmitter.getClass();
            completableEmitter.onError(new Throwable("TTS failed."));
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}

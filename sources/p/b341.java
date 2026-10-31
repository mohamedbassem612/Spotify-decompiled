package p;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b341 implements CompletableOnSubscribe, TextToSpeech.OnInitListener {
    public final Context a;
    public final String b;
    public final String c;
    public CompletableEmitter d;
    public TextToSpeech e;

    public b341(Context context, String str, String str2) {
        Locale locale = Locale.US;
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        CompletableEmitter completableEmitter = this.d;
        completableEmitter.getClass();
        if (!completableEmitter.isDisposed() && i == 0) {
            TextToSpeech textToSpeech = this.e;
            textToSpeech.getClass();
            textToSpeech.setOnUtteranceProgressListener(new a341(this));
            TextToSpeech textToSpeech2 = this.e;
            textToSpeech2.getClass();
            textToSpeech2.setLanguage(Locale.US);
            TextToSpeech textToSpeech3 = this.e;
            textToSpeech3.getClass();
            textToSpeech3.speak(this.b, 0, null, this.c);
        }
    }

    public final void subscribe(CompletableEmitter completableEmitter) {
        this.d = completableEmitter;
        completableEmitter.setCancellable(new ci0(this, (byte) 6));
        this.e = new TextToSpeech(this.a, this);
    }
}

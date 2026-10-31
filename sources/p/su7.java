package p;

import android.media.AudioManager;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class su7 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ su7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BehaviorSubject behaviorSubject = (BehaviorSubject) ((g23) obj).c;
                dv7 dv7Var = dv7.b;
                if (i == -3) {
                    behaviorSubject.onNext(dv7Var);
                    break;
                } else if (i == -2) {
                    behaviorSubject.onNext(dv7Var);
                    break;
                } else if (i == -1) {
                    behaviorSubject.onNext(dv7Var);
                    break;
                } else if (i == 1) {
                    behaviorSubject.onNext(dv7.a);
                    break;
                }
                break;
            default:
                xuc xucVar = (xuc) obj;
                if (i == -1) {
                    t2j0 t2j0Var = xucVar.b.a;
                    t210 t210VarN = ExternalAccessoryRemoteError.n();
                    t210VarN.n("audio_recording");
                    t210VarN.r();
                    t210VarN.q("audio_focus_change|audiofocus loss");
                    t2j0Var.a(t210VarN.build());
                    xucVar.release();
                }
                break;
        }
    }
}

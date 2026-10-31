package p;

import android.view.KeyEvent;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gu7 implements u3b1 {
    public final Flowable a;
    public final w9u0 b;
    public final yqg c;
    public final ark1 d;
    public final vku e = new vku();

    public gu7(ark1 ark1Var, Flowable flowable, w9u0 w9u0Var, yqg yqgVar, dg30 dg30Var) {
        this.d = ark1Var;
        this.a = flowable;
        this.b = w9u0Var;
        this.c = yqgVar;
        ((f0i) dg30Var).a.a(new fu7(this, (byte) 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean onKeyDown(int i, final KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Flowable flowable = this.a;
        w9u0 w9u0Var = this.b;
        vku vkuVar = this.e;
        final byte b = 1;
        if (keyCode == 62) {
            Single map = new FlowableSingleSingle(ydh.f(flowable, flowable)).map(new um5(this, (byte) 21));
            Objects.requireNonNull(w9u0Var);
            vkuVar.a(map.flatMap(new vq6(w9u0Var, (byte) 4)).subscribe());
            return true;
        }
        final byte b2 = 0;
        ark1 ark1Var = this.d;
        switch (keyCode) {
            case 19:
                if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                    ark1Var.b("audio_external_keyboard", (String) null, 1.0d);
                    return true;
                }
                if (keyEvent.isCtrlPressed()) {
                    ark1Var.h("audio_external_keyboard", (String) null, (jor) null);
                    return true;
                }
                return false;
            case 20:
                if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                    ark1Var.b("audio_external_keyboard", (String) null, 0.0d);
                    return true;
                }
                if (keyEvent.isCtrlPressed()) {
                    ark1Var.e("audio_external_keyboard", (String) null, (jor) null);
                    return true;
                }
                return false;
            case 21:
                if (keyEvent.isCtrlPressed()) {
                    Single singleFlatMap = new FlowableSingleSingle(ydh.f(flowable, flowable)).map(new um5((byte) 22)).flatMap(new Function(this) { // from class: p.eu7
                        public final /* synthetic */ gu7 b;

                        {
                            this.b = this;
                        }

                        public final Object apply(Object obj) {
                            byte b3 = b2;
                            KeyEvent keyEvent2 = keyEvent;
                            gu7 gu7Var = this.b;
                            Boolean bool = (Boolean) obj;
                            switch (b3) {
                                case 0:
                                    if (!bool.booleanValue() || keyEvent2.isShiftPressed()) {
                                        return Single.just(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build()));
                                    }
                                    Flowable flowable2 = gu7Var.a;
                                    return new FlowableSingleSingle(ydh.f(flowable2, flowable2)).map(new mp5(gu7Var, -15000, (byte) 1)).map(new um5((byte) 23));
                                default:
                                    if (!bool.booleanValue() || keyEvent2.isShiftPressed()) {
                                        return Single.just(new l9u0());
                                    }
                                    Flowable flowable3 = gu7Var.a;
                                    return new FlowableSingleSingle(ydh.f(flowable3, flowable3)).map(new mp5(gu7Var, 15000, (byte) 1)).map(new um5((byte) 23));
                            }
                        }
                    });
                    Objects.requireNonNull(w9u0Var);
                    vkuVar.a(singleFlatMap.flatMap(new vq6(w9u0Var, (byte) 4)).subscribe());
                    return true;
                }
                return false;
            case 22:
                if (keyEvent.isCtrlPressed()) {
                    Single singleFlatMap2 = new FlowableSingleSingle(ydh.f(flowable, flowable)).map(new um5((byte) 22)).flatMap(new Function(this) { // from class: p.eu7
                        public final /* synthetic */ gu7 b;

                        {
                            this.b = this;
                        }

                        public final Object apply(Object obj) {
                            byte b3 = b;
                            KeyEvent keyEvent2 = keyEvent;
                            gu7 gu7Var = this.b;
                            Boolean bool = (Boolean) obj;
                            switch (b3) {
                                case 0:
                                    if (!bool.booleanValue() || keyEvent2.isShiftPressed()) {
                                        return Single.just(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build()));
                                    }
                                    Flowable flowable2 = gu7Var.a;
                                    return new FlowableSingleSingle(ydh.f(flowable2, flowable2)).map(new mp5(gu7Var, -15000, (byte) 1)).map(new um5((byte) 23));
                                default:
                                    if (!bool.booleanValue() || keyEvent2.isShiftPressed()) {
                                        return Single.just(new l9u0());
                                    }
                                    Flowable flowable3 = gu7Var.a;
                                    return new FlowableSingleSingle(ydh.f(flowable3, flowable3)).map(new mp5(gu7Var, 15000, (byte) 1)).map(new um5((byte) 23));
                            }
                        }
                    });
                    Objects.requireNonNull(w9u0Var);
                    vkuVar.a(singleFlatMap2.flatMap(new vq6(w9u0Var, (byte) 4)).subscribe());
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}

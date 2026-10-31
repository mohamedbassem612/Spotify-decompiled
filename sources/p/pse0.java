package p;

import com.spotify.lyrics.fullscreenview.events.proto.LyricsErrorReportingEvent;
import com.spotify.marquee.marquee.events.proto.MarqueeUserHoldoutEvent;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pse0 implements Consumer {
    public final /* synthetic */ byte a;
    public final t2j0 b;

    public /* synthetic */ pse0(t2j0 t2j0Var, byte b) {
        this.a = b;
        this.b = t2j0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        t2j0 t2j0Var = this.b;
        switch (b) {
            case 0:
                zwg0 zwg0Var = (zwg0) obj;
                dyg0 dyg0VarO = MarqueeUserHoldoutEvent.o();
                dyg0VarO.r("impression");
                dyg0VarO.s(zwg0Var.c);
                dyg0VarO.q(zwg0Var.d);
                MarqueeUserHoldoutEvent marqueeUserHoldoutEvent = (MarqueeUserHoldoutEvent) dyg0VarO.build();
                marqueeUserHoldoutEvent.getClass();
                t2j0Var.a(marqueeUserHoldoutEvent);
                break;
            default:
                thf0 thf0Var = (thf0) obj;
                ahf0 ahf0VarN = LyricsErrorReportingEvent.n();
                ahf0VarN.s(thf0Var.b);
                ahf0VarN.q(thf0Var.c);
                ahf0VarN.r(thf0Var.d);
                ahf0VarN.n(thf0Var.a);
                t2j0Var.a(ahf0VarN.build());
                break;
        }
    }
}

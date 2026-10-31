package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aau0 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.ActiveSession a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aau0(WidgetState.ActiveSession activeSession, long j, float f, float f2) {
        super(2);
        this.a = activeSession;
        this.b = j;
        this.c = f;
        this.d = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            WidgetState.ActiveSession activeSession = this.a;
            rau0.b(activeSession.getPlayPauseState(), this.b, this.c, this.d, activeSession.getMetadata().getContextUri(), x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

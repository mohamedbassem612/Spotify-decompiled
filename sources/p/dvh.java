package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dvh extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.ActiveSession a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvh(WidgetState.ActiveSession activeSession, boolean z, float f) {
        super(2);
        this.a = activeSession;
        this.b = z;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            rau0.c(this.a, this.b, this.c, null, 0.0f, 32.0f, 40.0f, 0.0f, 0.0f, x340Var2, 1769472, 536);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}

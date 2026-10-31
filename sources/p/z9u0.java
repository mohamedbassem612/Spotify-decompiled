package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z9u0 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.PlayPauseState a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9u0(WidgetState.PlayPauseState playPauseState, long j, float f, float f2, String str, int i) {
        super(2);
        this.a = playPauseState;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        rau0.b(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP);
        return rih1.a;
    }
}

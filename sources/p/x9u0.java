package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x9u0 extends hab0 implements vu30 {
    public final /* synthetic */ WidgetState.LeftButtonConfiguration a;
    public final /* synthetic */ iko b;
    public final /* synthetic */ CurrentTrackMetadata c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9u0(WidgetState.LeftButtonConfiguration leftButtonConfiguration, iko ikoVar, CurrentTrackMetadata currentTrackMetadata, boolean z, long j, float f, float f2, int i) {
        super(2);
        this.a = leftButtonConfiguration;
        this.b = ikoVar;
        this.c = currentTrackMetadata;
        this.d = z;
        this.e = j;
        this.f = f;
        this.g = f2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        rau0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
        return rih1.a;
    }
}

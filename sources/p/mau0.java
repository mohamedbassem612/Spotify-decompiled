package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mau0 extends hab0 implements vu30 {
    public final /* synthetic */ iko a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mau0(iko ikoVar, CurrentTrackMetadata currentTrackMetadata, long j, float f, float f2, int i) {
        super(2);
        this.a = ikoVar;
        this.b = currentTrackMetadata;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rau0.f(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1));
        return rih1.a;
    }
}

package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jol1 extends hab0 implements xu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ WidgetState.WrappedPlaylist d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jol1(float f, float f2, long j, WidgetState.WrappedPlaylist wrappedPlaylist, boolean z) {
        super(3);
        this.a = j;
        this.b = z;
        this.c = f;
        this.d = wrappedPlaylist;
        this.e = f2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        float f = ool1.a;
        et40 et40Var = et40.a;
        fc11.g(dm5.Q(et40Var, f), b0kVar, 0);
        gt40 gt40VarA = obh.a(dm5.h0(et40Var, s3v.b(this.a) - 32.0f));
        float f2 = this.e;
        WidgetState.WrappedPlaylist wrappedPlaylist = this.d;
        boolean z = this.b;
        eqr0.a(gt40VarA, 0, 0, apo.r(-1671562916, new iol1(wrappedPlaylist, z, f2), b0kVar), b0kVar, 3072, 6);
        fc11.g(dm5.Q(et40Var, (z ? ool1.b : ool1.d) + this.c), b0kVar, 0);
        return rih1.a;
    }
}

package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b6a extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c6a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6a(c6a c6aVar, byte b) {
        super(1);
        this.a = b;
        this.b = c6aVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        c6a c6aVar = this.b;
        switch (b) {
            case 0:
                return c6aVar.a.a((paj0) obj, c6aVar.c, c6aVar.d);
            case 1:
                return c6aVar.a.a((paj0) obj, c6aVar.c, c6aVar.d);
            case 2:
                return q1o1.u(c6aVar.b.a((paj0) obj), anm1.N("messaging_banner_jit_type_tag", u291.f(c6aVar.d, 1.0f)), (FrameLayout.LayoutParams) null, 6);
            case 3:
                return c6aVar.a.a((paj0) obj, c6aVar.c, c6aVar.d);
            default:
                return c6aVar.a.a((paj0) obj, c6aVar.c, c6aVar.d);
        }
    }
}

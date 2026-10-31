package p;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g280 extends j2t {
    public final /* synthetic */ byte o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f51p;

    public g280(Surface surface) {
        super(j2t.k, 0);
        this.f51p = surface;
    }

    @Override // p.j2t
    public final n8d0 f() {
        byte b = this.o;
        Object obj = this.f51p;
        switch (b) {
            case 0:
                return poz0.B((Surface) obj);
            default:
                return ((j4d1) obj).f;
        }
    }

    public g280(Surface surface, Size size, int i) {
        super(size, i);
        this.f51p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g280(j4d1 j4d1Var, Size size) {
        super(size, 34);
        this.f51p = j4d1Var;
    }
}

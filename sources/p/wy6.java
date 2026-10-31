package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wy6 implements ey31 {
    public final /* synthetic */ byte a;
    public final u0i b;

    public /* synthetic */ wy6(u0i u0iVar, byte b) {
        this.a = b;
        this.b = u0iVar;
    }

    public final fy31 a(ViewGroup viewGroup) {
        byte b = this.a;
        igx igxVar = this.b;
        switch (b) {
            case 0:
                return new jh3(((pp) igxVar).a(null), (byte) 1);
            default:
                return new jh3(igxVar.a((l0i) null), (byte) 4);
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return xu31.class;
            default:
                return rv31.class;
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 1;
        }
    }
}

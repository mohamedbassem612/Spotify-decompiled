package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hh3 implements ey31 {
    public final /* synthetic */ byte a;
    public final pp b;

    public /* synthetic */ hh3(pp ppVar, byte b) {
        this.a = b;
        this.b = ppVar;
    }

    public final fy31 a(ViewGroup viewGroup) {
        byte b = this.a;
        pp ppVar = this.b;
        switch (b) {
            case 0:
                return new jh3(ppVar.a(null), (byte) 0);
            default:
                return new jh3(ppVar.a(null), (byte) 2);
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return wu31.class;
            default:
                return iv31.class;
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return 3;
            default:
                return 6;
        }
    }
}

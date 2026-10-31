package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rlu implements n561 {
    public final /* synthetic */ byte a;
    public final n561 b;
    public final iu30 c;

    public /* synthetic */ rlu(n561 n561Var, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = n561Var;
        this.c = iu30Var;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new qlu(this.b.iterator(), this.c);
            case 1:
                return new y9v(this);
            default:
                return new y9v(this, (byte) 0);
        }
    }
}

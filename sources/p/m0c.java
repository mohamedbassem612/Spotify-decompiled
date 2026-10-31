package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m0c implements o6w0 {
    public final /* synthetic */ byte a;
    public final dg30 b;
    public final ldj0 c;
    public final y4q0 d;

    public /* synthetic */ m0c(dg30 dg30Var, ldj0 ldj0Var, y4q0 y4q0Var, byte b) {
        this.a = b;
        this.b = dg30Var;
        this.c = ldj0Var;
        this.d = y4q0Var;
    }

    @Override // p.o6w0
    public final r4j0 a(Context context) {
        switch (this.a) {
            case 0:
                return new l0c(this.b, this.c, this.d);
            case 1:
                return new ms30(this.b, this.c, this.d);
            case 2:
                return new yem0(this.b, this.c, this.d);
            default:
                return new ojl1(this.b, this.c, this.d);
        }
    }
}

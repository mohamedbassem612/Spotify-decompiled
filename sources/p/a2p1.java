package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a2p1 extends h2p1 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ p2p1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2p1(p2p1 p2p1Var, byte b) {
        super(p2p1Var);
        this.e = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(p2p1Var);
                this.f = p2p1Var;
                super(p2p1Var);
                break;
            default:
                this.f = p2p1Var;
                break;
        }
    }

    @Override // p.h2p1
    public final Object a(int i) {
        byte b = this.e;
        p2p1 p2p1Var = this.f;
        switch (b) {
            case 0:
                return p2p1Var.a()[i];
            default:
                return new k2p1(p2p1Var, i);
        }
    }
}

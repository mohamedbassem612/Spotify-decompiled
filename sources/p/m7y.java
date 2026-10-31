package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m7y extends k7o1 {
    public final ltf1 b;

    public /* synthetic */ m7y(h0n1 h0n1Var) {
        super(8);
        this.b = new ltf1((i2i1) h0n1Var.a);
    }

    @Override // p.k7o1
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("C_T", this.a);
        bundle.putBundle("A", this.b.m());
        return bundle;
    }
}

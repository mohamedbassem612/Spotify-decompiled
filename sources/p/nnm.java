package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nnm extends k7o1 {
    public final ltf1 b;

    public /* synthetic */ nnm(n4b n4bVar) {
        super(3);
        this.b = new ltf1((i2i1) n4bVar.b);
    }

    @Override // p.k7o1
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("C_T", this.a);
        bundle.putBundle("A", this.b.m());
        return bundle;
    }
}

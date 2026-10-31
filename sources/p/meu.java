package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class meu implements g50 {
    public final /* synthetic */ byte a;

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        switch (this.a) {
            case 0:
                w1q0Var.invoke(Boolean.TRUE);
                break;
            default:
                w1q0Var.invoke(Boolean.FALSE);
                break;
        }
    }

    public /* synthetic */ meu(byte b, boolean z) {
        this.a = b;
    }
}

package p;

import android.os.Bundle;
import android.os.Messenger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wvh0 extends hwh0 {
    public final /* synthetic */ Messenger a;
    public final /* synthetic */ int b;
    public final /* synthetic */ mv2 c;

    public wvh0(mv2 mv2Var, Messenger messenger, int i) {
        this.c = mv2Var;
        this.a = messenger;
        this.b = i;
    }

    @Override // p.hwh0
    public final void a(String str, Bundle bundle) {
        int i = zvh0.f;
        if (this.c.k(this.a) >= 0) {
            if (str == null) {
                zvh0.d(this.a, 4, this.b, 0, bundle, (Bundle) null);
                return;
            }
            Bundle bundleG = cy30.g("error", str);
            zvh0.d(this.a, 4, this.b, 0, bundle, bundleG);
        }
    }

    @Override // p.hwh0
    public final void b(Bundle bundle) {
        int i = zvh0.f;
        if (this.c.k(this.a) >= 0) {
            zvh0.d(this.a, 3, this.b, 0, bundle, (Bundle) null);
        }
    }
}

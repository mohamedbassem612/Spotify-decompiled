package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n8c0 implements bkl {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Intent c;

    public n8c0(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final void accept(Object obj) {
        ((m8c0) obj).b(this.a, this.b, this.c);
    }

    public final String toString() {
        return "Event.ON_ACTIVITY_RESULT";
    }
}

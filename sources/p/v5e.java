package p;

import android.os.Bundle;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v5e implements f4h1 {
    public final /* synthetic */ byte a;
    public final s5e b;
    public final LinearLayout c;

    public /* synthetic */ v5e(s5e s5eVar, LinearLayout linearLayout, byte b) {
        this.a = b;
        this.b = s5eVar;
        this.c = linearLayout;
    }

    public final Object getView() {
        byte b = this.a;
        return this.c;
    }

    public final Bundle serialize() {
        switch (this.a) {
            case 0:
                return new Bundle();
            default:
                return mno1.g();
        }
    }

    public final void start() {
        byte b = this.a;
        s5e s5eVar = this.b;
        switch (b) {
            case 0:
                s5eVar.start();
                break;
            default:
                s5eVar.start();
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        s5e s5eVar = this.b;
        switch (b) {
            case 0:
                s5eVar.stop();
                break;
            default:
                s5eVar.stop();
                break;
        }
    }
}

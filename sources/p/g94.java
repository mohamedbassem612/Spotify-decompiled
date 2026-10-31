package p;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g94 implements vng {
    public final Context a;
    public ClipboardManager b;

    public g94(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.a.getSystemService("clipboard");
        this.b = clipboardManager2;
        return clipboardManager2;
    }
}

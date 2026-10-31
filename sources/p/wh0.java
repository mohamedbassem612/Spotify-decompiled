package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wh0 implements xh0 {
    public final Intent a;

    public wh0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh0) && u890.j(this.a, ((wh0) obj).a);
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }
}

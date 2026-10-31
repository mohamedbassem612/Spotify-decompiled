package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bbd implements ebd {
    public final int a;
    public final Intent b;

    public bbd(Intent intent, int i) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbd)) {
            return false;
        }
        bbd bbdVar = (bbd) obj;
        return this.a == bbdVar.a && u890.j(this.b, bbdVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }
}

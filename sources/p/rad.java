package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rad implements tad {
    public final int a;
    public final Intent b;

    public rad(Intent intent, int i) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rad)) {
            return false;
        }
        rad radVar = (rad) obj;
        return this.a == radVar.a && u890.j(this.b, radVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }
}

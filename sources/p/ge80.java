package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ge80 extends o6p1 {
    public final View c;

    public ge80(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge80) && this.c.equals(((ge80) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

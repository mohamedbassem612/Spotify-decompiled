package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j7j0 extends cyo1 {
    public final View c;

    public j7j0(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7j0) && this.c.equals(((j7j0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

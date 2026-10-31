package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m7r0 extends upn1 {
    public final View c;

    public m7r0(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7r0) && u890.j(this.c, ((m7r0) obj).c);
    }

    public final int hashCode() {
        View view = this.c;
        if (view == null) {
            return 0;
        }
        return view.hashCode();
    }
}

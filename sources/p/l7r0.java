package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l7r0 extends upn1 {
    public final View c;

    public l7r0(View view) {
        this.c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7r0) && u890.j(this.c, ((l7r0) obj).c);
    }

    public final int hashCode() {
        View view = this.c;
        if (view == null) {
            return 0;
        }
        return view.hashCode();
    }
}

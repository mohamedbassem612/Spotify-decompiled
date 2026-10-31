package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ziy {
    public final View a;

    public ziy(View view) {
        this.a = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ziy) && this.a.equals(((ziy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

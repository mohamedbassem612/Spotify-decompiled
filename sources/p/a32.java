package p;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a32 {
    public final View a;
    public final ViewTreeObserver b;
    public final int c;

    public a32(View view) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = view.getId();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a32) && this.a.equals(((a32) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

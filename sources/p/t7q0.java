package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class t7q0 implements Parcelable {
    public final String getUri() {
        if (this instanceof f7q0) {
            return ((f7q0) this).a;
        }
        if (this instanceof h7q0) {
            return ((h7q0) this).a.getId();
        }
        if (this instanceof g7q0) {
            return ((g7q0) this).a;
        }
        if (this instanceof e7q0) {
            return ((e7q0) this).a;
        }
        eg.o();
        return null;
    }
}

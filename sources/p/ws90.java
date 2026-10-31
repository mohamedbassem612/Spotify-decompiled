package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ws90 implements xs90 {
    public final Context a;

    public ws90(Context context) {
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws90) && u890.j(this.a, ((ws90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

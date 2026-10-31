package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vs80 implements ws80 {
    public final Bundle a;

    public vs80(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs80) && this.a.equals(((vs80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

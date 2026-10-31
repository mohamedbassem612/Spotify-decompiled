package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class btc1 {
    public final ArrayList a;

    public btc1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btc1) && this.a.equals(((btc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

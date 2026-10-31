package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j181 {
    public final ArrayList a;

    public j181(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j181) && this.a.equals(((j181) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

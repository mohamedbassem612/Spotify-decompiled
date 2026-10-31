package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cnw0 implements dnw0 {
    public final maa a;

    public cnw0(maa maaVar) {
        this.a = maaVar;
    }

    @Override // p.dnw0
    public final List a() {
        return Collections.singletonList(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnw0) && this.a.equals(((cnw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

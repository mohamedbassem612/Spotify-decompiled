package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class prm extends trm {
    public final List a;

    public prm(nvm nvmVar, zgo1 zgo1Var) {
        this(Collections.singletonList(new tjn(nvmVar, zgo1Var)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prm) && u890.j(this.a, ((prm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public prm(List list) {
        this.a = list;
    }
}

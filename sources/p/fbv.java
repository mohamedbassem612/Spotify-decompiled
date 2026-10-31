package p;

import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fbv implements lil {
    public final sil a;

    public fbv(iu30 iu30Var) {
        sil silVar = new sil(null);
        iu30Var.invoke(silVar);
        this.a = silVar;
    }

    @Override // p.lil
    public void c(ynb1 ynb1Var, List list) throws CLParsingException {
        this.a.a(ynb1Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbv)) {
            return false;
        }
        return this.a.equals(((fbv) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}

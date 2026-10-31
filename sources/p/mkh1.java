package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mkh1 implements nkh1 {
    public final String a;
    public final String b;

    public mkh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final List a() {
        return Collections.singletonList(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkh1)) {
            return false;
        }
        mkh1 mkh1Var = (mkh1) obj;
        return this.a.equals(mkh1Var.a) && this.b.equals(mkh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}

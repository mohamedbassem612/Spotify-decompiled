package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rc70 extends rwo1 {
    public final String b;
    public final HubsImmutableComponentBundle c;
    public final /* synthetic */ sc70 d;

    public rc70(sc70 sc70Var, String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.d = sc70Var;
        this.b = str;
        this.c = hubsImmutableComponentBundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc70)) {
            return false;
        }
        rc70 rc70Var = (rc70) obj;
        return u890.j(this.b, rc70Var.b) && this.c.equals(rc70Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    public final rwo1 j(String str, Serializable serializable) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = this.c;
        if (u890.j(serializable, hubsImmutableComponentBundle.j(str))) {
            return this;
        }
        qc70 qc70Var = new qc70();
        qc70Var.b = this.b;
        qc70Var.c = hubsImmutableComponentBundle.a;
        qc70Var.j(str, serializable);
        return qc70Var;
    }

    public final sc70 l() {
        return this.d;
    }
}

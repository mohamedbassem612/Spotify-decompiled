package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kd70 extends vxo1 {
    public final String c;
    public final String d;
    public final HubsImmutableComponentBundle e;
    public final /* synthetic */ ld70 f;

    public kd70(ld70 ld70Var, String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.f = ld70Var;
        this.c = str;
        this.d = str2;
        this.e = hubsImmutableComponentBundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd70)) {
            return false;
        }
        kd70 kd70Var = (kd70) obj;
        return u890.j(this.c, kd70Var.c) && u890.j(this.d, kd70Var.d) && this.e.equals(kd70Var.e);
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e);
    }

    public final vxo1 i(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        if (hubsImmutableComponentBundle.s().isEmpty()) {
            return this;
        }
        jd70 jd70Var = new jd70();
        jd70Var.c = this.c;
        jd70Var.d = this.d;
        jd70Var.e = this.e.a;
        jd70Var.i(hubsImmutableComponentBundle);
        return jd70Var;
    }

    public final ld70 j() {
        return this.f;
    }
}

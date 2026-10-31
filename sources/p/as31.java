package p;

import android.content.ComponentName;
import android.media.RouteListingPreference;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class as31 {
    public final List a;
    public final boolean b;
    public final ComponentName c;

    public as31(jqd0 jqd0Var) {
        this.a = (List) jqd0Var.c;
        this.b = jqd0Var.b;
        this.c = (ComponentName) jqd0Var.d;
    }

    public final RouteListingPreference a() {
        return sf.S(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as31)) {
            return false;
        }
        as31 as31Var = (as31) obj;
        return this.a.equals(as31Var.a) && this.b == as31Var.b && Objects.equals(this.c, as31Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b), this.c);
    }
}

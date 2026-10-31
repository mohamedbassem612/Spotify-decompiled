package p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ygz0 {
    public final boolean a;
    public final Set b;
    public final Set c;

    public ygz0(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.a = z;
        this.b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean a(Class cls, boolean z) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.c.contains(cls) && this.a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ygz0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ygz0 ygz0Var = (ygz0) obj;
        return this.a == ygz0Var.a && Objects.equals(this.b, ygz0Var.b) && Objects.equals(this.c, ygz0Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}

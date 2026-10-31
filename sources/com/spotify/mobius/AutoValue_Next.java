package com.spotify.mobius;

import java.util.Set;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class AutoValue_Next<M, F> extends Next<M, F> {
    public final Object a;
    public final Set b;

    public AutoValue_Next(Object obj, Set set) {
        this.a = obj;
        if (set != null) {
            this.b = set;
        } else {
            bhn0.i("Null effects");
            throw null;
        }
    }

    @Override // com.spotify.mobius.Next
    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Next) {
            Next next = (Next) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(((AutoValue_Next) next).a) : ((AutoValue_Next) next).a == null) {
                if (this.b.equals(((AutoValue_Next) next).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() ^ (((obj == null ? 0 : obj.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Next{model=" + this.a + ", effects=" + this.b + "}";
    }
}

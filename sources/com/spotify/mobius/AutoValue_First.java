package com.spotify.mobius;

import java.util.Set;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class AutoValue_First<M, F> extends First<M, F> {
    public final Object a;
    public final Set b;

    public AutoValue_First(Object obj, Set set) {
        if (obj == null) {
            bhn0.i("Null model");
            throw null;
        }
        this.a = obj;
        if (set != null) {
            this.b = set;
        } else {
            bhn0.i("Null effects");
            throw null;
        }
    }

    @Override // com.spotify.mobius.First
    public final Set a() {
        return this.b;
    }

    @Override // com.spotify.mobius.First
    public final Object d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof First) {
            AutoValue_First autoValue_First = (AutoValue_First) ((First) obj);
            if (this.a.equals(autoValue_First.a) && this.b.equals(autoValue_First.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "First{model=" + this.a + ", effects=" + this.b + "}";
    }
}

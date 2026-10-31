package com.spotify.player.model;

import p.bhn0;
import p.f4i1;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class AutoValue_Suppressions extends Suppressions {
    private final t380 providers;

    public AutoValue_Suppressions(t380 t380Var) {
        if (t380Var != null) {
            this.providers = t380Var;
        } else {
            bhn0.i("Null providers");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Suppressions) {
            return this.providers.equals(((Suppressions) obj).providers());
        }
        return false;
    }

    public int hashCode() {
        return this.providers.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.Suppressions
    public t380 providers() {
        return this.providers;
    }

    public String toString() {
        return f4i1.f("Suppressions{providers=", String.valueOf(this.providers), "}");
    }
}

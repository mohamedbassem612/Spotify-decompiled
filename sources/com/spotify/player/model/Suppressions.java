package com.spotify.player.model;

import java.util.Collections;
import java.util.Set;
import p.kg11;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Suppressions {
    public static final Suppressions EMPTY = create();

    public static Suppressions create(Set<String> set) {
        kg11 kg11VarP;
        if (set == null) {
            int i = t380.c;
            kg11VarP = kg11.t;
        } else {
            kg11VarP = t380.p(set);
        }
        return new AutoValue_Suppressions(kg11VarP);
    }

    public abstract t380 providers();

    public static Suppressions create() {
        return create(Collections.EMPTY_SET);
    }
}

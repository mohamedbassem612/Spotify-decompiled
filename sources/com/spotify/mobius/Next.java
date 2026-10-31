package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.ImmutableUtil;
import com.spotify.mobius.internal_util.Preconditions;
import java.util.Collections;
import java.util.Set;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Next<M, F> {
    public static Next a(Set set) {
        return new AutoValue_Next(null, ImmutableUtil.b(set));
    }

    public static Next h(Object obj) {
        ImmutableUtil.a();
        return new AutoValue_Next(obj, Collections.EMPTY_SET);
    }

    public static Next i(Object obj, Set set) {
        return new AutoValue_Next(obj, ImmutableUtil.b(set));
    }

    public static Next j() {
        ImmutableUtil.a();
        return new AutoValue_Next(null, Collections.EMPTY_SET);
    }

    public abstract Set b();

    public final boolean c() {
        return !((AutoValue_Next) this).b.isEmpty();
    }

    public final boolean d() {
        return ((AutoValue_Next) this).a != null;
    }

    public final void e(Consumer consumer) {
        if (d()) {
            consumer.accept(g());
        }
    }

    public final Object f(Object obj) {
        Preconditions.b(obj);
        return d() ? g() : obj;
    }

    public final Object g() {
        if (d()) {
            return ((AutoValue_Next) this).a;
        }
        bhn0.t("there is no model in this Next<>");
        return null;
    }
}

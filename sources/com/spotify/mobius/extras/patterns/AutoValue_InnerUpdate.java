package com.spotify.mobius.extras.patterns;

import com.spotify.mobius.Update;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.mobius.functions.Function;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
final class AutoValue_InnerUpdate<M, E, F, MI, EI, FI> extends InnerUpdate<M, E, F, MI, EI, FI> {
    public final Update a;
    public final Function b;
    public final Function c;
    public final BiFunction d;
    public final InnerEffectHandler e;

    public static final class Builder<M, E, F, MI, EI, FI> extends InnerUpdate.Builder<M, E, F, MI, EI, FI> {
        public Update a;
        public Function b;
        public Function c;
        public BiFunction d;
        public InnerEffectHandler e;

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        public final InnerUpdate a() {
            String strConcat = this.a == null ? " innerUpdate" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" modelExtractor");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" eventExtractor");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" modelUpdater");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" innerEffectHandler");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_InnerUpdate(this.a, this.b, this.c, this.d, this.e);
            }
            eg.m("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        public final InnerUpdate.Builder b(Function function) {
            this.c = function;
            return this;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        public final InnerUpdate.Builder c(InnerEffectHandler innerEffectHandler) {
            this.e = innerEffectHandler;
            return this;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        public final InnerUpdate.Builder d(Update update) {
            this.a = update;
            return this;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        public final InnerUpdate.Builder e(Function function) {
            this.b = function;
            return this;
        }

        @Override // com.spotify.mobius.extras.patterns.InnerUpdate.Builder
        public final InnerUpdate.Builder f(BiFunction biFunction) {
            this.d = biFunction;
            return this;
        }
    }

    public AutoValue_InnerUpdate(Update update, Function function, Function function2, BiFunction biFunction, InnerEffectHandler innerEffectHandler) {
        this.a = update;
        this.b = function;
        this.c = function2;
        this.d = biFunction;
        this.e = innerEffectHandler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InnerUpdate) {
            AutoValue_InnerUpdate autoValue_InnerUpdate = (AutoValue_InnerUpdate) ((InnerUpdate) obj);
            if (this.a.equals(autoValue_InnerUpdate.a) && this.b.equals(autoValue_InnerUpdate.b) && this.c.equals(autoValue_InnerUpdate.c) && this.d.equals(autoValue_InnerUpdate.d) && this.e.equals(autoValue_InnerUpdate.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "InnerUpdate{innerUpdate=" + this.a + ", modelExtractor=" + this.b + ", eventExtractor=" + this.c + ", modelUpdater=" + this.d + ", innerEffectHandler=" + this.e + "}";
    }
}

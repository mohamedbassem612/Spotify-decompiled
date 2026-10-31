package com.spotify.mobius.extras.patterns;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.mobius.functions.Function;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class InnerUpdate<M, E, F, MI, EI, FI> implements Update<M, E, F> {

    public static abstract class Builder<M, E, F, MI, EI, FI> {
        public abstract InnerUpdate a();

        public abstract Builder b(Function function);

        public abstract Builder c(InnerEffectHandler innerEffectHandler);

        public abstract Builder d(Update update);

        public abstract Builder e(Function function);

        public abstract Builder f(BiFunction biFunction);
    }

    public static Builder b() {
        return new AutoValue_InnerUpdate.Builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Next a(Object obj, Object obj2) {
        AutoValue_InnerUpdate autoValue_InnerUpdate = (AutoValue_InnerUpdate) this;
        Object objApply = autoValue_InnerUpdate.b.apply(obj);
        objApply.getClass();
        Object objApply2 = autoValue_InnerUpdate.c.apply(obj2);
        objApply2.getClass();
        Next nextA = autoValue_InnerUpdate.a.a(objApply, objApply2);
        nextA.getClass();
        boolean zD = nextA.d();
        if (zD) {
            obj = autoValue_InnerUpdate.d.apply(obj, nextA.g());
        }
        Set setB = nextA.b();
        InnerEffectHandlers.AnonymousClass2 anonymousClass2 = (InnerEffectHandlers.AnonymousClass2) autoValue_InnerUpdate.e;
        anonymousClass2.getClass();
        if (setB.isEmpty()) {
            return zD ? Next.h(obj) : Next.j();
        }
        HashSet hashSet = new HashSet();
        Iterator<E> it = setB.iterator();
        while (it.hasNext()) {
            Object objApply3 = anonymousClass2.a.apply(it.next());
            objApply3.getClass();
            hashSet.add(objApply3);
        }
        return zD ? Next.i(obj, hashSet) : Next.a(hashSet);
    }
}

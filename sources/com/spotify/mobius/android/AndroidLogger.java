package com.spotify.mobius.android;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class AndroidLogger<M, E, F> implements MobiusLoop.Logger<M, E, F> {
    @Override // com.spotify.mobius.MobiusLoop.Logger
    public void a(Object obj, Object obj2, Next next) {
        if (next.d()) {
            Objects.toString(next.g());
        }
        Iterator<E> it = next.b().iterator();
        while (it.hasNext()) {
            Objects.toString(it.next());
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void b(Object obj, Object obj2, Exception exc) {
        String.format("FATAL ERROR: exception updating model '%s' with event '%s'", obj, obj2);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void c(Object obj, First first) {
        Objects.toString(first.d());
        Iterator<E> it = first.a().iterator();
        while (it.hasNext()) {
            Objects.toString(it.next());
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void d(Object obj, Object obj2) {
        Objects.toString(obj2);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void e(Object obj) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void f(Object obj, Exception exc) {
        Objects.toString(obj);
    }
}

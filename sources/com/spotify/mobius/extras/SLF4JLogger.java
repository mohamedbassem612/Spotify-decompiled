package com.spotify.mobius.extras;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Iterator;
import p.rue0;
import p.vue0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class SLF4JLogger<M, E, F> implements MobiusLoop.Logger<M, E, F> {
    public static final rue0 b = vue0.b(SLF4JLogger.class);
    public final String a;

    public SLF4JLogger(String str) {
        this.a = str;
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void a(Object obj, Object obj2, Next next) {
        boolean zD = next.d();
        String str = this.a;
        rue0 rue0Var = b;
        if (zD) {
            rue0Var.d("Mobius ({}) - Model updated: {}", str, next.g());
        }
        Iterator<E> it = next.b().iterator();
        while (it.hasNext()) {
            rue0Var.d("Mobius ({}) - Effect dispatched: {}", str, it.next());
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void b(Object obj, Object obj2, Exception exc) {
        b.n(obj, obj2, exc);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void c(Object obj, First first) {
        Object objD = first.d();
        rue0 rue0Var = b;
        String str = this.a;
        rue0Var.d("Mobius ({}) - Loop initialized, starting from model: {}", str, objD);
        Iterator<E> it = first.a().iterator();
        while (it.hasNext()) {
            rue0Var.d("Mobius ({}) - Effect dispatched: {}", str, it.next());
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void d(Object obj, Object obj2) {
        b.d("Mobius ({}) - Event received: {}", this.a, obj2);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void e(Object obj) {
        b.b(this.a);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void f(Object obj, Exception exc) {
        b.j(obj, exc);
    }
}

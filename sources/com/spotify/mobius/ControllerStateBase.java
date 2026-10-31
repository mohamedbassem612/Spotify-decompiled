package com.spotify.mobius;

import p.f4i1;
import p.qau;
import p.rue0;
import p.vue0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
abstract class ControllerStateBase<M, E> {
    public static final rue0 a = vue0.b(ControllerStateBase.class);

    public String a() {
        return "created";
    }

    public void b(Connectable connectable) {
        throw new IllegalStateException(f4i1.f("cannot call connect when in the ", a(), " state"));
    }

    public void c() {
        throw new IllegalStateException(f4i1.f("cannot call disconnect when in the ", a(), " state"));
    }

    public void d(Object obj) {
        a.d("Dropping event that was dispatched when the program was in the {} state: {}", a(), obj);
    }

    public abstract Object e();

    public void f(qau qauVar) {
        throw new IllegalStateException(f4i1.f("cannot call replaceModel when in the ", a(), " state"));
    }

    public void g() {
        throw new IllegalStateException(f4i1.f("cannot call start when in the ", a(), " state"));
    }

    public void h() {
        throw new IllegalStateException(f4i1.f("cannot call stop when in the ", a(), " state"));
    }

    public void i(Object obj) {
        a.d("Dropping model that was dispatched when the program was in the {} state: {}", a(), obj);
    }
}

package p;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ahz0 {
    public static final ygz0 b = new ygz0(true, null, null);
    public static final ahz0 c = new ahz0();
    public final xen0 a;

    public ahz0() {
        xen0 xen0Var = new xen0();
        xen0Var.c = new Object();
        xen0Var.a = 0;
        xen0Var.b = false;
        xen0Var.e = new HashMap();
        xen0Var.f = new CopyOnWriteArraySet();
        xen0Var.d = new AtomicReference(b);
        this.a = xen0Var;
    }
}

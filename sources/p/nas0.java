package p;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nas0 {
    public final h4k a;
    public final v3k b;
    public final x340 c;
    public final vu30 d;
    public final boolean e;
    public final j06 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(pas0.c);
    public long i = t8p1.k();
    public oen0 j = ij41.a;
    public final h72 k;
    public final l0x0 l;

    public nas0(h4k h4kVar, v3k v3kVar, x340 x340Var, qen0 qen0Var, vu30 vu30Var, boolean z, j06 j06Var, Object obj) {
        this.a = h4kVar;
        this.b = v3kVar;
        this.c = x340Var;
        this.d = vu30Var;
        this.e = z;
        this.f = j06Var;
        this.g = obj;
        h72 h72Var = new h72();
        h72Var.L(qen0Var, x340Var.F());
        this.k = h72Var;
        this.l = new l0x0(j06Var.a());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((pas0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    pas0 pas0Var = pas0.f;
                    pas0 pas0Var2 = pas0.g;
                    while (!atomicReference.compareAndSet(pas0Var, pas0Var2)) {
                        if (atomicReference.get() != pas0Var) {
                            bmv0.b("Unexpected state change from: " + pas0Var + " to: " + pas0Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(pas0.a);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.w(this.f, this.k);
                    this.k.A();
                    this.k.B();
                    this.k.z();
                    this.a.Q0 = null;
                } catch (Throwable th) {
                    this.k.z();
                    this.a.Q0 = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void c() {
        oen0 oen0Var;
        this.h.set(pas0.b);
        h72 h72Var = this.k;
        if (((oen0) h72Var.e).h()) {
            oen0Var = (oen0) h72Var.e;
            oen0 oen0Var2 = ij41.a;
            h72Var.e = new oen0();
            ((bfn0) h72Var.d).g();
        } else {
            oen0Var = null;
        }
        h72Var.z();
        h4k h4kVar = this.a;
        h4kVar.Q0 = null;
        if (oen0Var != null) {
            h4kVar.U0.Y = oen0Var;
            h4kVar.W0 = (byte) 2;
        }
    }

    public final l0x0 d() {
        return this.l;
    }

    public final h72 e() {
        return this.k;
    }

    public final boolean f() {
        return ((pas0) this.h.get()).compareTo(pas0.f) >= 0;
    }

    public final boolean g() {
        return this.h.get() == pas0.e && this.i == t8p1.k();
    }

    public final void h() {
        AtomicReference atomicReference;
        pas0 pas0Var;
        pas0 pas0Var2;
        do {
            atomicReference = this.h;
            pas0Var = pas0.d;
            pas0Var2 = pas0.f;
            if (atomicReference.compareAndSet(pas0Var, pas0Var2)) {
                return;
            }
        } while (atomicReference.get() == pas0Var);
        bmv0.b("Unexpected state change from: " + pas0Var + " to: " + pas0Var2 + ".");
    }

    public final void i() {
        AtomicReference atomicReference;
        pas0 pas0Var;
        do {
            atomicReference = this.h;
            pas0Var = pas0.f;
            if (atomicReference.compareAndSet(pas0Var, pas0.d)) {
                return;
            }
        } while (atomicReference.get() == pas0Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:1: B:25:0x007b->B:85:?, LOOP_END, SYNTHETIC] */
    public final boolean j(n181 n181Var) throws Exception {
        long j;
        pas0 pas0Var = pas0.e;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((pas0) atomicReference.get()).ordinal();
            h4k h4kVar = this.a;
            v3k v3kVar = this.b;
            pas0 pas0Var2 = pas0.d;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    x340 x340Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        x340Var.z = 0;
                        x340Var.y = true;
                    }
                    this.j = v3kVar.b(h4kVar, n181Var, this.d);
                    if (z) {
                        if (x340Var.F || x340Var.z != 0) {
                            bmv0.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        x340Var.z = -1;
                        x340Var.y = false;
                    }
                    pas0 pas0Var3 = pas0.c;
                    while (!atomicReference.compareAndSet(pas0Var3, pas0Var2)) {
                        if (atomicReference.get() != pas0Var3) {
                            bmv0.b("Unexpected state change from: " + pas0Var3 + " to: " + pas0Var2 + ".");
                            if (this.j.g()) {
                                h();
                            }
                            return f();
                        }
                    }
                    if (this.j.g()) {
                        h();
                    }
                    return f();
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(pas0Var2, pas0Var)) {
                            if (atomicReference.get() != pas0Var2) {
                                bmv0.b("Unexpected state change from: " + pas0Var2 + " to: " + pas0Var + ".");
                                j = this.i;
                                this.i = t8p1.k();
                                this.j = v3kVar.r(h4kVar, n181Var, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(pas0Var, pas0Var2)) {
                                    if (atomicReference.get() != pas0Var) {
                                        bmv0.b("Unexpected state change from: " + pas0Var + " to: " + pas0Var2 + ".");
                                        if (this.j.g()) {
                                            h();
                                        }
                                        return f();
                                    }
                                }
                                if (this.j.g()) {
                                    h();
                                }
                                return f();
                            }
                        }
                        this.i = t8p1.k();
                        this.j = v3kVar.r(h4kVar, n181Var, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(pas0Var, pas0Var2)) {
                            if (atomicReference.get() != pas0Var) {
                                bmv0.b("Unexpected state change from: " + pas0Var + " to: " + pas0Var2 + ".");
                                if (this.j.g()) {
                                    h();
                                }
                                return f();
                            }
                        }
                        if (this.j.g()) {
                            h();
                        }
                        return f();
                    } catch (Throwable th) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(pas0Var, pas0Var2)) {
                            if (atomicReference.get() != pas0Var) {
                                bmv0.b("Unexpected state change from: " + pas0Var + " to: " + pas0Var2 + ".");
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.i;
                case 4:
                    g0k.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(pas0.a);
            throw e;
        }
    }
}

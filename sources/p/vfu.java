package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vfu extends xfu implements e9n, lnm {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(vfu.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long i = avg.a.objectFieldOffset(vfu.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final q8n d;
    public final onm e;
    public Object f;
    public final Object g;

    public vfu(q8n q8nVar, onm onmVar) {
        super(-1);
        this.d = q8nVar;
        this.e = onmVar;
        this.f = hr80.a;
        this.g = flo1.s(onmVar.getContext());
    }

    @Override // p.e9n
    public final e9n getCallerFrame() {
        return this.e;
    }

    @Override // p.lnm
    public final o8n getContext() {
        return this.e.getContext();
    }

    @Override // p.xfu
    public final Object h() {
        Object obj = this.f;
        this.f = hr80.a;
        return obj;
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        Object objR = uap1.r(obj);
        onm onmVar = this.e;
        o8n context = onmVar.getContext();
        q8n q8nVar = this.d;
        if (hr80.y(q8nVar, context)) {
            this.f = objR;
            this.c = 0;
            hr80.x(q8nVar, onmVar.getContext(), this);
            return;
        }
        ab00 ab00VarA = jge1.a();
        if (ab00VarA.V()) {
            this.f = objR;
            this.c = 0;
            ab00VarA.R(this);
            return;
        }
        ab00VarA.T(true);
        try {
            o8n context2 = onmVar.getContext();
            Object objW = flo1.w(context2, this.g);
            try {
                onmVar.resumeWith(obj);
                flo1.p(context2, objW);
                while (ab00VarA.Z()) {
                }
            } catch (Throwable th) {
                flo1.p(context2, objW);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                ab00VarA.N(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + v8r.v(this.e) + ']';
    }

    @Override // p.xfu
    public final lnm c() {
        return this;
    }
}

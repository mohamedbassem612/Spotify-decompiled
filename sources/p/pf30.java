package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pf30 extends kh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ pf30(AtomicReference atomicReference, byte b) {
        this.a = b;
        this.b = atomicReference;
    }

    public final void a(Object obj) {
        byte b = this.a;
        AtomicReference atomicReference = this.b;
        switch (b) {
            case 0:
                kh0 kh0Var = (kh0) atomicReference.get();
                if (kh0Var == null) {
                    eg.m("Operation cannot be started before fragment is in created state");
                } else {
                    kh0Var.a(obj);
                }
                break;
            default:
                kh0 kh0Var2 = (kh0) atomicReference.get();
                if (kh0Var2 != null) {
                    kh0Var2.a(obj);
                }
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        AtomicReference atomicReference = this.b;
        switch (b) {
            case 0:
                kh0 kh0Var = (kh0) atomicReference.getAndSet(null);
                if (kh0Var != null) {
                    kh0Var.b();
                }
                break;
            default:
                kh0 kh0Var2 = (kh0) atomicReference.getAndSet(null);
                if (kh0Var2 != null) {
                    kh0Var2.b();
                }
                break;
        }
    }
}

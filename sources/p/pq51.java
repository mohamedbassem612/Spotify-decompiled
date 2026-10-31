package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class pq51 {
    public static final ip51 a = new ip51(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(ip51 ip51Var) {
        if (ip51Var.f != null || ip51Var.g != null) {
            hhg1.n("Failed requirement.");
            return;
        }
        if (ip51Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        ip51 ip51Var2 = a;
        ip51 ip51Var3 = (ip51) atomicReference.getAndSet(ip51Var2);
        if (ip51Var3 == ip51Var2) {
            return;
        }
        int i = ip51Var3 != null ? ip51Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(ip51Var3);
            return;
        }
        ip51Var.f = ip51Var3;
        ip51Var.b = 0;
        ip51Var.c = i + 8192;
        atomicReference.set(ip51Var);
    }

    public static final ip51 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        ip51 ip51Var = a;
        ip51 ip51Var2 = (ip51) atomicReference.getAndSet(ip51Var);
        if (ip51Var2 == ip51Var) {
            return new ip51();
        }
        if (ip51Var2 == null) {
            atomicReference.set(null);
            return new ip51();
        }
        atomicReference.set(ip51Var2.f);
        ip51Var2.f = null;
        ip51Var2.c = 0;
        return ip51Var2;
    }
}

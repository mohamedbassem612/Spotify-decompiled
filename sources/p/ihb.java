package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ihb {
    public final int a;
    public final mr20 b;
    public final iu30 c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final /* synthetic */ phb e;

    public ihb(phb phbVar, int i, sen0 sen0Var, iu30 iu30Var) {
        this.e = phbVar;
        this.a = i;
        this.b = sen0Var;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100 A[DONT_GENERATE] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    public final Object a(onm onmVar) {
        hhb hhbVar;
        rih1 rih1Var = rih1.a;
        if (onmVar instanceof hhb) {
            hhbVar = (hhb) onmVar;
            int i = hhbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hhbVar.c = i - Integer.MIN_VALUE;
            } else {
                hhbVar = new hhb(this, onmVar);
            }
        } else {
            hhbVar = new hhb(this, onmVar);
        }
        Object obj = hhbVar.a;
        d9n d9nVar = d9n.a;
        int i2 = hhbVar.c;
        try {
            try {
                try {
                    if (i2 == 0) {
                        hm5.M(obj);
                        if (this.d.compareAndSet(false, true)) {
                            iu30 iu30Var = this.c;
                            hhbVar.c = 1;
                            if (iu30Var.invoke(hhbVar) == d9nVar) {
                                return d9nVar;
                            }
                        }
                        return rih1Var;
                    }
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    this.e.b.g(this.a);
                } catch (Exception e) {
                    Logger.l(e, "Failed to restore audio mode after Bluetooth microphone capture", new Object[0]);
                } finally {
                    if (this.e.d == this) {
                        this.e.d = null;
                    }
                }
            } catch (TimeoutCancellationException e2) {
                Logger.l(e2, "Bluetooth microphone route release timed out", new Object[0]);
                try {
                    this.e.b.g(this.a);
                } catch (Exception e3) {
                    Logger.l(e3, "Failed to restore audio mode after Bluetooth microphone capture", new Object[0]);
                } finally {
                    if (this.e.d == this) {
                        this.e.d = null;
                    }
                }
            } catch (CancellationException e4) {
                throw e4;
            } catch (Exception e5) {
                Logger.l(e5, "Bluetooth microphone route release failed", new Object[0]);
                try {
                    this.e.b.g(this.a);
                } catch (Exception e6) {
                    Logger.l(e6, "Failed to restore audio mode after Bluetooth microphone capture", new Object[0]);
                } finally {
                    if (this.e.d == this) {
                        this.e.d = null;
                    }
                }
                return rih1Var;
            }
        } catch (Throwable th) {
            try {
                this.e.b.g(this.a);
            } catch (Exception e7) {
                Logger.l(e7, "Failed to restore audio mode after Bluetooth microphone capture", new Object[0]);
            } finally {
                if (this.e.d == this) {
                    this.e.d = null;
                }
            }
            throw th;
        }
    }
}

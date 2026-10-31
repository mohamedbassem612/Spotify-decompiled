package p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class xu7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xu7(ip00 ip00Var, int i, boolean z) {
        this.a = (byte) 5;
        this.c = ip00Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yu7 yu7Var = (yu7) this.c;
                yu7Var.b.onAudioFocusChange(this.b);
                return;
            case 1:
                em3 em3Var = (em3) this.c;
                int i = this.b;
                t38 t38Var = (t38) em3Var.c;
                String str = zoi1.a;
                t38Var.i(i);
                return;
            case 2:
                ((d2d) this.c).a(this.b);
                return;
            case 3:
                LinkedHashSet<hdd1> linkedHashSet = (LinkedHashSet) this.c;
                int i2 = this.b;
                for (hdd1 hdd1Var : linkedHashSet) {
                    if (i2 == 5) {
                        synchronized (hdd1Var.f61p) {
                            try {
                                if (hdd1Var.m() && hdd1Var.q != null) {
                                    hdd1Var.l("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it = hdd1Var.q.iterator();
                                    while (it.hasNext()) {
                                        ((j2t) it.next()).a();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        hdd1Var.getClass();
                    }
                }
                return;
            case 4:
                ((Consumer) this.c).accept(Integer.valueOf(this.b));
                return;
            case 5:
                ip00 ip00Var = (ip00) this.c;
                int i3 = this.b;
                pfr pfrVar = ip00Var.W0;
                byte b = ip00Var.a[i3].a.b;
                pfrVar.a0(pfrVar.W(), 1033, new n7o((byte) 19));
                return;
            case 6:
                ((b4j1) this.c).onStatus(this.b);
                return;
            default:
                rlh0 rlh0Var = (rlh0) this.c;
                int i4 = this.b;
                d46 d46Var = rlh0Var.k;
                d46Var.remove(Integer.valueOf(i4));
                rlh0Var.l.delete(i4);
                hi61 hi61Var = rlh0Var.n;
                if (hi61Var == null || hi61Var.a.c >= 5 || !d46Var.isEmpty()) {
                    return;
                }
                rlh0Var.m.postDelayed(new klh0(rlh0Var, (byte) 1), 500L);
                return;
        }
    }

    public /* synthetic */ xu7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}

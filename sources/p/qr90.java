package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qr90 implements yt90 {
    public final kly0 a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final kly0 e;
    public final kly0 f;
    public final kly0 g;
    public final kly0 h;
    public final kly0 i;
    public final znb0 j = dm5.S(3, new pr90(this, (byte) 0));

    public qr90(chp chpVar, kly0 kly0Var, kly0 kly0Var2, chp chpVar2, kly0 kly0Var3, kly0 kly0Var4, chp chpVar3, chp chpVar4, kly0 kly0Var5) {
        this.a = chpVar;
        this.b = kly0Var;
        this.c = kly0Var2;
        this.d = chpVar2;
        this.e = kly0Var3;
        this.f = kly0Var4;
        this.g = chpVar3;
        this.h = chpVar4;
        this.i = kly0Var5;
    }

    public final void start() {
        Iterator it = ((List) this.j.getValue()).iterator();
        while (it.hasNext()) {
            ((yt90) it.next()).start();
        }
    }

    public final void stop() {
        Iterator it = ((List) this.j.getValue()).iterator();
        while (it.hasNext()) {
            ((yt90) it.next()).stop();
        }
    }
}

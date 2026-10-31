package p;

import android.os.SystemClock;
import androidx.media3.exoplayer.video.a;
import androidx.media3.exoplayer.video.c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yoj1 {
    public final iir a;
    public final c b;
    public final xoj1 g;
    public final ln20 h;
    public long m;
    public final x1c c = new x1c((byte) 4);
    public final w4c0 d = new w4c0();
    public final w4c0 e = new w4c0();
    public final v4f0 f = new v4f0(16);
    public long i = -9223372036854775807L;
    public z1k1 l = z1k1.d;
    public long j = -9223372036854775807L;
    public long k = -9223372036854775807L;

    public yoj1(iir iirVar, c cVar, xoj1 xoj1Var, ln20 ln20Var) {
        this.a = iirVar;
        this.b = cVar;
        this.g = xoj1Var;
        this.h = ln20Var;
    }

    public final void a(long j, long j2) {
        final iir iirVar = this.a;
        a aVar = (a) iirVar.c;
        while (true) {
            v4f0 v4f0Var = this.f;
            if (v4f0Var.c == 0) {
                return;
            }
            long jB = v4f0Var.b();
            Long l = (Long) this.e.C(jB);
            c cVar = this.b;
            if (l != null && l.longValue() != this.m) {
                this.m = l.longValue();
                cVar.e(2);
            }
            ln20 ln20Var = this.h;
            ln20Var.b(1000 * jB);
            long j3 = this.m;
            long jA = ln20Var.a();
            long j4 = ln20Var.h;
            c cVar2 = this.b;
            x1c x1cVar = this.c;
            int iA = cVar2.a(jB, j, j2, j3, false, false, jA, j4, x1cVar);
            if (iA != 5 && iA != 4) {
                this.g.a(jB, x1cVar.a);
            }
            final byte b = 1;
            if (iA == 0 || iA == 1) {
                this.j = jB;
                final byte b2 = 0;
                boolean z = iA == 0;
                long jC = v4f0Var.c();
                z1k1 z1k1Var = (z1k1) this.d.C(jC);
                if (z1k1Var != null && !z1k1Var.equals(z1k1.d) && !z1k1Var.equals(this.l)) {
                    this.l = z1k1Var;
                    ge30 ge30Var = new ge30();
                    ge30Var.v = z1k1Var.a;
                    ge30Var.w = z1k1Var.b;
                    ge30Var.o = asj0.p("video/raw");
                    iirVar.b = new ie30(ge30Var);
                    aVar.j.execute(new e0i(iirVar, z1k1Var, (byte) 17));
                }
                long jNanoTime = z ? System.nanoTime() : x1cVar.b;
                b = cVar.e == 3 ? (byte) 0 : (byte) 1;
                cVar.e = 3;
                cVar.k.getClass();
                cVar.g = zoi1.W(SystemClock.elapsedRealtime());
                if (b != 0 && aVar.f != null) {
                    aVar.j.execute(new Runnable() { // from class: p.fzs
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            iir iirVar2 = iirVar;
                            switch (b3) {
                                case 0:
                                    ((a) iirVar2.c).i.a();
                                    break;
                                default:
                                    ((a) iirVar2.c).i.d();
                                    break;
                            }
                        }
                    });
                }
                ie30 ie30Var = (ie30) iirVar.b;
                aVar.k.a(jC, jNanoTime, ie30Var == null ? new ie30(new ge30()) : ie30Var, null);
                ((w1k1) aVar.d.remove()).a(jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.j = jB;
                v4f0Var.c();
                aVar.j.execute(new Runnable() { // from class: p.fzs
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        iir iirVar2 = iirVar;
                        switch (b3) {
                            case 0:
                                ((a) iirVar2.c).i.a();
                                break;
                            default:
                                ((a) iirVar2.c).i.d();
                                break;
                        }
                    }
                });
                ((w1k1) aVar.d.remove()).b();
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    eg.m(String.valueOf(iA));
                    return;
                }
                this.j = jB;
            }
        }
    }
}

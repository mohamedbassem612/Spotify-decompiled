package p;

import android.util.Pair;
import androidx.media3.common.PlaybackException;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u5u0 implements uz3, q3u0 {
    public final hfs a;
    public final HashMap b;
    public final HashMap c;
    public final dqe1 d;
    public s5u0 e;
    public String f;
    public long g;
    public int h;
    public int i;
    public Exception j;
    public long k;
    public long l;
    public ie30 m;
    public ie30 n;
    public z1k1 o;

    public u5u0() {
        hfs hfsVar = new hfs();
        this.a = hfsVar;
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = s5u0.O;
        this.d = new dqe1();
        this.o = z1k1.d;
        hfsVar.d = this;
    }

    @Override // p.q3u0
    public final void a(String str) {
        t5u0 t5u0Var = (t5u0) this.b.get(str);
        t5u0Var.getClass();
        t5u0Var.K = true;
        t5u0Var.I = false;
    }

    @Override // p.uz3
    public final void b(z1k1 z1k1Var) {
        this.o = z1k1Var;
    }

    @Override // p.q3u0
    public final void f(tz3 tz3Var, String str, boolean z) {
        t5u0 t5u0Var = (t5u0) this.b.remove(str);
        t5u0Var.getClass();
        ((tz3) this.c.remove(str)).getClass();
        str.equals(this.f);
        int i = 11;
        if (t5u0Var.G != 11 && !z) {
            i = 15;
        }
        long j = tz3Var.a;
        t5u0Var.d(j);
        t5u0Var.c(j);
        t5u0Var.h(i, tz3Var);
        this.e = s5u0.a(this.e, t5u0Var.a(true));
    }

    @Override // p.q3u0
    public final void g(tz3 tz3Var, String str) {
        t5u0 t5u0Var = (t5u0) this.b.get(str);
        t5u0Var.getClass();
        t5u0Var.J = true;
    }

    @Override // p.q3u0
    public final void h(tz3 tz3Var, String str) {
        this.b.put(str, new t5u0(tz3Var));
        this.c.put(str, tz3Var);
    }

    public final boolean i(em3 em3Var, String str, int i) {
        return em3Var.j(i) && this.a.a(em3Var.m(i), str);
    }

    @Override // p.uz3
    public final void o(tz3 tz3Var, int i, long j) {
        this.k = i;
        this.l = j;
    }

    @Override // p.uz3
    public final void p(Exception exc) {
        this.j = exc;
    }

    @Override // p.uz3
    public final void q(tz3 tz3Var, qqh0 qqh0Var) {
        int i = qqh0Var.b;
        ie30 ie30Var = qqh0Var.c;
        if (i == 2 || i == 0) {
            this.m = ie30Var;
        } else if (i == 1) {
            this.n = ie30Var;
        }
    }

    @Override // p.uz3
    public final void r(qqh0 qqh0Var, IOException iOException) {
        this.j = iOException;
    }

    @Override // p.uz3
    public final void s(p8u0 p8u0Var, int i) {
        String str;
        if (this.f == null) {
            hfs hfsVar = this.a;
            synchronized (hfsVar) {
                str = hfsVar.f;
            }
            this.f = str;
            this.g = p8u0Var.f;
        }
        this.h = i;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, p.t5u0] */
    @Override // p.uz3
    public final void t(r8u0 r8u0Var, em3 em3Var) {
        hfs hfsVar;
        hfs hfsVar2;
        boolean z;
        ?? r13;
        HashMap map;
        int i;
        ko20 ko20Var = (ko20) em3Var.b;
        if (ko20Var.a.size() == 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int size = ko20Var.a.size();
            hfsVar = this.a;
            if (i2 >= size) {
                break;
            }
            int iB = ko20Var.b(i2);
            tz3 tz3VarM = em3Var.m(iB);
            if (iB == 0) {
                hfsVar.i(tz3VarM);
            } else if (iB == 11) {
                hfsVar.h(this.h, tz3VarM);
            } else {
                hfsVar.g(tz3VarM);
            }
            i2++;
        }
        HashMap map2 = this.b;
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int i3 = 0;
            tz3 tz3Var = null;
            boolean zA = false;
            while (i3 < ko20Var.a.size()) {
                tz3 tz3VarM2 = em3Var.m(ko20Var.b(i3));
                boolean zA2 = hfsVar.a(tz3VarM2, str);
                if (tz3Var == null || (zA2 && !zA)) {
                    map = map2;
                    i = i3;
                } else {
                    if (zA2 == zA) {
                        i = i3;
                        map = map2;
                        if (tz3VarM2.a > tz3Var.a) {
                        }
                    } else {
                        map = map2;
                        i = i3;
                    }
                    i3 = i + 1;
                    map2 = map;
                }
                tz3Var = tz3VarM2;
                zA = zA2;
                i3 = i + 1;
                map2 = map;
            }
            HashMap map3 = map2;
            tz3Var.getClass();
            sqe1 sqe1Var = tz3Var.b;
            p2i0 p2i0Var = tz3Var.d;
            if (zA || p2i0Var == null) {
                hfsVar2 = hfsVar;
            } else {
                int i4 = p2i0Var.b;
                Object obj = p2i0Var.a;
                if (p2i0Var.c()) {
                    dqe1 dqe1Var = this.d;
                    long jD = sqe1Var.g(obj, dqe1Var).d(i4);
                    if (jD == Long.MIN_VALUE) {
                        jD = dqe1Var.d;
                    }
                    tz3Var = new tz3(tz3Var.a, sqe1Var, tz3Var.c, new p2i0(obj, p2i0Var.d, i4), zoi1.n0(jD + dqe1Var.e), sqe1Var, tz3Var.g, tz3Var.h, tz3Var.i, tz3Var.j);
                    hfsVar2 = hfsVar;
                    zA = hfsVar2.a(tz3Var, str);
                } else {
                    hfsVar2 = hfsVar;
                }
            }
            Pair pairCreate = Pair.create(tz3Var, Boolean.valueOf(zA));
            ?? r6 = (t5u0) map3.get(str);
            boolean zI = i(em3Var, str, 11);
            boolean zI2 = i(em3Var, str, 1018);
            boolean zI3 = i(em3Var, str, 1011);
            boolean zI4 = i(em3Var, str, 1000);
            boolean zI5 = i(em3Var, str, 10);
            boolean z2 = i(em3Var, str, ContentMediaFormat.FULL_CONTENT_MOVIE) || i(em3Var, str, SemanticState.ReadOnly);
            boolean zI6 = i(em3Var, str, ContentMediaFormat.PARTIAL_CONTENT_MOVIE);
            boolean zI7 = i(em3Var, str, ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
            boolean zI8 = i(em3Var, str, 25);
            tz3 tz3Var2 = (tz3) pairCreate.first;
            ((Boolean) pairCreate.second).booleanValue();
            long j = str.equals(this.f) ? this.g : -9223372036854775807L;
            int i5 = zI2 ? this.i : 0;
            PlaybackException playbackExceptionL = zI5 ? r8u0Var.L() : null;
            Exception exc = z2 ? this.j : null;
            long j2 = j;
            long j3 = zI6 ? this.k : 0L;
            long j4 = zI6 ? this.l : 0L;
            ie30 ie30Var = zI7 != 0 ? this.m : null;
            ie30 ie30Var2 = zI7 ? this.n : null;
            z1k1 z1k1Var = zI8 ? this.o : null;
            r6.getClass();
            if (j2 != -9223372036854775807L) {
                long j5 = tz3Var2.a;
                r6.I = true;
            }
            if (r8u0Var.getPlaybackState() != 2) {
                r6.I = false;
            }
            int playbackState = r8u0Var.getPlaybackState();
            Iterator it2 = it;
            if (playbackState == 1 || playbackState == 4 || zI) {
                z = false;
                r6.K = false;
            } else {
                z = false;
            }
            if (playbackExceptionL != null) {
                r6.L = true;
                r6.E++;
            } else if (r8u0Var.L() == null) {
                r6.L = z;
            }
            if (r6.J && !r6.K) {
                o3g1 o3g1VarU = r8u0Var.U();
                if (!o3g1VarU.a(2)) {
                    r6.g(tz3Var2, null);
                }
                if (!o3g1VarU.a(1)) {
                    r6.e(tz3Var2, null);
                }
            }
            if (ie30Var != null) {
                r6.g(tz3Var2, ie30Var);
            }
            if (ie30Var2 != null) {
                r6.e(tz3Var2, ie30Var2);
            }
            ie30 ie30Var3 = r6.O;
            if (ie30Var3 != null && ie30Var3.x == -1 && z1k1Var != null) {
                ge30 ge30VarA = ie30Var3.a();
                ge30VarA.v = z1k1Var.a;
                ge30VarA.w = z1k1Var.b;
                r6.g(tz3Var2, new ie30(ge30VarA));
            }
            if (zI4) {
                r6.M = true;
            }
            if (zI3) {
                r6.D++;
            }
            r6.C += (long) i5;
            r6.A += j3;
            r6.B += j4;
            if (exc != null) {
                r6.F++;
            }
            int playbackState2 = r8u0Var.getPlaybackState();
            if (r6.I && r6.J) {
                r13 = 5;
            } else if (r6.L) {
                r13 = 13;
            } else if (!r6.J) {
                r13 = r6.M;
            } else if (r6.K) {
                r13 = 14;
            } else if (playbackState2 == 4) {
                r13 = 11;
            } else if (playbackState2 == 2) {
                int i6 = r6.G;
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 14) {
                    r13 = 2;
                } else if (r8u0Var.q()) {
                    r13 = r8u0Var.c0() != 0 ? 10 : 6;
                } else {
                    r13 = 7;
                }
            } else {
                r13 = 3;
                if (playbackState2 != 3) {
                    r13 = (playbackState2 != 1 || r6.G == 0) ? r6.G : 12;
                } else if (!r8u0Var.q()) {
                    r13 = 4;
                } else if (r8u0Var.c0() != 0) {
                    r13 = 9;
                }
            }
            float f = r8u0Var.l().a;
            if (r6.G != r13 || r6.S != f) {
                long j6 = tz3Var2.a;
                r6.d(j6);
                r6.c(j6);
            }
            r6.S = f;
            if (r6.G != r13) {
                r6.h(r13, tz3Var2);
            }
            hfsVar = hfsVar2;
            map2 = map3;
            it = it2;
            ko20Var = ko20Var;
        }
        hfs hfsVar3 = hfsVar;
        this.m = null;
        this.n = null;
        this.f = null;
        if (em3Var.j(1028)) {
            hfsVar3.c(em3Var.m(1028));
        }
    }

    @Override // p.uz3
    public final void u(int i) {
        this.i = i;
    }
}

package p;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nl60 implements p641 {
    public final int a;
    public final rl60 b;
    public int c = -1;

    public nl60(rl60 rl60Var, int i) {
        this.b = rl60Var;
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void a() {
        dm5.m(this.c == -1);
        rl60 rl60Var = this.b;
        rl60Var.z();
        rl60Var.k1.getClass();
        int[] iArr = rl60Var.k1;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = rl60Var.n1;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (rl60Var.j1.contains(rl60Var.i1.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean b() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public final int c(w2z w2zVar, gar garVar, int i) {
        ie30 ie30Var;
        if (this.c == -3) {
            garVar.e(4);
            return -4;
        }
        if (b()) {
            int i2 = this.c;
            rl60 rl60Var = this.b;
            ArrayList arrayList = rl60Var.N0;
            if (!rl60Var.H()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((qk60) arrayList.get(i4)).k;
                        int length = rl60Var.V0.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (rl60Var.n1[i6] && rl60Var.V0[i6].y() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    zoi1.d0(0, i4, arrayList);
                    qk60 qk60Var = (qk60) arrayList.get(0);
                    ie30 ie30Var2 = qk60Var.d;
                    if (!ie30Var2.equals(rl60Var.g1)) {
                        rl60Var.X.k(rl60Var.b, ie30Var2, qk60Var.e, qk60Var.f, qk60Var.g);
                    }
                    rl60Var.g1 = ie30Var2;
                }
                if (arrayList.isEmpty() || ((qk60) arrayList.get(0)).h()) {
                    int iZ = rl60Var.V0[i2].z(w2zVar, garVar, i, rl60Var.t1);
                    if (iZ == -5) {
                        ie30 ie30VarF = (ie30) w2zVar.c;
                        ie30VarF.getClass();
                        if (i2 == rl60Var.b1) {
                            int iJ = bmq0.j(rl60Var.V0[i2].y());
                            while (i3 < arrayList.size() && ((qk60) arrayList.get(i3)).k != iJ) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                ie30Var = ((qk60) arrayList.get(i3)).d;
                            } else {
                                ie30Var = rl60Var.f1;
                                ie30Var.getClass();
                            }
                            ie30VarF = ie30VarF.f(ie30Var);
                        }
                        w2zVar.c = ie30VarF;
                    }
                    return iZ;
                }
            }
        }
        return -3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.DrmSession$DrmSessionException */
    public final void e() throws DrmSession.DrmSessionException, IOException {
        int i = this.c;
        rl60 rl60Var = this.b;
        if (i == -2) {
            rl60Var.z();
            throw new SampleQueueMappingException(f4i1.f("Unable to bind a sample queue to TrackGroup with MIME type ", rl60Var.i1.a(this.a).d[0].f66p, "."));
        }
        if (i == -1) {
            rl60Var.J();
        } else if (i != -3) {
            rl60Var.J();
            rl60Var.V0[i].w();
        }
    }

    public final boolean isReady() {
        if (this.c == -3) {
            return true;
        }
        if (!b()) {
            return false;
        }
        int i = this.c;
        rl60 rl60Var = this.b;
        return !rl60Var.H() && rl60Var.V0[i].u(rl60Var.t1);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    public final int s(long j) throws Throwable {
        Object next;
        Object objI;
        if (!b()) {
            return 0;
        }
        int i = this.c;
        rl60 rl60Var = this.b;
        if (rl60Var.H()) {
            return 0;
        }
        ql60 ql60Var = rl60Var.V0[i];
        int iR = ql60Var.r(j, rl60Var.t1);
        ArrayList arrayList = rl60Var.N0;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objI = next;
            } else {
                objI = null;
            }
        } else if (arrayList.isEmpty()) {
            objI = null;
        } else {
            objI = l1d.i(1, arrayList);
        }
        qk60 qk60Var = (qk60) objI;
        if (qk60Var != null && !qk60Var.h()) {
            iR = Math.min(iR, qk60Var.g(i) - ql60Var.p());
        }
        ql60Var.E(iR);
        return iR;
    }
}

package p;

import androidx.media3.exoplayer.drm.DrmSession;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vjx0 implements p641 {
    public final int a;
    public final boolean b;
    public final /* synthetic */ xjx0 c;

    public vjx0(xjx0 xjx0Var, int i, boolean z) {
        this.c = xjx0Var;
        this.a = i;
        this.b = z;
    }

    public final int c(w2z w2zVar, gar garVar, int i) {
        xjx0 xjx0Var = this.c;
        if (xjx0Var.J()) {
            return -3;
        }
        int i2 = this.a;
        xjx0Var.E(i2);
        int iZ = xjx0Var.W0[i2].z(w2zVar, garVar, i, xjx0Var.t1);
        if (iZ == -3) {
            xjx0Var.F(i2);
        }
        return iZ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.DrmSession$DrmSessionException */
    public final void e() throws DrmSession.DrmSessionException, IOException {
        int i = this.a;
        xjx0 xjx0Var = this.c;
        xjx0Var.W0[i].w();
        eyh0 eyh0Var = xjx0Var.N0;
        int iM = xjx0Var.d.m(xjx0Var.g1);
        IOException iOException = (IOException) eyh0Var.d;
        if (iOException != null) {
            throw iOException;
        }
        e9e0 e9e0Var = (e9e0) eyh0Var.c;
        if (e9e0Var != null) {
            if (iM == Integer.MIN_VALUE) {
                iM = e9e0Var.a;
            }
            IOException iOException2 = e9e0Var.e;
            if (iOException2 != null && e9e0Var.f > iM) {
                throw iOException2;
            }
        }
    }

    public final int getFlags() {
        return this.b ? 4 : 0;
    }

    public final boolean isReady() {
        xjx0 xjx0Var = this.c;
        return !xjx0Var.J() && xjx0Var.W0[this.a].u(xjx0Var.t1);
    }

    public final int s(long j) throws Throwable {
        xjx0 xjx0Var = this.c;
        if (xjx0Var.J()) {
            return 0;
        }
        int i = this.a;
        xjx0Var.E(i);
        n541 n541Var = xjx0Var.W0[i];
        int iR = n541Var.r(j, xjx0Var.t1);
        n541Var.E(iR);
        if (iR == 0) {
            xjx0Var.F(i);
        }
        return iR;
    }
}

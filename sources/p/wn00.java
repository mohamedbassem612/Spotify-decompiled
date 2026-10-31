package p;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wn00 extends vn00 {
    public final cab f1;
    public final int g1;
    public final ArrayList h1;
    public final long i1;
    public final LogSessionId j1;
    public int k1;
    public long l1;

    public wn00(cab cabVar, int i, o0g o0gVar, a67 a67Var, LogSessionId logSessionId, int i2) {
        super(2, o0gVar, a67Var);
        this.f1 = cabVar;
        this.g1 = i;
        this.j1 = logSessionId;
        this.h1 = new ArrayList();
        this.k1 = -1;
        this.l1 = -9223372036854775807L;
        this.i1 = i2 != -2147483647 ? 1000000 / ((long) i2) : -9223372036854775807L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    @Override // p.vn00
    public final boolean W() throws ExportException {
        if (this.V0.e()) {
            this.U0.g();
            this.W0 = true;
            return false;
        }
        fmr fmrVar = this.V0;
        MediaCodec.BufferInfo bufferInfo = fmrVar.g(false) ? fmrVar.a : null;
        if (bufferInfo != null) {
            long j = bufferInfo.presentationTimeUs;
            long j2 = j - this.T0;
            if (j2 >= 0) {
                ArrayList arrayList = this.h1;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) arrayList.get(i)).longValue() == j) {
                        arrayList.remove(i);
                    }
                }
                long j3 = this.l1;
                long j4 = this.i1;
                if (j4 != -9223372036854775807L && j3 != -9223372036854775807L && j2 < j3) {
                    this.V0.j();
                    return true;
                }
                if (this.U0.f() != this.k1 && this.U0.h(j2)) {
                    this.V0.k(j2, true);
                    if (j4 != -9223372036854775807L) {
                        long j5 = this.l1;
                        this.l1 = j5 == -9223372036854775807L ? j2 + j4 : j5 + j4;
                    }
                    return true;
                }
            }
            this.V0.j();
            return true;
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:87:0x0165  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (android.os.Build.MODEL.startsWith("SM-F936") != false) goto L34;
     */
    @Override // p.vn00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(p.ie30 r15) throws androidx.media3.transformer.ExportException {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wn00.X(p.ie30):void");
    }

    @Override // p.vn00
    public final void Y(gar garVar) {
        long j = this.R0;
        p641 p641Var = this.i;
        p641Var.getClass();
        boolean z = ((p641Var.getFlags() & 1) == 0 || j == -9223372036854775807L || garVar.f - this.X < j) ? false : true;
        long j2 = garVar.f;
        if (j2 < this.Y || z) {
            this.h1.add(Long.valueOf(j2));
        }
    }

    @Override // p.vn00
    public final ie30 a0(ie30 ie30Var) {
        if (this.g1 != 3 || !x8h.h(ie30Var.H)) {
            return ie30Var;
        }
        ge30 ge30VarA = ie30Var.a();
        ge30VarA.G = x8h.h;
        return new ie30(ge30VarA);
    }

    @Override // p.vn00
    public final ie30 b0(ie30 ie30Var) {
        x8h x8hVar = ie30Var.H;
        if (x8hVar == null || !x8hVar.f()) {
            x8hVar = x8h.h;
        }
        if (this.g1 == 1 && x8h.h(x8hVar)) {
            x8hVar = x8h.h;
        }
        ge30 ge30VarA = ie30Var.a();
        ge30VarA.G = x8hVar;
        return new ie30(ge30VarA);
    }

    @Override // p.vn00
    public final boolean e0(gar garVar) {
        if (!garVar.f(4)) {
            garVar.d.getClass();
            if (this.V0 == null) {
                garVar.f -= this.T0;
            }
        }
        return false;
    }

    @Override // p.jca
    public final long g(long j, long j2) {
        if (this.h == 1) {
            return 1000000L;
        }
        int i = this.k1;
        if (i == -1) {
            return 10000L;
        }
        return ((long) i) * 2000;
    }

    @Override // p.jca
    public final String i() {
        return "ExoAssetLoaderVideoRenderer";
    }

    @Override // p.vn00
    public final void Z(ie30 ie30Var) {
    }
}

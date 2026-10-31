package p;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dpg extends njm1 {
    public final oqe1 N0;
    public moh0 O0;
    public cpg P0;
    public ClippingMediaSource$IllegalClippingException Q0;
    public long R0;
    public long S0;
    public final boolean Y;
    public final ArrayList Z;

    public dpg(m3c m3cVar) {
        super((qba) m3cVar.d);
        this.O0 = new moh0((loh0) m3cVar.e);
        this.Y = m3cVar.b;
        this.Z = new ArrayList();
        this.N0 = new oqe1();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[PHI: r11
      0x0042: PHI (r11v1 long) = (r11v0 long), (r11v3 long) binds: [B:14:0x0036, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public final void K(sqe1 sqe1Var) {
        long j;
        long j2;
        oqe1 oqe1Var = this.N0;
        sqe1Var.m(0, oqe1Var);
        long j3 = oqe1Var.f108p;
        ArrayList arrayList = this.Z;
        long j4 = Long.MIN_VALUE;
        if (arrayList.isEmpty() || this.P0 == null || this.O0.e) {
            moh0 moh0Var = this.O0;
            j = moh0Var.b;
            long j5 = moh0Var.d;
            if (moh0Var.f) {
                long j6 = oqe1Var.l;
                j += j6;
                if (j5 != Long.MIN_VALUE) {
                    j2 = j6 + j5;
                } else {
                    j2 = j5;
                }
            } else {
                j2 = j5;
            }
            this.R0 = j3 + j;
            this.S0 = j5 == j4 ? Long.MIN_VALUE : j3 + j2;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bpg) arrayList.get(i)).h(this.R0, this.S0);
            }
            j4 = j2;
        } else {
            j = this.R0 - j3;
            long j7 = this.S0;
            if (j7 != Long.MIN_VALUE) {
                j4 = j7 - j3;
            }
        }
        try {
            cpg cpgVar = new cpg(sqe1Var, j, j4, this.O0.h);
            this.P0 = cpgVar;
            s(cpgVar);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.Q0 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((bpg) arrayList.get(i2)).X = this.Q0;
            }
        }
    }

    @Override // p.njm1, p.qba
    public final boolean c(yoh0 yoh0Var) {
        qba qbaVar = this.X;
        if (qbaVar.c(yoh0Var)) {
            return this.Y || qbaVar.m().e.equals(yoh0Var.e);
        }
        return false;
    }

    @Override // p.njm1, p.qba
    public final arh0 f(p2i0 p2i0Var, hw3 hw3Var, long j) {
        bpg bpgVar = new bpg(this.X.f(p2i0Var, hw3Var, j), !this.O0.g, this.R0, this.S0, this.Y);
        this.Z.add(bpgVar);
        return bpgVar;
    }

    @Override // p.h2k, p.qba
    public final void o() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.Q0;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.o();
    }

    @Override // p.qba
    public final void p(sqe1 sqe1Var) {
        if (this.Q0 != null) {
            return;
        }
        K(sqe1Var);
    }

    @Override // p.njm1, p.qba
    public final void t(arh0 arh0Var) {
        ArrayList arrayList = this.Z;
        dm5.y(arrayList.remove(arh0Var));
        this.X.t(((bpg) arh0Var).a);
        if (!arrayList.isEmpty() || this.O0.e) {
            return;
        }
        cpg cpgVar = this.P0;
        cpgVar.getClass();
        K(cpgVar.e);
    }

    @Override // p.h2k, p.qba
    public final void w() {
        super.w();
        this.Q0 = null;
        this.P0 = null;
    }

    @Override // p.njm1, p.qba
    public final void z(yoh0 yoh0Var) {
        cpg cpgVar;
        cpg cpgVar2;
        boolean z = this.Y;
        if (z) {
            moh0 moh0Var = this.O0;
            this.O0 = yoh0Var.e;
            if (this.P0 != null) {
                ArrayList arrayList = this.Z;
                if (!arrayList.isEmpty() && (cpgVar2 = this.P0) != null && !this.O0.e) {
                    long j = cpgVar2.e.n(0, this.N0, 0L).l;
                    long j2 = moh0Var.f ? -j : 0L;
                    moh0 moh0Var2 = this.O0;
                    long j3 = moh0Var2.f ? j : 0L;
                    long j4 = this.R0;
                    long j5 = moh0Var2.b;
                    long j6 = (((j2 + j3) + j5) - moh0Var.b) + j4;
                    this.R0 = j6;
                    long j7 = moh0Var2.d;
                    this.S0 = j7 != Long.MIN_VALUE ? (j6 + j7) - j5 : Long.MIN_VALUE;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((bpg) arrayList.get(i)).h(this.R0, this.S0);
                    }
                }
            }
        }
        cpg cpgVar3 = this.P0;
        super.z(yoh0Var);
        if (z && (cpgVar = this.P0) != null && cpgVar == cpgVar3) {
            K(cpgVar.e);
        }
    }

    public dpg(qba qbaVar, long j, long j2) {
        m3c m3cVar = new m3c(qbaVar);
        dm5.y(!m3cVar.c);
        ((loh0) m3cVar.e).b(j);
        dm5.y(!m3cVar.c);
        ((loh0) m3cVar.e).a(j2);
        this(m3cVar);
    }
}

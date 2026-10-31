package p;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vws extends cxs implements Comparable {
    public final boolean N0;
    public final boolean O0;
    public final int P0;
    public final int Q0;
    public final boolean R0;
    public final int S0;
    public final int T0;
    public final int U0;
    public final int V0;
    public final boolean W0;
    public final int X;
    public final boolean X0;
    public final int Y;
    public final boolean Y0;
    public final int Z;
    public final int e;
    public final boolean f;
    public final String g;
    public final zws h;
    public final boolean i;
    public final int t;

    /* JADX WARN: Code duplicated, block: B:120:0x0190  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:90:0x0147  */
    public vws(int i, pnf1 pnf1Var, int i2, zws zwsVar, int i3, boolean z, rws rwsVar, int i4) {
        int i5;
        int iH;
        boolean z2;
        int iH2;
        boolean z3;
        boolean z4;
        boolean z5;
        super(i, pnf1Var, i2);
        this.h = zwsVar;
        boolean z6 = zwsVar.z0;
        b380 b380Var = zwsVar.v;
        b380 b380Var2 = zwsVar.q;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.N0 = false;
        this.g = exs.i(this.d.d);
        this.i = jca.u(i3, false);
        int i8 = 0;
        while (true) {
            int size = b380Var2.size();
            i5 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i8 >= size) {
                iH = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iH = exs.h(this.d, (String) b380Var2.get(i8), false);
                if (iH > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.X = i8;
        this.t = iH;
        int i9 = this.d.f;
        int i10 = zwsVar.s;
        this.Y = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.Z = exs.g(this.d, zwsVar.r);
        ie30 ie30Var = this.d;
        int i11 = ie30Var.f;
        this.O0 = i11 == 0 || (i11 & 1) != 0;
        this.R0 = (ie30Var.e & 1) != 0;
        String str = ie30Var.f66p;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.Y0 = z2;
        int i12 = ie30Var.J;
        this.S0 = i12;
        this.T0 = ie30Var.L;
        int i13 = ie30Var.k;
        this.U0 = i13;
        this.f = (i13 == -1 || i13 <= zwsVar.u) && (i12 == -1 || i12 <= zwsVar.t) && rwsVar.apply(ie30Var);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = zoi1.X(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 < strArrSplit.length) {
                iH2 = exs.h(this.d, strArrSplit[i15], false);
                if (iH2 <= 0) {
                    i15++;
                }
            } else {
                iH2 = 0;
                i15 = Integer.MAX_VALUE;
            }
        }
        this.P0 = i15;
        this.Q0 = iH2;
        for (int i16 = 0; i16 < b380Var.size(); i16++) {
            String str2 = this.d.f66p;
            if (str2 != null && str2.equals(b380Var.get(i16))) {
                i5 = i16;
                this.V0 = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.W0 = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.X0 = z4;
                ie30 ie30Var2 = this.d;
                boolean z7 = this.f;
                zws zwsVar2 = this.h;
                z5 = zwsVar2.B0;
                i0g1 i0g1Var = zwsVar2.w;
                if (jca.u(i3, z5) && ((z7 || zwsVar2.y0) && (i0g1Var.a != 2 || exs.l(zwsVar2, i3, ie30Var2)))) {
                    if (jca.u(i3, false) || !z7 || ie30Var2.k == -1 || zwsVar2.G || zwsVar2.F || ((!zwsVar2.C0 && z) || i0g1Var.a == 2 || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.e = i7;
            }
        }
        this.V0 = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.W0 = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.X0 = z4;
        ie30 ie30Var3 = this.d;
        boolean z8 = this.f;
        zws zwsVar3 = this.h;
        z5 = zwsVar3.B0;
        i0g1 i0g1Var2 = zwsVar3.w;
        if (jca.u(i3, z5)) {
            if (jca.u(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.e = i7;
    }

    @Override // p.cxs
    public final int a() {
        return this.e;
    }

    @Override // p.cxs
    public final boolean b(cxs cxsVar) {
        int i;
        String str;
        vws vwsVar = (vws) cxsVar;
        ie30 ie30Var = vwsVar.d;
        this.h.getClass();
        ie30 ie30Var2 = this.d;
        int i2 = ie30Var2.J;
        if (i2 == -1 || i2 != ie30Var.J) {
            return false;
        }
        return (this.N0 || ((str = ie30Var2.f66p) != null && TextUtils.equals(str, ie30Var.f66p))) && (i = ie30Var2.L) != -1 && i == ie30Var.L && this.W0 == vwsVar.W0 && this.X0 == vwsVar.X0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vws vwsVar) {
        oqq0 oqq0Var;
        oqq0 oqq0VarA;
        boolean z = this.i;
        boolean z2 = this.f;
        if (z2 && z) {
            oqq0VarA = exs.l;
            oqq0Var = oqq0VarA;
        } else {
            oqq0 oqq0Var2 = exs.l;
            oqq0Var = oqq0Var2;
            oqq0VarA = oqq0Var2.a();
        }
        boolean z3 = vwsVar.i;
        int i = vwsVar.U0;
        sxh sxhVarD = sxh.a.d(z, z3);
        Integer numValueOf = Integer.valueOf(this.X);
        Integer numValueOf2 = Integer.valueOf(vwsVar.X);
        rd31 rd31Var = rd31.a;
        sxh sxhVarC = sxhVarD.c(numValueOf, numValueOf2, rd31Var).a(this.t, vwsVar.t).a(this.Y, vwsVar.Y).c(Integer.valueOf(this.Z), Integer.valueOf(vwsVar.Z), rd31Var).d(this.R0, vwsVar.R0).d(this.O0, vwsVar.O0).c(Integer.valueOf(this.P0), Integer.valueOf(vwsVar.P0), rd31Var).a(this.Q0, vwsVar.Q0).d(z2, vwsVar.f).c(Integer.valueOf(this.V0), Integer.valueOf(vwsVar.V0), rd31Var);
        boolean z4 = this.h.F;
        int i2 = this.U0;
        if (z4) {
            sxhVarC = sxhVarC.c(Integer.valueOf(i2), Integer.valueOf(i), oqq0Var.a());
        }
        sxh sxhVarC2 = sxhVarC.d(this.W0, vwsVar.W0).d(this.X0, vwsVar.X0).d(this.Y0, vwsVar.Y0).c(Integer.valueOf(this.S0), Integer.valueOf(vwsVar.S0), oqq0VarA).c(Integer.valueOf(this.T0), Integer.valueOf(vwsVar.T0), oqq0VarA);
        if (Objects.equals(this.g, vwsVar.g)) {
            sxhVarC2 = sxhVarC2.c(Integer.valueOf(i2), Integer.valueOf(i), oqq0VarA);
        }
        return sxhVarC2.f();
    }
}

package p;

import androidx.car.app.model.Alert;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dxs extends cxs {
    public final int N0;
    public final int O0;
    public final int P0;
    public final boolean Q0;
    public final int R0;
    public final boolean S0;
    public final int T0;
    public final boolean U0;
    public final boolean V0;
    public final boolean W0;
    public final int X;
    public final int X0;
    public final int Y;
    public final boolean Y0;
    public final int Z;
    public final String Z0;
    public final boolean e;
    public final zws f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int t;

    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    public dxs(int i, pnf1 pnf1Var, int i2, zws zwsVar, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iH;
        int i6;
        String strC;
        ie30 ie30Var;
        int i7;
        int i8;
        int i9;
        ie30 ie30Var2;
        int i10;
        int i11;
        int i12;
        super(i, pnf1Var, i2);
        this.f = zwsVar;
        boolean z4 = zwsVar.x0;
        b380 b380Var = zwsVar.m;
        b380 b380Var2 = zwsVar.o;
        int i13 = z4 ? 24 : 16;
        int i14 = 0;
        this.S0 = false;
        if (!z || (((i10 = (ie30Var2 = this.d).w) != -1 && i10 > zwsVar.a) || ((i11 = ie30Var2.x) != -1 && i11 > zwsVar.b))) {
            z2 = false;
        } else {
            float f = ie30Var2.B;
            if ((f == -1.0f || f <= zwsVar.c) && ((i12 = ie30Var2.k) == -1 || i12 <= zwsVar.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.e = z2;
        if (!z || (((i7 = (ie30Var = this.d).w) != -1 && i7 < zwsVar.e) || ((i8 = ie30Var.x) != -1 && i8 < zwsVar.f))) {
            z3 = false;
        } else {
            float f2 = ie30Var.B;
            if ((f2 == -1.0f || f2 >= zwsVar.g) && ((i9 = ie30Var.k) == -1 || i9 >= zwsVar.h)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.g = z3;
        this.h = jca.u(i3, false);
        ie30 ie30Var3 = this.d;
        float f3 = ie30Var3.B;
        this.i = f3 != -1.0f && f3 >= 10.0f;
        this.t = ie30Var3.k;
        this.X = ie30Var3.c();
        int i15 = 0;
        while (true) {
            int size = b380Var2.size();
            i5 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i15 >= size) {
                iH = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iH = exs.h(this.d, (String) b380Var2.get(i15), false);
                if (iH > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.Z = i15;
        this.N0 = iH;
        int i16 = this.d.f;
        int i17 = zwsVar.f79p;
        oqq0 oqq0Var = exs.l;
        this.O0 = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
        int i18 = this.d.f;
        this.Q0 = i18 == 0 || (i18 & 1) != 0;
        this.R0 = exs.h(this.d, str, exs.i(str) == null);
        ie30 ie30Var4 = this.d;
        String str2 = ie30Var4.f66p;
        int i19 = i3 & 384;
        if (i19 == 256 && (strC = hkh0.c(ie30Var4)) != null) {
            str2 = strC;
        }
        for (int i20 = 0; i20 < b380Var.size(); i20++) {
            if (str2 != null && str2.equals(b380Var.get(i20))) {
                i5 = i20;
                break;
            }
        }
        this.Y = i5;
        this.P0 = exs.g(this.d, zwsVar.n);
        this.U0 = i19 == 128 || i19 == 256;
        boolean z5 = i19 == 128;
        this.V0 = z5;
        this.W0 = (i3 & 64) == 64;
        this.Z0 = str2;
        if (str2 != null) {
            i6 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.X0 = i6;
        this.Y0 = z5 && x8h.h(this.d.H);
        boolean z6 = this.e;
        zws zwsVar2 = this.f;
        ie30 ie30Var5 = this.d;
        if ((ie30Var5.f & TlsSocketProvider.READ_BUFFER_SIZE) == 0 && jca.u(i3, zwsVar2.B0) && (z6 || zwsVar2.w0)) {
            i14 = (!jca.u(i3, false) || !this.g || !z6 || ie30Var5.k == -1 || zwsVar2.G || zwsVar2.F || (i13 & i3) == 0) ? 1 : 2;
        }
        this.T0 = i14;
    }

    public static int c(dxs dxsVar, dxs dxsVar2) {
        sxh sxhVarD = sxh.a.d(dxsVar.h, dxsVar2.h);
        Integer numValueOf = Integer.valueOf(dxsVar.Z);
        Integer numValueOf2 = Integer.valueOf(dxsVar2.Z);
        rd31 rd31Var = rd31.a;
        return sxhVarD.c(numValueOf, numValueOf2, rd31Var).a(dxsVar.N0, dxsVar2.N0).a(dxsVar.O0, dxsVar2.O0).c(Integer.valueOf(dxsVar.P0), Integer.valueOf(dxsVar2.P0), rd31Var).d(dxsVar.Q0, dxsVar2.Q0).a(dxsVar.R0, dxsVar2.R0).d(dxsVar.i, dxsVar2.i).d(dxsVar.e, dxsVar2.e).d(dxsVar.g, dxsVar2.g).c(Integer.valueOf(dxsVar.Y), Integer.valueOf(dxsVar2.Y), rd31Var).d(dxsVar.U0, dxsVar2.U0).d(dxsVar.W0, dxsVar2.W0).f();
    }

    @Override // p.cxs
    public final int a() {
        return this.T0;
    }

    @Override // p.cxs
    public final boolean b(cxs cxsVar) {
        dxs dxsVar = (dxs) cxsVar;
        if (!this.S0 && !Objects.equals(this.Z0, dxsVar.Z0)) {
            return false;
        }
        this.f.getClass();
        return this.U0 == dxsVar.U0 && this.W0 == dxsVar.W0;
    }
}

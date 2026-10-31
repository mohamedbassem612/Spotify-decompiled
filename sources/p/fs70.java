package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fs70 implements o1i {
    public final /* synthetic */ byte a;
    public final wdm b;
    public final bf3 c;

    public /* synthetic */ fs70(wdm wdmVar, bf3 bf3Var, byte b) {
        this.a = b;
        this.b = wdmVar;
        this.c = bf3Var;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((ds70) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((nic0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                e((obf0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        switch (this.a) {
            case 0:
                return new x0i(new w0i(o0iVar.e, "image_content", null, null, 12));
            case 1:
                return new x0i(new w0i(o0iVar.e, "linear_gradient_content", null, null, 12));
            default:
                return new x0i(new w0i(o0iVar.e, "lottie_animation_content", null, null, 12));
        }
    }

    public void c(ds70 ds70Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        o0i o0iVar2 = o0iVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(284421542);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ds70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar2) : x340Var.i(o0iVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        boolean z2 = true;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2;
            eso1.e(Uri.parse(ds70Var.a.a), isl.a, u291.d(qim0Var, 1.0f), null, null, null, mif1.P0, null, null, oux.a, false, false, x340Var, 1794096, 0, 3464);
            int i4 = i3 & 14;
            if (i4 != 4) {
                x340Var = x340Var;
                z2 = false;
            }
            x340Var = x340Var;
            Object objT = x340Var.T();
            rih1 rih1Var = null;
            if (z2 || objT == fkj0.X) {
                iw9 iw9Var = ds70Var.b;
                if (iw9Var != null) {
                    objT = new ny7(iw9Var.a, iw9Var.c, null, iw9Var.b, ds70Var.c ? 5 : null, null, 100);
                } else {
                    objT = null;
                }
                x340Var.s0(objT);
            }
            ny7 ny7Var = (ny7) objT;
            if (ny7Var == null) {
                x340Var.i0(-767527405);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(-767527404);
                sto1.a(this.b, o0iVar, ny7Var, (Function0) null, x340Var, 64 | (i3 & 112), 8);
                o0iVar2 = o0iVar;
                x340Var.r(false);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(-767445626);
                ejo1.c(ds70Var, this.c, o0iVar2, x340Var, i4 | 512 | ((i3 << 3) & 896));
            } else {
                x340Var.i0(-1548779847);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, ds70Var, o0iVar2, qim0Var, (byte) 15);
        }
    }

    public void d(nic0 nic0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        mic0 n6a1Var;
        o0i o0iVar2 = o0iVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-690158880);
        int i2 = (i & 6) == 0 ? (x340Var.g(nic0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar2) : x340Var.i(o0iVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            long j = ((vex) zex.a.b).a;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            ArrayList arrayList = nic0Var.a;
            int size = arrayList.size();
            if (size == 0) {
                n6a1Var = new n6a1(j);
            } else if (size != 1) {
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                    arrayList2.add(new u7h(z4p1.e(((Number) it.next()).intValue())));
                }
                n6a1Var = v9c.s(arrayList2, 0.0f, 0.0f, 14);
            } else {
                n6a1Var = new n6a1(z4p1.e(((Number) o7h.q0(arrayList)).intValue()));
            }
            rih1 rih1Var = null;
            qim0 qim0VarE = dug.e(qim0VarD, n6a1Var, (hw61) null, 0.0f, 6);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE2, x340Var, y580.Y);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                iw9 iw9Var = nic0Var.b;
                objT = iw9Var != null ? new ny7(iw9Var.a, iw9Var.c, null, iw9Var.b, nic0Var.c ? 5 : null, null, 100) : null;
                x340Var.s0(objT);
            }
            ny7 ny7Var = (ny7) objT;
            if (ny7Var == null) {
                x340Var.i0(1916853683);
                x340Var.r(false);
            } else {
                x340Var.i0(1916853684);
                sto1.a(this.b, o0iVar, ny7Var, (Function0) null, x340Var, 64 | (i3 & 112), 8);
                o0iVar2 = o0iVar;
                x340Var.r(false);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(1916937446);
                ejo1.c(nic0Var, this.c, o0iVar2, x340Var, i4 | 512 | ((i3 << 3) & 896));
            } else {
                x340Var.i0(338928411);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, this, nic0Var, o0iVar2, qim0Var, (byte) 10);
        }
    }

    public void e(obf0 obf0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        fs70 fs70Var;
        o0i o0iVar2 = o0iVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1015572102);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(obf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar2) : x340Var.i(o0iVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ncf0 ncf0VarG = h5p1.G(new pcf0(obf0Var.a), (String) null, (xu30) null, x340Var, 0, 62);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            kbf0 kbf0VarN = zpn1.n(ncf0VarG.c(), ((Boolean) ven0Var.getValue()).booleanValue(), false, (bcf0) null, 0.0f, obf0Var.d ? Integer.MAX_VALUE : 0, x340Var, 952);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new sqa0(ven0Var, (byte) 8);
                x340Var.s0(objT2);
            }
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            oto1.c(obf0Var, o0iVar2, (iu30) objT2, x340Var, i4 | 448 | i5);
            fcf0 fcf0VarC = ncf0VarG.c();
            boolean zG = x340Var.g(kbf0VarN);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new uk1(kbf0VarN, (byte) 11);
                x340Var.s0(objT3);
            }
            mp10.e(fcf0VarC, (Function0) objT3, u291.d(qim0Var, 1.0f), false, false, false, null, false, null, null, null, false, false, null, null, false, x340Var, 0, 0, 65528);
            x340Var = x340Var;
            boolean z = i4 == 4;
            Object objT4 = x340Var.T();
            rih1 rih1Var = null;
            if (z || objT4 == m4cVar) {
                iw9 iw9Var = obf0Var.b;
                if (iw9Var != null) {
                    objT4 = new ny7(iw9Var.a, iw9Var.c, null, iw9Var.b, obf0Var.c ? 5 : null, null, 100);
                } else {
                    objT4 = null;
                }
                x340Var.s0(objT4);
            }
            ny7 ny7Var = (ny7) objT4;
            if (ny7Var == null) {
                x340Var.i0(1160046323);
                x340Var.r(false);
                fs70Var = this;
                o0iVar2 = o0iVar;
            } else {
                x340Var.i0(1160046324);
                fs70Var = this;
                sto1.a(fs70Var.b, o0iVar, ny7Var, (Function0) null, x340Var, 64 | i5, 8);
                o0iVar2 = o0iVar;
                x340Var.r(false);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(1160135480);
                ejo1.c(obf0Var, fs70Var.c, o0iVar2, x340Var, i4 | 512 | ((i3 << 3) & 896));
                x340Var.r(false);
            } else {
                x340Var.i0(1007251950);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, this, obf0Var, o0iVar2, qim0Var, (byte) 21);
        }
    }
}

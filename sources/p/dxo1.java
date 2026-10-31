package p;

import android.net.Uri;
import android.os.Parcel;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dxo1 {
    public static b180 a;

    public static final void a(mj mjVar, iu30 iu30Var, gw70 gw70Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1463726178);
        int i2 = i | (x340Var.g(mjVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(gw70Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean zI = x340Var.i(watVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new pj(watVar, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = x340Var.i(watVar);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new pj(watVar, (byte) 1);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z = (i2 & 112) == 32;
            Object objT3 = x340Var.T();
            if (z || objT3 == m4cVar) {
                objT3 = new qj(iu30Var, (byte) 0);
                x340Var.s0(objT3);
            }
            nyx.a(2, (wux) null, apo.r(-1283358741, new x2(mjVar, t890.s(new vy71(true, function0, function1, xy71.b, (iu30) objT3, 32), (bs91) null, x340Var, 0, 2), iu30Var, gw70Var), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj(mjVar, iu30Var, gw70Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(813122650);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mp10.f(h5p1.G(new pcf0(str), null, null, x340Var, 0, 62).c(), qim0Var, false, false, (bcf0) null, Integer.MAX_VALUE, (ddf0) null, (tl3) null, (j6m) null, x340Var, (i2 & 112) | 1572864, 0, 2097084);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 0);
        }
    }

    public static final void c(ib8 ib8Var, fqg0 fqg0Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1052142505);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ib8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(fqg0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String str = ib8Var.c;
            qim0 qim0Var3 = nim0.a;
            obg1.e(true, str, u291.f(qim0Var3, 1.0f), 136.0f, true, "release_row", apo.r(274411062, new pp5(fqg0Var, ib8Var, (byte) 26), x340Var), function0, x340Var, ((i3 << 12) & 29360128) | 1797126, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8((byte) 21, i, ib8Var, fqg0Var, function0, qim0Var2);
        }
    }

    public static final void d(mj mjVar, iu30 iu30Var, gw70 gw70Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1940827317);
        int i2 = i | (b0kVar3.g(mjVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(gw70Var) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qti1 qti1Var = voo1.g;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            cwl1.b(u291.z(u291.f(voo1.y(qim0Var3, qti1Var), 1.0f), (fra) null, 3), (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1127408606, new nj(mjVar, gw70Var, iu30Var), b0kVar3), b0kVar2, 0, 48, 2030);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj(mjVar, iu30Var, gw70Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void e(ev51 ev51Var, iu30 iu30Var, gw70 gw70Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        gw70 gw70Var2;
        qim0 qim0Var2;
        w4i1 w4i1Var = ev51Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2108546351);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ev51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gw70Var2 = gw70Var;
            i2 |= x340Var.i(gw70Var2) ? 256 : 128;
        } else {
            gw70Var2 = gw70Var;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            rgi1 rgi1Var = new rgi1(Collections.singletonList(w4i1Var), w4i1Var.b, new mgi1(new ogi1(apo.r(1549521937, new qff(ev51Var, (byte) 4), x340Var))));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("chat_user", qim0Var3);
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new frf(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            ero1.f(rgi1Var, (Function0) objT, gw70Var2, qim0VarN, x340Var, i3 & 896, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa((byte) 22, i, ev51Var, gw70Var, iu30Var, qim0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x0121  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:75:0x012d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138  */
    /* JADX WARN: Code duplicated, block: B:82:0x014e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void f(gbx gbxVar, qim0 qim0Var, max maxVar, gdx gdxVar, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        gdx gdxVarR;
        int i5;
        boolean z;
        qim0 qim0Var3;
        gdx gdxVar2;
        h311 h311VarV;
        int i6;
        qim0 qim0Var4;
        idn0 idn0VarY;
        int i7;
        qim0 qim0VarB;
        boolean z2;
        Object objT;
        int i8;
        int i9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1062899760);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(gbxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            i4 = i3 | 384;
            if ((i & 3072) == 0) {
                if (x340Var.g(maxVar)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i4 |= i9;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    gdxVarR = gdxVar;
                    int i11 = x340Var.g(gdxVarR) ? 16384 : 8192;
                    i4 |= i11;
                } else {
                    gdxVarR = gdxVar;
                }
                i4 |= i11;
            } else {
                gdxVarR = gdxVar;
            }
            i5 = i4 | 196608;
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i5 |= i8;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                x340Var.d0();
                i6 = i & 1;
                qim0Var4 = nim0.a;
                if (i6 != 0 || x340Var.E()) {
                    if (i10 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        gdxVarR = yla.r(x340Var);
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                    }
                }
                qim0 qim0Var5 = qim0Var2;
                x340Var.s();
                boolean zJ = u890.j(maxVar, jax.a);
                if (((Boolean) x340Var.k(ny20.a)).booleanValue()) {
                    x340Var.i0(-755531823);
                    idn0VarY = zso1.Y(x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1946612243);
                    x340Var.r(false);
                    idn0VarY = null;
                }
                ldx ldxVar = ldx.c;
                u5j1 u5j1Var = d4o1.a;
                vch vchVar = new vch(vno1.o(u5j1Var, x340Var, 0));
                float f = gdxVarR.c;
                qim0 qim0VarU = u291.u(qim0Var5, f, f, 0.0f, 0.0f, 12);
                vq60 vq60Var = jw80.a;
                qim0 qim0VarH = pqo.h(qim0VarU.then(tsj0.a), !zJ);
                if (maxVar instanceof hax) {
                    x340Var.i0(-1946246070);
                    if ((i5 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = x340Var.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new i5w((hax) maxVar, (byte) 14);
                        x340Var.s0(objT);
                    }
                    i7 = 0;
                    qim0VarB = s161.b(qim0Var4, false, (iu30) objT);
                    x340Var.r(false);
                } else {
                    i7 = 0;
                    x340Var.i0(-755514376);
                    x340Var.r(false);
                    qim0VarB = qim0Var4;
                }
                qim0 qim0VarQ = i1p1.q(qim0VarH.then(qim0VarB).then(bin.u(qim0Var4, idn0VarY, vchVar, zJ, gbxVar.c, new pm31(i7), gbxVar.b)), u5j1Var);
                float f2 = gdxVarR.b;
                qim0 qim0VarW = uyn1.w(qim0VarQ, new zzq0(f2, f2, f2, f2));
                k5k k5kVar = py20.a;
                uwr uwrVar = cbx.a;
                mod.b(k5kVar.a(new u7h(cbx.a(x340Var).c.a)), apo.r(2051634416, new g6w(gdxVarR, qim0VarW, j2iVar, (byte) 14), x340Var), x340Var, 56);
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            gdxVar2 = gdxVarR;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(gbxVar, qim0Var3, maxVar, gdxVar2, j2iVar, i, i2, (byte) 7);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        i4 = i3 | 384;
        if ((i & 3072) == 0) {
            if (x340Var.g(maxVar)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i4 |= i9;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                gdxVarR = gdxVar;
                if (x340Var.g(gdxVarR)) {
                }
                i4 |= i11;
            } else {
                gdxVarR = gdxVar;
            }
            i4 |= i11;
        } else {
            gdxVarR = gdxVar;
        }
        i5 = i4 | 196608;
        if ((1572864 & i) == 0) {
            if (x340Var.i(j2iVar)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i5 |= i8;
        }
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            x340Var.d0();
            i6 = i & 1;
            qim0Var4 = nim0.a;
            if (i6 != 0) {
                if (i10 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 16) != 0) {
                    i5 &= -57345;
                    gdxVarR = yla.r(x340Var);
                }
            } else {
                if (i10 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 16) != 0) {
                    i5 &= -57345;
                    gdxVarR = yla.r(x340Var);
                }
            }
            qim0 qim0Var6 = qim0Var2;
            x340Var.s();
            boolean zJ2 = u890.j(maxVar, jax.a);
            if (((Boolean) x340Var.k(ny20.a)).booleanValue()) {
                x340Var.i0(-755531823);
                idn0VarY = zso1.Y(x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-1946612243);
                x340Var.r(false);
                idn0VarY = null;
            }
            ldx ldxVar2 = ldx.c;
            u5j1 u5j1Var2 = d4o1.a;
            vch vchVar2 = new vch(vno1.o(u5j1Var2, x340Var, 0));
            float f3 = gdxVarR.c;
            qim0 qim0VarU2 = u291.u(qim0Var6, f3, f3, 0.0f, 0.0f, 12);
            vq60 vq60Var2 = jw80.a;
            qim0 qim0VarH2 = pqo.h(qim0VarU2.then(tsj0.a), !zJ2);
            if (maxVar instanceof hax) {
                x340Var.i0(-1946246070);
                if ((i5 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new i5w((hax) maxVar, (byte) 14);
                    x340Var.s0(objT);
                } else {
                    objT = new i5w((hax) maxVar, (byte) 14);
                    x340Var.s0(objT);
                }
                i7 = 0;
                qim0VarB = s161.b(qim0Var4, false, (iu30) objT);
                x340Var.r(false);
            } else {
                i7 = 0;
                x340Var.i0(-755514376);
                x340Var.r(false);
                qim0VarB = qim0Var4;
            }
            qim0 qim0VarQ2 = i1p1.q(qim0VarH2.then(qim0VarB).then(bin.u(qim0Var4, idn0VarY, vchVar2, zJ2, gbxVar.c, new pm31(i7), gbxVar.b)), u5j1Var2);
            float f4 = gdxVarR.b;
            qim0 qim0VarW2 = uyn1.w(qim0VarQ2, new zzq0(f4, f4, f4, f4));
            k5k k5kVar2 = py20.a;
            uwr uwrVar2 = cbx.a;
            mod.b(k5kVar2.a(new u7h(cbx.a(x340Var).c.a)), apo.r(2051634416, new g6w(gdxVarR, qim0VarW2, j2iVar, (byte) 14), x340Var), x340Var, 56);
            qim0Var3 = qim0Var6;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        gdxVar2 = gdxVarR;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(gbxVar, qim0Var3, maxVar, gdxVar2, j2iVar, i, i2, (byte) 7);
        }
    }

    public static final void g(float f, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(579783730);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(j2iVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, true);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarU = u291.u(nim0.a, 0.0f, 0.0f, f, f, 3);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarU);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            k4s0.i((i2 >> 6) & 14, j2iVar, x340Var, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vyx(f, qim0Var, j2iVar, i, (byte) 0);
        }
    }

    public static final void h(yq00 yq00Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1957711329);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(yq00Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            String strO0 = cwl1.o0(x340Var, 2131959607);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xc10.R0;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0Var3, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            zko1.b(0, cwl1.o0(x340Var, 2131959604), cwl1.n0(2131959600, new Object[]{cwl1.o0(x340Var, 2131959604)}, x340Var), x340Var, null);
            zko1.b(0, cwl1.o0(x340Var, 2131959605), cwl1.n0(2131959606, new Object[]{cwl1.o0(x340Var, 2131959605)}, x340Var), x340Var, null);
            zko1.b(0, cwl1.o0(x340Var, 2131959602), cwl1.n0(2131959598, new Object[]{cwl1.o0(x340Var, 2131959602)}, x340Var), x340Var, null);
            if (yq00Var instanceof wq00) {
                x340Var.i0(-383466271);
                zko1.b(0, cwl1.o0(x340Var, 2131959603), cwl1.n0(2131959599, new Object[]{cwl1.o0(x340Var, 2131959603)}, x340Var), x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(-383149141);
                x340Var.r(false);
            }
            if (z) {
                x340Var.i0(-383097061);
                zko1.b(0, cwl1.o0(x340Var, 2131959601), cwl1.n0(2131959597, new Object[]{cwl1.o0(x340Var, 2131959601)}, x340Var), x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(-382774165);
                x340Var.r(false);
            }
            cvx cvxVar = cbx.b(x340Var).b;
            String strJ = kk0.j(16.0f, 2131959612, x340Var, x340Var, qim0Var3);
            lee1 lee1Var2 = cbx.d(x340Var).k;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = xc10.S0;
                x340Var.s0(objT2);
            }
            uwo1.e(strJ, s161.b(qim0Var3, false, (iu30) objT2), lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            lee1 lee1Var3 = cbx.d(x340Var).j;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e("•", uyn1.B(qim0Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11), lee1Var3, 0L, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2040);
            uwo1.e(cwl1.o0(x340Var, 2131959611), null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs((Object) yq00Var, z, (Object) qim0Var2, i, (byte) 18);
        }
    }

    public static final void i(String str, gw70 gw70Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1173560529);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(gw70Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            eso1.h(oi7.a(Uri.parse(str), gw70Var, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, i2 & 112, 0, 131068), isl.a, qim0Var, (p3v) null, (zvx) null, (ecx) null, mif1.T0, (tl3) null, (ColorFilter) null, x340Var, (i2 & 896) | 48, 440);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) str, (Object) gw70Var, (Object) qim0Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x034f  */
    /* JADX WARN: Code duplicated, block: B:194:0x035e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0375  */
    /* JADX WARN: Code duplicated, block: B:201:0x0386  */
    /* JADX WARN: Code duplicated, block: B:206:0x0395  */
    /* JADX WARN: Code duplicated, block: B:209:0x039f  */
    /* JADX WARN: Code duplicated, block: B:213:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:214:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:217:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:218:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:224:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:227:0x03da  */
    /* JADX WARN: Code duplicated, block: B:228:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:230:0x03df  */
    /* JADX WARN: Code duplicated, block: B:231:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:235:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:238:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:239:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:243:0x0404  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(zyi0 zyi0Var, String str, String str2, boolean z, z201 z201Var, qj0 qj0Var, c101 c101Var, sve sveVar, ngs0 ngs0Var, lgq lgqVar, h4q h4qVar, umf0 umf0Var, c380 c380Var, iu30 iu30Var, qim0 qim0Var, boolean z2, boolean z3, boolean z4, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        x340 x340Var;
        qim0 qim0Var2;
        boolean z5;
        float f;
        Object next;
        byte b;
        yyi0 yyi0Var;
        ArrayList arrayList;
        z90 z90Var;
        c9 c9VarF;
        int i5;
        byte b2;
        int i6;
        byte b3;
        int i7;
        Object objT;
        iu30 iu30Var2;
        byte b4;
        byte b5;
        int i8;
        Object objT2;
        byte b6;
        Object objT3;
        yyi0 yyi0Var2 = zyi0Var.f;
        String str3 = zyi0Var.c;
        String str4 = zyi0Var.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(719832554);
        if ((i & 6) == 0) {
            i3 = i | (x340Var2.g(zyi0Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.i(z201Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= x340Var2.i(qj0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= x340Var2.i(c101Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? x340Var2.g(sveVar) : x340Var2.i(sveVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= x340Var2.i(ngs0Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= x340Var2.i(lgqVar) ? 536870912 : 268435456;
        }
        int i9 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var2.i(h4qVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.i(umf0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? x340Var2.g(c380Var) : x340Var2.i(c380Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        int i10 = i4 | 24576;
        if ((i2 & 196608) == 0) {
            i10 |= x340Var2.h(z2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i10 |= x340Var2.h(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i10 |= x340Var2.h(z4) ? 8388608 : 4194304;
        }
        if (x340Var2.Y(i9 & 1, ((i9 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true)) {
            boolean z6 = u890.j(zyi0Var.d.a, str2) && !zyi0Var.f44p;
            String strD = pcf.d(6, str, null);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var3);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (zyi0Var.m) {
                x340Var2.i0(1199310344);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                z5 = false;
                x340Var2.r(false);
                f = 8.0f;
            } else {
                z5 = false;
                x340Var2.i0(1199311976);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 4.0f;
            }
            op71.g(x340Var2, u291.h(qim0Var3, f));
            Iterator it = zyi0Var.i.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((gxz0) next).c.a, str2));
            gxz0 gxz0Var = (gxz0) next;
            String str5 = gxz0Var != null ? gxz0Var.b : null;
            boolean zG = x340Var2.g(str5);
            Object objT4 = x340Var2.T();
            if (zG || objT4 == m4cVar) {
                objT4 = z201Var.a(str5);
                x340Var2.s0(objT4);
            }
            ven0 ven0VarG = rwq.g((mr20) objT4, z201.b, null, x340Var2, 0, 2);
            boolean zG2 = x340Var2.g(str4) | ((3670016 & i10) == 1048576 ? true : z5);
            Object objT5 = x340Var2.T();
            if (zG2 || objT5 == m4cVar) {
                objT5 = h4qVar.a(str4, z3);
                x340Var2.s0(objT5);
            }
            u201 u201Var = (u201) objT5;
            String str6 = zyi0Var.a;
            int i11 = i10;
            String str7 = str5;
            tom tomVar = new tom(str6, str, zyi0Var.d, zyi0Var.g, true, new vol(str3, (String) null), (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, zyi0Var.b, (xo2) null, 3008);
            boolean zG3 = x340Var2.g(str6) | ((i9 & 112) == 32) | x340Var2.g(zyi0Var.j);
            Object objT6 = x340Var2.T();
            if (zG3 || objT6 == m4cVar) {
                b = 1;
                objT6 = lgqVar.a(tomVar, new p5j0(zyi0Var, (byte) 1));
                x340Var2.s0(objT6);
            } else {
                b = 1;
            }
            oa0 oa0Var = (oa0) objT6;
            float f2 = zyi0Var.e;
            c380 c380Var2 = (c380) ven0VarG.getValue();
            if (zyi0Var.h) {
                yyi0Var = yyi0Var2;
                boolean z7 = yyi0Var instanceof vyi0 ? 0 : b;
                boolean z8 = zyi0Var.k;
                boolean z9 = zyi0Var.l;
                if (yyi0Var instanceof vyi0) {
                    c9VarF = mqo1.F(Collections.singletonList(aa0.d));
                } else if (zyi0Var.o || !(zyi0Var.n instanceof oyi0)) {
                    arrayList = new ArrayList();
                    arrayList.add(new y90(str3));
                    if (!z6 && !zyi0Var.a()) {
                        arrayList.add(fa0.d);
                    }
                    boolean z10 = zyi0Var.t;
                    if (z6 || !tomVar.X) {
                        z90Var = ba0.d;
                    } else {
                        z90Var = new z90(z10);
                    }
                    arrayList.add(z90Var);
                    c9VarF = mqo1.F(arrayList);
                } else {
                    c9VarF = mqo1.F(Collections.singletonList(ba0.d));
                }
                c9 c9Var = c9VarF;
                i5 = i9 & 14;
                if (i5 == 4) {
                    b2 = b;
                } else {
                    b2 = 0;
                }
                i6 = i11 & 7168;
                if (i6 == 2048) {
                    b3 = b;
                } else {
                    b3 = 0;
                }
                i7 = b2 | b3;
                objT = x340Var2.T();
                if (i7 == 0 || objT == m4cVar) {
                    iu30Var2 = iu30Var;
                    objT = new o5j0(zyi0Var, iu30Var2, (byte) 0);
                    x340Var2.s0(objT);
                } else {
                    iu30Var2 = iu30Var;
                }
                iu30 iu30Var3 = (iu30) objT;
                if (i5 == 4) {
                    b4 = b;
                } else {
                    b4 = 0;
                }
                if (i6 == 2048) {
                    b5 = b;
                } else {
                    b5 = 0;
                }
                i8 = b5 | b4;
                objT2 = x340Var2.T();
                if (i8 == 0 || objT2 == m4cVar) {
                    objT2 = new o5j0(zyi0Var, iu30Var2, b);
                    x340Var2.s0(objT2);
                }
                iu30 iu30Var4 = (iu30) objT2;
                if (i5 == 4) {
                    b6 = b;
                } else {
                    b6 = 0;
                }
                objT3 = x340Var2.T();
                if (b6 == 0 || objT3 == m4cVar) {
                    objT3 = new p5j0(zyi0Var, (byte) 0);
                    x340Var2.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                boolean z11 = z6;
                exd0.h(u201Var, oa0Var, f2, (qim0) null, z9, z11, z7, z8, str7, c9Var, iu30Var3, c380Var2, iu30Var4, function0, apo.r(1629278311, new r5j0(zyi0Var, c380Var, z11, z, qj0Var, strD, z4, iu30Var2, sveVar, z2, umf0Var, c101Var, ngs0Var), x340Var2), x340Var2, 0, 8);
                x340Var = x340Var2;
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                yyi0Var = yyi0Var2;
            }
            boolean z12 = zyi0Var.k;
            boolean z13 = zyi0Var.l;
            if (yyi0Var instanceof vyi0) {
                c9VarF = mqo1.F(Collections.singletonList(aa0.d));
            } else if (zyi0Var.o) {
                arrayList = new ArrayList();
                arrayList.add(new y90(str3));
                if (!z6) {
                    arrayList.add(fa0.d);
                }
                boolean z14 = zyi0Var.t;
                if (z6) {
                    z90Var = ba0.d;
                } else {
                    z90Var = ba0.d;
                }
                arrayList.add(z90Var);
                c9VarF = mqo1.F(arrayList);
            } else {
                arrayList = new ArrayList();
                arrayList.add(new y90(str3));
                if (!z6) {
                    arrayList.add(fa0.d);
                }
                boolean z15 = zyi0Var.t;
                if (z6) {
                    z90Var = ba0.d;
                } else {
                    z90Var = ba0.d;
                }
                arrayList.add(z90Var);
                c9VarF = mqo1.F(arrayList);
            }
            c9 c9Var2 = c9VarF;
            i5 = i9 & 14;
            if (i5 == 4) {
                b2 = b;
            } else {
                b2 = 0;
            }
            i6 = i11 & 7168;
            if (i6 == 2048) {
                b3 = b;
            } else {
                b3 = 0;
            }
            i7 = b2 | b3;
            objT = x340Var2.T();
            if (i7 == 0) {
                iu30Var2 = iu30Var;
                objT = new o5j0(zyi0Var, iu30Var2, (byte) 0);
                x340Var2.s0(objT);
            } else {
                iu30Var2 = iu30Var;
                objT = new o5j0(zyi0Var, iu30Var2, (byte) 0);
                x340Var2.s0(objT);
            }
            iu30 iu30Var5 = (iu30) objT;
            if (i5 == 4) {
                b4 = b;
            } else {
                b4 = 0;
            }
            if (i6 == 2048) {
                b5 = b;
            } else {
                b5 = 0;
            }
            i8 = b5 | b4;
            objT2 = x340Var2.T();
            if (i8 == 0) {
                objT2 = new o5j0(zyi0Var, iu30Var2, b);
                x340Var2.s0(objT2);
            } else {
                objT2 = new o5j0(zyi0Var, iu30Var2, b);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var6 = (iu30) objT2;
            if (i5 == 4) {
                b6 = b;
            } else {
                b6 = 0;
            }
            objT3 = x340Var2.T();
            if (b6 == 0) {
                objT3 = new p5j0(zyi0Var, (byte) 0);
                x340Var2.s0(objT3);
            } else {
                objT3 = new p5j0(zyi0Var, (byte) 0);
                x340Var2.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            boolean z16 = z6;
            exd0.h(u201Var, oa0Var, f2, (qim0) null, z13, z16, z7, z12, str7, c9Var2, iu30Var5, c380Var2, iu30Var6, function1, apo.r(1629278311, new r5j0(zyi0Var, c380Var, z16, z, qj0Var, strD, z4, iu30Var2, sveVar, z2, umf0Var, c101Var, ngs0Var), x340Var2), x340Var2, 0, 8);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s5j0(zyi0Var, str, str2, z, z201Var, qj0Var, c101Var, sveVar, ngs0Var, lgqVar, h4qVar, umf0Var, c380Var, iu30Var, qim0Var2, z2, z3, z4, i, i2);
        }
    }

    public static final void k(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(304187179);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarI = zr7.i(qim0Var, gce0.a1);
            uwr uwrVar = cbx.a;
            t1c.a(anm1.N("ShareCardLoading", cwl1.l0(qim0VarI, cbx.a(x340Var).a.b.c(), (hw61) null, 14)), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b271(qim0Var, i, (byte) 0);
        }
    }

    public static dxo1 l(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new qjm0(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            zoo zooVar = new zoo();
            zooVar.b = d;
            zooVar.c = dArr3;
            return zooVar;
        }
        jic0 jic0Var = new jic0();
        int length = dArr2[0].length;
        jic0Var.d = new double[length];
        jic0Var.b = dArr;
        jic0Var.c = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return jic0Var;
    }

    public static boolean r(y570 y570Var) {
        return (y570Var.k().a.c == null && y570Var.k().a.f == null && y570Var.g().g("calendar") == null) ? false : true;
    }

    public static final String s(cr01 cr01Var) {
        ft01 ft01Var;
        String str;
        br01 br01Var = cr01Var.e;
        String str2 = cr01Var.b;
        if (br01Var == br01.c && (ft01Var = (ft01) o7h.s0(cr01Var.f)) != null && (str = ft01Var.b) != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return str2;
    }

    public static final go80 t(klm klmVar, zcp0 zcp0Var) {
        return klmVar.a("DjNudgeEngineDaemon", new nbp0(zcp0Var, (byte) 6));
    }

    public static final ArrayList u(int i, int i2, List list) {
        o8d1 q8d1Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            p8d1 p8d1Var = (x8d1) obj;
            boolean z = i3 == i;
            if (p8d1Var instanceof p8d1) {
                p8d1 p8d1Var2 = p8d1Var;
                List list3 = p8d1Var2.a;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new u7h(z4p1.e(((Number) it.next()).intValue())));
                }
                q8d1Var = new o8d1((list3.size() == 1 || (list3.size() >= 2 && ((Number) list3.get(0)).intValue() == ((Number) list3.get(1)).intValue())) ? l1d.m("share-menu.swatches.background-color-", Integer.toHexString(((Number) o7h.q0(list3)).intValue())) : "share-menu.swatches.background-color-gradient", p8d1Var2.b, arrayList2, z);
            } else if (p8d1Var instanceof s8d1) {
                s8d1 s8d1Var = (s8d1) p8d1Var;
                q8d1Var = new r8d1("share-menu.swatches.background-canvas-image", z, s8d1Var.b, s8d1Var.a);
            } else if (p8d1Var instanceof v8d1) {
                v8d1 v8d1Var = (v8d1) p8d1Var;
                q8d1Var = new u8d1("share-menu.swatches.background-canvas-video", z, v8d1Var.b, v8d1Var.a, i2);
            } else {
                if (!(p8d1Var instanceof t8d1)) {
                    eg.o();
                    return null;
                }
                q8d1Var = new q8d1(1, "share-menu.swatches.themed-swatch", ((t8d1) p8d1Var).b, z);
            }
            arrayList.add(q8d1Var);
            i3 = i4;
        }
        return arrayList;
    }

    public static osw v(i6a i6aVar) {
        return new osw(new gk90(i6aVar, vu70.d));
    }

    public static final int w(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 2;
        }
        if (iC == 1) {
            return 1;
        }
        if (iC == 2) {
            return 3;
        }
        eg.o();
        return 0;
    }

    public static void x(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, Parcel parcel) {
        parcel.writeByteArray(playlistRequestDecorationPolicy.toByteArray());
    }

    public abstract double m(double d);

    public abstract void n(double d, double[] dArr);

    public abstract void o(double d, float[] fArr);

    public abstract void p(double d, double[] dArr);

    public abstract double[] q();
}

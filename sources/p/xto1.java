package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.mobius.Effects;
import defpackage.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xto1 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    public static final void a(up71 up71Var, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        int i3;
        int i4;
        String strK;
        boolean z;
        Object objT;
        boolean z2;
        Object objT2;
        m4c m4cVar = fkj0.X;
        boolean z3 = up71Var.d;
        int i5 = up71Var.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(477304594);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(up71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 2048 : 1024;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            List list = up71Var.b;
            String str = up71Var.c;
            Function0 function0 = null;
            if (i5 == 5) {
                i3 = -871774711;
                i4 = 2131962352;
            } else {
                if (z3) {
                    x340Var.i0(-1255097935);
                    Integer numR = sto1.r(up71Var.e);
                    if (numR == null) {
                        x340Var.i0(-1255097936);
                        x340Var.r(false);
                        strK = null;
                    } else {
                        strK = kk0.k(x340Var, -1255097935, numR, x340Var, false);
                    }
                    x340Var.r(false);
                } else {
                    i3 = -871769330;
                    i4 = 2131962351;
                }
                rgi1 rgi1Var = new rgi1(list, str, strK, new mgi1(new pgi1(cwl1.o0(x340Var, 2131962349), plx.c, (Function0) null)));
                if (i5 == 5) {
                    x340Var.i0(-1254544213);
                    if ((i2 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT2 = x340Var.T();
                    if (z2 || objT2 == m4cVar) {
                        objT2 = new ggf(iu30Var, (byte) 19);
                        x340Var.s0(objT2);
                    }
                    function0 = (Function0) objT2;
                    x340Var.r(false);
                } else if (z3) {
                    x340Var.i0(-1254450314);
                    if ((i2 & 896) == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objT = x340Var.T();
                    if (z || objT == m4cVar) {
                        objT = new ggf(iu30Var, (byte) 20);
                        x340Var.s0(objT);
                    }
                    function0 = (Function0) objT;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1254377589);
                    x340Var.r(false);
                }
                ero1.f(rgi1Var, function0, gw70Var, qim0Var2, x340Var, ((i2 << 3) & 896) | (i2 & 7168), 0);
            }
            strK = x0d.k(x340Var, i3, i4, x340Var, false);
            rgi1 rgi1Var2 = new rgi1(list, str, strK, new mgi1(new pgi1(cwl1.o0(x340Var, 2131962349), plx.c, (Function0) null)));
            if (i5 == 5) {
                x340Var.i0(-1254544213);
                if ((i2 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT2 = x340Var.T();
                if (z2) {
                    objT2 = new ggf(iu30Var, (byte) 19);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new ggf(iu30Var, (byte) 19);
                    x340Var.s0(objT2);
                }
                function0 = (Function0) objT2;
                x340Var.r(false);
            } else if (z3) {
                x340Var.i0(-1254450314);
                if ((i2 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objT = x340Var.T();
                if (z) {
                    objT = new ggf(iu30Var, (byte) 20);
                    x340Var.s0(objT);
                } else {
                    objT = new ggf(iu30Var, (byte) 20);
                    x340Var.s0(objT);
                }
                function0 = (Function0) objT;
                x340Var.r(false);
            } else {
                x340Var.i0(-1254377589);
                x340Var.r(false);
            }
            ero1.f(rgi1Var2, function0, gw70Var, qim0Var2, x340Var, ((i2 << 3) & 896) | (i2 & 7168), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, up71Var, gw70Var, iu30Var, qim0Var, (byte) 20);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(727681040);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarC = u291.c(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            t1c.a(dug.f(u291.v(qim0VarC, 1.0f), cbx.a(x340Var).a.b.c(), d4o1.a), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 28);
        }
    }

    public static final void c(int i, int i2, String str, String str2, String str3, b0k b0kVar, qim0 qim0Var) {
        int i3;
        String str4;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(844444644);
        j06 j06Var = x340Var2.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            str4 = str3;
            i3 |= x340Var2.g(str4) ? 2048 : 1024;
        } else {
            str4 = str3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var2).g;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarH = u291.h(u291.v(qim0Var, 166.4f), 96.0f);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            int i4 = i3;
            Uri uri = Uri.parse(str4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = eqr0.D(78.4f, 0.0f, 2, u291.r(nim0Var, 88.0f));
            cua cuaVar = cbx.b(x340Var2).f;
            cua cuaVar2 = cbx.b(x340Var2).f;
            eso1.e(uri, isl.a, qim0VarD, (p3v) null, new zvx(), (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 3120, 0, 4064);
            qim0 qim0VarR = u291.r(nim0Var, 96.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarR);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            t1c.a(dug.f(h2c.a.b(nim0Var), cbx.a(x340Var2).a.a.a(), er31.a), x340Var2, 0);
            bmq0.a(Uri.parse(str), u291.r(nim0Var, 88.0f), hcx.e, (String) null, str2, i != 0 ? u7h.b(z4p1.e(i), 1.0f, 0.0f, 0.0f, 0.0f, 14) : u7h.k, 0L, false, x340Var2, ((i4 << 9) & 57344) | 384, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new er2(str, str2, i, str3, qim0Var, i2, (byte) 1);
        }
    }

    public static final void d(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(868423872);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("host-approval-sheet-header-subtitle", u291.f(nim0Var, 1.0f));
            jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            hmx hmxVar = hmx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(hmxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, hmx.d | 48, 56);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, null, ktd.l(nim0Var, 6.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0((byte) 8, i, str, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void e(qim0 qim0Var, int i, long j, long j2, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        long j3;
        long jA;
        int i5;
        boolean z;
        int i6;
        qim0 qim0Var3;
        long j4;
        long j5;
        h311 h311VarV;
        qim0 qim0Var4;
        int i7;
        long j6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-224347983);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            qim0Var2 = qim0Var;
        } else if ((i2 & 6) == 0) {
            qim0Var2 = qim0Var;
            i4 = i2 | (x340Var.i(qim0Var2) ? 4 : 2);
        } else {
            qim0Var2 = qim0Var;
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16;
        }
        if ((i3 & 4) == 0) {
            j3 = j;
            int i10 = x340Var.f(j3) ? 256 : 128;
            int i11 = i4 | i10;
            if ((i3 & 8) == 0) {
                jA = j2;
                int i12 = x340Var.f(jA) ? 2048 : 1024;
                i5 = i11 | i12;
                if ((i5 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i5 & 1, z)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0 || x340Var.E()) {
                        if (i8 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i9 != 0) {
                            i7 = 3;
                        } else {
                            i7 = i;
                        }
                        if ((i3 & 4) != 0) {
                            uwr uwrVar = cbx.a;
                            j6 = cbx.a(x340Var).b.c;
                            i5 &= -897;
                        } else {
                            j6 = j3;
                        }
                        if ((i3 & 8) != 0) {
                            uwr uwrVar2 = cbx.a;
                            i5 &= -7169;
                            jA = cbx.a(x340Var).a.b.a();
                        }
                        j3 = j6;
                    } else {
                        x340Var.b0();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        i7 = i;
                        qim0Var4 = qim0Var2;
                    }
                    x340Var.s();
                    shx0.b(rjx.i(x340Var, i7), 2, (i5 & 7168) | ((i5 >> 3) & 112), 0, j3, jA, x340Var, u291.r(qim0Var4, rjx.e(x340Var, i7)));
                    qim0Var3 = qim0Var4;
                    i6 = i7;
                } else {
                    x340Var.b0();
                    i6 = i;
                    qim0Var3 = qim0Var2;
                }
                j4 = j3;
                j5 = jA;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new jwx(qim0Var3, i6, j4, j5, i2, i3);
                }
            }
            jA = j2;
            i5 = i11 | i12;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i9 != 0) {
                        i7 = 3;
                    } else {
                        i7 = i;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar3 = cbx.a;
                        j6 = cbx.a(x340Var).b.c;
                        i5 &= -897;
                    } else {
                        j6 = j3;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar4 = cbx.a;
                        i5 &= -7169;
                        jA = cbx.a(x340Var).a.b.a();
                    }
                    j3 = j6;
                } else {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i9 != 0) {
                        i7 = 3;
                    } else {
                        i7 = i;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar5 = cbx.a;
                        j6 = cbx.a(x340Var).b.c;
                        i5 &= -897;
                    } else {
                        j6 = j3;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar6 = cbx.a;
                        i5 &= -7169;
                        jA = cbx.a(x340Var).a.b.a();
                    }
                    j3 = j6;
                }
                x340Var.s();
                shx0.b(rjx.i(x340Var, i7), 2, (i5 & 7168) | ((i5 >> 3) & 112), 0, j3, jA, x340Var, u291.r(qim0Var4, rjx.e(x340Var, i7)));
                qim0Var3 = qim0Var4;
                i6 = i7;
            } else {
                x340Var.b0();
                i6 = i;
                qim0Var3 = qim0Var2;
            }
            j4 = j3;
            j5 = jA;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jwx(qim0Var3, i6, j4, j5, i2, i3);
            }
        }
        j3 = j;
        int i13 = i4 | i10;
        if ((i3 & 8) == 0) {
            jA = j2;
            if (x340Var.f(jA)) {
            }
            i5 = i13 | i12;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i9 != 0) {
                        i7 = 3;
                    } else {
                        i7 = i;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar7 = cbx.a;
                        j6 = cbx.a(x340Var).b.c;
                        i5 &= -897;
                    } else {
                        j6 = j3;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar8 = cbx.a;
                        i5 &= -7169;
                        jA = cbx.a(x340Var).a.b.a();
                    }
                    j3 = j6;
                } else {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i9 != 0) {
                        i7 = 3;
                    } else {
                        i7 = i;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar9 = cbx.a;
                        j6 = cbx.a(x340Var).b.c;
                        i5 &= -897;
                    } else {
                        j6 = j3;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar10 = cbx.a;
                        i5 &= -7169;
                        jA = cbx.a(x340Var).a.b.a();
                    }
                    j3 = j6;
                }
                x340Var.s();
                shx0.b(rjx.i(x340Var, i7), 2, (i5 & 7168) | ((i5 >> 3) & 112), 0, j3, jA, x340Var, u291.r(qim0Var4, rjx.e(x340Var, i7)));
                qim0Var3 = qim0Var4;
                i6 = i7;
            } else {
                x340Var.b0();
                i6 = i;
                qim0Var3 = qim0Var2;
            }
            j4 = j3;
            j5 = jA;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jwx(qim0Var3, i6, j4, j5, i2, i3);
            }
        }
        jA = j2;
        i5 = i13 | i12;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i9 != 0) {
                    i7 = 3;
                } else {
                    i7 = i;
                }
                if ((i3 & 4) != 0) {
                    uwr uwrVar11 = cbx.a;
                    j6 = cbx.a(x340Var).b.c;
                    i5 &= -897;
                } else {
                    j6 = j3;
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar12 = cbx.a;
                    i5 &= -7169;
                    jA = cbx.a(x340Var).a.b.a();
                }
                j3 = j6;
            } else {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i9 != 0) {
                    i7 = 3;
                } else {
                    i7 = i;
                }
                if ((i3 & 4) != 0) {
                    uwr uwrVar13 = cbx.a;
                    j6 = cbx.a(x340Var).b.c;
                    i5 &= -897;
                } else {
                    j6 = j3;
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar14 = cbx.a;
                    i5 &= -7169;
                    jA = cbx.a(x340Var).a.b.a();
                }
                j3 = j6;
            }
            x340Var.s();
            shx0.b(rjx.i(x340Var, i7), 2, (i5 & 7168) | ((i5 >> 3) & 112), 0, j3, jA, x340Var, u291.r(qim0Var4, rjx.e(x340Var, i7)));
            qim0Var3 = qim0Var4;
            i6 = i7;
        } else {
            x340Var.b0();
            i6 = i;
            qim0Var3 = qim0Var2;
        }
        j4 = j3;
        j5 = jA;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jwx(qim0Var3, i6, j4, j5, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void f(float f, int i, int i2, int i3, long j, long j2, b0k b0kVar, qim0 qim0Var) {
        int i4;
        qim0 qim0Var2;
        long jA;
        boolean z;
        qim0 qim0Var3;
        long j3;
        h311 h311VarV;
        qim0 qim0Var4;
        int i5;
        int iC;
        int i6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1659704063);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.d(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var.e(iC)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if (x340Var.f(j)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    jA = j2;
                    int i8 = x340Var.f(jA) ? 16384 : 8192;
                    i4 |= i8;
                } else {
                    jA = j2;
                }
                i4 |= i8;
            } else {
                jA = j2;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar = cbx.a;
                        jA = cbx.a(x340Var).a.b.a();
                        i4 &= -57345;
                    }
                } else {
                    x340Var.b0();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    qim0Var4 = qim0Var2;
                }
                long j4 = jA;
                x340Var.s();
                shx0.a(f, u291.r(qim0Var4, rjx.e(x340Var, i)), j, rjx.i(x340Var, i), j4, 1, x340Var, (i4 & 14) | ((i4 >> 3) & 896) | (i4 & 57344));
                j3 = j4;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                j3 = jA;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new kwx(f, i, i2, i3, j, j3, qim0Var3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        if ((i2 & 384) == 0) {
            if (i == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i);
            }
            if (x340Var.e(iC)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (x340Var.f(j)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                jA = j2;
                if (x340Var.f(jA)) {
                }
                i4 |= i8;
            } else {
                jA = j2;
            }
            i4 |= i8;
        } else {
            jA = j2;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar2 = cbx.a;
                    jA = cbx.a(x340Var).a.b.a();
                    i4 &= -57345;
                }
            } else {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar3 = cbx.a;
                    jA = cbx.a(x340Var).a.b.a();
                    i4 &= -57345;
                }
            }
            long j5 = jA;
            x340Var.s();
            shx0.a(f, u291.r(qim0Var4, rjx.e(x340Var, i)), j, rjx.i(x340Var, i), j5, 1, x340Var, (i4 & 14) | ((i4 >> 3) & 896) | (i4 & 57344));
            j3 = j5;
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            j3 = jA;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kwx(f, i, i2, i3, j, j3, qim0Var3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void g(int i, int i2, b0k b0kVar, hcx hcxVar, c380 c380Var, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2051201124);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.e(hcxVar.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                fc11.a(c380Var, anm1.N("host-approval-sheet-header-face-pile", qim0Var4), hcxVar, (hux) null, true, 2, (gbx) null, (String) null, (idn0) null, x340Var, (i3 & 14) | 221192 | ((i3 << 3) & 896), 456);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((byte) 13, i, i2, (Object) c380Var, (Object) hcxVar, qim0Var3);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            fc11.a(c380Var, anm1.N("host-approval-sheet-header-face-pile", qim0Var4), hcxVar, (hux) null, true, 2, (gbx) null, (String) null, (idn0) null, x340Var, (i3 & 14) | 221192 | ((i3 << 3) & 896), 456);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((byte) 13, i, i2, (Object) c380Var, (Object) hcxVar, qim0Var3);
        }
    }

    public static final void h(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1581125863);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT;
            boolean zI = x340Var.i(hdn0Var) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xr00(c380Var, hdn0Var, (lnm) null, (byte) 3);
                x340Var.s0(objT2);
            }
            qxd0.t(c380Var, x340Var, (vu30) objT2);
            boolean z = !c380Var.isEmpty();
            j2i j2iVarR = apo.r(468555761, new cex(hdn0Var, c380Var, (byte) 10), x340Var);
            qim0 qim0Var2 = nim0.a;
            fq7.g(z, qim0Var2, (bby) null, (ln00) null, (String) null, j2iVarR, x340Var, 196656, 28);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var, i, (byte) 5);
        }
    }

    public static final void i(String str, String str2, boolean z, lee1 lee1Var, qim0 qim0Var, b0k b0kVar, int i) {
        String str3;
        int i2;
        lee1 lee1Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1271245955);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (b0kVar2.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            lee1Var2 = lee1Var;
            i2 |= b0kVar2.i(lee1Var2) ? 2048 : 1024;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.e, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar2).b.a;
            nim0 nim0Var = nim0.a;
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            uwo1.e(str3, anm1.N("host-approval-sheet-header-title", u291.f(nim0Var, 1.0f)), lee1Var2, j, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, i3 | (i4 & 896), 0, 2016);
            b0kVar2 = b0kVar2;
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 4.0f));
            if (z) {
                b0kVar2.i0(2143514366);
                d(str2, b0kVar2, i4 & 14);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(2143583868);
                uwo1.e(str2, anm1.N("host-approval-sheet-header-subtitle", u291.f(nim0Var, 1.0f)), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, i4 & 14, 0, 2016);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((byte) 17, i, (Object) str, (Object) str2, (Object) lee1Var, qim0Var, z);
        }
    }

    public static final void j(cw60 cw60Var, String str, String str2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(242365268);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(cw60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.i0(984792358);
            float fM0 = ((wat) x340Var.k(t4k.h)).M0((int) (((crl1) x340Var.k(t4k.u)).a() & 4294967295L));
            x340Var.r(false);
            boolean z = p3v.b(fM0, 400.0f) >= 0;
            ArrayList arrayList = new ArrayList();
            ew60 ew60Var = cw60Var.b;
            String str3 = ew60Var.c;
            String str4 = str3 == null ? "" : str3;
            String str5 = ew60Var.a;
            String str6 = ew60Var.b;
            arrayList.add(new phx(8, 0L, str4, str5, str6 == null ? str5 : str6));
            ew60 ew60Var2 = cw60Var.a;
            String str7 = ew60Var2.c;
            String str8 = str7 == null ? "" : str7;
            String str9 = ew60Var2.a;
            String str10 = ew60Var2.b;
            arrayList.add(new phx(8, 0L, str8, str9, str10 == null ? str9 : str10));
            c380 c380VarA = mqo1.A(arrayList);
            boolean z2 = !cw60Var.e && cw60Var.d == 1;
            if (z) {
                x340Var.i0(464080390);
                k((i2 & 112) | 8 | (i2 & 896), str, str2, x340Var, c380VarA, z2);
                x340Var.r(false);
            } else {
                x340Var.i0(464157766);
                t((i2 & 112) | 8 | (i2 & 896), str, str2, x340Var, c380VarA, z2);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(cw60Var, str, str2, i, (byte) 2);
        }
    }

    public static final void k(int i, String str, String str2, b0k b0kVar, c380 c380Var, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-589773322);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("host-approval-sheet-header", dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a));
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            g((i3 & 14) | 56, 4, x340Var, hcx.d, c380Var, null);
            lee1 lee1Var = cbx.d(x340Var).e;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            i(str, str2, z, lee1Var, uyn1.x(qim0VarF2, 16.0f), x340Var, (i3 >> 3) & 1022);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hw60(c380Var, str, str2, z, i, (byte) 0);
        }
    }

    public static final void l(phm0 phm0Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        long j;
        gbx gbxVar;
        Function0 function1;
        int i2;
        m4c m4cVar = fkj0.X;
        String str = phm0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1196182556);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.i(phm0Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            if (((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue()) {
                x340Var.i0(-1519789887);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).a.e;
                x340Var.r(false);
            } else {
                x340Var.i0(-1519789337);
                x340Var.r(false);
                j = u7h.j;
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF = dug.f(uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), j, d4o1.a);
            if (ihc1.y0(str)) {
                gbxVar = new gbx(z50.c, function0);
            } else {
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbxVar = new gbx(new y50(str), function0);
            }
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, wmo1.k(qim0VarF, idn0Var, true, gbxVar, null, 24));
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarQ = i1p1.q(nim0Var, er31.a);
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarN = anm1.N("artwork", u291.m(qim0VarQ, 48.0f));
            Uri uri = Uri.parse(phm0Var.b);
            isl islVar = isl.a;
            eso1.e(uri, islVar, qim0VarN, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
            qim0 qim0VarA = h2c.a.a(u291.v(u291.h(nim0Var, 14.0f), 14.0f), een.Y);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = xdc0.Z;
                x340Var.s0(objT2);
            }
            w0h1.a(phm0Var.f, islVar, exd0.q(qim0VarA, (iu30) objT2), cbx.a(x340Var).b.c, 0L, true, x340Var, 196664, 16);
            x340Var.r(true);
            op71.g(x340Var, u291.v(nim0Var, 16.0f));
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                function1 = function2;
                x340Var.l(function1);
            } else {
                function1 = function2;
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            Function0 function3 = function1;
            uwo1.e(phm0Var.a, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            if (phm0Var.e) {
                x340Var.i0(1399914121);
                qim0 qim0VarN2 = anm1.N("download_badge", nim0Var);
                int iC = l1d.C(phm0Var.g);
                if (iC == 0) {
                    i2 = 1;
                } else if (iC != 1) {
                    i2 = 3;
                    if (iC != 2) {
                        if (iC != 3) {
                            eg.o();
                            return;
                        }
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                acq0.e(i2, 0, x340Var, qim0VarN2);
                ab80.p(nim0Var, 8.0f, x340Var, false);
            } else {
                x340Var.i0(1400128424);
                x340Var.r(false);
            }
            uwo1.e(phm0Var.c, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            w0h1.a(plx.c, islVar, u291.v(u291.h(nim0Var, 16.0f), 16.0f).then(new i5j1(fraVar)), 0L, 0L, false, x340Var, plx.d | 48, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(phm0Var, qim0Var, function0, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void m(String str, String str2, int i, String str3, qim0 qim0Var, boolean z, b0k b0kVar, int i2, int i3) {
        int i4;
        boolean z2;
        boolean z3;
        qim0 qim0Var2;
        boolean z4;
        h311 h311VarV;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-31337341);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.g(str3) ? 2048 : 1024;
        }
        int i5 = i4 | 24576;
        int i6 = i3 & 32;
        if (i6 == 0) {
            if ((196608 & i2) == 0) {
                z2 = z;
                i5 |= x340Var.h(z2) ? 131072 : 65536;
            }
            if ((74899 & i5) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i5 & 1, z3)) {
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                qim0Var2 = nim0.a;
                if (z4) {
                    x340Var.i0(-1562566344);
                    r(i, i5 & 65534, str, str2, str3, x340Var, qim0Var2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1562331209);
                    c(i, i5 & 65534, str, str2, str3, x340Var, qim0Var2);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dix(str, str2, i, str3, qim0Var2, z4, i2, i3);
            }
        }
        i5 = 221184 | i4;
        z2 = z;
        if ((74899 & i5) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i5 & 1, z3)) {
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            qim0Var2 = nim0.a;
            if (z4) {
                x340Var.i0(-1562566344);
                r(i, i5 & 65534, str, str2, str3, x340Var, qim0Var2);
                x340Var.r(false);
            } else {
                x340Var.i0(-1562331209);
                c(i, i5 & 65534, str, str2, str3, x340Var, qim0Var2);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dix(str, str2, i, str3, qim0Var2, z4, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x0164  */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:57:0x0177  */
    /* JADX WARN: Code duplicated, block: B:60:0x0181  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void n(int i, int i2, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        zsc zscVar;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-581546823);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (x340Var.i(function0)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i5 != 0) {
                    z2 = false;
                }
                uwr uwrVar = cbx.a;
                qim0 qim0VarX = bin.x(dug.f(qim0Var, cbx.a(x340Var).c.c, er31.b(cbx.b(x340Var).b.b)), false, null, null, null, function0, 15);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarY = uyn1.y(qim0VarX, cbx.b(x340Var).b.a, 12.0f);
                jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarY);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                lee1 lee1Var = cbx.d(x340Var).h;
                zscVar = zex.a;
                uwo1.e(str, null, lee1Var, ((yex) zscVar.d).b, null, null, 0, false, null, 0, null, x340Var, i3 & 14, 0, 2034);
                x340Var = x340Var;
                if (z2) {
                    x340Var.i0(893556116);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    nim0 nim0Var = nim0.a;
                    op71.g(x340Var, u291.v(nim0Var, 8.0f));
                    dnx dnxVar = dnx.c;
                    long j = ((yex) zscVar.d).b;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(dnxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var, dnx.d | 196656, 16);
                    x340Var.r(false);
                } else {
                    x340Var.i0(893918413);
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            z4 = z2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wqi0(str, qim0Var, z4, function0, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if (x340Var.i(function0)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i5 != 0) {
                z2 = false;
            }
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarX2 = bin.x(dug.f(qim0Var, cbx.a(x340Var).c.c, er31.b(cbx.b(x340Var).b.b)), false, null, null, null, function0, 15);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarX2, cbx.b(x340Var).b.a, 12.0f);
            jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarY2);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lee1 lee1Var2 = cbx.d(x340Var).h;
            zscVar = zex.a;
            uwo1.e(str, null, lee1Var2, ((yex) zscVar.d).b, null, null, 0, false, null, 0, null, x340Var, i3 & 14, 0, 2034);
            x340Var = x340Var;
            if (z2) {
                x340Var.i0(893556116);
                cvx cvxVar4 = cbx.b(x340Var).b;
                nim0 nim0Var2 = nim0.a;
                op71.g(x340Var, u291.v(nim0Var2, 8.0f));
                dnx dnxVar2 = dnx.c;
                long j2 = ((yex) zscVar.d).b;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(dnxVar2, isl.a, u291.r(nim0Var2, 16.0f), j2, 0L, false, x340Var, dnx.d | 196656, 16);
                x340Var.r(false);
            } else {
                x340Var.i0(893918413);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        z4 = z2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wqi0(str, qim0Var, z4, function0, i, i2);
        }
    }

    public static final void o(ovs0 ovs0Var, smp0 smp0Var, kls0 kls0Var, b0k b0kVar, int i) {
        int i2;
        Object dvq0Var;
        dlv dlvVar;
        Boolean bool;
        lz20 lz20Var;
        int i3;
        int i4;
        bby bbyVarA;
        int i5 = ovs0Var.a;
        boolean z = ovs0Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2080474027);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ovs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(smp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(kls0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var2 = (lz20) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float fM0 = ((wat) x340Var.k(t4k.h)).M0(ovs0Var.h);
            mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(cbx.a(x340Var).a.c)}), 0.0f, 0.0f, 14);
            boolean z2 = z || (ovs0Var.c && i5 > 0) || (ovs0Var.d && i5 > 0 && ovs0Var.b > 0);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(ovs0Var);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            if (z2) {
                ven0Var.setValue(ovs0Var);
            }
            ovs0 ovs0Var2 = z2 ? ovs0Var : (ovs0) ven0Var.getValue();
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = x340Var.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f7: ARITH (r3v10 'zI' boolean) = (wrap boolean:0x00f2: ARITH (wrap boolean:0x00ee: INVOKE (r13v1 'x340Var' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r11v3 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:239)) | (wrap boolean:?: TERNARY null = ((wrap int:0x00e4: ARITH (r3v5 'i2' int) & (14 int) A[WRAPPED] (LINE:229)) == (4 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:243)) | (wrap boolean:0x00f3: INVOKE (r13v1 'x340Var' p.x340), (r10v4 'lz20Var2' p.lz20) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:244)) A[DECLARE_VAR] (LINE:248) in method: p.xto1.o(p.ovs0, p.smp0, p.kls0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v3 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 489
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.xto1.o(p.ovs0, p.smp0, p.kls0, p.b0k, int):void");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final void p(lh01 lh01Var, iu30 iu30Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
            int i2;
            String strK;
            String strK2;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(246796923);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? x340Var.g(lh01Var) : x340Var.i(lh01Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.h(z) ? 256 : 128;
            }
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                hh01 hh01Var = hh01.a;
                boolean zEquals = lh01Var.equals(hh01Var);
                jh01 jh01Var = jh01.a;
                if (zEquals) {
                    strK = x0d.k(x340Var, 948647430, 2131960920, x340Var, false);
                } else if ((lh01Var instanceof ih01) || (lh01Var instanceof kh01)) {
                    strK = x0d.k(x340Var, 948651479, 2131960918, x340Var, false);
                } else {
                    if (!lh01Var.equals(jh01Var)) {
                        throw p3d1.k(x340Var, 948646438, false);
                    }
                    strK = x0d.k(x340Var, 948654213, 2131960921, x340Var, false);
                }
                boolean z2 = lh01Var instanceof ih01;
                if (z2 || (lh01Var instanceof kh01)) {
                    strK2 = x0d.k(x340Var, 948659669, 2131960922, x340Var, false);
                } else if (lh01Var.equals(jh01Var)) {
                    strK2 = x0d.k(x340Var, 948662325, 2131960923, x340Var, false);
                } else {
                    if (!lh01Var.equals(hh01Var)) {
                        throw p3d1.k(x340Var, 948657800, false);
                    }
                    strK2 = x0d.k(x340Var, 948665017, 2131960919, x340Var, false);
                }
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarI = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, qim0VarI);
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
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (ihc1.y0(strK2)) {
                    hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                    return;
                }
                y50 y50Var = new y50(strK2);
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    objT = new j9z0(iu30Var, (byte) 26);
                    x340Var.s0(objT);
                }
                gbx gbxVar = new gbx(y50Var, (Function0) objT);
                pex pexVar = pex.b;
                lex lexVarZ = yoo1.z(x340Var);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarN = anm1.N("recaps_button_test_tag", pqo.h(uyn1.z(0.0f, 8.0f, 1, qim0VarI), (lh01Var instanceof hh01) || z2));
                if (z) {
                    qim0VarI = zr7.i(qim0VarI, krz0.e);
                }
                poo1.e(gbxVar, pexVar, lexVarZ, qim0VarN.then(qim0VarI), 0, strK, null, apo.r(808213869, new ziz0(lh01Var, (byte) 12), x340Var), null, null, null, false, null, ybj.a, x340Var, 12582912, 3072, 8016);
                x340Var = x340Var;
                x340Var.r(true);
                if (z2) {
                    x340Var.i0(-655053276);
                    boolean z4 = i3 == 32;
                    Object objT2 = x340Var.T();
                    if (z4 || objT2 == m4cVar) {
                        objT2 = new j9z0(iu30Var, (byte) 27);
                        x340Var.s0(objT2);
                    }
                    otw.c(new a4f0((Function0) objT2), ((ih01) lh01Var).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-654927385);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new e30(lh01Var, iu30Var, z, i, (byte) 27);
            }
        }

        public static final void q(iu30 iu30Var, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(966913921);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                String strO0 = cwl1.o0(x340Var, 2131958333);
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new m861(iu30Var, (byte) 1);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                foo1.c(new gbx(new y50(strO0), function0), ldx.c, nim0.a, null, yla.s(x340Var).a(), null, null, null, null, null, tgj.b, x340Var, 384, 48, 2008);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new luy0(iu30Var, i, (byte) 2);
            }
        }

        public static final void r(int i, int i2, String str, String str2, String str3, b0k b0kVar, qim0 qim0Var) {
            int i3;
            String str4;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-427338192);
            j06 j06Var = x340Var.a;
            if ((i2 & 6) == 0) {
                i3 = (x340Var.g(str) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.g(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var.e(i) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                str4 = str3;
                i3 |= x340Var.g(str4) ? 2048 : 1024;
            } else {
                str4 = str3;
            }
            if ((i2 & 24576) == 0) {
                i3 |= x340Var.i(qim0Var) ? 16384 : 8192;
            }
            if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                cvx cvxVar = cbx.b(x340Var).b;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                boolean zG = x340Var.g((wat) x340Var.k(t4k.h)) | x340Var.d(87.0f) | x340Var.d(48.0f);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new xqi0();
                    x340Var.s0(objT);
                }
                xqi0 xqi0Var = (xqi0) objT;
                qim0 qim0VarH = u291.h(u291.v(qim0Var, 188.0f), 107.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
                int i4 = i3;
                d36 d36Var = new d36(12.0f, true, new um5(false));
                nim0 nim0Var = nim0.a;
                qim0 qim0VarQ = i1p1.q(nim0Var, xqi0Var);
                jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarQ);
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
                Uri uri = Uri.parse(str);
                qim0 qim0VarR = u291.r(nim0Var, 88.0f);
                bmq0.a(uri, qim0VarR, hcx.e, (String) null, str2, i != 0 ? u7h.b(z4p1.e(i), 1.0f, 0.0f, 0.0f, 0.0f, 14) : u7h.k, 0L, false, x340Var, ((i4 << 9) & 57344) | 384, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER);
                Uri uri2 = Uri.parse(str4);
                qim0 qim0VarR2 = u291.r(nim0Var, 88.0f);
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvx zvxVar = new zvx();
                isl islVar = isl.a;
                eso1.e(uri2, islVar, qim0VarR2, (p3v) null, zvxVar, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 3120, 0, 4064);
                x340Var = x340Var;
                x340Var.r(true);
                qim0 qim0VarD = eqr0.D(0.0f, 67.0f, 1, h2c.a.a(nim0Var, een.e));
                zsc zscVar = zex.a;
                qim0 qim0VarX = uyn1.x(dug.f(qim0VarD, ((wex) ((gmt) zscVar.c).c).h, er31.a), 8.0f);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                w0h1.a(ysx.c, islVar, u291.r(nim0Var, 24.0f), ((yex) zscVar.d).b, 0L, true, x340Var, ysx.d | 196656, 16);
                x340Var.r(true);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new er2(str, str2, i, str4, qim0Var, i2, (byte) 2);
            }
        }

        public static final void s(int i, String str, b0k b0kVar, qim0 qim0Var) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(85079541);
            int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                Uri uri = Uri.parse(str);
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarR = u291.r(qim0Var3, 88.0f);
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                eso1.e(uri, isl.a, qim0VarR, (p3v) null, new zvx(), (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 3120, 0, 4064);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uo50(str, qim0Var2, i, (byte) 9);
            }
        }

        public static final void t(int i, String str, String str2, b0k b0kVar, c380 c380Var, boolean z) {
            int i2;
            String str3;
            boolean z2;
            x340 x340Var;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(-1756203582);
            j06 j06Var = x340Var2.a;
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? x340Var2.g(c380Var) : x340Var2.i(c380Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var2.g(str) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                str3 = str2;
                i2 |= x340Var2.g(str3) ? 256 : 128;
            } else {
                str3 = str2;
            }
            if ((i & 3072) == 0) {
                z2 = z;
                i2 |= x340Var2.h(z2) ? 2048 : 1024;
            } else {
                z2 = z;
            }
            if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarN = anm1.N("host-approval-sheet-header", dug.f(qim0VarF, cbx.a(x340Var2).a.a.a(), d4o1.a));
                era eraVar = een.Q0;
                b36 b36Var = h36.e;
                mbh mbhVarA = jbh.a(b36Var, eraVar, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z3 = x340Var2.S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                int i3 = i2;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(b36Var, een.N0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                cvx cvxVar = cbx.b(x340Var2).b;
                g(56 | (i3 & 14), 0, x340Var2, hcx.c, c380Var, uyn1.x(nim0Var, 8.0f));
                lee1 lee1Var = cbx.d(x340Var2).f;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                i(str, str3, z2, lee1Var, uyn1.x(qim0VarF3, 8.0f), x340Var2, (i3 >> 3) & 1022);
                x340Var = x340Var2;
                x340Var.r(true);
                x340Var.r(true);
            } else {
                x340Var = x340Var2;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hw60(c380Var, str, str2, z, i, (byte) 1);
            }
        }

        public static final void u(i2c i2cVar, ArrayList arrayList, vi11 vi11Var, vzq0 vzq0Var, b0k b0kVar, int i) {
            int i2;
            b0k b0kVar2;
            mf60 mf60Var;
            x5r x5rVar;
            w4g w4gVar;
            usb1 usb1Var;
            k7s0 k7s0Var;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(840420267);
            if ((i & 6) == 0) {
                i2 = (b0kVar3.i(i2cVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= b0kVar3.i(arrayList) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= b0kVar3.i(vi11Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= b0kVar3.i(vzq0Var) ? 2048 : 1024;
            }
            if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                float f = cvxVar.b;
                float fMin = Math.min(560.0f, ((i2cVar.d() - 32.0f) - f) / 2.0f);
                float fD = vzq0Var.d();
                float fA = vzq0Var.a();
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        mf60Var = null;
                        break;
                    } else {
                        yue1 yue1Var = (yue1) it.next();
                        mf60Var = yue1Var instanceof mf60 ? (mf60) yue1Var : null;
                    }
                } while (mf60Var == null);
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        x5rVar = null;
                        break;
                    } else {
                        yue1 yue1Var2 = (yue1) it2.next();
                        x5rVar = yue1Var2 instanceof x5r ? (x5r) yue1Var2 : null;
                    }
                } while (x5rVar == null);
                Iterator it3 = arrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        w4gVar = null;
                        break;
                    } else {
                        yue1 yue1Var3 = (yue1) it3.next();
                        w4gVar = yue1Var3 instanceof w4g ? (w4g) yue1Var3 : null;
                    }
                } while (w4gVar == null);
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        usb1Var = null;
                        break;
                    }
                    yue1 yue1Var4 = (yue1) it4.next();
                    Iterator it5 = it4;
                    usb1Var = yue1Var4 instanceof usb1 ? (usb1) yue1Var4 : null;
                    if (usb1Var != null) {
                        break;
                    } else {
                        it4 = it5;
                    }
                }
                Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        k7s0Var = null;
                        break;
                    }
                    Iterator it7 = it6;
                    yue1 yue1Var5 = (yue1) it6.next();
                    k7s0Var = yue1Var5 instanceof k7s0 ? (k7s0) yue1Var5 : null;
                    if (k7s0Var != null) {
                        break;
                    } else {
                        it6 = it7;
                    }
                }
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                era eraVar = een.Q0;
                d36 d36Var = new d36(16.0f, true, new um5(false));
                zzq0 zzq0VarJ = uyn1.j(0.0f, fD, 0.0f, fA, 5);
                boolean zI = b0kVar3.i(mf60Var) | b0kVar3.i(vi11Var) | b0kVar3.d(fMin) | b0kVar3.d(f) | b0kVar3.i(cvxVar) | b0kVar3.i(x5rVar) | b0kVar3.i(w4gVar) | b0kVar3.i(usb1Var) | b0kVar3.i(k7s0Var);
                Object objT = b0kVar3.T();
                if (zI || objT == fkj0.X) {
                    n3f0 n3f0Var = new n3f0(mf60Var, vi11Var, fMin, f, cvxVar, x5rVar, w4gVar, usb1Var, k7s0Var);
                    b0kVar3.s0(n3f0Var);
                    objT = n3f0Var;
                }
                b0kVar2 = b0kVar3;
                ujo1.d(qim0VarF, null, zzq0VarJ, false, d36Var, eraVar, null, false, null, (iu30) objT, b0kVar2, 0, 458);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new uoc1(i, i2cVar, arrayList, vi11Var, vzq0Var, (byte) 5);
            }
        }

        public static final void v(ArrayList arrayList, vi11 vi11Var, vzq0 vzq0Var, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1425243358);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(arrayList) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(vi11Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(vzq0Var) ? 256 : 128;
            }
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                w2g0.c((qim0) null, (tl3) null, apo.r(-331011316, new nu31(arrayList, vi11Var, vzq0Var, (byte) 27), x340Var), x340Var, 3072, 7);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cyc1(arrayList, vi11Var, vzq0Var, i, (byte) 1);
            }
        }

        public static final ArrayList w(ArrayList arrayList, Collection collection, ov30 ov30Var) {
            a8b0 a8b0VarG;
            arrayList.size();
            collection.size();
            ArrayList<mmr0> arrayListV1 = o7h.v1(arrayList, collection);
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayListV1, 10));
            for (mmr0 mmr0Var : arrayListV1) {
                a8b0 a8b0Var = (a8b0) mmr0Var.a;
                tsi1 tsi1Var = (tsi1) mmr0Var.b;
                int i = tsi1Var.g;
                fg5 annotations = tsi1Var.getAnnotations();
                ajn0 name = tsi1Var.getName();
                boolean zY1 = tsi1Var.y1();
                boolean z = tsi1Var.i;
                boolean z2 = tsi1Var.t;
                if (tsi1Var.X != null) {
                    int i2 = kht.a;
                    a8b0VarG = iht.c(ov30Var).e().g(a8b0Var);
                } else {
                    a8b0VarG = null;
                }
                arrayList2.add(new tsi1(ov30Var, (tsi1) null, i, annotations, name, a8b0Var, zY1, z, z2, a8b0VarG, tsi1Var.getSource()));
            }
            return arrayList2;
        }

        public static final HashSet x(uz7 uz7Var, tto1 tto1Var) {
            return (((uz7Var.g > 0L ? 1 : (uz7Var.g == 0L ? 0 : -1)) > 0) || uz7Var.d || !uz7Var.e) ? Effects.a(new tto1[0]) : Effects.a(new tto1[]{tto1Var});
        }

        public static final brb0 z(beg begVar) {
            beg begVar2;
            int i = kht.a;
            Iterator it = begVar.m().t0().d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    begVar2 = null;
                    break;
                }
                a8b0 a8b0Var = (a8b0) it.next();
                if (!g6b0.y(a8b0Var)) {
                    jfg jfgVarS = a8b0Var.t0().s();
                    if (iht.l(jfgVarS, 1) || iht.l(jfgVarS, 3)) {
                        begVar2 = (beg) jfgVarS;
                        break;
                    }
                }
            }
            if (begVar2 == null) {
                return null;
            }
            zpi0 zpi0VarA0 = begVar2.a0();
            brb0 brb0Var = zpi0VarA0 instanceof brb0 ? (brb0) zpi0VarA0 : null;
            return brb0Var == null ? z(begVar2) : brb0Var;
        }

        public e8b0 D(e8b0 e8b0Var) {
            return e8b0Var;
        }

        public long y() {
            long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
            return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
        }

        public void A(x7o x7oVar) {
        }

        public void C(long j, z7o z7oVar) {
        }

        public void B(long j, w7o w7oVar, k1e k1eVar) {
        }
    }

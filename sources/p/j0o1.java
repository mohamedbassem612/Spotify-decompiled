package p;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.LocaleList;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.meet.addons.AddonException;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class j0o1 {
    public static final h661[] a = new h661[0];
    public static b180 b;

    public static int A(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int B(Object obj) {
        return A(obj == null ? 0 : obj.hashCode());
    }

    public static final h3h1 C(op80 op80Var) {
        return op80Var.a(a2x0.V0);
    }

    public static AddonException D(m02 m02Var) {
        Optional.empty();
        return new AddonException(null, m02Var);
    }

    public static AddonException E(String str, String str2) {
        Optional.of(new e2o1(str2));
        return new AddonException(str, m02.b);
    }

    public static final void a(boolean z, vtp vtpVar, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-284876664);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(vtpVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new nfk0(iu30Var, (byte) 19);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z3 = i3 == 256;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new nfk0(iu30Var, (byte) 20);
                x340Var.s0(objT2);
            }
            otw.c(vtpVar.a(function0, (Function0) objT2, rrn1.B(x340Var)), new e1o0(z), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(z, (Object) vtpVar, (Object) iu30Var, i, (byte) 8);
        }
    }

    public static final void b(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-932836462);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            op71.g(x340Var, exd0.q(qim0Var, iu30Var));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(qim0Var, iu30Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d9  */
    public static final void c(String str, gbx gbxVar, qim0 qim0Var, hux huxVar, fhm fhmVar, String str2, List list, max maxVar, long j, long j2, boolean z, boolean z2, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        int i2;
        qim0 qim0Var3;
        n4d1 n4d1Var;
        xu30 xu30Var;
        j2i j2iVar;
        j2i j2iVarZ;
        j2i j2iVarZ2;
        Object next;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-365788572);
        int i3 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(gbxVar) ? 32 : 16) | 3456 | (b0kVar3.i(huxVar) ? 16384 : 8192) | (b0kVar3.g(fhmVar) ? 131072 : 65536) | (b0kVar3.g(str2) ? 1048576 : 524288) | 104857600 | (b0kVar3.i(list) ? 536870912 : 268435456);
        int i4 = (b0kVar3.g(maxVar) ? 4 : 2) | (b0kVar3.f(j) ? 32 : 16) | (b0kVar3.f(j2) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.h(z2) ? 16384 : 8192);
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 9363) == 9362) ? false : true)) {
            b0kVar3.d0();
            int i5 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i5 == 0 || b0kVar3.E()) {
                i2 = i3 & (-29360129);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar3.b0();
                i2 = i3 & (-29360129);
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((n4d1) next) instanceof m4d1));
                n4d1Var = (n4d1) next;
            } else {
                n4d1Var = null;
            }
            List list2 = list == null ? z6x.a : list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                int i6 = i4;
                n4d1 n4d1Var2 = (n4d1) obj;
                if (z2 || !(n4d1Var2 instanceof m4d1)) {
                    arrayList.add(obj);
                }
                i4 = i6;
            }
            int i7 = i4;
            boolean z3 = !z2 && u890.j(n4d1Var, new m4d1(1));
            boolean zA = ef.b(b0kVar3).a();
            b0kVar3.i0(-874261895);
            b0kVar3.r(false);
            qim0 qim0VarN = anm1.N("ContextMenuItem", qim0Var4);
            boolean zG = ((((i2 & 3670016) ^ 1572864) > 1048576 && b0kVar3.g(str2)) || (i2 & 1572864) == 1048576) | b0kVar3.g((Object) null);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new kak(str2, (byte) 17);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarThen = s161.b(qim0VarN, true, (iu30) objT).then(qim0Var3);
            if (zA) {
                xu30Var = null;
                if (z3) {
                    j2iVarZ2 = wfi.a;
                } else {
                    j2iVar = null;
                    j2iVarZ = i9p1.z(arrayList, null);
                }
                if (z3 && !zA) {
                    j2iVar = wfi.b;
                }
                j2i j2iVar2 = j2iVar;
                if (zA) {
                    b0kVar3.i0(-872494770);
                    b0kVar3.i0(-872494771);
                    b0kVar3.r(false);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(-872535815);
                    b0kVar3.r(false);
                }
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarThen, null, maxVar, false, null, null, gbxVar, null, apo.r(-1881756562, new y1g(arrayList, huxVar, fhmVar, j2, z), b0kVar3), null, null, j2iVarZ, j2iVar2, xu30Var, null, apo.r(-719126872, new no9((Object) arrayList, (Object) str, j, (byte) 3), b0kVar3), b0kVar2, ((i7 << 6) & 896) | 100663296 | ((i2 << 15) & 3670016), 196608, 18106);
                qim0Var2 = qim0Var3;
            } else {
                xu30Var = null;
                j2iVarZ2 = i9p1.z(arrayList, null);
            }
            j2iVarZ = j2iVarZ2;
            j2iVar = null;
            if (z3) {
                j2iVar = wfi.b;
            }
            j2i j2iVar3 = j2iVar;
            if (zA) {
                b0kVar3.i0(-872535815);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-872494770);
                b0kVar3.i0(-872494771);
                b0kVar3.r(false);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarThen, null, maxVar, false, null, null, gbxVar, null, apo.r(-1881756562, new y1g(arrayList, huxVar, fhmVar, j2, z), b0kVar3), null, null, j2iVarZ, j2iVar3, xu30Var, null, apo.r(-719126872, new no9((Object) arrayList, (Object) str, j, (byte) 3), b0kVar3), b0kVar2, ((i7 << 6) & 896) | 100663296 | ((i2 << 15) & 3670016), 196608, 18106);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new thm(str, gbxVar, qim0Var2, huxVar, fhmVar, str2, list, maxVar, j, j2, z, z2, i);
        }
    }

    public static final void d(fhm fhmVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(181474619);
        int i2 = (x340Var.g(fhmVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                LayerDrawable layerDrawable = fhmVar.a.a;
                yk4 yk4Var = new yk4(mno1.y(layerDrawable, layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888));
                x340Var.s0(yk4Var);
                objT = yk4Var;
            }
            yk4 yk4Var2 = (yk4) objT;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            eso1.f(yk4Var2, isl.a, u291.r(nim0.a, 24.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 48, 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h1m(fhmVar, i, (byte) 7);
        }
    }

    public static final void e(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar4;
        j2i j2iVar5;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1046154072);
        int i2 = i | (b0kVar3.h(z) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            j2iVar4 = j2iVar;
            j2iVar5 = j2iVar2;
            b0kVar2 = b0kVar3;
            cgj1.n((qim0) null, (vu30) null, (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, (erl1) null, apo.r(-244609495, new tf(j2iVar4, j2iVar5, j2iVar3, z), b0kVar3), b0kVar2, 805306368, 511);
            qim0Var2 = nim0.a;
        } else {
            j2iVar4 = j2iVar;
            j2iVar5 = j2iVar2;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x1o0(j2iVar4, j2iVar5, j2iVar3, z, qim0Var2, i, (byte) 0);
        }
    }

    public static final void f(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(415562809);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(j2iVar) ? 4 : 2) | (x340Var.i(j2iVar2) ? 32 : 16) | (x340Var.i(j2iVar3) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (0.4f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarC = u291.c(new wnb0(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true), 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarC, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.e, 7);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            dv20.l(i2 & 14, j2iVar, x340Var, true);
            if (0.6f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true);
            era eraVar = een.Q0;
            b36 b36Var = h36.e;
            mbh mbhVarA = jbh.a(b36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = kx40.h(1.0f, l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14), true);
            mbh mbhVarA2 = jbh.a(b36Var, eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j2iVar4 = j2iVar2;
            dv20.l((i2 >> 3) & 14, j2iVar4, x340Var, true);
            qim0 qim0VarB2 = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.e, 7);
            gfh0 gfh0VarC2 = t1c.c(een.t, false);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            k4s0.i((i2 >> 6) & 14, j2iVar3, x340Var, true, true);
            x340Var.r(true);
        } else {
            j2iVar4 = j2iVar2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ssh(j2iVar, j2iVar4, j2iVar3, qim0Var, i, (byte) 1);
        }
    }

    public static final void g(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(383363347);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(j2iVar) ? 4 : 2) | (x340Var.i(j2iVar2) ? 32 : 16) | (x340Var.i(j2iVar3) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            f36 f36Var = h36.e;
            f36 f36Var2 = z ? h36.c : f36Var;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = kx40.h(1.0f, l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14), true);
            mbh mbhVarA2 = jbh.a(f36Var2, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j2iVar.invoke(x340Var, Integer.valueOf(i2 & 14));
            uwr uwrVar = cbx.a;
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.d));
            dv20.l((i2 >> 3) & 14, j2iVar2, x340Var, true);
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.e, 7);
            gfh0 gfh0VarC = t1c.c(een.t, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            j2iVar4 = j2iVar3;
            k4s0.i(14 & (i2 >> 6), j2iVar4, x340Var, true, true);
        } else {
            j2iVar4 = j2iVar3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x1o0(j2iVar, j2iVar2, j2iVar4, z, qim0Var, i, (byte) 1);
        }
    }

    public static final void h(mya0 mya0Var, String str, shg1 shg1Var, iu30 iu30Var, vzq0 vzq0Var, es41 es41Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        String str2;
        shg1 shg1Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        yxa0 yxa0Var = mya0Var.e;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(940613503);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(mya0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(shg1Var) : b0kVar3.i(shg1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            vzq0Var2 = vzq0Var;
            i2 |= b0kVar3.i(vzq0Var2) ? 16384 : 8192;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(es41Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            float fA = vzq0Var2.a();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.d(uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, fA, 2), 1.0f), es41Var, false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarH);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            float fD = vzq0Var2.d();
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            op71.g(b0kVar3, u291.r(qim0Var3, fD + 16.0f));
            String strO0 = cwl1.o0(b0kVar3, 2131957089);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.e, een.Z, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarF);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            String str3 = mya0Var.d;
            Uri uri = str3 != null ? Uri.parse(str3) : Uri.EMPTY;
            uri.getClass();
            String str4 = mya0Var.c;
            boolean zG = b0kVar3.g(strO0);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new ry40(strO0, (byte) 25);
                b0kVar3.s0(objT);
            }
            bmq0.a(uri, s161.b(qim0Var3, true, (iu30) objT), hcx.d, str4, (String) null, 0L, 0L, false, b0kVar3, 384, 240);
            b0kVar3.r(true);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            op71.g(b0kVar3, u291.r(qim0Var3, 8.0f));
            String str5 = mya0Var.c;
            lee1 lee1Var = cbx.d(b0kVar3).e;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            uwo1.e(str5, uyn1.z(16.0f, 0.0f, 2, qim0VarF2), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2024);
            uwo1.e(kk0.j(cbx.b(b0kVar3).b.a, 2131957090, b0kVar3, b0kVar3, qim0Var3), null, cbx.d(b0kVar3).j, 0L, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2042);
            cvx cvxVar6 = cbx.b(b0kVar3).b;
            uwo1.e(kk0.j(16.0f, 2131957078, b0kVar3, b0kVar3, qim0Var3), null, cbx.d(b0kVar3).j, 0L, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2042);
            l4p1.f(0, cwl1.o0(b0kVar3, 2131957080), b0kVar3, null);
            l4p1.f(0, cwl1.o0(b0kVar3, 2131957079), b0kVar3, null);
            cvx cvxVar7 = cbx.b(b0kVar3).b;
            String strJ = kk0.j(16.0f, 2131957086, b0kVar3, b0kVar3, qim0Var3);
            String strN0 = cwl1.n0(2131957085, new Object[]{strJ}, b0kVar3);
            zma1 zma1Var = cbx.d(b0kVar3).k.a;
            boolean zG2 = b0kVar3.g(strN0) | b0kVar3.g(strJ) | b0kVar3.g(zma1Var);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                String strSubstring = strN0.substring(0, ihc1.w0(strN0, strJ, 0, false, 6));
                String strSubstring2 = strN0.substring(strJ.length() + strSubstring.length(), strN0.length());
                ye5 ye5Var = new ye5();
                ye5Var.g(strSubstring);
                int iO = ye5Var.o(zma1Var);
                try {
                    ye5Var.g(strJ);
                    ye5Var.k(iO);
                    ye5Var.g(strSubstring2);
                    objT2 = ye5Var.p();
                    b0kVar3.s0(objT2);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            }
            uwo1.f((af5) objT2, null, cbx.d(b0kVar3).j, null, null, null, 0, false, null, 0, null, null, b0kVar3, 0, 0, 4090);
            cvx cvxVar8 = cbx.b(b0kVar3).b;
            uwo1.e(kk0.j(16.0f, 2131957088, b0kVar3, b0kVar3, qim0Var3), null, cbx.d(b0kVar3).j, 0L, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2042);
            cvx cvxVar9 = cbx.b(b0kVar3).b;
            uwo1.e(kk0.j(16.0f, 2131957092, b0kVar3, b0kVar3, qim0Var3), null, cbx.d(b0kVar3).j, 0L, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2042);
            b0kVar2 = b0kVar3;
            op71.g(b0kVar2, u291.r(qim0Var3, cbx.b(b0kVar2).b.a));
            str2 = str;
            shg1Var2 = shg1Var;
            s110.d(yxa0Var, apo.r(898651827, new qya0(shg1Var2, str2, iu30Var, (byte) 0), b0kVar2), b0kVar2, 48);
            op71.g(b0kVar2, u291.r(qim0Var3, cbx.b(b0kVar2).b.a));
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && b0kVar2.i(shg1Var2)));
            Object objT3 = b0kVar2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new rya0(shg1Var2, iu30Var, (byte) 0);
                b0kVar2.s0(objT3);
            }
            n9p1.c((iu30) objT3, yxa0Var, qim0VarF3, b0kVar2, 0);
            cvx cvxVar10 = cbx.b(b0kVar2).b;
            ywx0.n(qim0Var3, 16.0f, b0kVar2, true);
            qim0Var2 = qim0Var3;
        } else {
            str2 = str;
            shg1Var2 = shg1Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3((Object) mya0Var, (Object) str2, (Object) shg1Var2, iu30Var, (Object) vzq0Var, (Object) es41Var, (Object) qim0Var2, i, (byte) 7);
        }
    }

    public static final void i(mya0 mya0Var, String str, shg1 shg1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1790464461);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(mya0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(shg1Var) : b0kVar3.i(shg1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            k2t0 k2t0VarV = kkn.v(ti5.g(b0kVar3), b0kVar3);
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            j2t0 j2t0Var = k2t0VarV.c;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            qim0Var2 = qim0Var3;
            cgj1.n(bmq0.L(qim0Var3, j2t0Var, (g6o0) null), apo.r(-868430959, new vx90(k2t0VarV, iu30Var, (byte) 6), b0kVar3), (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, (erl1) null, apo.r(675998748, new tya0(mya0Var, str2, shg1Var, iu30Var, es41VarC), b0kVar3), b0kVar2, 805306416, 508);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 26, i, mya0Var, str, shg1Var, qim0Var2, iu30Var);
        }
    }

    public static final void j(String str, c380 c380Var, b0k b0kVar, int i) {
        String str2;
        c380 c380Var2;
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1150449708);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(c380Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, anm1.N("mainTitle", uyn1.z(16.0f, 0.0f, 2, nim0Var)), cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2016);
            str2 = str;
            d36 d36Var = new d36(ywx0.k(nim0Var, cbx.b(x340Var).b.a, x340Var, x340Var).b.a, true, new um5(false));
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            mbh mbhVarA2 = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            c380Var2 = c380Var;
            Iterator itN = kk0.n(x340Var, qim0VarE2, lljVar4, 1093202666, c380Var2);
            while (itN.hasNext()) {
                u3o0 u3o0Var = (u3o0) itN.next();
                hux huxVar = u3o0Var.a;
                String str3 = u3o0Var.b;
                String str4 = u3o0Var.c;
                uwr uwrVar2 = cbx.a;
                l(huxVar, str3, str4, uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, nim0Var), x340Var, 8);
            }
            b2 = 2;
            us71.m(x340Var, false, true, true);
        } else {
            str2 = str;
            c380Var2 = c380Var;
            b2 = 2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f850(str2, c380Var2, i, b2);
        }
    }

    public static final void k(v3o0 v3o0Var, vtp vtpVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1876613730);
        int i2 = (x340Var.i(v3o0Var) ? 4 : 2) | i | (x340Var.g(vtpVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            e(apo.r(869827936, new y1o0(v3o0Var, (byte) 0), x340Var), apo.r(735245247, new y1o0(v3o0Var, (byte) 1), x340Var), apo.r(600662558, new z1o0(v3o0Var, vtpVar, iu30Var), x340Var), v3o0Var.f, null, x340Var, 438);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z1o0(v3o0Var, vtpVar, iu30Var, i);
        }
    }

    public static final void l(hux huxVar, String str, String str2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(658043485);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, 56 | (i2 & 14), 56);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, anm1.N("sectionTitle", c13.k(nim0Var, 8.0f, x340Var, 1.0f, true)), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2032);
            x340Var.r(true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            uwo1.e(str2, anm1.N("sectionSubtitle", nim0Var), cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, (i2 >> 6) & 14, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, huxVar, str, str2, qim0Var, (byte) 29);
        }
    }

    public static final void m(String str, iu30 iu30Var, String str2, qim0 qim0Var, boolean z, boolean z2, boolean z3, lee1 lee1Var, kua0 kua0Var, bua0 bua0Var, boolean z4, int i, int i2, elk1 elk1Var, b0k b0kVar, int i3) {
        int i4;
        x340 x340Var;
        bua0 bua0Var2;
        int i5;
        int i6;
        elk1 elk1Var2;
        bua0 bua0Var3;
        int i7;
        int i8;
        elk1 elk1Var3;
        int i9;
        long jA;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1579551130);
        if ((i3 & 6) == 0) {
            i4 = (x340Var2.g(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var2.g(str2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var2.i(qim0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= x340Var2.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= x340Var2.h(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= x340Var2.i(lee1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= x340Var2.i(kua0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= 268435456;
        }
        if (x340Var2.Y(i4 & 1, (306783379 & i4) != 306783378)) {
            x340Var2.d0();
            if ((i3 & 1) == 0 || x340Var2.E()) {
                bua0Var3 = bua0.d;
                i7 = i4 & (-1879048193);
                i8 = z4 ? 1 : Integer.MAX_VALUE;
                elk1Var3 = m9x0.X0;
                i9 = 1;
            } else {
                x340Var2.b0();
                i7 = i4 & (-1879048193);
                bua0Var3 = bua0Var;
                i8 = i;
                i9 = i2;
                elk1Var3 = elk1Var;
            }
            x340Var2.s();
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var2.i0(1825204771);
                uwr uwrVar = cbx.a;
                jA = cbx.a(x340Var2).a.a.c();
                x340Var2.r(false);
            } else {
                x340Var2.i0(1825206782);
                uwr uwrVar2 = cbx.a;
                jA = cbx.a(x340Var2).a.a.a();
                x340Var2.r(false);
            }
            qim0 qim0VarF = dug.f(qim0Var, jA, er31.b(4.0f));
            if (z) {
                x340Var2.i0(1825211714);
                j = cbx.a(x340Var2).b.d;
                x340Var2.r(false);
            } else {
                x340Var2.i0(1825212357);
                x340Var2.r(false);
                j = u7h.j;
            }
            qim0 qim0VarE = d1u.E(2.0f, j, qim0VarF, er31.b(4.0f));
            boolean zI = x340Var2.i(ven0Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new aya1(ven0Var, (byte) 2);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarX = uyn1.x(bin.x(qim0VarE, false, null, null, null, (Function0) objT2, 15), 16.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE2, x340Var2, y580.Y);
            n6a1 n6a1Var = new n6a1(cbx.a(x340Var2).b.c);
            qim0 qim0VarA = u291.a(nim0.a, 280.0f, 56.0f);
            boolean zI2 = x340Var2.i(ven0Var);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new ry71(ven0Var, (byte) 9);
                x340Var2.s0(objT3);
            }
            int i10 = i7 & 126;
            int i11 = i7 >> 6;
            int i12 = i10 | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016);
            bua0 bua0Var4 = bua0Var3;
            int i13 = i8;
            xea.a(str, iu30Var, cev0.G(qim0VarA, (iu30) objT3), z2, z3, lee1Var, kua0Var, bua0Var4, false, i13, i9, elk1Var3, (iu30) null, (idn0) null, n6a1Var, apo.r(-989717513, new xo6(str, str2, (byte) 13), x340Var2), x340Var2, i12, 196614, 12544);
            x340Var = x340Var2;
            x340Var.r(true);
            i5 = i13;
            i6 = i9;
            elk1Var2 = elk1Var3;
            bua0Var2 = bua0Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            bua0Var2 = bua0Var;
            i5 = i;
            i6 = i2;
            elk1Var2 = elk1Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bre(str, iu30Var, str2, qim0Var, z, z2, z3, lee1Var, kua0Var, bua0Var2, z4, i5, i6, elk1Var2, i3);
        }
    }

    public static final void n(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-812757094);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            eso1.h(i3o1.n(i, x340Var, i3 & 14), isl.a, u291.f(nim0.a, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.S0, een.h, (ColorFilter) null, x340Var, 224312, 256);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 5, i, i2);
        }
    }

    public static final boolean o(vir0 vir0Var, w7u0 w7u0Var) {
        int iOrdinal = w7u0Var.ordinal();
        if (iOrdinal == 0) {
            return vir0Var instanceof sir0;
        }
        if (iOrdinal == 1) {
            return (vir0Var instanceof sir0) || (vir0Var instanceof uir0);
        }
        if (iOrdinal == 2) {
            return true;
        }
        eg.o();
        return false;
    }

    public static final Set p(h661 h661Var) {
        if (h661Var instanceof mtc) {
            return ((mtc) h661Var).a();
        }
        HashSet hashSet = new HashSet(h661Var.d());
        int iD = h661Var.d();
        for (int i = 0; i < iD; i++) {
            hashSet.add(h661Var.e(i));
        }
        return hashSet;
    }

    public static final h661[] q(List list) {
        h661[] h661VarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (h661VarArr = (h661[]) list.toArray(new h661[0])) == null) ? a : h661VarArr;
    }

    public static final c021 r(svz0 svz0Var) {
        Integer num;
        c021 c021Var = new c021(10, 0);
        m67 m67Var = (m67) svz0Var.b.get("remote-configuration-client-android:reconnect_throttle_seconds");
        return new c021((m67Var == null || (num = m67Var.d) == null) ? c021Var.a() : num.intValue(), 0);
    }

    public static final lz11 s(Transport transport) {
        return new lz11(transport);
    }

    public static LocaleList t(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static final tka0 u(oma0 oma0Var) {
        tka0 tka0VarK = oma0Var.k();
        if (tka0VarK instanceof tka0) {
            return tka0VarK;
        }
        if (!(tka0VarK instanceof qma0)) {
            hhg1.g(tka0VarK, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + tka0VarK + " from generic non-reified function. Such functionality cannot be supported because " + tka0VarK + " is erased, either specify serializer explicitly or make calling function inline with reified " + tka0VarK + '.');
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    public static final Next v(z551 z551Var) {
        z2g0 z2g0Var;
        String str;
        String str2;
        z551 z551VarA;
        h1z0 h1z0Var;
        fw41 fw41Var;
        e7r0 e7r0Var;
        re20 re20Var;
        boolean z;
        gyh gyhVar;
        List list;
        xo20 xo20Var;
        gyh gyhVar2;
        gyh gyhVar3;
        a951 a951Var = z551Var.d;
        if (!(a951Var instanceof a951)) {
            return Next.j();
        }
        klr0 klr0Var = z551Var.g;
        if (!(klr0Var instanceof klr0)) {
            if (klr0Var instanceof jlr0) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        boolean z2 = klr0Var.b;
        riq0 riq0Var = a951Var.a;
        if (z2) {
            return Next.j();
        }
        if (z2) {
            eg.o();
            return null;
        }
        String str3 = "";
        if (!(riq0Var instanceof riq0)) {
            if (!(riq0Var instanceof qiq0)) {
                eg.o();
                return null;
            }
            k851 k851Var = (k851) o7h.C0(((qiq0) riq0Var).b);
            if (k851Var == null || (z2g0Var = k851Var.b) == null || (str = z2g0Var.b) == null) {
            }
            if (str.length() == 0) {
                return Next.h(z551.a(z551Var, (String) null, (String) null, 0, (f951) null, (val) null, (fw41) null, new klr0(str, true), (ue20) null, (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32703));
            }
            str2 = str;
            z551VarA = z551.a(z551Var, (String) null, (String) null, 0, (f951) null, (val) null, (fw41) null, new klr0(str, z2), (ue20) null, (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32703);
            h1z0Var = z551Var.N0;
            fw41Var = z551VarA.f;
            e7r0Var = z551VarA.Y;
            re20Var = z551Var.h;
            z = re20Var instanceof re20;
            gyhVar = gyh.b;
            if (z) {
                xo20Var = re20Var.a;
                if (xo20Var == null) {
                    return w(z551VarA, str2);
                }
                String str4 = z551VarA.a;
                String str5 = e7r0Var.a;
                int i = fw41Var.d;
                gyhVar2 = h1z0Var.a;
                if (gyhVar2 == null) {
                    gyhVar3 = gyhVar;
                } else {
                    gyhVar3 = gyhVar2;
                }
                return Next.i(z551VarA, Effects.a(new qx41[]{new qx41(str4, str5, xo20Var, str2, i, (tv80) null, gyhVar3, fw41Var.c, (List) null)}));
            }
            if (re20Var instanceof te20) {
                if (re20Var instanceof se20) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            if (riq0Var instanceof riq0) {
                return w(z551VarA, str2);
            }
            if (riq0Var instanceof qiq0) {
                eg.o();
                return null;
            }
            qiq0 qiq0Var = (qiq0) riq0Var;
            list = qiq0Var.c;
            if (list != null || !o7h.p1(list).equals(o7h.p1(((te20) re20Var).b()))) {
                return Next.j();
            }
            String str6 = z551VarA.a;
            String str7 = e7r0Var.a;
            xo20 xo20Var2 = qiq0Var.a;
            int i2 = fw41Var.d;
            gyh gyhVar4 = h1z0Var.a;
            return Next.i(z551VarA, Effects.a(new qx41[]{new qx41(str6, str7, xo20Var2, str2, i2, (tv80) null, gyhVar4 == null ? gyhVar : gyhVar4, fw41Var.c, list)}));
        }
        List list2 = riq0Var.a;
        int size = list2.size();
        if (size > 0) {
            str3 = ((k851) list2.get(size - 1)).b.b;
        }
        str = str3;
        if (str.length() == 0) {
            return Next.h(z551.a(z551Var, (String) null, (String) null, 0, (f951) null, (val) null, (fw41) null, new klr0(str, true), (ue20) null, (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32703));
        }
        str2 = str;
        z551VarA = z551.a(z551Var, (String) null, (String) null, 0, (f951) null, (val) null, (fw41) null, new klr0(str, z2), (ue20) null, (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32703);
        h1z0Var = z551Var.N0;
        fw41Var = z551VarA.f;
        e7r0Var = z551VarA.Y;
        re20Var = z551Var.h;
        z = re20Var instanceof re20;
        gyhVar = gyh.b;
        if (z) {
            xo20Var = re20Var.a;
            if (xo20Var == null) {
                return w(z551VarA, str2);
            }
            String str8 = z551VarA.a;
            String str9 = e7r0Var.a;
            int i3 = fw41Var.d;
            gyhVar2 = h1z0Var.a;
            if (gyhVar2 == null) {
                gyhVar3 = gyhVar;
            } else {
                gyhVar3 = gyhVar2;
            }
            return Next.i(z551VarA, Effects.a(new qx41[]{new qx41(str8, str9, xo20Var, str2, i3, (tv80) null, gyhVar3, fw41Var.c, (List) null)}));
        }
        if (re20Var instanceof te20) {
            if (re20Var instanceof se20) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (riq0Var instanceof riq0) {
            return w(z551VarA, str2);
        }
        if (riq0Var instanceof qiq0) {
            eg.o();
            return null;
        }
        qiq0 qiq0Var2 = (qiq0) riq0Var;
        list = qiq0Var2.c;
        if (list != null) {
        }
        return Next.j();
    }

    public static final Next w(z551 z551Var, String str) {
        String str2 = z551Var.a;
        String str3 = z551Var.Y.a;
        fw41 fw41Var = z551Var.f;
        return Next.i(z551Var, Effects.a(new rx41[]{new rx41(str2, str3, str, fw41Var.d, z551Var.N0.a, (tv80) null, fw41Var.c, 32)}));
    }

    public static final ObjectAnimator x(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
    }

    public static final ObjectAnimator y(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
    }

    public static void z(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}

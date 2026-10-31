package p;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.ParserException;
import com.spotify.element.core.ElementCrashContextException;
import com.spotify.player.model.PlayerState;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class loo1 {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    public static b180 c;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static o4t A(int i, fc10 fc10Var, izr0 izr0Var) throws ParserException {
        o4t o4tVarF = o4t.f(fc10Var, izr0Var);
        while (true) {
            int i2 = o4tVarF.a;
            if (i2 == i) {
                return o4tVarF;
            }
            td6.p(i2, "Ignoring unknown WAV chunk: ");
            long j = o4tVarF.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.d("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            fc10Var.u((int) j2);
            o4tVarF = o4t.f(fc10Var, izr0Var);
        }
    }

    public static final float B(int i) {
        float f = i / 255.0f;
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final qtg C(jjo0 jjo0Var) {
        if (jjo0Var instanceof ijo0) {
            ijo0 ijo0Var = (ijo0) jjo0Var;
            return new g690(ijo0Var.d, new WeakReference(ijo0Var.e), ijo0Var.f, ijo0Var.g);
        }
        if (jjo0Var instanceof hjo0) {
            hjo0 hjo0Var = (hjo0) jjo0Var;
            return new f690(hjo0Var.d, new WeakReference(hjo0Var.e), hjo0Var.f, hjo0Var.g);
        }
        eg.o();
        return null;
    }

    public static final int D(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 1;
        }
        if (iC == 1) {
            return 2;
        }
        if (iC == 2) {
            return 3;
        }
        if (iC == 3) {
            return 4;
        }
        eg.o();
        return 0;
    }

    public static String E(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) "\n");
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            return sb.toString();
        } catch (IOException e) {
            eg.f(e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0311  */
    public static final void a(jre jreVar, g9m g9mVar, lz71 lz71Var, nu nuVar, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, Function0 function0, Function0 function1, Function0 function2, boolean z, boolean z2, boolean z3, boolean z4, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1293772769);
        j06 j06Var = x340Var.a;
        int i5 = i | (x340Var.i(jreVar) ? 4 : 2) | (x340Var.i(g9mVar) ? 32 : 16) | (x340Var.i(lz71Var) ? 256 : 128) | (x340Var.i(nuVar) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 131072 : 65536) | (x340Var.i(function0) ? 8388608 : 4194304) | (x340Var.i(function1) ? 67108864 : 33554432) | (x340Var.i(function2) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var.h(z) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.h(z4) ? 2048 : 1024;
        }
        int i6 = i3;
        if (x340Var.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            boolean z5 = jreVar instanceof gre;
            cr31 cr31VarA = (z5 || (z2 && ((jreVar instanceof ire) || (jreVar instanceof dre)))) ? er31.a(50) : er31.b(20.0f);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF2 = dug.f(sto1.o(qim0VarF, 12.0f, cr31VarA, false, 0L, 0L, 24), cbx.a(x340Var).a.a.c(), cr31VarA);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("ChatBubbleBar.Root", qim0VarF2.then(z5 ? qim0Var2 : i1p1.q(qim0Var2, cr31VarA)));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
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
            if (jreVar instanceof fre) {
                x340Var.i0(720679429);
                x340Var.r(false);
            } else {
                if (jreVar instanceof ere) {
                    x340Var.i0(1685817351);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0 qim0VarX = uyn1.x(qim0Var2, 12.0f);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
                    ktd.s(j2iVar, x340Var, 6, true, false);
                } else if (z5) {
                    x340Var.i0(1685821452);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 12.0f, 1, qim0Var2);
                    gfh0 gfh0VarC3 = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    ktd.s(j2iVar2, x340Var, 6, true, false);
                } else if (jreVar instanceof ire) {
                    x340Var.i0(1685826763);
                    int i7 = i6 << 12;
                    n(((ire) jreVar).a, lz71Var, nuVar, function2, function1, z2, z3, x340Var, ((i5 >> 3) & 1008) | ((i5 >> 18) & 7168) | (57344 & (i5 >> 12)) | (458752 & i7) | (3670016 & i7));
                    x340Var.r(false);
                } else if (jreVar instanceof dre) {
                    x340Var.i0(1685839560);
                    int iC = l1d.C(((dre) jreVar).a);
                    if (iC == 0) {
                        i4 = 2131952115;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return;
                        }
                        i4 = 2131952114;
                    }
                    String strO0 = cwl1.o0(x340Var, i4);
                    int i8 = i5 >> 3;
                    int i9 = i6 << 12;
                    n(strO0, lz71Var, nuVar, null, function1, z2, z3, x340Var, (i8 & 896) | (i8 & 112) | 3072 | (57344 & (i5 >> 12)) | (458752 & i9) | (3670016 & i9));
                    x340Var.r(false);
                } else {
                    if (!(jreVar instanceof hre)) {
                        throw p3d1.k(x340Var, 1685815877, false);
                    }
                    x340Var.i0(1685861503);
                    j((hre) jreVar, g9mVar, function0, z, j2iVar, x340Var, (i5 & 126) | ((i5 >> 15) & 896) | ((i6 << 9) & 7168) | 24576);
                    x340Var.r(false);
                }
                if (z4 || !((jreVar instanceof ire) || (jreVar instanceof dre))) {
                    x340Var.i0(722520519);
                    x340Var.r(false);
                } else {
                    x340Var.i0(722459015);
                    i541.c(h2c.a.b(qim0Var2), x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(true);
            }
            if (z4) {
                x340Var.i0(722520519);
                x340Var.r(false);
            } else {
                x340Var.i0(722520519);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new voe(jreVar, g9mVar, lz71Var, nuVar, j2iVar, qim0Var, j2iVar2, function0, function1, function2, z, z2, z3, z4, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, boolean z, qim0 qim0Var, String str2, boolean z2, Function0 function4, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        String str3;
        String strO0;
        int i2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-881098261);
        int i3 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192) | (x340Var.i(function2) ? 131072 : 65536) | (x340Var.i(function3) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304) | 369098752;
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (((x340Var.h(z2) ? (char) 4 : (char) 2) | (x340Var.i(function4) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                strO0 = cwl1.o0(x340Var, 2131952118);
                i2 = i3 & (-1879048193);
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                strO0 = str2;
                i2 = i3 & (-1879048193);
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            int i4 = i2 & 14;
            y7e1 y7e1VarD = c4p1.D(i4, 2, str, x340Var);
            int i5 = i2;
            boolean zI = (i4 == 4) | x340Var.i(y7e1VarD);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new woe(str, y7e1VarD, null, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(str, x340Var, (vu30) objT);
            boolean zI2 = x340Var.i(y7e1VarD) | ((i5 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new qy5(y7e1VarD, iu30Var, (lnm) null, (byte) 3);
                x340Var.s0(objT2);
            }
            qxd0.t(y7e1VarD, x340Var, (vu30) objT2);
            boolean z3 = !ihc1.y0(y7e1VarD.d().d);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = bb00.h(1, x340Var);
            }
            err0 err0Var = (hdn0) objT3;
            boolean zG = vqo1.g(err0Var.s(), y7e1VarD.d().d.toString());
            rqo1.d(apo.r(-1503385194, new zoe(y7e1VarD, iu30Var2, function0, strO0, (hdn0) err0Var, zG, function3, z2, z3, function4), x340Var), anm1.N("ChatBubbleBar.ReplyInput", qim0Var3), p7f.f, zG, null, apo.r(1464058161, new erc(z, function2, z3, iu30Var2, y7e1VarD, function1, (byte) 1), x340Var), kys0.b, x340Var, 196614, 16);
            qim0Var2 = qim0Var3;
            str3 = strO0;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            str3 = str2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3b(str, iu30Var, iu30Var2, function0, function1, function2, function3, z, qim0Var2, str3, z2, function4, i);
        }
    }

    public static final void c(boolean z, rd60 rd60Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(769902079);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(rd60Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("add_to_library_button", nim0.a);
            boolean z2 = false;
            gdx gdxVarS = yla.s(x340Var);
            pk1 pk1Var = new pk1(z ? qk1.b : qk1.a, false, rd60Var.a.b, cwl1.o0(x340Var, 2131951772), (j7p1) null, 18);
            jax haxVar = !rd60Var.b ? jax.a : new hax("TODO");
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new u460(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT), qim0VarN, haxVar, gdxVarS, x340Var, 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(z, rd60Var, iu30Var, i);
        }
    }

    public static final void d(dok0 dok0Var, ijf1 ijf1Var, float f, pmg1 pmg1Var, xu30 xu30Var, qim0 qim0Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, int i, float f2, bpo bpoVar, Integer num, zu30 zu30Var, iu30 iu30Var, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        bpo bpoVar2;
        x340 x340Var;
        qim0 qim0Var2;
        s69 s69Var;
        s69 s69Var2;
        s69 s69Var3;
        s69 s69Var4;
        s69 s69Var5;
        s69 s69Var6;
        s69 s69Var7;
        s69 s69Var8;
        s69 s69Var9;
        s69 s69Var10;
        s69 s69Var11;
        s69 s69Var12;
        List listM;
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        List listM2;
        h2c h2cVar;
        qim0 qim0Var3;
        zu30 zu30Var2 = zu30Var;
        j830 j830Var = j830.X0;
        tl3 tl3Var = een.h;
        Object obj = fkj0.X;
        Map map = dok0Var.k;
        cok0 cok0Var = dok0Var.a;
        lhg1 lhg1Var = cok0Var.a;
        boolean z = cok0Var.o;
        x340 x340Var2 = (x340) b0kVar;
        Map map2 = map;
        x340Var2.k0(1422547961);
        int i3 = i2 | (x340Var2.i(dok0Var) ? 32 : 16) | (x340Var2.d(f) ? 2048 : 1024) | (x340Var2.g(pmg1Var) ? 16384 : 8192) | (x340Var2.i(xu30Var) ? 131072 : 65536) | 1572864 | (x340Var2.i(xu30Var2) ? 8388608 : 4194304) | (x340Var2.i(xu30Var3) ? 67108864 : 33554432) | (x340Var2.i(xu30Var4) ? 536870912 : 268435456);
        int i4 = (x340Var2.i(xu30Var5) ? 4 : 2) | (x340Var2.e(i) ? 32 : 16) | (x340Var2.d(f2) ? 256 : 128) | (x340Var2.e(bpoVar == null ? -1 : bpoVar.ordinal()) ? 2048 : 1024) | (x340Var2.g(num) ? 16384 : 8192) | (x340Var2.i(zu30Var2) ? 131072 : 65536) | (x340Var2.i(iu30Var) ? 1048576 : 524288) | (x340Var2.i(function0) ? 8388608 : 4194304) | (x340Var2.i(function1) ? 67108864 : 33554432);
        if (x340Var2.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 38347923) == 38347922) ? false : true)) {
            int iX = f4p1.x(f2, i);
            boolean zH = x340Var2.h(z) | ((i4 & 112) == 32) | x340Var2.e(iX);
            Object objT = x340Var2.T();
            if (zH || objT == obj) {
                c380 c380VarA = fg91.b;
                if (z && i > 0 && iX > 0) {
                    int i5 = iX * i;
                    ArrayList arrayList = new ArrayList(q7h.U(new tr80(0, i5, 1), 10));
                    for (Iterator it = r9.iterator(); ((sr80) it).c; it = it) {
                        arrayList.add(Float.valueOf(((lr80) it).nextInt() / i5));
                    }
                    c380VarA = mqo1.A(arrayList);
                }
                objT = c380VarA;
                x340Var2.s0(objT);
            }
            c380 c380Var = (c380) objT;
            azb azbVar = cok0Var.b;
            float fO = yoi1.o(cok0Var.p / 100.0f, 0.0f, 0.5f);
            Map map3 = dok0Var.f;
            iez iezVar = map3 != null ? (iez) map3.get(j9k1.q(cok0Var.a.a, ioo1.A(dok0Var))) : null;
            Map map4 = dok0Var.i;
            ga20 ga20Var = map4 != null ? (ga20) map4.get(j9k1.r(cok0Var.a.a, ioo1.A(dok0Var))) : null;
            q6w0 q6w0Var = lhg1Var.a;
            kig1 kig1VarA = ioo1.A(dok0Var);
            Map map5 = kig1VarA.b;
            cuk1 cuk1Var = map5 != null ? (cuk1) map5.get(j9k1.t(q6w0Var, kig1VarA)) : null;
            s69 s69Var13 = q6w0Var.h;
            if (s69Var13 == null) {
                s69Var13 = cuk1Var != null ? cuk1Var.b : null;
            }
            s69 s69Var14 = q6w0Var.i;
            if (s69Var14 == null) {
                s69Var14 = cuk1Var != null ? cuk1Var.c : null;
            }
            q6w0 q6w0Var2 = lhg1Var.a;
            kig1 kig1VarA2 = ioo1.A(dok0Var);
            Map map6 = kig1VarA2.c;
            iez iezVar2 = map6 != null ? (iez) map6.get(j9k1.q(q6w0Var2, kig1VarA2)) : null;
            gez gezVar = q6w0Var2.t;
            if (gezVar == null || (s69Var = gezVar.a) == null) {
                s69Var = iezVar2 != null ? iezVar2.b : null;
            }
            gez gezVar2 = q6w0Var2.X;
            if (gezVar2 == null || (s69Var2 = gezVar2.a) == null) {
                s69Var2 = iezVar2 != null ? iezVar2.e : null;
            }
            q6w0 q6w0Var3 = lhg1Var.a;
            kig1 kig1VarA3 = ioo1.A(dok0Var);
            Map map7 = kig1VarA3.d;
            ga20 ga20Var2 = map7 != null ? (ga20) map7.get(j9k1.r(q6w0Var3, kig1VarA3)) : null;
            r920 r920Var = q6w0Var3.Y;
            if (r920Var == null || (s69Var3 = r920Var.a) == null) {
                s69Var3 = ga20Var2 != null ? ga20Var2.b : null;
            }
            r920 r920Var2 = q6w0Var3.Z;
            if (r920Var2 == null || (s69Var4 = r920Var2.a) == null) {
                s69Var4 = ga20Var2 != null ? ga20Var2.d : null;
            }
            q6w0 q6w0Var4 = cok0Var.a.a;
            tl3 tl3Var2 = tl3Var;
            kig1 kig1VarA4 = ioo1.A(dok0Var);
            azb azbVar2 = azbVar;
            Map map8 = kig1VarA4.e;
            qx30 qx30Var = map8 != null ? (qx30) map8.get(j9k1.s(q6w0Var4, kig1VarA4)) : null;
            ox30 ox30Var = q6w0Var4.N0;
            if (ox30Var == null || (s69Var5 = ox30Var.a) == null) {
                s69Var5 = qx30Var != null ? qx30Var.b : null;
            }
            ox30 ox30Var2 = q6w0Var4.O0;
            if (ox30Var2 == null || (s69Var6 = ox30Var2.a) == null) {
                s69Var6 = qx30Var != null ? qx30Var.c : null;
            }
            q6w0 q6w0Var5 = cok0Var.a.a;
            boolean z2 = z;
            kig1 kig1VarA5 = ioo1.A(dok0Var);
            s69 s69Var15 = s69Var6;
            Map map9 = kig1VarA5.e;
            qx30 qx30Var2 = map9 != null ? (qx30) map9.get(j9k1.s(q6w0Var5, kig1VarA5)) : null;
            ox30 ox30Var3 = q6w0Var5.N0;
            if (ox30Var3 == null || (s69Var7 = ox30Var3.b) == null) {
                s69Var7 = qx30Var2 != null ? qx30Var2.d : null;
            }
            ox30 ox30Var4 = q6w0Var5.O0;
            if (ox30Var4 == null || (s69Var8 = ox30Var4.b) == null) {
                s69Var8 = qx30Var2 != null ? qx30Var2.e : null;
            }
            q6w0 q6w0Var6 = cok0Var.a.a;
            s69 s69Var16 = s69Var8;
            kig1 kig1VarA6 = ioo1.A(dok0Var);
            s69 s69Var17 = s69Var7;
            Map map10 = kig1VarA6.e;
            qx30 qx30Var3 = map10 != null ? (qx30) map10.get(j9k1.s(q6w0Var6, kig1VarA6)) : null;
            ox30 ox30Var5 = q6w0Var6.N0;
            if (ox30Var5 == null || (s69Var9 = ox30Var5.c) == null) {
                s69Var9 = qx30Var3 != null ? qx30Var3.f : null;
            }
            ox30 ox30Var6 = q6w0Var6.O0;
            if (ox30Var6 == null || (s69Var10 = ox30Var6.c) == null) {
                s69Var10 = qx30Var3 != null ? qx30Var3.g : null;
            }
            q6w0 q6w0Var7 = cok0Var.a.a;
            cok0 cok0Var2 = cok0Var;
            kig1 kig1VarA7 = ioo1.A(dok0Var);
            s69 s69Var18 = s69Var10;
            Map map11 = kig1VarA7.d;
            ga20 ga20Var3 = map11 != null ? (ga20) map11.get(j9k1.r(q6w0Var7, kig1VarA7)) : null;
            r920 r920Var3 = q6w0Var7.Y;
            if (r920Var3 == null || (s69Var11 = r920Var3.c) == null) {
                s69Var11 = ga20Var3 != null ? ga20Var3.f : null;
            }
            r920 r920Var4 = q6w0Var7.Z;
            if (r920Var4 == null || (s69Var12 = r920Var4.c) == null) {
                s69Var12 = ga20Var3 != null ? ga20Var3.g : null;
            }
            Parcelable.Creator creator = fkc1.CREATOR;
            s69 s69Var19 = s69Var5;
            long jK = f5p1.k(x340Var2, 2131102362);
            s69 s69Var20 = s69Var9;
            s69 s69Var21 = s69Var4;
            s69 s69Var22 = s69Var11;
            long jK2 = f5p1.k(x340Var2, 2131102367);
            s69 s69Var23 = s69Var3;
            long jK3 = f5p1.k(x340Var2, 2131102366);
            long jK4 = f5p1.k(x340Var2, 2131102364);
            boolean zG = x340Var2.g(s69Var13) | x340Var2.g(s69Var14) | x340Var2.f(jK);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == obj) {
                int iOrdinal = ijf1Var.ordinal();
                if (iOrdinal == 0) {
                    kna knaVar = ara.b;
                    zqa zqaVarG = yap1.g(s69Var13, knaVar);
                    objT2 = Collections.singletonList(new lhc0(zqaVarG != null ? mqo1.A(zqaVarG.a) : null, 1.0f, jK, s69Var13, knaVar, ara.c, bpo.b));
                } else if (iOrdinal != 1) {
                    eg.o();
                    return;
                } else {
                    kna knaVar2 = ara.b;
                    zqa zqaVarG2 = yap1.g(s69Var14, knaVar2);
                    objT2 = Collections.singletonList(new lhc0(zqaVarG2 != null ? mqo1.A(zqaVarG2.a) : null, 1.0f, jK, s69Var14, knaVar2, ara.c, bpo.a));
                }
                x340Var2.s0(objT2);
            }
            List list = (List) objT2;
            boolean zG2 = x340Var2.g(iezVar) | x340Var2.g(s69Var) | x340Var2.g(s69Var2) | x340Var2.f(jK2);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == obj) {
                int iOrdinal2 = ijf1Var.ordinal();
                if (iOrdinal2 == 0) {
                    if (s69Var == null) {
                        s69Var = iezVar != null ? iezVar.b : null;
                    }
                    s69 s69Var24 = iezVar != null ? iezVar.c : null;
                    s69 s69Var25 = iezVar != null ? iezVar.d : null;
                    zqa zqaVarG3 = yap1.g(s69Var, j830Var);
                    zqa zqaVarG4 = yap1.g(s69Var24, j830Var);
                    zqa zqaVarG5 = yap1.g(s69Var25, j830Var);
                    c380 c380VarA2 = zqaVarG3 != null ? mqo1.A(zqaVarG3.a) : null;
                    bpo bpoVar3 = bpo.d;
                    listM = p7h.M(new lhc0[]{new lhc0(c380VarA2, 1.0f, jK2, s69Var, bpoVar3), new lhc0(zqaVarG4 != null ? mqo1.A(zqaVarG4.a) : null, 0.5f, jK2, (s69) null, bpoVar3), new lhc0(zqaVarG5 != null ? mqo1.A(zqaVarG5.a) : null, 0.5f, jK2, (s69) null, bpoVar3)});
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return;
                    }
                    if (s69Var2 == null) {
                        s69Var2 = iezVar != null ? iezVar.e : null;
                    }
                    s69 s69Var26 = iezVar != null ? iezVar.f : null;
                    s69 s69Var27 = iezVar != null ? iezVar.g : null;
                    zqa zqaVarG6 = yap1.g(s69Var2, j830Var);
                    zqa zqaVarG7 = yap1.g(s69Var26, j830Var);
                    zqa zqaVarG8 = yap1.g(s69Var27, j830Var);
                    c380 c380VarA3 = zqaVarG6 != null ? mqo1.A(zqaVarG6.a) : null;
                    bpo bpoVar4 = bpo.c;
                    listM = p7h.M(new lhc0[]{new lhc0(c380VarA3, 1.0f, jK2, s69Var2, bpoVar4), new lhc0(zqaVarG7 != null ? mqo1.A(zqaVarG7.a) : null, 0.5f, jK2, (s69) null, bpoVar4), new lhc0(zqaVarG8 != null ? mqo1.A(zqaVarG8.a) : null, 0.5f, jK2, (s69) null, bpoVar4)});
                }
                objT3 = listM;
                x340Var2.s0(objT3);
            }
            List list2 = (List) objT3;
            s69 s69Var28 = s69Var23;
            boolean zG3 = x340Var2.g(ga20Var) | x340Var2.g(s69Var28) | x340Var2.g(s69Var21) | x340Var2.g(s69Var22) | x340Var2.g(s69Var12) | x340Var2.f(jK3);
            Object objT4 = x340Var2.T();
            if (zG3 || objT4 == obj) {
                int iOrdinal3 = ijf1Var.ordinal();
                if (iOrdinal3 == 0) {
                    if (s69Var28 == null) {
                        s69Var28 = ga20Var != null ? ga20Var.b : null;
                    }
                    mmr0Var = new mmr0(s69Var28, bpo.f);
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return;
                    }
                    mmr0Var = new mmr0(s69Var21 == null ? ga20Var != null ? ga20Var.d : null : s69Var21, bpo.e);
                }
                s69 s69Var29 = (s69) mmr0Var.a;
                bpo bpoVar5 = (bpo) mmr0Var.b;
                zqa zqaVarG9 = yap1.g(s69Var29, j830Var);
                int iOrdinal4 = ijf1Var.ordinal();
                if (iOrdinal4 == 0) {
                    mmr0Var2 = new mmr0(s69Var22 == null ? ga20Var != null ? ga20Var.f : null : s69Var22, bpo.N0);
                } else if (iOrdinal4 != 1) {
                    eg.o();
                    return;
                } else {
                    if (s69Var12 == null) {
                        s69Var12 = ga20Var != null ? ga20Var.g : null;
                    }
                    mmr0Var2 = new mmr0(s69Var12, bpo.Z);
                }
                s69 s69Var30 = (s69) mmr0Var2.a;
                bpo bpoVar6 = (bpo) mmr0Var2.b;
                zqa zqaVarG10 = yap1.g(s69Var30, j830Var);
                objT4 = p7h.M(new lhc0[]{new lhc0(zqaVarG9 != null ? mqo1.A(zqaVarG9.a) : null, 1.0f, jK3, s69Var29, bpoVar5), new lhc0(zqaVarG10 != null ? mqo1.A(zqaVarG10.a) : null, 1.0f, jK3, s69Var30, bpoVar6)});
                x340Var2.s0(objT4);
            }
            List list3 = (List) objT4;
            boolean zG4 = x340Var2.g(s69Var19) | x340Var2.g(s69Var15) | x340Var2.g(s69Var17) | x340Var2.g(s69Var16) | x340Var2.g(s69Var20) | x340Var2.g(s69Var18) | x340Var2.f(jK4);
            Object objT5 = x340Var2.T();
            if (zG4 || objT5 == obj) {
                int iOrdinal5 = ijf1Var.ordinal();
                if (iOrdinal5 == 0) {
                    zqa zqaVarG11 = yap1.g(s69Var19, j830Var);
                    zqa zqaVarG12 = yap1.g(s69Var17, j830Var);
                    zqa zqaVarG13 = yap1.g(s69Var20, j830Var);
                    listM2 = p7h.M(new lhc0[]{new lhc0(zqaVarG11 != null ? mqo1.A(zqaVarG11.a) : null, 1.0f, jK4, s69Var19, bpo.h), new lhc0(zqaVarG12 != null ? mqo1.A(zqaVarG12.a) : null, 1.0f, jK4, s69Var17, bpo.t), new lhc0(zqaVarG13 != null ? mqo1.A(zqaVarG13.a) : null, 1.0f, jK4, s69Var20, bpo.Y)});
                } else {
                    if (iOrdinal5 != 1) {
                        eg.o();
                        return;
                    }
                    zqa zqaVarG14 = yap1.g(s69Var15, j830Var);
                    zqa zqaVarG15 = yap1.g(s69Var16, j830Var);
                    zqa zqaVarG16 = yap1.g(s69Var18, j830Var);
                    listM2 = p7h.M(new lhc0[]{new lhc0(zqaVarG14 != null ? mqo1.A(zqaVarG14.a) : null, 1.0f, jK4, s69Var15, bpo.g), new lhc0(zqaVarG15 != null ? mqo1.A(zqaVarG15.a) : null, 1.0f, jK4, s69Var16, bpo.i), new lhc0(zqaVarG16 != null ? mqo1.A(zqaVarG16.a) : null, 1.0f, jK4, s69Var18, bpo.X)});
                }
                objT5 = listM2;
                x340Var2.s0(objT5);
            }
            List list4 = (List) objT5;
            x340Var2.i0(1269142142);
            Iterator it2 = list.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                h2cVar = h2c.a;
                qim0Var3 = nim0.a;
                if (!zHasNext) {
                    break;
                }
                lhc0 lhc0Var = (lhc0) it2.next();
                c380 c380Var2 = lhc0Var.a;
                bpo bpoVar7 = lhc0Var.g;
                long j = lhc0Var.c;
                float f3 = lhc0Var.b;
                Iterator it3 = it2;
                azb azbVar3 = azbVar2;
                boolean z3 = z2;
                int iY = w3p1.y(zyb.a, azbVar3, z3);
                bpo bpoVar8 = lhc0Var.g;
                tl3 tl3Var3 = tl3Var2;
                qim0 qim0VarA = h2cVar.a(qim0Var3, tl3Var3);
                s69 s69Var31 = z3 ? lhc0Var.d : null;
                Map map12 = map2;
                i79 i79VarZ = i0p1.z(bpoVar7, map12);
                xu30 xu30Var6 = lhc0Var.e;
                iu30 iu30Var2 = lhc0Var.f;
                cok0 cok0Var3 = cok0Var2;
                boolean z4 = cok0Var3.q;
                List list5 = list3;
                Integer num2 = bpoVar == bpoVar7 ? num : null;
                boolean zI = ((i4 & 458752) == 131072) | x340Var2.i(lhc0Var);
                Object objT6 = x340Var2.T();
                if (zI || objT6 == obj) {
                    objT6 = new lkc1(zu30Var, lhc0Var, (byte) 3);
                    x340Var2.s0(objT6);
                }
                vu30 vu30Var = (vu30) objT6;
                boolean zI2 = ((i3 & 29360128) == 8388608) | x340Var2.i(lhc0Var);
                Object objT7 = x340Var2.T();
                if (zI2 || objT7 == obj) {
                    objT7 = new mkc1(xu30Var2, lhc0Var, (byte) 3);
                    x340Var2.s0(objT7);
                }
                int i6 = i3 << 3;
                uap1.c(f, j, c380Var2, iY, bpoVar8, pmg1Var, xu30Var, qim0VarA, f3, s69Var31, i79VarZ, xu30Var6, iu30Var2, fO, z4, num2, vu30Var, iu30Var, function0, function1, (vu30) objT7, c380Var, x340Var2, ((i3 >> 9) & 14) | (i6 & 458752) | (i6 & 3670016), (i4 << 3) & 2143289344);
                it2 = it3;
                azbVar2 = azbVar3;
                tl3Var2 = tl3Var3;
                z2 = z3;
                cok0Var2 = cok0Var3;
                list3 = list5;
                map2 = map12;
            }
            zu30Var2 = zu30Var;
            azb azbVar4 = azbVar2;
            Map map13 = map2;
            tl3 tl3Var4 = tl3Var2;
            boolean z5 = z2;
            cok0 cok0Var4 = cok0Var2;
            List list6 = list3;
            bpoVar2 = bpoVar;
            x340Var2.r(false);
            x340Var2.i0(1269191926);
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                lhc0 lhc0Var2 = (lhc0) it4.next();
                c380 c380Var3 = lhc0Var2.a;
                bpo bpoVar9 = lhc0Var2.g;
                List list7 = list4;
                long j2 = lhc0Var2.c;
                Iterator it5 = it4;
                float f4 = lhc0Var2.b;
                int iY2 = w3p1.y(syb.a, azbVar4, z5);
                bpo bpoVar10 = lhc0Var2.g;
                qim0 qim0VarA2 = h2cVar.a(qim0Var3, tl3Var4);
                s69 s69Var32 = z5 ? lhc0Var2.d : null;
                i79 i79VarZ2 = i0p1.z(bpoVar9, map13);
                xu30 xu30Var7 = lhc0Var2.e;
                iu30 iu30Var3 = lhc0Var2.f;
                boolean z6 = cok0Var4.q;
                Integer num3 = bpoVar2 == bpoVar9 ? num : null;
                boolean zI3 = ((i4 & 458752) == 131072) | x340Var2.i(lhc0Var2);
                Object objT8 = x340Var2.T();
                if (zI3 || objT8 == obj) {
                    objT8 = new lkc1(zu30Var2, lhc0Var2, (byte) 0);
                    x340Var2.s0(objT8);
                }
                vu30 vu30Var2 = (vu30) objT8;
                boolean zI4 = ((i3 & 234881024) == 67108864) | x340Var2.i(lhc0Var2);
                Object objT9 = x340Var2.T();
                if (zI4 || objT9 == obj) {
                    objT9 = new mkc1(xu30Var3, lhc0Var2, (byte) 0);
                    x340Var2.s0(objT9);
                }
                int i7 = i3 << 3;
                uap1.c(f, j2, c380Var3, iY2, bpoVar10, pmg1Var, xu30Var, qim0VarA2, f4, s69Var32, i79VarZ2, xu30Var7, iu30Var3, fO, z6, num3, vu30Var2, iu30Var, function0, function1, (vu30) objT9, c380Var, x340Var2, ((i3 >> 9) & 14) | (i7 & 458752) | (i7 & 3670016), (i4 << 3) & 2143289344);
                list4 = list7;
                it4 = it5;
            }
            List<lhc0> list8 = list4;
            x340Var2.r(false);
            x340Var2.i0(1269241534);
            Iterator it6 = list6.iterator();
            while (it6.hasNext()) {
                lhc0 lhc0Var3 = (lhc0) it6.next();
                c380 c380Var4 = lhc0Var3.a;
                bpo bpoVar11 = lhc0Var3.g;
                Iterator it7 = it6;
                long j3 = lhc0Var3.c;
                float f5 = lhc0Var3.b;
                int iY3 = w3p1.y(tyb.a, azbVar4, z5);
                bpo bpoVar12 = lhc0Var3.g;
                qim0 qim0VarA3 = h2cVar.a(qim0Var3, tl3Var4);
                s69 s69Var33 = z5 ? lhc0Var3.d : null;
                i79 i79VarZ3 = i0p1.z(bpoVar11, map13);
                xu30 xu30Var8 = lhc0Var3.e;
                iu30 iu30Var4 = lhc0Var3.f;
                boolean z7 = cok0Var4.q;
                Integer num4 = bpoVar2 == bpoVar11 ? num : null;
                boolean zI5 = ((i4 & 458752) == 131072) | x340Var2.i(lhc0Var3);
                Object objT10 = x340Var2.T();
                if (zI5 || objT10 == obj) {
                    objT10 = new lkc1(zu30Var2, lhc0Var3, (byte) 1);
                    x340Var2.s0(objT10);
                }
                vu30 vu30Var3 = (vu30) objT10;
                boolean zI6 = ((i3 & 1879048192) == 536870912) | x340Var2.i(lhc0Var3);
                Object objT11 = x340Var2.T();
                if (zI6 || objT11 == obj) {
                    objT11 = new mkc1(xu30Var4, lhc0Var3, (byte) 1);
                    x340Var2.s0(objT11);
                }
                vu30 vu30Var4 = (vu30) objT11;
                int i8 = i3 << 3;
                uap1.c(f, j3, c380Var4, iY3, bpoVar12, pmg1Var, xu30Var, qim0VarA3, f5, s69Var33, i79VarZ3, xu30Var8, iu30Var4, fO, z7, num4, vu30Var3, iu30Var, function0, function1, vu30Var4, c380Var, x340Var2, ((i3 >> 9) & 14) | (i8 & 458752) | (i8 & 3670016), (i4 << 3) & 2143289344);
                it6 = it7;
            }
            x340Var2.r(false);
            for (lhc0 lhc0Var4 : list8) {
                c380 c380Var5 = lhc0Var4.a;
                bpo bpoVar13 = lhc0Var4.g;
                long j4 = lhc0Var4.c;
                float f6 = lhc0Var4.b;
                int iY4 = w3p1.y(uyb.a, azbVar4, z5);
                bpo bpoVar14 = lhc0Var4.g;
                qim0 qim0VarA4 = h2cVar.a(qim0Var3, tl3Var4);
                azb azbVar5 = azbVar4;
                s69 s69Var34 = z5 ? lhc0Var4.d : null;
                i79 i79VarZ4 = i0p1.z(bpoVar13, map13);
                xu30 xu30Var9 = lhc0Var4.e;
                iu30 iu30Var5 = lhc0Var4.f;
                boolean z8 = cok0Var4.q;
                Integer num5 = bpoVar2 == bpoVar13 ? num : null;
                boolean zI7 = ((i4 & 458752) == 131072) | x340Var2.i(lhc0Var4);
                Object objT12 = x340Var2.T();
                if (zI7 || objT12 == obj) {
                    objT12 = new lkc1(zu30Var2, lhc0Var4, (byte) 2);
                    x340Var2.s0(objT12);
                }
                vu30 vu30Var5 = (vu30) objT12;
                boolean zI8 = ((i4 & 14) == 4) | x340Var2.i(lhc0Var4);
                Object objT13 = x340Var2.T();
                if (zI8 || objT13 == obj) {
                    objT13 = new mkc1(xu30Var5, lhc0Var4, (byte) 2);
                    x340Var2.s0(objT13);
                }
                int i9 = i3 << 3;
                uap1.c(f, j4, c380Var5, iY4, bpoVar14, pmg1Var, xu30Var, qim0VarA4, f6, s69Var34, i79VarZ4, xu30Var9, iu30Var5, fO, z8, num5, vu30Var5, iu30Var, function0, function1, (vu30) objT13, c380Var, x340Var2, ((i3 >> 9) & 14) | (i9 & 458752) | (i9 & 3670016), (i4 << 3) & 2143289344);
                azbVar4 = azbVar5;
                h2cVar = h2cVar;
            }
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
        } else {
            bpoVar2 = bpoVar;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nkc1(dok0Var, ijf1Var, f, pmg1Var, xu30Var, qim0Var2, xu30Var2, xu30Var3, xu30Var4, xu30Var5, i, f2, bpoVar2, num, zu30Var2, iu30Var, function0, function1, i2);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-257178861);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            wro1.h(new gbx(z50.c, function0), kdx.c, anm1.N("ChatBubbleBar.ExpandButton", nim0.a), jax.a, yla.s(x340Var), null, false, null, null, jbi.f, x340Var, 0, 6, 968);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 17);
        }
    }

    public static final void f(rd60 rd60Var, iu30 iu30Var, qim0 qim0Var, yqg yqgVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-703742093);
        int i2 = i | (x340Var.g(rd60Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.g(yqgVar) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            long jA = cbx.a(x340Var).a.b.a();
            cvx cvxVar = cbx.b(x340Var).b;
            qim0Var2 = qim0Var3;
            w3d1.a(uyn1.z(4.0f, 0.0f, 2, qim0Var3), cr31VarB, jA, 0L, 0.0f, 0.0f, (qqb) null, apo.r(408461700, new sd60(rd60Var, iu30Var, yqgVar, (byte) 1), x340Var), x340Var, 12582912, 120);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60((Object) rd60Var, iu30Var, (Object) qim0Var2, (Object) yqgVar, i, (byte) 3);
        }
    }

    public static final void g(hob1 hob1Var, int i, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, qim0 qim0Var, boolean z, yqg yqgVar, boolean z2, i091 i091Var, boolean z3, vu30 vu30Var, Function0 function0, b0k b0kVar, int i2) {
        x340 x340Var;
        qim0 qim0Var2;
        cr00 cr00Var;
        boolean z4;
        boolean z5;
        int i3;
        oiw0 oiw0VarA;
        x340 x340Var2;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1629047251);
        int i4 = i2 | (x340Var3.i(hob1Var) ? 4 : 2) | (x340Var3.e(i) ? 32 : 16) | 1572864 | (x340Var3.h(z) ? 8388608 : 4194304) | (x340Var3.g(yqgVar) ? 67108864 : 33554432) | (x340Var3.h(z2) ? 536870912 : 268435456);
        if (x340Var3.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (((((x340Var3.i(i091Var) ? (char) 4 : (char) 2) | (x340Var3.h(z3) ? ' ' : (char) 16)) | (x340Var3.i(vu30Var) ? 256 : 128)) | (x340Var3.i(function0) ? 2048 : 1024)) & 1171) == 1170) ? false : true)) {
            cr00 cr00Var2 = hob1Var.h;
            boolean zP = i091Var != null ? ebp1.p(i091Var) : false;
            Object objT = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var3);
            }
            hdn0 hdn0Var = (hdn0) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var3);
            }
            hdn0 hdn0Var2 = (hdn0) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar) {
                objT3 = bb00.h(0, x340Var3);
            }
            hdn0 hdn0Var3 = (hdn0) objT3;
            boolean z6 = cr00Var2.b;
            yaw0 yaw0Var = hob1Var.l;
            if (yaw0Var != null) {
                cr00Var = cr00Var2;
                i3 = 8388608;
                z5 = false;
                oiw0VarA = x760.A(yaw0Var.a, yaw0Var.b, yaw0Var.c, yaw0Var.d, yaw0Var.e, yaw0Var.f, yaw0Var.g, yaw0Var.h, yaw0Var.i, yaw0Var.k, z6, hob1Var.f ? new zkm((String) null, true, hob1Var.b, true) : null, i091Var, z, yaw0Var.l);
                z4 = z;
            } else {
                x340Var3 = x340Var3;
                cr00Var = cr00Var2;
                z4 = z;
                z5 = false;
                i3 = 8388608;
                oiw0VarA = null;
            }
            Object objT4 = x340Var3.T();
            if (objT4 == m4cVar) {
                objT4 = new zen0(Boolean.FALSE);
                x340Var2 = x340Var3;
                x340Var2.s0(objT4);
            } else {
                x340Var2 = x340Var3;
            }
            zen0 zen0Var = (zen0) objT4;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zI = x340Var2.i(zen0Var) | ((i4 & 29360128) == i3 ? true : z5);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new prb(zen0Var, z4, null, (byte) 1);
                x340Var2.s0(objT5);
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT5);
            cr00 cr00Var3 = cr00Var;
            uyg uygVar = new uyg(bth.n(cr00Var3, x340Var2), hob1Var.A);
            qim0 qim0Var3 = nim0.a;
            x340Var = x340Var2;
            w2g0.c(uyn1.B(zr7.i(qim0Var3, uygVar), 8.0f, 0.0f, 8.0f, ((wat) x340Var2.k(t4k.h)).M0(i), 2), (tl3) null, apo.r(-218118211, new abi0(zen0Var, oiw0VarA, cr00Var3, z2, j2iVar, z3, hdn0Var, hdn0Var2, j2iVar2, j2iVar4, j2iVar3, vu30Var, hob1Var, zP, function0, hdn0Var3, yqgVar), x340Var), x340Var, 3072, 6);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bbi0(hob1Var, i, j2iVar, j2iVar2, j2iVar3, j2iVar4, qim0Var2, z, yqgVar, z2, i091Var, z3, vu30Var, function0, i2);
        }
    }

    public static final void h(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(395491554);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gbx gbxVar = new gbx(z50.c, function0);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarN = anm1.N("ChatBubbleBar.MicButton", u291.r(nim0.a, 32.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            wro1.h(gbxVar, ldxVar, qim0VarN, jax.a, gdxVarS, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), false, null, null, jbi.a, x340Var, 0, 6, 904);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 18);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-11106230);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = z ? 2131960849 : 2131960847;
            int i4 = z ? 2131960848 : 2131960845;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = voo1.y(u291.d(nim0Var, 1.0f), voo1.c);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarY);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            uwo1.e(cwl1.o0(x340Var, i3), null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(8.0f, i4, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            foo1.c(new gbx(z50.c, function0), new idx(4), null, null, yla.r(x340Var), null, null, null, null, null, fbj.a, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ie1((byte) 15, i, function0, z);
        }
    }

    public static final void j(hre hreVar, g9m g9mVar, Function0 function0, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1409923856);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hreVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(g9mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            wat watVar = (wat) x340Var.k(t4k.h);
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            boolean zG = x340Var.g(lee1Var) | x340Var.g(watVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = ktd.k(watVar.M0((int) (yae1.a(yae1VarQ, "Xg\nXg\nXg", lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L)), x340Var);
            }
            float f = ((p3v) objT).a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("ChatBubbleBar.ResponseContent", uyn1.x(qim0VarF, 12.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            if (z) {
                x340Var.i0(756322608);
                String strO0 = cwl1.o0(x340Var, 2131952121);
                lee1 lee1Var2 = cbx.d(x340Var).g;
                long j = cbx.a(x340Var).b.b;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar2 = cbx.b(x340Var).b;
                z2 = true;
                uwo1.e(strO0, anm1.N("ChatBubbleBar.SpeakingText", uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 12.0f, 7)), lee1Var2, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                z2 = true;
                x340Var.i0(756704404);
                String str = hreVar.a;
                String str2 = hreVar.b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = hreVar.c;
                if (str3 == null) {
                    str3 = "";
                }
                f9m f9mVar = new f9m(str, str2, str3, 3, false, false, false, (iu30) null, function0, (Function0) null, (String) null, (otf0) null, 7520);
                qim0 qim0VarJ = u291.j(f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                cvx cvxVar3 = cbx.b(x340Var).b;
                otw.c(g9mVar, f9mVar, uyn1.B(qim0VarJ, 0.0f, 0.0f, 0.0f, 12.0f, 7), (ipb1) null, x340Var, (i2 >> 3) & 14, 8);
                x340Var.r(false);
            }
            dv20.l((i2 >> 12) & 14, j2iVar, x340Var, z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(hreVar, g9mVar, function0, z, j2iVar, i);
        }
    }

    public static final void k(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1333674487);
        int i2 = (x340Var.i(function0) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            wro1.h(new gbx(z50.c, function0), new idx(), anm1.N("ChatBubbleBar.SendButton", nim0.a), jax.a, yla.s(x340Var), null, false, null, null, jbi.d, x340Var, 0, 6, 968);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 19);
        }
    }

    public static final void l(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2129561074);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131952120);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pj8(function0, (byte) 23);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function1), new idx(), anm1.N("ChatBubbleBar.SkipButton", nim0.a), null, yla.s(x340Var), null, null, null, jbi.b, null, jbi.c, x340Var, 805306368, 48, 1496);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 20);
        }
    }

    public static final void m(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1747335467);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            wro1.h(new gbx(z50.c, function0), new idx(), anm1.N("ChatBubbleBar.StopButton", nim0.a), jax.a, yla.s(x340Var), null, false, null, null, jbi.e, x340Var, 0, 6, 968);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 2, i, function0, false);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    public static final void n(String str, lz71 lz71Var, nu nuVar, Function0 function0, Function0 function1, boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        ?? r10;
        qim0 qim0VarX;
        qim0 qim0Var;
        vu30 vu30Var;
        vu30 vu30Var2;
        b0k b0kVar3;
        float f;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-2100154461);
        j06 j06Var = ((x340) b0kVar4).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar4.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar4.i(lz71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar4.i(nuVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar4.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar4.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar4.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar4.h(z2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (b0kVar4.Y(i3 & 1, (i3 & 599187) != 599186)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var2, 1.0f), dsa0.m(b0kVar4, 2131165487));
            if (function0 != null) {
                b0kVar4.i0(-912522644);
                r10 = 0;
                qim0VarX = bin.x(qim0Var2, false, cwl1.o0(b0kVar4, 2131952116), new pm31(0), null, function0, 9);
                b0kVar4.r(false);
            } else {
                r10 = 0;
                b0kVar4.i0(-912312867);
                b0kVar4.r(false);
                qim0VarX = qim0Var2;
            }
            qim0 qim0VarN = anm1.N("ChatBubbleBar.ThinkingContent", qim0VarH.then(qim0VarX));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar4, (int) r10);
            int iHashCode = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM = b0kVar4.m();
            qim0 qim0VarE = zr7.E(b0kVar4, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            boolean z3 = ((x340) b0kVar4).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar4.l(n4kVar);
            } else {
                b0kVar4.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar4, lljVar);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, b0kVar4, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar4, lljVar2);
            nko1.F(b0kVar4);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, b0kVar4, vu30Var4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar4).b;
            op71.g(b0kVar4, u291.v(qim0Var2, 12.0f));
            if (z) {
                b0kVar4.i0(1637899008);
                wt2 wt2Var = new wt2(z2);
                cvx cvxVar2 = cbx.b(b0kVar4).b;
                qim0Var = qim0Var2;
                vu30Var2 = vu30Var4;
                f = 8.0f;
                vu30Var = vu30Var3;
                otw.c(nuVar, wt2Var, anm1.N("ChatBubbleBar.ThinkingIcon", uyn1.x(qim0Var2, 4.0f)), (ipb1) null, b0kVar4, (i3 >> 6) & 14, 8);
                b0kVar3 = b0kVar4;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                ab80.p(qim0Var, 8.0f, b0kVar3, (boolean) r10);
            } else {
                qim0Var = qim0Var2;
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                b0kVar3 = b0kVar4;
                f = 8.0f;
                b0kVar3.i0(1638270915);
                b0kVar3.r((boolean) r10);
            }
            qim0 qim0VarN2 = anm1.N("ChatBubbleBar.ThinkingText", new wnb0(1.0f, true));
            gfh0 gfh0VarC = t1c.c(een.g, (boolean) r10);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarN2);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, vu30Var);
            x0d.q(iHashCode2, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, vu30Var2);
            b0kVar2 = b0kVar3;
            otw.c(lz71Var, new kz71(30, str, false, false, false), (qim0) null, (ipb1) null, b0kVar2, (i3 >> 3) & 14, 12);
            b0kVar2.r(true);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(qim0Var, f));
            m(function1, b0kVar2, (i3 >> 12) & 14);
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            ab80.p(qim0Var, 4.0f, b0kVar2, true);
        } else {
            b0kVar2 = b0kVar4;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bw1(str, lz71Var, nuVar, function0, function1, z, z2, i);
        }
    }

    public static final void o(Throwable th, Object obj, Object obj2, String str) throws Throwable {
        String strO;
        String strO2 = null;
        if (obj != null) {
            strO = rc11.a.b(obj.getClass()).o();
        } else {
            strO = null;
        }
        if (obj2 != null) {
            strO2 = rc11.a.b(obj2.getClass()).o();
        }
        j2h1.h(th, new ElementCrashContextException(l1d.n(strO2, ". ", gvg.n("Element: ", str, ", Props: ", strO, ", State: "))));
        throw th;
    }

    public static /* synthetic */ void p(Throwable th, Object obj, Object obj2, String str) throws Throwable {
        o(th, obj, obj2, str);
        throw null;
    }

    public static final void q(tka0 tka0Var) {
        String strO = tka0Var.o();
        if (strO == null) {
            strO = tka0Var.toString();
        }
        IllegalStateException illegalStateException = new IllegalStateException(l1d.m("ElementRuntime is disposed and should not be used anymore. Element: ", strO));
        String strO2 = tka0Var.o();
        String strR = tka0Var.r();
        if (strR == null) {
            strR = tka0Var.toString();
        }
        illegalStateException.setStackTrace((StackTraceElement[]) f46.A0(new StackTraceElement[]{new StackTraceElement(strO2, "", f4i1.e(strR, ".kt"), -1)}, illegalStateException.getStackTrace()));
        throw illegalStateException;
    }

    public static final int r(int i) {
        if ((B(Color.blue(i)) * 0.0722f) + (B(Color.green(i)) * 0.7152f) + (B(Color.red(i)) * 0.2126f) >= 0.12f) {
            return i;
        }
        return Color.argb(255, (int) (((255 - Color.red(i)) * 0.2f) + Color.red(i)), (int) (((255 - Color.green(i)) * 0.2f) + Color.green(i)), (int) (((255 - Color.blue(i)) * 0.2f) + Color.blue(i)));
    }

    public static boolean s(fc10 fc10Var) {
        izr0 izr0Var = new izr0(8);
        int i = o4t.f(fc10Var, izr0Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        fc10Var.h(0, izr0Var.a, 4);
        izr0Var.R(0);
        int iQ = izr0Var.q();
        if (iQ == 1463899717) {
            return true;
        }
        oon1.v("Unsupported form type: " + iQ);
        return false;
    }

    public static final boolean t(int i, int i2) {
        return i == i2;
    }

    public static w4i1 u() {
        return w4i1.f;
    }

    public static ydx v(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        cvx cvxVar3 = cbx.b(b0kVar).b;
        cvx cvxVar4 = cbx.b(b0kVar).b;
        return new ydx(4.0f, 12.0f, 8.0f, new zzq0(12.0f, 12.0f, 12.0f, 12.0f));
    }

    public static int w(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean x(PlayerState playerState, String str) {
        String strContextUri = playerState.contextUri();
        Set set = s4b1.f;
        if (uic.k(strContextUri, new b3i1[]{nyu0.e, wyu0.f})) {
            Set set2 = s4b1.f;
            if (uic.x(playerState.contextUri()).h().equals(uic.x(str).h())) {
                return true;
            }
        }
        return false;
    }

    public static final void y(lzn0 lzn0Var, String str, Integer num) {
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("uri", str), new mmr0("pageType", "PERSONALIZED_SET")});
        if (num != null) {
            bundleH.putInt("accentColor", num.intValue());
        }
        lzn0Var.i(new dwn0("spotify:internal:magpie?config=EDIT", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundleH);
    }

    public static final fvb0 z(b0k b0kVar) {
        Object[] objArr = new Object[0];
        df41 df41Var = fvb0.x;
        boolean zE = ((x340) b0kVar).e(0) | ((x340) b0kVar).e(0);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            objT = new el70((byte) 11);
            x340Var.s0(objT);
        }
        return (fvb0) k5p1.u(objArr, df41Var, (Function0) objT, x340Var, 0);
    }
}

package p;

import android.content.Context;
import android.content.res.Resources;
import android.util.LruCache;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qcd0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qcd0(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        glf0 glf0Var = (glf0) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        yxb0 yxb0Var = (yxb0) this.b;
        elf0 elf0Var = glf0Var.c;
        boolean z = elf0Var instanceof elf0;
        elf0 elf0Var2 = z ? elf0Var : null;
        a9h a9hVar = elf0Var2 != null ? elf0Var2.a : null;
        if (a9hVar == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1093606182);
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                a9h a9hVar2 = new a9h((ArrayList) null, 0, (List) null, (String) null, false, (bef0) null, (eef0) null, 0, (bff0) null, 1023);
                x340Var2.s0(a9hVar2);
                objT = a9hVar2;
            }
            x340Var2.r(false);
            a9hVar = (a9h) objT;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1282206584);
            x340Var3.r(false);
        }
        ven0 ven0VarH = rwq.h(((sqs0) yxb0Var.e).b, x340Var, 0);
        e27 e27Var = (e27) yxb0Var.c;
        qim0 qim0VarI = zr7.i(zr7.i(anm1.N("lyrics_line", uyn1.z(8.0f, 0.0f, 2, u291.f(nim0.a, 1.0f))), new epe0((byte) 5, z)), new epe0((byte) 4, z));
        yqf0 yqf0Var = new yqf0(glf0Var.a, glf0Var.b, rqt0.K(a9hVar.a, (String) ven0VarH.getValue()), dhf0.c, false);
        bff0 bff0Var = a9hVar.b;
        boolean zBooleanValue = ((Boolean) ((kly0) yxb0Var.d).get()).booleanValue();
        fef0 fef0Var = a9hVar.a;
        String str = (String) ven0VarH.getValue();
        erf0 erf0Var = new erf0(zqf0.a, 2, bff0Var, (zBooleanValue && !u890.j(str, fef0Var.d) && rqt0.A(fef0Var, str)) ? 3 : 1, false, false);
        x340 x340Var4 = x340Var;
        Object objT2 = x340Var4.T();
        if (objT2 == m4cVar) {
            objT2 = z1f0.e1;
            x340Var4.s0(objT2);
        }
        iu30 iu30Var = (iu30) objT2;
        Object objT3 = x340Var4.T();
        if (objT3 == m4cVar) {
            objT3 = klf0.b;
            x340Var4.s0(objT3);
        }
        otw.c(e27Var, new frf0(yqf0Var, erf0Var, iu30Var, (iu30) objT3), qim0VarI, (ipb1) null, x340Var4, 64, 8);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        mpf0 mpf0Var = (mpf0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(mpf0Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            bff0 bff0VarA = mpf0Var.a();
            int i2 = i & 896;
            boolean z = i2 == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new uef0(iu30Var, (byte) 17);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            q3p1.b(0, 1, function0, x340Var2, false);
            qim0 qim0VarY = voo1.y(dug.e(u291.d(nim0.a, 1.0f), new mic0(0, 0L, 9187343241974906880L, p7h.M(new u7h[]{new u7h(z4p1.e(bff0VarA.a)), new u7h(z4p1.e(bff0VarA.b))}), (List) null), (hw61) null, 0.0f, 6), voo1.c);
            pof0 pof0Var = (pof0) this.b;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
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
            jpf0 jpf0Var = mpf0Var.b;
            if (jpf0Var instanceof kpf0) {
                x340Var2.i0(-808395474);
                poz0.g(bff0VarA, function0, x340Var2, 6);
                x340Var2.r(false);
            } else if (jpf0Var instanceof hpf0) {
                x340Var2.i0(-808391526);
                boolean z2 = i2 == 256;
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new uef0(iu30Var, (byte) 15);
                    x340Var2.s0(objT2);
                }
                poz0.d(bff0VarA, (Function0) objT2, function0, x340Var2, 6);
                x340Var2.r(false);
            } else {
                if (!(jpf0Var instanceof jpf0)) {
                    throw p3d1.k(x340Var2, -808397879, false);
                }
                x340Var2.i0(-808383906);
                jpf0 jpf0Var2 = jpf0Var;
                q8q q8qVar = pof0Var.a;
                boolean z3 = i2 == 256;
                Object objT3 = x340Var2.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new d720(iu30Var, (byte) 28);
                    x340Var2.s0(objT3);
                }
                vu30 vu30Var = (vu30) objT3;
                boolean z4 = i2 == 256;
                Object objT4 = x340Var2.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new uef0(iu30Var, (byte) 16);
                    x340Var2.s0(objT4);
                }
                poz0.f(jpf0Var2, q8qVar, vu30Var, (Function0) objT4, function0, x340Var2, 6);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iqf0 iqf0Var = (iqf0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        jqf0 jqf0Var = (jqf0) this.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = jqf0Var.c.a(jqf0Var.e);
            x340Var.s0(objT);
        }
        tyq tyqVar = (tyq) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            w9q w9qVar = jqf0Var.d;
            yjf0 yjf0Var = new yjf0(iu30Var, (byte) 4);
            w9qVar.getClass();
            objT2 = new c920(yjf0Var);
            x340Var.s0(objT2);
        }
        fn31.e(iqf0Var, jqf0Var.b, tyqVar, (c920) objT2, u291.d(nim0.a, 1.0f), iu30Var, x340Var, ((iIntValue >> 3) & 14) | 64 | ((iIntValue << 9) & 458752));
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        ((Number) obj5).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = dvf0.d;
            x340Var.s0(objT);
        }
        jto1.b(s161.b(qim0VarF, true, (iu30) objT), (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1996436782, new h6a0((ng20) this.b, iu30Var, (byte) 21), x340Var), (xu30) null, (xu30) null, (xu30) null, jyi.a, x340Var, 0, 196656, 30718);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        j4g0 j4g0Var = (j4g0) ((ng20) this.b).b;
        boolean z = j4g0Var instanceof h4g0;
        if (z) {
            i = 2131955255;
        } else {
            if (!(j4g0Var instanceof i4g0)) {
                eg.o();
                return null;
            }
            i = 2131955248;
        }
        if (z) {
            i2 = 2131955253;
        } else {
            if (!(j4g0Var instanceof i4g0)) {
                eg.o();
                return null;
            }
            i2 = 2131955245;
        }
        if (j4g0Var instanceof i4g0) {
            i3 = 2131955247;
        } else {
            if (!z) {
                eg.o();
                return null;
            }
            i3 = 2131955254;
        }
        byte b = 1;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new uef0(iu30Var, (byte) 23);
            x340Var2.s0(objT);
        }
        mqo1.e((Function0) objT, (i3u) null, (vu30) null, apo.r(2084694723, new vx1(i, (byte) 25), x340Var2), apo.r(1948667426, new vx1(i2, (byte) 26), x340Var2), apo.r(1812640129, new b30((byte) 21, i3, iu30Var, false), x340Var2), apo.r(1676612832, new k2g0(iu30Var, b), x340Var2), x340Var2, 1797120, 6);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        o4g0 o4g0Var = (o4g0) ((ng20) this.b).b;
        boolean z = o4g0Var instanceof m4g0;
        if (z) {
            i = 2131955258;
        } else {
            if (!(o4g0Var instanceof n4g0)) {
                eg.o();
                return null;
            }
            i = 2131955252;
        }
        if (z) {
            i2 = 2131955257;
        } else {
            if (!(o4g0Var instanceof n4g0)) {
                eg.o();
                return null;
            }
            i2 = 2131955250;
        }
        if (o4g0Var instanceof n4g0) {
            i3 = 2131955249;
        } else {
            if (!z) {
                eg.o();
                return null;
            }
            i3 = 2131955256;
        }
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new uef0(iu30Var, (byte) 26);
            x340Var2.s0(objT);
        }
        mqo1.e((Function0) objT, (i3u) null, (vu30) null, apo.r(-2089212676, new vx1(i, (byte) 28), x340Var2), apo.r(-260006339, new vx1(i2, (byte) 29), x340Var2), apo.r(1569199998, new b30((byte) 22, i3, iu30Var, false), x340Var2), apo.r(-896560961, new k2g0(iu30Var, (byte) 2), x340Var2), x340Var2, 1797120, 6);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xag0 xag0Var;
        boolean z;
        Object objT;
        boolean zI;
        Object objT2;
        boolean z2;
        Object objT3;
        boolean z3;
        Object objT4;
        xag0 xag0Var2 = (xag0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        fbg0 fbg0Var = (fbg0) this.b;
        nwa nwaVar = fbg0Var.b;
        lzn0 lzn0Var = fbg0Var.a;
        boolean z4 = fbg0Var.e;
        ezc ezcVar = fbg0Var.c;
        ezc ezcVar2 = fbg0Var.d;
        boolean z5 = fbg0Var.f;
        boolean z6 = fbg0Var.g;
        int i = (iIntValue & 896) ^ 384;
        boolean z7 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT5 = x340Var2.T();
        if (z7 || objT5 == m4cVar) {
            objT5 = new yjf0(iu30Var, (byte) 13);
            x340Var2.s0(objT5);
        }
        iu30 iu30Var2 = (iu30) objT5;
        if (i <= 256 || !x340Var2.g(iu30Var)) {
            xag0Var = xag0Var2;
            if ((iIntValue & 384) != 256) {
                z = false;
            }
            objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new yjf0(iu30Var, (byte) 14);
                x340Var2.s0(objT);
            }
            iu30 iu30Var3 = (iu30) objT;
            zI = x340Var2.i(fbg0Var);
            objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new tzf0(fbg0Var, (byte) 10);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            z2 = (i <= 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            objT3 = x340Var2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new uef0(iu30Var, (byte) 29);
                x340Var2.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            z3 = (i <= 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            objT4 = x340Var2.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new ebg0(iu30Var, (byte) 0);
                x340Var2.s0(objT4);
            }
            oon1.e(xag0Var, iu30Var2, iu30Var3, function0, function1, (Function0) objT4, lzn0Var, nwaVar, ezcVar, ezcVar2, z5, z6, (qim0) null, z4, x340Var2, (iIntValue >> 3) & 14);
            return rih1.a;
        }
        xag0Var = xag0Var2;
        z = true;
        objT = x340Var2.T();
        if (z) {
            objT = new yjf0(iu30Var, (byte) 14);
            x340Var2.s0(objT);
        } else {
            objT = new yjf0(iu30Var, (byte) 14);
            x340Var2.s0(objT);
        }
        iu30 iu30Var4 = (iu30) objT;
        zI = x340Var2.i(fbg0Var);
        objT2 = x340Var2.T();
        if (zI) {
            objT2 = new tzf0(fbg0Var, (byte) 10);
            x340Var2.s0(objT2);
        } else {
            objT2 = new tzf0(fbg0Var, (byte) 10);
            x340Var2.s0(objT2);
        }
        Function0 function2 = (Function0) objT2;
        if (i <= 256) {
        }
        objT3 = x340Var2.T();
        if (z2) {
            objT3 = new uef0(iu30Var, (byte) 29);
            x340Var2.s0(objT3);
        } else {
            objT3 = new uef0(iu30Var, (byte) 29);
            x340Var2.s0(objT3);
        }
        Function0 function3 = (Function0) objT3;
        if (i <= 256) {
        }
        objT4 = x340Var2.T();
        if (z3) {
            objT4 = new ebg0(iu30Var, (byte) 0);
            x340Var2.s0(objT4);
        } else {
            objT4 = new ebg0(iu30Var, (byte) 0);
            x340Var2.s0(objT4);
        }
        oon1.e(xag0Var, iu30Var2, iu30Var4, function2, function3, (Function0) objT4, lzn0Var, nwaVar, ezcVar, ezcVar2, z5, z6, (qim0) null, z4, x340Var2, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0162  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1 A[PHI: r17
      0x00b1: PHI (r17v2 boolean) = (r17v0 boolean), (r17v4 boolean) binds: [B:41:0x00af, B:39:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc A[PHI: r23
      0x00dc: PHI (r23v3 p.iu30) = (r23v1 p.iu30), (r23v4 p.iu30) binds: [B:55:0x00da, B:53:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107 A[PHI: r24
      0x0107: PHI (r24v3 p.iu30) = (r24v1 p.iu30), (r24v4 p.iu30) binds: [B:69:0x0105, B:67:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:74:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0112  */
    /* JADX WARN: Code duplicated, block: B:78:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0132 A[PHI: r25
      0x0132: PHI (r25v3 p.iu30) = (r25v1 p.iu30), (r25v4 p.iu30) binds: [B:83:0x0130, B:81:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x014d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0153  */
    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        hdg0 hdg0Var;
        boolean z;
        Object objT;
        boolean z2;
        boolean z3;
        Object objT2;
        iu30 iu30Var;
        iu30 iu30Var2;
        boolean z4;
        Object objT3;
        iu30 iu30Var3;
        iu30 iu30Var4;
        boolean z5;
        Object objT4;
        iu30 iu30Var5;
        iu30 iu30Var6;
        boolean z6;
        Object objT5;
        boolean z7;
        Object objT6;
        hdg0 hdg0Var2 = (hdg0) obj2;
        iu30 iu30Var7 = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        jdg0 jdg0Var = (jdg0) this.b;
        lzn0 lzn0Var = jdg0Var.a;
        boolean z8 = jdg0Var.e;
        nwa nwaVar = jdg0Var.b;
        ezc ezcVar = jdg0Var.c;
        ezc ezcVar2 = jdg0Var.d;
        boolean z9 = jdg0Var.f;
        boolean z10 = jdg0Var.g;
        x340 x340Var = (b0k) obj4;
        boolean zI = x340Var.i(jdg0Var);
        Object objT7 = x340Var.T();
        if (zI || objT7 == m4cVar) {
            objT7 = new tzf0(jdg0Var, (byte) 11);
            x340Var.s0(objT7);
        }
        Function0 function0 = (Function0) objT7;
        int i = (iIntValue & 896) ^ 384;
        boolean z11 = (i > 256 && x340Var.g(iu30Var7)) || (iIntValue & 384) == 256;
        Object objT8 = x340Var.T();
        if (z11 || objT8 == m4cVar) {
            objT8 = new ebg0(iu30Var7, (byte) 1);
            x340Var.s0(objT8);
        }
        Function0 function1 = (Function0) objT8;
        if (i <= 256 || !x340Var.g(iu30Var7)) {
            hdg0Var = hdg0Var2;
            if ((iIntValue & 384) != 256) {
                z = false;
            }
            objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ebg0(iu30Var7, (byte) 2);
                x340Var.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            if (i > 256 || !x340Var.g(iu30Var7)) {
                z2 = z8;
                if ((iIntValue & 384) != 256) {
                    z3 = false;
                }
                objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new yjf0(iu30Var7, (byte) 15);
                    x340Var.s0(objT2);
                }
                iu30Var = (iu30) objT2;
                if (i > 256 || !x340Var.g(iu30Var7)) {
                    iu30Var2 = iu30Var;
                    if ((iIntValue & 384) != 256) {
                        z4 = false;
                    }
                    objT3 = x340Var.T();
                    if (z4 || objT3 == m4cVar) {
                        objT3 = new yjf0(iu30Var7, (byte) 16);
                        x340Var.s0(objT3);
                    }
                    iu30Var3 = (iu30) objT3;
                    if (i > 256 || !x340Var.g(iu30Var7)) {
                        iu30Var4 = iu30Var3;
                        if ((iIntValue & 384) != 256) {
                            z5 = false;
                        }
                        objT4 = x340Var.T();
                        if (z5 || objT4 == m4cVar) {
                            objT4 = new yjf0(iu30Var7, (byte) 17);
                            x340Var.s0(objT4);
                        }
                        iu30Var5 = (iu30) objT4;
                        if (i > 256 || !x340Var.g(iu30Var7)) {
                            iu30Var6 = iu30Var5;
                            if ((iIntValue & 384) != 256) {
                                z6 = false;
                            }
                            objT5 = x340Var.T();
                            if (z6 || objT5 == m4cVar) {
                                objT5 = new yjf0(iu30Var7, (byte) 18);
                                x340Var.s0(objT5);
                            }
                            iu30 iu30Var8 = (iu30) objT5;
                            z7 = (i <= 256 && x340Var.g(iu30Var7)) || (iIntValue & 384) == 256;
                            objT6 = x340Var.T();
                            if (z7 || objT6 == m4cVar) {
                                objT6 = new yjf0(iu30Var7, (byte) 19);
                                x340Var.s0(objT6);
                            }
                            qpn1.b(hdg0Var, function0, function1, function2, iu30Var2, iu30Var4, iu30Var6, iu30Var8, (iu30) objT6, lzn0Var, nwaVar, ezcVar, ezcVar2, z9, z10, (qim0) null, z2, x340Var, (iIntValue >> 3) & 14);
                            return rih1.a;
                        }
                        iu30Var6 = iu30Var5;
                        z6 = true;
                        objT5 = x340Var.T();
                        if (z6) {
                            objT5 = new yjf0(iu30Var7, (byte) 18);
                            x340Var.s0(objT5);
                        } else {
                            objT5 = new yjf0(iu30Var7, (byte) 18);
                            x340Var.s0(objT5);
                        }
                        iu30 iu30Var9 = (iu30) objT5;
                        if (i <= 256) {
                        }
                        objT6 = x340Var.T();
                        if (z7) {
                            objT6 = new yjf0(iu30Var7, (byte) 19);
                            x340Var.s0(objT6);
                        } else {
                            objT6 = new yjf0(iu30Var7, (byte) 19);
                            x340Var.s0(objT6);
                        }
                        qpn1.b(hdg0Var, function0, function1, function2, iu30Var2, iu30Var4, iu30Var6, iu30Var9, (iu30) objT6, lzn0Var, nwaVar, ezcVar, ezcVar2, z9, z10, (qim0) null, z2, x340Var, (iIntValue >> 3) & 14);
                        return rih1.a;
                    }
                    iu30Var4 = iu30Var3;
                    z5 = true;
                    objT4 = x340Var.T();
                    if (z5) {
                        objT4 = new yjf0(iu30Var7, (byte) 17);
                        x340Var.s0(objT4);
                    } else {
                        objT4 = new yjf0(iu30Var7, (byte) 17);
                        x340Var.s0(objT4);
                    }
                    iu30Var5 = (iu30) objT4;
                    if (i > 256) {
                        iu30Var6 = iu30Var5;
                        if ((iIntValue & 384) != 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        iu30Var6 = iu30Var5;
                        if ((iIntValue & 384) != 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    objT5 = x340Var.T();
                    if (z6) {
                        objT5 = new yjf0(iu30Var7, (byte) 18);
                        x340Var.s0(objT5);
                    } else {
                        objT5 = new yjf0(iu30Var7, (byte) 18);
                        x340Var.s0(objT5);
                    }
                    iu30 iu30Var10 = (iu30) objT5;
                    if (i <= 256) {
                    }
                    objT6 = x340Var.T();
                    if (z7) {
                        objT6 = new yjf0(iu30Var7, (byte) 19);
                        x340Var.s0(objT6);
                    } else {
                        objT6 = new yjf0(iu30Var7, (byte) 19);
                        x340Var.s0(objT6);
                    }
                    qpn1.b(hdg0Var, function0, function1, function2, iu30Var2, iu30Var4, iu30Var6, iu30Var10, (iu30) objT6, lzn0Var, nwaVar, ezcVar, ezcVar2, z9, z10, (qim0) null, z2, x340Var, (iIntValue >> 3) & 14);
                    return rih1.a;
                }
                iu30Var2 = iu30Var;
                z4 = true;
                objT3 = x340Var.T();
                if (z4) {
                    objT3 = new yjf0(iu30Var7, (byte) 16);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new yjf0(iu30Var7, (byte) 16);
                    x340Var.s0(objT3);
                }
                iu30Var3 = (iu30) objT3;
                if (i > 256) {
                    iu30Var4 = iu30Var3;
                    if ((iIntValue & 384) != 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    iu30Var4 = iu30Var3;
                    if ((iIntValue & 384) != 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                objT4 = x340Var.T();
                if (z5) {
                    objT4 = new yjf0(iu30Var7, (byte) 17);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new yjf0(iu30Var7, (byte) 17);
                    x340Var.s0(objT4);
                }
                iu30Var5 = (iu30) objT4;
                if (i > 256) {
                    iu30Var6 = iu30Var5;
                    if ((iIntValue & 384) != 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    iu30Var6 = iu30Var5;
                    if ((iIntValue & 384) != 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objT5 = x340Var.T();
                if (z6) {
                    objT5 = new yjf0(iu30Var7, (byte) 18);
                    x340Var.s0(objT5);
                } else {
                    objT5 = new yjf0(iu30Var7, (byte) 18);
                    x340Var.s0(objT5);
                }
                iu30 iu30Var11 = (iu30) objT5;
                if (i <= 256) {
                }
                objT6 = x340Var.T();
                if (z7) {
                    objT6 = new yjf0(iu30Var7, (byte) 19);
                    x340Var.s0(objT6);
                } else {
                    objT6 = new yjf0(iu30Var7, (byte) 19);
                    x340Var.s0(objT6);
                }
                qpn1.b(hdg0Var, function0, function1, function2, iu30Var2, iu30Var4, iu30Var6, iu30Var11, (iu30) objT6, lzn0Var, nwaVar, ezcVar, ezcVar2, z9, z10, (qim0) null, z2, x340Var, (iIntValue >> 3) & 14);
                return rih1.a;
            }
            z2 = z8;
            z3 = true;
            objT2 = x340Var.T();
            if (z3) {
                objT2 = new yjf0(iu30Var7, (byte) 15);
                x340Var.s0(objT2);
            } else {
                objT2 = new yjf0(iu30Var7, (byte) 15);
                x340Var.s0(objT2);
            }
            iu30Var = (iu30) objT2;
            if (i > 256) {
                iu30Var2 = iu30Var;
                if ((iIntValue & 384) != 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                iu30Var2 = iu30Var;
                if ((iIntValue & 384) != 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            objT3 = x340Var.T();
            if (z4) {
                objT3 = new yjf0(iu30Var7, (byte) 16);
                x340Var.s0(objT3);
            } else {
                objT3 = new yjf0(iu30Var7, (byte) 16);
                x340Var.s0(objT3);
            }
            iu30Var3 = (iu30) objT3;
            if (i > 256) {
                iu30Var4 = iu30Var3;
                if ((iIntValue & 384) != 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                iu30Var4 = iu30Var3;
                if ((iIntValue & 384) != 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            objT4 = x340Var.T();
            if (z5) {
                objT4 = new yjf0(iu30Var7, (byte) 17);
                x340Var.s0(objT4);
            } else {
                objT4 = new yjf0(iu30Var7, (byte) 17);
                x340Var.s0(objT4);
            }
            iu30Var5 = (iu30) objT4;
            if (i > 256) {
                iu30Var6 = iu30Var5;
                if ((iIntValue & 384) != 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                iu30Var6 = iu30Var5;
                if ((iIntValue & 384) != 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            objT5 = x340Var.T();
            if (z6) {
                objT5 = new yjf0(iu30Var7, (byte) 18);
                x340Var.s0(objT5);
            } else {
                objT5 = new yjf0(iu30Var7, (byte) 18);
                x340Var.s0(objT5);
            }
            iu30 iu30Var12 = (iu30) objT5;
            if (i <= 256) {
            }
            objT6 = x340Var.T();
            if (z7) {
                objT6 = new yjf0(iu30Var7, (byte) 19);
                x340Var.s0(objT6);
            } else {
                objT6 = new yjf0(iu30Var7, (byte) 19);
                x340Var.s0(objT6);
            }
            qpn1.b(hdg0Var, function0, function1, function2, iu30Var2, iu30Var4, iu30Var6, iu30Var12, (iu30) objT6, lzn0Var, nwaVar, ezcVar, ezcVar2, z9, z10, (qim0) null, z2, x340Var, (iIntValue >> 3) & 14);
            return rih1.a;
        }
        hdg0Var = hdg0Var2;
        z = true;
        objT = x340Var.T();
        if (z) {
            objT = new ebg0(iu30Var7, (byte) 2);
            x340Var.s0(objT);
        } else {
            objT = new ebg0(iu30Var7, (byte) 2);
            x340Var.s0(objT);
        }
        Function0 function3 = (Function0) objT;
        if (i > 256) {
            z2 = z8;
            if ((iIntValue & 384) != 256) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z2 = z8;
            if ((iIntValue & 384) != 256) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        objT2 = x340Var.T();
        if (z3) {
            objT2 = new yjf0(iu30Var7, (byte) 15);
            x340Var.s0(objT2);
        } else {
            objT2 = new yjf0(iu30Var7, (byte) 15);
            x340Var.s0(objT2);
        }
        iu30Var = (iu30) objT2;
        if (i > 256) {
            iu30Var2 = iu30Var;
            if ((iIntValue & 384) != 256) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            iu30Var2 = iu30Var;
            if ((iIntValue & 384) != 256) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        objT3 = x340Var.T();
        if (z4) {
            objT3 = new yjf0(iu30Var7, (byte) 16);
            x340Var.s0(objT3);
        } else {
            objT3 = new yjf0(iu30Var7, (byte) 16);
            x340Var.s0(objT3);
        }
        iu30Var3 = (iu30) objT3;
        if (i > 256) {
            iu30Var4 = iu30Var3;
            if ((iIntValue & 384) != 256) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            iu30Var4 = iu30Var3;
            if ((iIntValue & 384) != 256) {
                z5 = true;
            } else {
                z5 = false;
            }
        }
        objT4 = x340Var.T();
        if (z5) {
            objT4 = new yjf0(iu30Var7, (byte) 17);
            x340Var.s0(objT4);
        } else {
            objT4 = new yjf0(iu30Var7, (byte) 17);
            x340Var.s0(objT4);
        }
        iu30Var5 = (iu30) objT4;
        if (i > 256) {
            iu30Var6 = iu30Var5;
            if ((iIntValue & 384) != 256) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            iu30Var6 = iu30Var5;
            if ((iIntValue & 384) != 256) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        objT5 = x340Var.T();
        if (z6) {
            objT5 = new yjf0(iu30Var7, (byte) 18);
            x340Var.s0(objT5);
        } else {
            objT5 = new yjf0(iu30Var7, (byte) 18);
            x340Var.s0(objT5);
        }
        iu30 iu30Var13 = (iu30) objT5;
        if (i <= 256) {
        }
        objT6 = x340Var.T();
        if (z7) {
            objT6 = new yjf0(iu30Var7, (byte) 19);
            x340Var.s0(objT6);
        } else {
            objT6 = new yjf0(iu30Var7, (byte) 19);
            x340Var.s0(objT6);
        }
        qpn1.b(hdg0Var, function0, function1, function3, iu30Var2, iu30Var4, iu30Var6, iu30Var13, (iu30) objT6, lzn0Var, nwaVar, ezcVar, ezcVar2, z9, z10, (qim0) null, z2, x340Var, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        bgg0 bgg0Var = (bgg0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean z = true;
        boolean zI = ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(bgg0Var)) || (iIntValue & 48) == 32) | x340Var.i(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new e9c0(bgg0Var, ven0Var, (lnm) null, (byte) 29);
            x340Var.s0(objT2);
        }
        int i = (iIntValue >> 3) & 14;
        qxd0.t(bgg0Var, x340Var, (vu30) objT2);
        Boolean bool = (Boolean) ven0Var.getValue();
        bool.booleanValue();
        boolean zI2 = x340Var.i(ven0Var);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new hj6(ven0Var, (lnm) null, (byte) 12);
            x340Var.s0(objT3);
        }
        qxd0.t(bool, x340Var, (vu30) objT3);
        qj0 qj0Var = (qj0) this.b;
        na9 na9Var = (na9) qj0Var.d;
        boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
        boolean zI3 = x340Var.i(ven0Var);
        if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        boolean z2 = zI3 | z;
        Object objT4 = x340Var.T();
        if (z2 || objT4 == m4cVar) {
            objT4 = new wq9(iu30Var, ven0Var, (byte) 22);
            x340Var.s0(objT4);
        }
        qj0Var.e(bgg0Var, na9Var, zBooleanValue, (Function0) objT4, (qim0) null, x340Var, i);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        plg0 plg0Var = (plg0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        nm1 nm1Var = (nm1) this.b;
        x340 x340Var = (b0k) obj4;
        x340Var.i0(1409114804);
        float fM0 = ((wat) x340Var.k(t4k.h)).M0((int) (((crl1) x340Var.k(t4k.u)).a() >> 32));
        x340Var.r(false);
        boolean zBooleanValue = ((Boolean) x340Var.k(alg0.a)).booleanValue();
        qim0 qim0VarX = nim0.a;
        if (zBooleanValue) {
            x340Var.i0(733062573);
            irn1.v((bv40) nm1Var.g, (mjm) nm1Var.f, (d0r) nm1Var.b, plg0Var, iu30Var, u291.f(u291.x(0.0f, fM0, 1, qim0VarX), 1.0f), x340Var, 64512 & (iIntValue << 6));
            x340Var.r(false);
        } else {
            x340Var.i0(733391576);
            long j = ((u7h) x340Var.k(gaa1.a)).a;
            boolean zBooleanValue2 = ((Boolean) b2u.t(x340Var).getValue()).booleanValue();
            String strO0 = cwl1.o0(x340Var, 2131962695);
            qim0 qim0VarN = anm1.N("contributor-card-root", u291.d(u291.x(0.0f, fM0, 1, qim0VarX), 1.0f));
            if (zBooleanValue2 && (plg0Var instanceof nlg0)) {
                x340Var.i0(733864264);
                boolean zF = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(plg0Var)) || (iIntValue & 48) == 32) | x340Var.f(j);
                Object objT = x340Var.T();
                if (zF || objT == m4cVar) {
                    objT = new xlg0(plg0Var, iu30Var, j, (byte) 0);
                    x340Var.s0(objT);
                }
                qim0VarX = bin.x(qim0VarX, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13);
                x340Var.r(false);
            } else {
                x340Var.i0(734293397);
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarN.then(qim0VarX);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = wlg0.f;
                x340Var.s0(objT2);
            }
            rrn1.o(apo.r(500801924, new q0g0(plg0Var, iu30Var, (byte) 5), x340Var), apo.r(-2043294420, new iwf0(nm1Var, plg0Var, iu30Var, (byte) 12), x340Var), s161.b(qim0VarThen, true, (iu30) objT2), x340Var, 54);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gmg0 gmg0Var = (gmg0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        nm1 nm1Var = (nm1) this.b;
        x340 x340Var = (b0k) obj4;
        x340Var.i0(1320609019);
        float fM0 = ((wat) x340Var.k(t4k.h)).M0((int) (((crl1) x340Var.k(t4k.u)).a() >> 32));
        x340Var.r(false);
        boolean zBooleanValue = ((Boolean) x340Var.k(alg0.a)).booleanValue();
        long j = ((u7h) x340Var.k(gaa1.a)).a;
        qim0 qim0VarX = nim0.a;
        if (zBooleanValue) {
            x340Var.i0(-2010555723);
            lrn1.m((d0r) nm1Var.b, gmg0Var, iu30Var, (njm) nm1Var.f, (bv40) nm1Var.g, u291.x(0.0f, fM0, 1, qim0VarX), x340Var, iIntValue & 1008);
            x340Var.r(false);
        } else {
            x340Var.i0(-2010242995);
            String strO0 = cwl1.o0(x340Var, 2131962699);
            boolean zBooleanValue2 = ((Boolean) b2u.t(x340Var).getValue()).booleanValue();
            qim0 qim0VarN = anm1.N("contributor-card-root", u291.d(u291.x(0.0f, fM0, 1, qim0VarX), 1.0f));
            if (zBooleanValue2) {
                x340Var.i0(-2009849047);
                boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(gmg0Var) | x340Var.f(j);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new au0(gmg0Var, iu30Var, j, (byte) 5);
                    x340Var.s0(objT);
                }
                qim0VarX = bin.x(qim0VarX, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13);
                x340Var.r(false);
            } else {
                x340Var.i0(-2009366098);
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarN.then(qim0VarX);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = wlg0.V0;
                x340Var.s0(objT2);
            }
            rrn1.o(apo.r(-1668570647, new q0g0(gmg0Var, iu30Var, (byte) 6), x340Var), apo.r(364861249, new iwf0(nm1Var, gmg0Var, iu30Var, (byte) 13), x340Var), s161.b(qim0VarThen, true, (iu30) objT2), x340Var, 54);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = ef.a;
        ezg0 ezg0Var = (ezg0) this.b;
        mod.b(kivVar.a(ezg0Var.t), apo.r(1096294489, new w0f0(ezg0Var, (uyg0) obj2, (ksw) obj, (iu30) obj3, (byte) 8), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        wdh0 wdh0Var = (xdh0) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        nm1 nm1Var = (nm1) this.b;
        if (wdh0Var instanceof wdh0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-2102447873);
            who1.g(wdh0Var.a.c.b.size(), 48, apo.r(83416271, new q0g0(nm1Var, wdh0Var, (byte) 13), x340Var2), x340Var2, (qim0) null);
            x340Var2.r(false);
        } else if (wdh0Var instanceof vdh0) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-2102440937);
            otw.c((szj) nm1Var.b, ((vdh0) wdh0Var).a, (qim0) null, (ipb1) null, x340Var3, 0, 12);
            x340Var3.r(false);
        } else {
            if (!(wdh0Var instanceof udh0)) {
                throw p3d1.k(x340Var, -2102449272, false);
            }
            x340 x340Var4 = x340Var;
            x340Var4.i0(-2102438304);
            x340Var4.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        nkh0 nkh0Var = (nkh0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = nkh0Var.c;
        String str2 = nkh0Var.a;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(nkh0Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            pkh0 pkh0Var = (pkh0) this.b;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
            nko1.H(qim0VarE, x340Var2, y580.Y);
            int iC = l1d.C(nkh0Var.b);
            if (iC == 0) {
                x340Var2.i0(983820537);
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                boolean z = (i & 896) == 256;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new mhg0(iu30Var, (byte) 10);
                    x340Var2.s0(objT);
                }
                pkh0Var.e(0, str2, str, x340Var2, zr7.i(qim0VarD2, new ipy((iu30) objT, (byte) 10)));
                x340Var2.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var2, 983818739, false);
                }
                x340Var2.i0(983827194);
                pkh0Var.f(384, str2, str, x340Var2, u291.d(nim0Var, 1.0f));
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        wee0 wee0Var;
        ArrayList arrayList;
        String str;
        io70 io70Var;
        String str2;
        List list;
        String str3;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                fq7.g(((ocd0) obj2).a, (qim0) null, xay.d((ni20) null, (fra) null, 15).a(xay.e(3, (ni20) null)), xay.l(15, (ni20) null).a(xay.f(3, (ni20) null)), (String) null, apo.r(1523964395, new k2d0(obj6, (byte) 4), b0kVar), b0kVar, 196608, 18);
                return rih1Var;
            case 1:
                int iIntValue = ((Number) obj5).intValue();
                hgd0 hgd0Var = (hgd0) ((et90) obj6).e;
                g0p1.m(hgd0Var.n(), hgd0Var.l(), (iu30) obj3, (qim0) null, (b0k) obj4, iIntValue & 896);
                return rih1Var;
            case 2:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                rwj rwjVar = (rwj) obj6;
                mod.b(oi7.a.a((gw70) rwjVar.e), apo.r(-1187555443, new mb90((ojd0) obj2, rwjVar, (iu30) obj3, (byte) 27), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 3:
                d7e0 d7e0Var = (d7e0) obj2;
                x340 x340Var = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                ldo ldoVar = (ldo) obj6;
                dgy dgyVar = (dgy) ldoVar.d;
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= (iIntValue2 & 64) == 0 ? x340Var.g(d7e0Var) : x340Var.i(d7e0Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 1041) != 1040)) {
                    x340Var2.b0();
                } else if (d7e0Var instanceof c7e0) {
                    x340Var2.i0(69274217);
                    String string = ((Resources) x340Var2.k(AndroidCompositionLocals_androidKt.c)).getString(2131955552);
                    long j = u7h.k;
                    j2i j2iVar = owi.a;
                    Object objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = fnc0.a1;
                        x340Var2.s0(objT);
                    }
                    ot11.a(dgyVar, (String) null, string, false, false, j, j2iVar, (Function0) objT, (qim0) null, x340Var2, 14380080);
                    x340Var2.r(false);
                } else {
                    if (!(d7e0Var instanceof b7e0)) {
                        throw p3d1.k(x340Var2, 972064905, false);
                    }
                    x340Var2.i0(69742441);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = ((bzo) ldoVar.c).a(dgyVar);
                        x340Var2.s0(objT2);
                    }
                    b7e0 b7e0Var = (b7e0) d7e0Var;
                    otw.c((fgy) objT2, new cgy(b7e0Var.b, b7e0Var.a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 4:
                g7e0 g7e0Var = (g7e0) obj2;
                x340 x340Var3 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (g7e0Var instanceof f7e0) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-2116739338);
                    x340Var4.r(false);
                } else {
                    if (!(g7e0Var instanceof e7e0)) {
                        throw p3d1.k(x340Var3, -2007945848, false);
                    }
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-2116709175);
                    otw.c((cm0) ((ng20) obj6).b, ((e7e0) g7e0Var).a, (qim0) null, (ipb1) null, x340Var5, 64, 12);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 5:
                bae0 bae0Var = (bae0) obj6;
                d5p1.b((z9e0) obj2, (iu30) obj3, bae0Var.a, bae0Var.b, bae0Var.c, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 6:
                nee0 nee0Var = (nee0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                see0 see0Var = (see0) obj6;
                int i = nee0Var.c;
                e1r0 e1r0Var = new e1r0((byte) 4);
                int i2 = (iIntValue3 & 896) ^ 384;
                boolean z = (i2 > 256 && x340Var6.g(iu30Var)) || (iIntValue3 & 384) == 256;
                x340 x340Var7 = x340Var6;
                Object objT3 = x340Var7.T();
                if (z || objT3 == m4cVar2) {
                    objT3 = new jwa0(iu30Var, (byte) 21);
                    x340Var7.s0(objT3);
                }
                ihg0 ihg0VarE = p1p1.E(e1r0Var, (iu30) objT3, x340Var7);
                boolean zI = x340Var7.i(see0Var) | x340Var7.i(ihg0VarE);
                Object objT4 = x340Var7.T();
                if (zI || objT4 == m4cVar2) {
                    objT4 = new e9c0(see0Var, ihg0VarE, (lnm) null, (byte) 14);
                    x340Var7.s0(objT4);
                }
                qxd0.t(rih1Var, x340Var7, (vu30) objT4);
                Context context = (Context) x340Var7.k(AndroidCompositionLocals_androidKt.b);
                iac0 iac0Var = (iac0) x340Var7.k(jfe0.a);
                boolean zI2 = x340Var7.i(iac0Var) | x340Var7.i(see0Var) | x340Var7.i(context) | ((i2 > 256 && x340Var7.g(iu30Var)) || (iIntValue3 & 384) == 256);
                Object objT5 = x340Var7.T();
                if (zI2 || objT5 == m4cVar2) {
                    objT5 = new z290((Object) iac0Var, (Object) see0Var, (Object) context, (Object) iu30Var, (lnm) null, (byte) 18);
                    x340Var7.s0(objT5);
                }
                qxd0.t(iac0Var, x340Var7, (vu30) objT5);
                if (nee0Var.b) {
                    x340Var7.i0(1184872710);
                    h7p1.k(i == 3, iu30Var, x340Var7, (iIntValue3 >> 3) & 112);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(1185023773);
                    x340Var7.r(false);
                }
                int[] iArr = ree0.a;
                String strO0 = cwl1.o0(x340Var7, iArr[l1d.C(i)] == 1 ? 2131957650 : 2131957652);
                String strO1 = cwl1.o0(x340Var7, iArr[l1d.C(i)] == 1 ? 2131957649 : 2131957651);
                String strO2 = cwl1.o0(x340Var7, i == 2 ? 2131957643 : 2131957642);
                boolean zI3 = x340Var7.i(nee0Var) | ((i2 > 256 && x340Var7.g(iu30Var)) || (iIntValue3 & 384) == 256) | x340Var7.i(see0Var);
                Object objT6 = x340Var7.T();
                if (zI3 || objT6 == m4cVar2) {
                    objT6 = new dt90(nee0Var, iu30Var, see0Var, (byte) 13);
                    x340Var7.s0(objT6);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT6);
                idx idxVar = new idx();
                String str4 = i == 2 ? "LocalFilesOpenSettingsButton" : "LocalFilesAllowAccessButton";
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarN = anm1.N(str4, nim0Var2);
                x340Var7.i0(-238807506);
                qim0 qim0VarD = u291.d(nim0Var2, 1.0f);
                if (nee0Var.a) {
                    uwr uwrVar = cbx.a;
                    qim0VarD = qim0VarD.then(uyn1.B(nim0Var2, 0.0f, cbx.b(x340Var7).b.f, 0.0f, 0.0f, 13));
                }
                x340Var7.r(false);
                qim0 qim0VarN2 = anm1.N("LocalFilesEmptyViewElement", qim0VarD);
                uwr uwrVar2 = cbx.a;
                jap1.l(uyn1.z(cbx.b(x340Var7).b.b, 0.0f, 2, qim0VarN2), qim0VarN, strO0, strO1, strO2, gbxVar, idxVar, (vu30) null, x340Var7, 0, 384);
                return rih1Var;
            case 7:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                doe doeVar = (doe) obj6;
                j7e0 j7e0Var = ((hwq) obj2).g;
                boolean z2 = j7e0Var instanceof j7e0;
                ArrayList arrayList2 = z6x.a;
                if (z2) {
                    zuc0 zuc0Var = j7e0Var.a;
                    smc0 smc0VarN = k4p1.n();
                    tu00 tu00Var = zuc0Var.q;
                    fjf1 fjf1Var = zuc0Var.p;
                    jo70 jo70VarA = tu00Var.a(jo70.class);
                    if (jo70VarA == null || (list = jo70VarA.d) == null) {
                        fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
                        if (fjf1Var2 != null) {
                            List list2 = fjf1Var2.b;
                            ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((yif1) it.next()).a);
                            }
                            arrayList = new ArrayList();
                            for (Object obj7 : arrayList3) {
                                if (((String) obj7).length() > 0) {
                                    arrayList.add(obj7);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else {
                        List list3 = list;
                        ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((ho70) it2.next()).a);
                        }
                        arrayList = new ArrayList();
                        for (Object obj8 : arrayList4) {
                            if (((String) obj8).length() > 0) {
                                arrayList.add(obj8);
                            }
                        }
                    }
                    if (arrayList != null) {
                        arrayList2 = arrayList;
                    }
                    String strY0 = o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                    jo70 jo70VarA2 = zuc0Var.q.a(jo70.class);
                    if (jo70VarA2 == null || (io70Var = jo70VarA2.e) == null || (str2 = io70Var.a) == null) {
                        fjf1 fjf1Var3 = fjf1Var instanceof fjf1 ? fjf1Var : null;
                        str = fjf1Var3 != null ? fjf1Var3.a.a : null;
                    } else {
                        str = str2;
                    }
                    if (str == null) {
                        str = "";
                    }
                    smc0VarN.add(strY0);
                    if (!ihc1.y0(strY0) && !ihc1.y0(str)) {
                        smc0VarN.add(" • ");
                        smc0VarN.add(str);
                    }
                    wee0Var = new wee0(k4p1.k(smc0VarN));
                } else {
                    wee0Var = new wee0(arrayList2);
                }
                doeVar.g(wee0Var, b0kVar3, 0);
                return rih1Var;
            case 8:
                are0 are0Var = (are0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                b0k b0kVar4 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                j2i j2iVarR = apo.r(627391418, new k2d0(((gqe0) obj6).b.get(), (byte) 17), b0kVar4);
                int i3 = iIntValue4 >> 3;
                jap1.i(are0Var, iu30Var2, j2iVarR, apo.r(98270654, new qae0(are0Var, iu30Var2, j2iVarR, (byte) 6), b0kVar4), b0kVar4, (i3 & 112) | (i3 & 14) | 3456);
                return rih1Var;
            case 9:
                xnb1 xnb1Var = (xnb1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                c380 c380Var = xnb1Var.c;
                lrn1 lrn1Var = xnb1Var.d;
                qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                uwr uwrVar3 = cbx.a;
                cua cuaVar = cbx.b(x340Var8).f;
                qim0 qim0VarF = dug.f(i1p1.q(qim0VarZ, er31.b(8.0f)), z4p1.e(452984831), d4o1.a);
                float f = cbx.b(x340Var8).b.c;
                cvx cvxVar = cbx.b(x340Var8).b;
                qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, f);
                y1f0 y1f0Var = (y1f0) obj6;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var9 = x340Var8;
                int iHashCode = Long.hashCode(x340Var9.T);
                xos0 xos0VarM = x340Var9.m();
                qim0 qim0VarE = zr7.E(x340Var8, qim0VarY);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var8, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var8, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var8, lljVar3);
                nko1.F(x340Var8);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var8, lljVar4);
                qim0 qim0VarA = h2c.a.a(nim0Var, een.h);
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var8, 0);
                int iHashCode2 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM2 = x340Var10.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarA);
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(mbhVarA, x340Var8, lljVar);
                nko1.H(xos0VarM2, x340Var8, lljVar2);
                i3a.l(iHashCode2, x340Var8, lljVar3, x340Var8);
                nko1.H(qim0VarE2, x340Var8, lljVar4);
                if (lrn1Var instanceof vzg1) {
                    x340Var10.i0(-1539654085);
                    y1f0Var.h(xnb1Var.b, (vzg1) lrn1Var, xnb1Var.c, iu30Var3, x340Var8, (iIntValue5 << 3) & 7168);
                    x340Var10.r(false);
                } else if (lrn1Var.equals(wzg1.c)) {
                    x340Var10.i0(-1539647387);
                    y1f0Var.j(xnb1Var.b, c380Var, x340Var8, 0);
                    x340Var10.r(false);
                } else {
                    if (!(lrn1Var instanceof uzg1)) {
                        throw p3d1.k(x340Var10, -1539655719, false);
                    }
                    x340Var10.i0(-1539643794);
                    y1f0Var.e(c380Var, (uzg1) lrn1Var, x340Var8, 0);
                    x340Var10.r(false);
                }
                x340Var10.r(true);
                x340Var10.r(true);
                return rih1Var;
            case 10:
                xnb1 xnb1Var2 = (xnb1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                c380 c380Var2 = xnb1Var2.c;
                lrn1 lrn1Var2 = xnb1Var2.d;
                qim0 qim0VarZ2 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                uwr uwrVar4 = cbx.a;
                cua cuaVar2 = cbx.b(x340Var11).f;
                qim0 qim0VarX = uyn1.x(dug.f(i1p1.q(qim0VarZ2, er31.b(8.0f)), z4p1.e(452984831), d4o1.a), cbx.b(x340Var11).b.b);
                a2f0 a2f0Var = (a2f0) obj6;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var12 = x340Var11;
                int iHashCode3 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM3 = x340Var12.m();
                qim0 qim0VarE3 = zr7.E(x340Var11, qim0VarX);
                hzj.A.getClass();
                x340 x340Var13 = x340Var11;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(gfh0VarC2, x340Var11, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM3, x340Var11, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var11, lljVar7);
                nko1.F(x340Var11);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE3, x340Var11, lljVar8);
                qim0 qim0VarA2 = h2c.a.a(nim0Var, een.h);
                mbh mbhVarA2 = jbh.a(h36.c, een.Q0, x340Var11, 0);
                int iHashCode4 = Long.hashCode(x340Var13.T);
                xos0 xos0VarM4 = x340Var13.m();
                qim0 qim0VarE4 = zr7.E(x340Var11, qim0VarA2);
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(mbhVarA2, x340Var11, lljVar5);
                nko1.H(xos0VarM4, x340Var11, lljVar6);
                i3a.l(iHashCode4, x340Var11, lljVar7, x340Var11);
                nko1.H(qim0VarE4, x340Var11, lljVar8);
                if (lrn1Var2 instanceof vzg1) {
                    x340Var13.i0(-1993290557);
                    a2f0Var.h(xnb1Var2.b, (vzg1) lrn1Var2, xnb1Var2.c, iu30Var4, x340Var11, (iIntValue6 << 3) & 7168);
                    x340Var13.r(false);
                } else if (lrn1Var2.equals(wzg1.c)) {
                    x340Var13.i0(-1993283859);
                    a2f0Var.j(xnb1Var2.b, c380Var2, x340Var11, 0);
                    x340Var13.r(false);
                } else {
                    if (!(lrn1Var2 instanceof uzg1)) {
                        throw p3d1.k(x340Var13, -1993292191, false);
                    }
                    x340Var13.i0(-1993280266);
                    a2f0Var.e(c380Var2, (uzg1) lrn1Var2, x340Var11, 0);
                    x340Var13.r(false);
                }
                x340Var13.r(true);
                x340Var13.r(true);
                return rih1Var;
            case 11:
                x340 x340Var14 = (b0k) obj4;
                ((Number) obj5).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var14).b;
                qim0 qim0VarX2 = uyn1.x(qim0VarF2, 8.0f);
                yp50 yp50Var = (yp50) obj6;
                gfh0 gfh0VarC3 = t1c.c(een.h, false);
                x340 x340Var15 = x340Var14;
                int iHashCode5 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM5 = x340Var15.m();
                qim0 qim0VarE5 = zr7.E(x340Var14, qim0VarX2);
                hzj.A.getClass();
                x340 x340Var16 = x340Var14;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(gfh0VarC3, x340Var14, y580.O0);
                nko1.H(xos0VarM5, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode5), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE5, x340Var14, y580.Y);
                maa maaVar = (maa) yp50Var.b.get();
                rih1 rih1Var2 = rih1.a;
                otw.c(maaVar, rih1Var2, (qim0) null, (ipb1) null, x340Var14, 56, 12);
                x340Var16.r(true);
                return rih1Var2;
            case 12:
                jgf0 jgf0Var = (jgf0) obj2;
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                d7e.k(jgf0Var.c, (vu30) null, (vu30) null, apo.r(-2013496494, new h6a0(jgf0Var, (iu30) obj3, (ogf0) obj6), b0kVar5), b0kVar5, 3072, 6);
                return rih1Var;
            case 13:
                return a(obj, obj2, obj3, obj4, obj5);
            case 14:
                qtf0 qtf0Var = (qtf0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                umf0 umf0Var = (umf0) obj6;
                Flowable flowable = (Flowable) umf0Var.d;
                yqg yqgVar = (yqg) umf0Var.e;
                int i4 = (iIntValue7 & 896) ^ 384;
                boolean z3 = (i4 > 256 && x340Var17.g(iu30Var5)) || (iIntValue7 & 384) == 256;
                x340 x340Var18 = x340Var17;
                Object objT7 = x340Var18.T();
                if (z3 || objT7 == m4cVar3) {
                    objT7 = new yjf0(iu30Var5, (byte) 2);
                    x340Var18.s0(objT7);
                }
                iu30 iu30Var6 = (iu30) objT7;
                boolean z4 = (i4 > 256 && x340Var18.g(iu30Var5)) || (iIntValue7 & 384) == 256;
                Object objT8 = x340Var18.T();
                if (z4 || objT8 == m4cVar3) {
                    objT8 = new yjf0(iu30Var5, (byte) 3);
                    x340Var18.s0(objT8);
                }
                d9y0.f(qtf0Var, flowable, yqgVar, (qim0) null, iu30Var6, (iu30) objT8, x340Var18, (iIntValue7 >> 3) & 14);
                return rih1Var;
            case 15:
                return d(obj, obj2, obj3, obj4, obj5);
            case 16:
                return e(obj, obj2, obj3, obj4, obj5);
            case 17:
                return f(obj, obj2, obj3, obj4, obj5);
            case 18:
                return g(obj, obj2, obj3, obj4, obj5);
            case 19:
                return h(obj, obj2, obj3, obj4, obj5);
            case 20:
                return i(obj, obj2, obj3, obj4, obj5);
            case 21:
                return j(obj, obj2, obj3, obj4, obj5);
            case 22:
                return k(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return m(obj, obj2, obj3, obj4, obj5);
            case 24:
                return n(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                b0k b0kVar6 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((mvg0) obj6).a), apo.r(1030816146, new lvg0((fwg0) obj2, (iu30) obj3, (byte) 0), b0kVar6), b0kVar6, 56);
                return rih1Var;
            case 26:
                return o(obj, obj2, obj3, obj4, obj5);
            case 27:
                return p(obj, obj2, obj3, obj4, obj5);
            case 28:
                return q(obj, obj2, obj3, obj4, obj5);
            default:
                gsh0 gsh0Var = (gsh0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                pt ptVar = (pt) obj6;
                Object obj9 = fkj0.X;
                int i5 = gsh0Var.g;
                int i6 = (iIntValue8 & 48) == 0 ? iIntValue8 | (x340Var19.g(gsh0Var) ? 32 : 16) : iIntValue8;
                if ((iIntValue8 & 384) == 0) {
                    i6 |= x340Var19.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    String packageName = ((Context) x340Var20.k(AndroidCompositionLocals_androidKt.b)).getPackageName();
                    kiv kivVar = k2r0.a;
                    i8h1 i8h1VarH = cwl1.H(((cir0) x340Var20.k(kivVar)).g());
                    e1r0 e1r0Var2 = new e1r0((byte) 3, false);
                    int i7 = i6 & 896;
                    boolean z5 = i7 == 256;
                    Object objT9 = x340Var20.T();
                    if (z5 || objT9 == obj9) {
                        objT9 = new mhg0(iu30Var7, (byte) 14);
                        x340Var20.s0(objT9);
                    }
                    ihg0 ihg0VarE2 = p1p1.E(e1r0Var2, (iu30) objT9, x340Var20);
                    e1r0 e1r0Var3 = new e1r0((byte) 5, false);
                    boolean z6 = i7 == 256;
                    Object objT10 = x340Var20.T();
                    if (z6 || objT10 == obj9) {
                        objT10 = new mhg0(iu30Var7, (byte) 15);
                        x340Var20.s0(objT10);
                    }
                    ihg0 ihg0VarE3 = p1p1.E(e1r0Var3, (iu30) objT10, x340Var20);
                    e1r0 e1r0Var4 = new e1r0((byte) 3, false);
                    boolean z7 = i7 == 256;
                    Object objT11 = x340Var20.T();
                    if (z7 || objT11 == obj9) {
                        objT11 = new mhg0(iu30Var7, (byte) 13);
                        x340Var20.s0(objT11);
                    }
                    ihg0 ihg0VarE4 = p1p1.E(e1r0Var4, (iu30) objT11, x340Var20);
                    tbr0 tbr0VarC = ((cir0) x340Var20.k(kivVar)).c();
                    boolean zI4 = x340Var20.i(ptVar) | x340Var20.i(tbr0VarC) | x340Var20.i(i8h1VarH) | x340Var20.i(ihg0VarE2) | x340Var20.i(ihg0VarE3) | x340Var20.g(packageName) | x340Var20.i(ihg0VarE4) | (i7 == 256);
                    Object objT12 = x340Var20.T();
                    if (zI4 || objT12 == obj9) {
                        objT12 = new lsh0(ptVar, tbr0VarC, i8h1VarH, ihg0VarE2, ihg0VarE3, packageName, ihg0VarE4, iu30Var7, (lnm) null);
                        str3 = packageName;
                        x340Var20.s0(objT12);
                    } else {
                        str3 = packageName;
                    }
                    qxd0.t(rih1Var, x340Var20, (vu30) objT12);
                    boolean zI5 = x340Var20.i(ptVar) | (i7 == 256);
                    Object objT13 = x340Var20.T();
                    if (zI5 || objT13 == obj9) {
                        objT13 = new uah0(ptVar, iu30Var7, (byte) 3);
                        x340Var20.s0(objT13);
                    }
                    qxd0.i(rih1Var, (iu30) objT13, x340Var20);
                    k8c0 k8c0Var = k8c0.ON_RESUME;
                    boolean z8 = i7 == 256;
                    Object objT14 = x340Var20.T();
                    if (z8 || objT14 == obj9) {
                        objT14 = new msh0(iu30Var7, (byte) 3);
                        x340Var20.s0(objT14);
                    }
                    cso1.j(k8c0Var, (iac0) null, (Function0) objT14, x340Var20, 6);
                    boolean z9 = !gsh0Var.e.isEmpty();
                    Boolean boolValueOf = Boolean.valueOf(z9);
                    boolean zI6 = x340Var20.i(ptVar) | x340Var20.h(z9);
                    Object objT15 = x340Var20.T();
                    if (zI6 || objT15 == obj9) {
                        objT15 = new uug0(ptVar, z9, (lnm) null);
                        x340Var20.s0(objT15);
                    }
                    qxd0.t(boolValueOf, x340Var20, (vu30) objT15);
                    Object objT16 = x340Var20.T();
                    if (objT16 == obj9) {
                        objT16 = new LruCache(50);
                        x340Var20.s0(objT16);
                    }
                    LruCache lruCache = (LruCache) objT16;
                    int i8 = gsh0Var.a;
                    List list4 = gsh0Var.b;
                    boolean z10 = gsh0Var.c;
                    List list5 = gsh0Var.e;
                    p8i0 p8i0Var = gsh0Var.X;
                    int i9 = p8i0Var == p8i0.c ? i5 : gsh0Var.f;
                    boolean z11 = gsh0Var.h;
                    boolean z12 = i5 > 0;
                    q8n q8nVar = (q8n) ptVar.h;
                    boolean z13 = i7 == 256;
                    Object objT17 = x340Var20.T();
                    if (z13 || objT17 == obj9) {
                        objT17 = new msh0(iu30Var7, (byte) 4);
                        x340Var20.s0(objT17);
                    }
                    Function0 function0 = (Function0) objT17;
                    boolean z14 = i7 == 256;
                    Object objT18 = x340Var20.T();
                    if (z14 || objT18 == obj9) {
                        objT18 = new msh0(iu30Var7, (byte) 5);
                        x340Var20.s0(objT18);
                    }
                    Function0 function1 = (Function0) objT18;
                    boolean z15 = i7 == 256;
                    Object objT19 = x340Var20.T();
                    if (z15 || objT19 == obj9) {
                        objT19 = new msh0(iu30Var7, (byte) 6);
                        x340Var20.s0(objT19);
                    }
                    Function0 function2 = (Function0) objT19;
                    boolean z16 = i7 == 256;
                    Object objT20 = x340Var20.T();
                    if (z16 || objT20 == obj9) {
                        objT20 = new msh0(iu30Var7, (byte) 7);
                        x340Var20.s0(objT20);
                    }
                    Function0 function3 = (Function0) objT20;
                    boolean z17 = i7 == 256;
                    Object objT21 = x340Var20.T();
                    if (z17 || objT21 == obj9) {
                        objT21 = new mhg0(iu30Var7, (byte) 12);
                        x340Var20.s0(objT21);
                    }
                    iu30 iu30Var8 = (iu30) objT21;
                    boolean z18 = i7 == 256;
                    Object objT22 = x340Var20.T();
                    if (z18 || objT22 == obj9) {
                        objT22 = new ebg0(iu30Var7, (byte) 29);
                        x340Var20.s0(objT22);
                    }
                    Function0 function4 = (Function0) objT22;
                    boolean z19 = i7 == 256;
                    Object objT23 = x340Var20.T();
                    if (z19 || objT23 == obj9) {
                        objT23 = new mhg0(iu30Var7, (byte) 11);
                        x340Var20.s0(objT23);
                    }
                    dko1.h(i8, list4, z10, list5, i9, z11, p8i0Var, z12, lruCache, q8nVar, function0, function1, function2, function3, iu30Var8, function4, (iu30) objT23, x340Var20, 0);
                    if (gsh0Var.i) {
                        x340Var20.i0(2126496023);
                        boolean z20 = i7 == 256;
                        Object objT24 = x340Var20.T();
                        if (z20 || objT24 == obj9) {
                            objT24 = new msh0(iu30Var7, (byte) 0);
                            x340Var20.s0(objT24);
                        }
                        Function0 function5 = (Function0) objT24;
                        boolean z21 = i7 == 256;
                        Object objT25 = x340Var20.T();
                        if (z21 || objT25 == obj9) {
                            objT25 = new dnn(iu30Var7, (byte) 2);
                            x340Var20.s0(objT25);
                        }
                        oqn1.c(function5, (Function0) objT25, x340Var20, 0);
                        x340Var20.r(false);
                    } else {
                        x340Var20.i0(2126664198);
                        x340Var20.r(false);
                    }
                    if (gsh0Var.t) {
                        x340Var20.i0(2126712496);
                        boolean zI7 = (i7 == 256) | x340Var20.i(ihg0VarE3) | x340Var20.g(str3);
                        Object objT26 = x340Var20.T();
                        if (zI7 || objT26 == obj9) {
                            objT26 = new dt90(iu30Var7, ihg0VarE3, str3, (byte) 18);
                            x340Var20.s0(objT26);
                        }
                        Function0 function6 = (Function0) objT26;
                        boolean z22 = i7 == 256;
                        Object objT27 = x340Var20.T();
                        if (z22 || objT27 == obj9) {
                            objT27 = new msh0(iu30Var7, (byte) 1);
                            x340Var20.s0(objT27);
                        }
                        oqn1.b(function6, (Function0) objT27, x340Var20, 0);
                        x340Var20.r(false);
                    } else {
                        x340Var20.i0(2127102662);
                        x340Var20.r(false);
                    }
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
        }
    }
}

package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o1p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(Collection collection, onm onmVar) {
        tc9 tc9Var;
        Iterator it;
        int i;
        if (onmVar instanceof tc9) {
            tc9Var = (tc9) onmVar;
            int i2 = tc9Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tc9Var.d = i2 - Integer.MIN_VALUE;
            } else {
                tc9Var = new tc9(onmVar);
            }
        } else {
            tc9Var = new tc9(onmVar);
        }
        Object obj = tc9Var.c;
        int i3 = tc9Var.d;
        if (i3 == 0) {
            hm5.M(obj);
            it = collection.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = tc9Var.b;
            it = tc9Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            faa0 faa0Var = (faa0) it.next();
            tc9Var.a = it;
            tc9Var.b = i;
            tc9Var.d = 1;
            Object objJ = faa0Var.j(tc9Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0054 -> B:19:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object C(p.faa0[] r6, p.onm r7) {
        /*
            boolean r0 = r7 instanceof p.sc9
            if (r0 == 0) goto L13
            r0 = r7
            p.sc9 r0 = (p.sc9) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.sc9 r0 = new p.sc9
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            int r6 = r0.d
            int r1 = r0.c
            int r3 = r0.b
            java.lang.Object[] r4 = r0.a
            p.faa0[] r4 = (p.faa0[]) r4
            p.hm5.M(r7)
            r7 = r4
            goto L57
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L37:
            p.hm5.M(r7)
            int r7 = r6.length
            r1 = 0
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r1
        L40:
            if (r1 >= r6) goto L59
            r4 = r7[r1]
            r0.a = r7
            r0.b = r3
            r0.c = r1
            r0.d = r6
            r0.f = r2
            java.lang.Object r4 = r4.j(r0)
            p.d9n r5 = p.d9n.a
            if (r4 != r5) goto L57
            return r5
        L57:
            int r1 = r1 + r2
            goto L40
        L59:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o1p1.C(p.faa0[], p.onm):java.lang.Object");
    }

    public static void E(t6b0 t6b0Var, Annotation annotation) throws InvocationTargetException {
        Class clsN = j2h1.s(annotation).n();
        r6b0 r6b0VarI = t6b0Var.i(bb11.a(clsN), new ab11(annotation));
        if (r6b0VarI != null) {
            F(r6b0VarI, annotation, clsN);
        }
    }

    public static void F(r6b0 r6b0Var, Annotation annotation, Class cls) throws InvocationTargetException {
        for (Method method : cls.getDeclaredMethods()) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                ajn0 ajn0VarE = ajn0.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    r6b0Var.n(ajn0VarE, x((Class) objInvoke));
                } else if (kc11.a.contains(enclosingClass)) {
                    r6b0Var.e(ajn0VarE, objInvoke);
                } else {
                    List list = bb11.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        r6b0Var.f(ajn0VarE, bb11.a(enclosingClass), ajn0.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class cls2 = (Class) f46.B0(enclosingClass.getInterfaces());
                        cls2.getClass();
                        r6b0 r6b0VarH = r6b0Var.h(bb11.a(cls2), ajn0VarE);
                        if (r6b0VarH != null) {
                            F(r6b0VarH, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        s6b0 s6b0VarM = r6b0Var.m(ajn0VarE);
                        if (s6b0VarM != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                heg hegVarA = bb11.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    s6b0VarM.g(hegVarA, ajn0.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    s6b0VarM.c(x((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    r6b0 r6b0VarK = s6b0VarM.k(bb11.a(componentType));
                                    if (r6b0VarK != null) {
                                        F(r6b0VarK, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    s6b0VarM.d(obj4);
                                }
                            }
                            s6b0VarM.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        r6b0Var.a();
    }

    public static final String G(nu70 nu70Var, mu70 mu70Var) {
        u281 u281Var;
        String str = null;
        if (mu70Var.i) {
            jo70 jo70Var = nu70Var.c;
            str = jo70Var != null ? jo70Var.b : null;
            return str == null ? "" : str;
        }
        if (mu70Var.g) {
            l98 l98Var = nu70Var.e;
            ArrayList arrayList = l98Var != null ? l98Var.a : null;
            if (arrayList != null && !arrayList.isEmpty()) {
                return ((k98) o7h.q0(nu70Var.e.a)).a;
            }
        }
        if (!mu70Var.f) {
            return o7h.y0(nu70Var.a.f, " • ", (String) null, (String) null, a9o.a1, 30);
        }
        w281 w281Var = nu70Var.b;
        if (w281Var != null && (u281Var = w281Var.g) != null) {
            str = u281Var.a;
        }
        return str == null ? "" : str;
    }

    public static final ho71 H(yn71 yn71Var) {
        return new ho71(yn71Var.b, yn71Var.a, yn71Var.d);
    }

    public static final void a(String str, String str2, String str3, String str4, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-991292190);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0Var3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            op71.g(x340Var, u291.h(qim0Var3, 24.0f));
            qim0 qim0VarN = anm1.N("Title", qim0Var3);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).h, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1720);
            uwo1.e(str3, anm1.N("TimeLabel", qim0Var3), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, (i2 >> 6) & 14, 0, 1712);
            uwo1.e(str2, anm1.N("Subtitle", qim0Var3), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, (i2 >> 3) & 14, 0, 1712);
            op71.g(x340Var, u291.h(qim0Var3, 29.0f));
            vbe.s(str4, (qim0) null, 0L, 0L, (lee1) null, false, x340Var, (i2 >> 9) & 14, 62);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yld0(str, str2, str3, str4, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(256097613);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.g(str4) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var3);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            cso1.d(Uri.parse(str2), new jsl(cwl1.n0(2131952457, new Object[]{str}, b0kVar3)), anm1.N("MainImage", u291.r(qim0Var3, 142.0f)), null, null, null, null, b0kVar2, 0, 248);
            qon1.b(str3, str4, uyn1.B(qim0Var2, 8.0f, 10.0f, 0.0f, 0.0f, 12), null, b0kVar2, (i2 >> 6) & 126, 8);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yld0(str, str2, str3, str4, qim0Var2, i, (byte) 1);
        }
    }

    public static final void c(int i, String str, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z, boolean z2) {
        int i2;
        String str2;
        qim0 qim0Var2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-501588625);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= x340Var.g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 16384 : 8192;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            pm31 pm31Var = new pm31(1);
            boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z4 || objT == fkj0.X) {
                objT = new ag21(iu30Var, z, (byte) 4);
                x340Var.s0(objT);
            }
            qim0 qim0VarQ = dgo1.q(qim0Var2, z, z2, pm31Var, (Function0) objT, 8);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-909021428);
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(klx.c, isl.a, u291.r(nim0Var, 24.0f), cbx.a(x340Var).c.c, 0L, false, x340Var, klx.d | 48, 48);
                x340Var.r(false);
                z3 = true;
            } else {
                z3 = true;
                x340Var.i0(-908751170);
                zov0 zov0Var2 = cbx.b(x340Var).g;
                qim0 qim0VarR = u291.r(nim0Var, 24.0f);
                avw0 avw0Var = cbx.b(x340Var).c;
                t1c.a(d1u.E(2.0f, cbx.a(x340Var).c.b, qim0VarR, er31.a), x340Var, 0);
                x340Var.r(false);
            }
            uwo1.e(str2, new wnb0(1.0f, z3), cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, (i2 >> 6) & 14, 0, 2040);
            x340Var = x340Var;
            x340Var.r(z3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(z, z2, str, iu30Var, qim0Var, i, (byte) 5);
        }
    }

    public static final void d(boolean z, boolean z2, Function0 function0, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        hax haxVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2007335442);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.h(z) ? 4 : 2) | (x340Var2.h(z2) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var2).a.d, d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarF2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarP);
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
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF3 = u291.f(u291.x(0.0f, dsa0.m(x340Var2, 2131166901), 1, h2c.a.a(qim0Var3, een.h)), 1.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarA = uyn1.A(qim0VarF3, 16.0f, 16.0f, 16.0f, cbx.b(x340Var2).b.b);
            mbh mbhVarA = jbh.a(new d36(cbx.b(x340Var2).b.b, true, new um5(false)), een.Q0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF4);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            uwo1.e(cwl1.o0(x340Var2, 2131963120), u291.f(qim0Var3, 1.0f), cbx.d(x340Var2).k, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            c((i2 & 7168) | ((i2 >> 3) & 14), cwl1.o0(x340Var2, 2131963119), x340Var2, iu30Var, u291.f(qim0Var3, 1.0f), z2, !z);
            x340Var2.r(true);
            gbx gbxVar = new gbx(z50.c, function0);
            gdx gdxVarR = yla.r(x340Var2);
            idx idxVar = new idx(4);
            if (z) {
                x340Var2.i0(-47547978);
                haxVar = new hax(cwl1.o0(x340Var2, 2131963118));
                x340Var2.r(false);
            } else if (z2) {
                x340Var2.i0(-47544918);
                x340Var2.r(false);
                haxVar = jax.a;
            } else {
                x340Var2.i0(-47542690);
                haxVar = new hax(cwl1.o0(x340Var2, 2131963117));
                x340Var2.r(false);
            }
            foo1.c(gbxVar, idxVar, null, haxVar, gdxVarR, null, null, null, null, null, apo.r(-2002425737, new ov51((byte) 3, z), x340Var2), x340Var2, 0, 48, 1996);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(z, z2, function0, iu30Var, qim0Var2, i, (byte) 23);
        }
    }

    public static final void e(fdj1 fdj1Var, j2i j2iVar, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ji0 ji0Var = fdj1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1753996760);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(fdj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = uyn1.x(dug.f(u291.f(qim0Var, 1.0f), cbx.a(x340Var).d.b, er31.b(16.0f)), 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cbx.a.getClass();
            qim0 qim0VarF2 = dug.f(i1p1.q(hno1.f(qim0VarF, uwr.d()), er31.b(8.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
            n(fdj1Var.b, ji0Var.g.b, fdj1Var.e && fdj1Var.d, fdj1Var.c, iu30Var, x340Var, (i2 << 6) & 57344);
            int i3 = i2 >> 6;
            l(fdj1Var.c, j2iVar, function1, function2, h2c.a.a(nim0Var, graVar), x340Var, (i2 & 112) | (i3 & 896) | (i3 & 7168));
            x340Var.r(true);
            k(i2 & 7168, ji0Var.c, ji0Var.R0, function0, x340Var, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ji0Var.b());
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3((Object) fdj1Var, (Object) j2iVar, iu30Var, (Object) function0, function1, (Object) function2, (Object) qim0Var, i, (byte) 24);
        }
    }

    public static final void f(hux huxVar, String str, String str2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1828865582);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | ((i & 8) == 0 ? b0kVar2.g(huxVar) : b0kVar2.i(huxVar) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.g(str2) ? 256 : 128) | 3072;
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            zov0 zov0Var = cbx.b(b0kVar2).g;
            w0h1.a(huxVar, isl.a, u291.r(qim0Var3, 24.0f), 0L, 0L, false, b0kVar2, 56 | (i2 & 14), 56);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            mbh mbhVarA = jbh.a(new d36(2.0f, true, new um5(false)), een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            b0kVar2 = b0kVar2;
            uwo1.e(str, u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).k, 0L, null, null, 0, false, null, 0, null, b0kVar2, (i2 >> 3) & 14, 0, 2040);
            uwo1.e(str2, u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, (i2 >> 6) & 14, 0, 2032);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lxl(huxVar, str, str2, qim0Var2, i);
        }
    }

    public static final void g(y7e1 y7e1Var, pz20 pz20Var, Function0 function0, b0k b0kVar, int i) {
        y7e1 y7e1Var2;
        pz20 pz20Var2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1071256495);
        int i2 = (x340Var.i(y7e1Var) ? 4 : 2) | i | (x340Var.g(pz20Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = ((i2 & 112) == 32) | x340Var.i(y7e1Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                y7e1Var2 = y7e1Var;
                pz20Var2 = pz20Var;
                function1 = function0;
                hff hffVar = new hff(pz20Var2, y7e1Var2, function1, (lnm) null, (byte) 5);
                x340Var.s0(hffVar);
                objT = hffVar;
            } else {
                y7e1Var2 = y7e1Var;
                pz20Var2 = pz20Var;
                function1 = function0;
            }
            qxd0.t(pz20Var2, x340Var, (vu30) objT);
        } else {
            y7e1Var2 = y7e1Var;
            pz20Var2 = pz20Var;
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(y7e1Var2, pz20Var2, function1, i, (byte) 20);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1703315298);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long j = ((xex) ((gmt) zex.a.c).b).r;
            t1c.a(dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 29);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1866991572);
        j06 j06Var = x340Var.a;
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(8.0f));
            Uri uri = Uri.parse("https://cdn-spotify-gen-alpha.spotifycdn.com/account-linking/ParentEducation.webp");
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, uwr.d(), as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 27696, 0, 3968);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = pod1.c1;
                x340Var.s0(objT);
            }
            uwo1.e(cwl1.o0(x340Var, 2131963125), s161.b(qim0VarF2, false, (iu30) objT), cbx.d(x340Var).c, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            uwo1.e(cwl1.o0(x340Var, 2131963121), u291.f(nim0Var, 1.0f), cbx.d(x340Var).f, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            b2 = 1;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, b2);
        }
    }

    public static final void j(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(528108439);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131951993);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0Var, j, er31.b(2.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.y(qim0VarF, 4.0f, 2.0f), cbx.d(x340Var).n, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 15);
        }
    }

    public static final void k(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(663445823);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new sah1(function0, (byte) 23);
                x340Var2.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = p3d1.m(0L, x340Var2);
            }
            frr0 frr0Var = (frr0) objT2;
            boolean zI = x340Var2.i(frr0Var) | x340Var2.g(function1);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new mah1(function1, frr0Var, (byte) 16);
                x340Var2.s0(objT3);
            }
            Function0 function2 = (Function0) objT3;
            int i3 = i2;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean zG = x340Var2.g(function2);
            Object objT4 = x340Var2.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new sah1(function2, (byte) 21);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarX = bin.x(qim0VarF, z, null, null, null, (Function0) objT4, 14);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            wnb0 wnb0Var = new wnb0(1.0f, false);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(str, anm1.N(czd1.b, uyn1.B(wnb0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11)), cbx.d(x340Var2).g, ((vex) zex.a.b).b, null, null, 0, false, new cjc0(2), 0, null, x340Var2, i3 & 14, 0, 1776);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(-812164272);
                idx idxVar = new idx(8);
                gdx gdxVarS = yla.s(x340Var);
                boolean zG2 = x340Var.g(function2);
                Object objT5 = x340Var.T();
                if (zG2 || objT5 == m4cVar) {
                    objT5 = new sah1(function2, (byte) 22);
                    x340Var.s0(objT5);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT5);
                cvx cvxVar2 = cbx.b(x340Var).b;
                foo1.c(gbxVar, idxVar, anm1.N(czd1.c, uyn1.B(nim0.a, 8.0f, 0.0f, 0.0f, 0.0f, 14)), null, gdxVarS, null, null, null, null, null, apo.r(1726141181, new zsd1(str2, (byte) 19), x340Var), x340Var, 0, 48, 2008);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-811559617);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ahu(str, str2, z, function0, qim0Var, i, (byte) 3);
        }
    }

    public static final void l(boolean z, j2i j2iVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1665933112);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            gfx.b(18, apo.r(431540771, new ofi0(qim0Var, cbx.b(x340Var).b, z, function0, function1, j2iVar), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(z, j2iVar, function0, function1, qim0Var, i);
        }
    }

    public static final void m(int i, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-566173693);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, z ? 2131952017 : 2131952015);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 48.0f);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new eb7(z, function1, function0, (byte) 2);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarR, false, null, null, null, (Function0) objT, 15);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            mta mtaVar2 = cbx.b(x340Var).d;
            qim0 qim0VarF = dug.f(u291.r(qim0Var3, 32.0f), ((vex) zex.a.e).d, er31.a);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            x340Var = x340Var;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
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
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(z ? aux.c : ztx.c, new jsl(strO0), u291.r(qim0Var3, 16.0f), cbx.a(x340Var).c.a, 0L, false, x340Var, 8, 48);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rfz(z, function0, function1, qim0Var2, i);
        }
    }

    public static final void n(o2u0 o2u0Var, List list, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        boolean z4;
        uoa uoaVar;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1323203239);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(o2u0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= x340Var.h(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= x340Var.h(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zG = x340Var.g(o2u0Var);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = (uoa) iu30Var.invoke(o2u0Var);
                x340Var.s0(objT);
            }
            uoa uoaVar2 = (uoa) objT;
            boolean zG2 = x340Var.g(list);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = a4p1.k(list);
                x340Var.s0(objT2);
            }
            a7j1 a7j1Var = (a7j1) objT2;
            boolean zI = x340Var.i(uoaVar2);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                objT3 = new cu0(uoaVar2, (byte) 6);
                x340Var.s0(objT3);
            }
            qxd0.i(uoaVar2, (iu30) objT3, x340Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            boolean zI2 = x340Var.i(uoaVar2) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | x340Var.i(o2u0Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == obj) {
                z8j1 z8j1Var = new z8j1(uoaVar2, z2, z3, o2u0Var, (byte) 0);
                uoaVar = uoaVar2;
                x340Var.s0(z8j1Var);
                objT4 = z8j1Var;
            } else {
                uoaVar = uoaVar2;
            }
            Function0 function0 = (Function0) objT4;
            if (x340Var.g(uoaVar) | x340Var.g(boolValueOf) | x340Var.g(boolValueOf2)) {
                qxd0.S(function0, x340Var);
            }
            a4p1.d(uoaVar, b3k1.d, a7j1Var, u291.d(nim0.a, 1.0f), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(o2u0Var, list, z, z2, iu30Var, i, (byte) 11);
        }
    }

    public static final void o(xld0 xld0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1955232908);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(xld0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.v(anm1.N("Card", qim0Var3), 308.0f), 142.0f);
            mgx mgxVar = mgx.e;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            String strO0 = cwl1.o0(x340Var, 2131954724);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                cwl1.b(qim0VarH, (tl3) null, er31.b(12.0f), mgxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(164135325, new k2d0(xld0Var, (byte) 12), x340Var), x340Var, 0, 48, 1506);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(xld0Var, function0, qim0Var2, i, (byte) 29);
        }
    }

    public static final void p(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(283294087);
        if (x340Var.Y(i & 1, i != 0)) {
            r(384, cwl1.o0(x340Var, 2131963127), rmj.c, x340Var, null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 2);
        }
    }

    public static final void q(String str, String str2, String str3, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1176416035);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function1) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = (mqt0) function0.invoke();
                x340Var.s0(objT);
            }
            kqt0 kqt0Var = new kqt0(str2, str, str3, function1);
            qim0 qim0Var3 = nim0.a;
            otw.c((mqt0) objT, kqt0Var, anm1.N("PlayPreviewAction", qim0Var3), (ipb1) null, x340Var, 0, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((byte) 16, i, str, str2, str3, function0, function1, qim0Var2, false);
        }
    }

    public static final void r(int i, String str, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        j2i j2iVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2107473013);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            uwo1.e(str, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2040);
            j2iVar2 = j2iVar;
            dv20.l(6, j2iVar2, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z6a(str, qim0Var2, j2iVar2, i, (byte) 4);
        }
    }

    public static final void s(shm0 shm0Var, lvc1 lvc1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-679621771);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(shm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lvc1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, rmj.b, apo.r(-1287491287, new juc1(shm0Var, iu30Var, lvc1Var, (byte) 7), x340Var), null, apo.r(60806126, new bxb1(shm0Var, (byte) 19), x340Var), x340Var, ((i3 >> 9) & 14) | 25008, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, shm0Var, lvc1Var, iu30Var, qim0Var2, (byte) 10);
        }
    }

    public static final void t(int i, int i2, int i3, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1869783144);
        int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            r(384, cwl1.o0(x340Var, 2131963122), apo.r(344375648, new d681((byte) 2, i2, i), x340Var), x340Var, null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d681(i, i2, i3, (byte) 3);
        }
    }

    public static final Object u(Collection collection, lnm lnmVar) {
        return collection.isEmpty() ? z6x.a : new oc9((l2t[]) collection.toArray(new l2t[0])).a(lnmVar);
    }

    public static final Object v(l2t[] l2tVarArr, onm onmVar) {
        return l2tVarArr.length == 0 ? z6x.a : new oc9(l2tVarArr).a(onmVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object w(ay8 ay8Var, onm onmVar) throws ItemUnavailableException, AbortFlowException {
        puj0 puj0Var;
        if (onmVar instanceof puj0) {
            puj0Var = (puj0) onmVar;
            int i = puj0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                puj0Var.b = i - Integer.MIN_VALUE;
            } else {
                puj0Var = new puj0(onmVar);
            }
        } else {
            puj0Var = new puj0(onmVar);
        }
        Object objJ = puj0Var.a;
        int i2 = puj0Var.b;
        if (i2 == 0) {
            hm5.M(objJ);
            fca0 fca0Var = new fca0(2, (lnm) null, (byte) 16);
            puj0Var.b = 1;
            objJ = b5p1.j(ay8Var, fca0Var, puj0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object objG = u890.G((k1r) objJ);
        if (objG != null) {
            return objG;
        }
        throw new ItemUnavailableException();
    }

    public static jeg x(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            heg hegVarA = bb11.a(cls);
            String str = j8a0.a;
            heg hegVarF = j8a0.f(hegVarA.a());
            if (hegVarF != null) {
                hegVarA = hegVarF;
            }
            return new jeg(hegVarA, i);
        }
        if (cls.equals(Void.TYPE)) {
            kf30 kf30VarI = rfb1.d.i();
            return new jeg(new heg(kf30VarI.b(), kf30VarI.a.g()), i);
        }
        tnw0 tnw0VarC = nja0.b(cls.getName()).c();
        if (i > 0) {
            kf30 kf30Var = (kf30) tnw0VarC.d.getValue();
            return new jeg(new heg(kf30Var.b(), kf30Var.a.g()), i - 1);
        }
        kf30 kf30Var2 = (kf30) tnw0VarC.c.getValue();
        return new jeg(new heg(kf30Var2.b(), kf30Var2.a.g()), i);
    }

    public static a1q y(p68 p68Var) {
        p68Var.getClass();
        return new a1q(p68Var);
    }

    public cp5 A(Context context, Object obj) {
        return null;
    }

    public Object D(Intent intent, int i) {
        Bundle extras;
        swf swfVar;
        return (intent == null || (extras = intent.getExtras()) == null || (swfVar = (swf) jhc1.t(extras, "EXTRA_CHECKOUT_RESULT", swf.class)) == null) ? pwf.a : swfVar;
    }

    public Intent z(Context context, Object obj) {
        Intent intent = new Intent(context, (Class<?>) ChoiceScreenUcActivity.class);
        intent.putExtra("EXTRA_CHOICE_SCREEN_UC_ARGS", (Parcelable) obj);
        return intent;
    }
}

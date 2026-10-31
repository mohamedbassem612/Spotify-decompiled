package p;

import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import j$.time.Clock;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p5 implements iu30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public p5(vgq0 vgq0Var) {
        this.a = (byte) 23;
        this.b = ((g420) vgq0Var.b).a();
    }

    public utr a(mml mmlVar, List list) {
        td41 td41Var = (td41) this.b;
        return new utr(td41Var.d(mmlVar, list), td41Var.a(mmlVar, list));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(lnm lnmVar) {
        vxq vxqVar;
        if (lnmVar instanceof vxq) {
            vxqVar = (vxq) lnmVar;
            int i = vxqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vxqVar.c = i - Integer.MIN_VALUE;
            } else {
                vxqVar = new vxq(this, lnmVar);
            }
        } else {
            vxqVar = new vxq(this, lnmVar);
        }
        Object objA = vxqVar.a;
        int i2 = vxqVar.c;
        if (i2 == 0) {
            hm5.M(objA);
            um40 um40Var = (um40) this.b;
            vxqVar.c = 1;
            objA = um40Var.a(vxqVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        pm40 pm40Var = (rm40) objA;
        if (pm40Var instanceof pm40) {
            return new ayq(pm40Var.a, false, false, false, false, false);
        }
        if (pm40Var instanceof qm40) {
            hhg1.o(pm40Var, "Could not load. Response: ");
            return null;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0413 A[PHI: r18
      0x0413: PHI (r18v10 java.util.List) = (r18v9 java.util.List), (r18v9 java.util.List), (r18v15 java.util.List), (r18v15 java.util.List) binds: [B:511:0x0413, B:186:0x0449, B:497:0x0413, B:175:0x0411] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x0416  */
    /* JADX WARN: Code duplicated, block: B:180:0x0420  */
    /* JADX WARN: Code duplicated, block: B:324:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:363:0x0876  */
    /* JADX WARN: Code duplicated, block: B:365:0x0882  */
    /* JADX WARN: Code duplicated, block: B:402:0x093b  */
    /* JADX WARN: Code duplicated, block: B:497:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:? A[LOOP:4: B:178:0x041a->B:499:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [int] */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    public final Object invoke(Object obj) {
        i0h1 i0h1VarG;
        Object value;
        boolean zIsEmpty;
        kf30 kf30VarD;
        Object next;
        dzq0 dzq0Var;
        ava avaVar;
        byp bypVar;
        dzq0 dzq0Var2;
        List list;
        List listSingletonList;
        List list2;
        Iterator it;
        Collection collection;
        byte b = this.a;
        List list3 = z6x.a;
        kf90 kf90Var = kf90.a;
        x9v0 x9v0Var = x9v0.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        e890 e890Var = null;
        boolean z2 = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                oj80 oj80Var = new oj80((p2o0) obj2, map, map2, (byte) 3);
                Class cls = ((jc11) obj).a;
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    String str = "(";
                    if (i >= length) {
                        Class cls2 = cls;
                        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                        int length2 = declaredConstructors.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            Constructor<?> constructor = declaredConstructors[i2];
                            ajn0 ajn0Var = moa1.e;
                            constructor.getClass();
                            StringBuilder sb = new StringBuilder(str);
                            for (Class<?> cls3 : constructor.getParameterTypes()) {
                                cls3.getClass();
                                sb.append(bb11.b(cls3));
                            }
                            sb.append(")V");
                            u961 u961Var = new u961(oj80Var, new bqi0(ajn0Var.b().concat(sb.toString())));
                            for (Annotation annotation : constructor.getDeclaredAnnotations()) {
                                annotation.getClass();
                                o1p1.E(u961Var, annotation);
                            }
                            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                            parameterAnnotations.getClass();
                            if (parameterAnnotations.length != 0) {
                                int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                                int length4 = parameterAnnotations.length;
                                for (int i3 = 0; i3 < length4; i3++) {
                                    Annotation[] annotationArr = parameterAnnotations[i3];
                                    annotationArr.getClass();
                                    int length5 = annotationArr.length;
                                    int i4 = 0;
                                    while (i4 < length5) {
                                        Constructor<?>[] constructorArr = declaredConstructors;
                                        Annotation annotation2 = annotationArr[i4];
                                        int i5 = length2;
                                        Class clsN = j2h1.s(annotation2).n();
                                        int i6 = i2;
                                        int i7 = length3;
                                        String str2 = str;
                                        d520 d520VarD = u961Var.D(i3 + length3, bb11.a(clsN), new ab11(annotation2));
                                        if (d520VarD != null) {
                                            o1p1.F(d520VarD, annotation2, clsN);
                                        }
                                        i4++;
                                        declaredConstructors = constructorArr;
                                        length3 = i7;
                                        i2 = i6;
                                        length2 = i5;
                                        str = str2;
                                    }
                                }
                            }
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i8 = length2;
                            int i9 = i2;
                            String str3 = str;
                            u961Var.a();
                            i2 = i9 + 1;
                            declaredConstructors = constructorArr2;
                            length2 = i8;
                            str = str3;
                        }
                        Field[] declaredFields = cls2.getDeclaredFields();
                        int length6 = declaredFields.length;
                        int i10 = 0;
                        while (i10 < length6) {
                            Field field = declaredFields[i10];
                            bqi0 bqi0Var = new bqi0(cy30.l(ajn0.e(field.getName()).b(), '#', bb11.b(field.getType())));
                            ArrayList arrayList = new ArrayList();
                            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                            int length7 = declaredAnnotations.length;
                            int i11 = 0;
                            while (i11 < length7) {
                                Annotation annotation3 = declaredAnnotations[i11];
                                annotation3.getClass();
                                Class clsN2 = j2h1.s(annotation3).n();
                                Field[] fieldArr = declaredFields;
                                d520 d520VarG = ((p2o0) oj80Var.b).G(bb11.a(clsN2), new ab11(annotation3), arrayList);
                                if (d520VarG != null) {
                                    o1p1.F(d520VarG, annotation3, clsN2);
                                }
                                i11++;
                                declaredFields = fieldArr;
                            }
                            Field[] fieldArr2 = declaredFields;
                            if (!arrayList.isEmpty()) {
                                ((HashMap) oj80Var.c).put(bqi0Var, arrayList);
                            }
                            i10++;
                            declaredFields = fieldArr2;
                        }
                        return new gg5(map, map2, map3);
                    }
                    Method method = declaredMethods[i];
                    ajn0 ajn0VarE = ajn0.e(method.getName());
                    StringBuilder sb2 = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    int length8 = parameterTypes.length;
                    for (?? r14 = z2; r14 < length8; r14++) {
                        Class<?> cls4 = parameterTypes[r14];
                        cls4.getClass();
                        sb2.append(bb11.b(cls4));
                    }
                    sb2.append(")");
                    sb2.append(bb11.b(method.getReturnType()));
                    u961 u961Var2 = new u961(oj80Var, new bqi0(ajn0VarE.b().concat(sb2.toString())));
                    Annotation[] declaredAnnotations2 = method.getDeclaredAnnotations();
                    int length9 = declaredAnnotations2.length;
                    for (?? r13 = z2; r13 < length9; r13++) {
                        Annotation annotation4 = declaredAnnotations2[r13];
                        annotation4.getClass();
                        o1p1.E(u961Var2, annotation4);
                    }
                    Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                    int length10 = parameterAnnotations2.length;
                    for (?? r11 = z2; r11 < length10; r11++) {
                        Annotation[] annotationArr2 = parameterAnnotations2[r11];
                        annotationArr2.getClass();
                        int length11 = annotationArr2.length;
                        for (?? r15 = z2; r15 < length11; r15++) {
                            Annotation annotation5 = annotationArr2[r15];
                            Class cls5 = cls;
                            Class clsN3 = j2h1.s(annotation5).n();
                            Method[] methodArr = declaredMethods;
                            int i12 = length;
                            d520 d520VarD2 = u961Var2.D((int) r11, bb11.a(clsN3), new ab11(annotation5));
                            if (d520VarD2 != null) {
                                o1p1.F(d520VarD2, annotation5, clsN3);
                            }
                            declaredMethods = methodArr;
                            length = i12;
                            cls = cls5;
                        }
                        z2 = false;
                    }
                    u961Var2.a();
                    i++;
                    z2 = false;
                }
                break;
            case 1:
                ((g8b0) obj).getClass();
                return (qx81) ((x5) obj2).b.b.invoke();
            case 2:
                qia0 qia0Var = (qia0) obj2;
                zbc zbcVarD = qia0Var.d((kf30) obj);
                if (zbcVarD == null) {
                    return null;
                }
                ks6 ks6Var = qia0Var.c;
                if (ks6Var != null) {
                    zbcVarD.y1(ks6Var);
                    return zbcVarD;
                }
                u890.C("components");
                throw null;
            case 3:
                uqs uqsVar = (uqs) obj2;
                c4x0 c4x0Var = c4x0.N0;
                fa faVar = (fa) obj;
                e8b0 e8b0Var = faVar.a;
                if (uqsVar.b && e8b0Var != null) {
                    if (e8b0Var instanceof a8b0) {
                        z2 = e8b0Var instanceof nwz0;
                    } else {
                        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb3.append(e8b0Var);
                        sb3.append(", ");
                        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb3));
                    }
                    if (z2) {
                        return null;
                    }
                }
                if (e8b0Var == null || (i0h1VarG = c4x0Var.G(e8b0Var)) == null) {
                    return null;
                }
                List listA = d0p1.A(i0h1VarG);
                List listY = d0p1.y(e8b0Var);
                Iterator it2 = listA.iterator();
                Iterator it3 = listY.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(q7h.U(listA, 10), q7h.U(listY, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    a1h1 a1h1Var = (a1h1) it2.next();
                    gmh1 gmh1VarC = d0p1.C(c4x0Var, (d0h1) it3.next());
                    r8a0 r8a0Var = faVar.b;
                    arrayList2.add(gmh1VarC == null ? new fa(null, r8a0Var, a1h1Var) : new fa(gmh1VarC, zf5.b((zf5) ((uw0) ((o860) uqsVar.d).b).Y, r8a0Var, gmh1VarC.getAnnotations()), a1h1Var));
                }
                return arrayList2;
            case 4:
                jit jitVar = (jit) obj2;
                gmh1 gmh1Var = (gmh1) obj;
                gmh1Var.getClass();
                if (!d4o1.i(gmh1Var)) {
                    jfg jfgVarS = gmh1Var.t0().s();
                    z = (jfgVarS instanceof y0h1) && !u890.j(((y0h1) jfgVarS).k(), jitVar);
                }
                return Boolean.valueOf(z);
            case 5:
                ma maVar = (ma) obj2;
                la laVar = (la) obj;
                djx0 djx0VarC = maVar.c();
                List list4 = laVar.a;
                djx0VarC.getClass();
                if (list4.isEmpty()) {
                    a8b0 a8b0VarB = maVar.b();
                    List listSingletonList2 = a8b0VarB != null ? Collections.singletonList(a8b0VarB) : null;
                    if (listSingletonList2 != null) {
                        list3 = listSingletonList2;
                    }
                    list4 = list3;
                }
                List listL1 = list4 instanceof List ? (List) list4 : null;
                if (listL1 == null) {
                    listL1 = o7h.l1(list4);
                }
                laVar.b = maVar.h(listL1);
                return rih1Var;
            case 6:
                p5t0.l(0, 0, (p5t0) obj, (q5t0) obj2);
                return rih1Var;
            case 7:
                ((uhd) obj2).cancel();
                return rih1Var;
            case 8:
                return Boolean.valueOf(koa1.i.containsKey(h0p1.n((xw81) obj2)));
            case 9:
                long j = ((izg0) obj).a;
                bpb1 bpb1Var = ((h28) obj2).a;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, Long.valueOf(Math.max(((Number) value).longValue(), j))));
                return rih1Var;
            case 10:
                vb11 vb11Var = (vb11) obj;
                if (!((Boolean) ((aeg) obj2).b.invoke(vb11Var)).booleanValue()) {
                    z = false;
                } else if (((Method) vb11Var.b()).getDeclaringClass().isInterface()) {
                    String strB = vb11Var.c().b();
                    int iHashCode = strB.hashCode();
                    if (iHashCode != -1776922004) {
                        if (iHashCode != -1295482945) {
                            if (iHashCode == 147696667 && strB.equals("hashCode")) {
                                zIsEmpty = ((ArrayList) vb11Var.h()).isEmpty();
                            }
                        } else if (strB.equals("equals")) {
                            bc11 bc11Var = (bc11) o7h.X0(vb11Var.h());
                            zb11 zb11Var = bc11Var != null ? bc11Var.a : null;
                            ob11 ob11Var = zb11Var instanceof ob11 ? (ob11) zb11Var : null;
                            if (ob11Var != null) {
                                q7a0 q7a0Var = ob11Var.b;
                                if ((q7a0Var instanceof mb11) && (kf30VarD = ((mb11) q7a0Var).d()) != null && u890.j(kf30VarD.a.a, "java.lang.Object")) {
                                    zIsEmpty = true;
                                }
                            }
                        }
                        zIsEmpty = false;
                    } else if (strB.equals("toString")) {
                        zIsEmpty = ((ArrayList) vb11Var.h()).isEmpty();
                    } else {
                        zIsEmpty = false;
                    }
                    if (zIsEmpty) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                geg gegVar = (geg) obj2;
                feg fegVar = (feg) obj;
                heg hegVar = fegVar.a;
                ks6 ks6Var2 = gegVar.a;
                Iterator it4 = ((Iterable) ks6Var2.t).iterator();
                while (it4.hasNext()) {
                    beg begVarC = ((deg) it4.next()).c(hegVar);
                    if (begVarC != null) {
                        return begVarC;
                    }
                }
                if (geg.c.contains(hegVar)) {
                    return null;
                }
                ydg ydgVarA = fegVar.b;
                if (ydgVarA == null && (ydgVarA = ((zdg) ks6Var2.d).a(hegVar)) == null) {
                    return null;
                }
                zjn0 zjn0Var = ydgVarA.a;
                hfy0 hfy0Var = ydgVarA.b;
                ava avaVar2 = ydgVarA.c;
                mka1 mka1Var = ydgVarA.d;
                heg hegVarE = hegVar.e();
                if (hegVarE != null) {
                    beg begVar = (beg) gegVar.b.invoke(new feg(hegVarE, null));
                    wht whtVar = begVar instanceof wht ? (wht) begVar : null;
                    if (whtVar == null || !whtVar.t0().m().contains(hegVar.f())) {
                        return null;
                    }
                    bypVar = whtVar.Y;
                    avaVar = avaVar2;
                } else {
                    fzq0 fzq0Var = (fzq0) ks6Var2.f;
                    kf30 kf30Var = hegVar.a;
                    ArrayList arrayList3 = new ArrayList();
                    men1.p(fzq0Var, kf30Var, arrayList3);
                    Iterator it5 = arrayList3.iterator();
                    do {
                        if (it5.hasNext()) {
                            next = it5.next();
                            dzq0Var2 = (dzq0) next;
                            if (dzq0Var2 instanceof zbc) {
                            }
                        } else {
                            next = null;
                        }
                        dzq0Var = (dzq0) next;
                        if (dzq0Var == null) {
                            return null;
                        }
                        l141 l141Var = new l141(hfy0Var.a1);
                        y3j1 y3j1Var = y3j1.b;
                        avaVar = avaVar2;
                        bypVar = new byp(ks6Var2, zjn0Var, dzq0Var, l141Var, l0p1.h(hfy0Var.c1), avaVar, (xht) null, (mxa1) null, z6x.a);
                    } while (!((fit) ((zbc) dzq0Var2).E()).m().contains(hegVar.f()));
                    dzq0Var = (dzq0) next;
                    if (dzq0Var == null) {
                        return null;
                    }
                    l141 l141Var2 = new l141(hfy0Var.a1);
                    y3j1 y3j1Var2 = y3j1.b;
                    avaVar = avaVar2;
                    bypVar = new byp(ks6Var2, zjn0Var, dzq0Var, l141Var2, l0p1.h(hfy0Var.c1), avaVar, (xht) null, (mxa1) null, z6x.a);
                }
                return new wht(bypVar, hfy0Var, zjn0Var, avaVar, mka1Var);
            case 12:
                gaa0 gaa0Var = (gaa0) obj2;
                if (gaa0Var.isActive()) {
                    gaa0Var.R(new AbortFlowException(gaa0Var));
                }
                return rih1Var;
            case 13:
                return ((zim0) obj).e().r((tnw0) obj2);
            case 14:
                Object obj3 = ((Object[]) obj2)[((Number) obj).intValue()];
                if (obj3 != null) {
                    return (String) obj3;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.String");
                return null;
            case 15:
                return d((lnm) obj);
            case 16:
                Timestamp timestamp = (Timestamp) obj;
                LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(timestamp.q(), timestamp.p(), ZoneOffset.UTC);
                long jAbs = Math.abs(localDateTimeOfEpochSecond.until(LocalDateTime.now((Clock) obj2), ChronoUnit.SECONDS));
                ChronoUnit chronoUnit = ChronoUnit.MINUTES;
                if (jAbs < chronoUnit.getDuration().getSeconds()) {
                    return ixe1.INSTANCE;
                }
                ChronoUnit chronoUnit2 = ChronoUnit.HOURS;
                if (jAbs < chronoUnit2.getDuration().getSeconds()) {
                    return new exe1(String.valueOf(jAbs / chronoUnit.getDuration().getSeconds()));
                }
                ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
                if (jAbs < chronoUnit3.getDuration().getSeconds()) {
                    return new bxe1(String.valueOf(jAbs / chronoUnit2.getDuration().getSeconds()));
                }
                if (jAbs < ChronoUnit.WEEKS.getDuration().getSeconds()) {
                    return new ywe1(timestamp.q(), timestamp.p(), String.valueOf(jAbs / chronoUnit3.getDuration().getSeconds()));
                }
                return jAbs < ChronoUnit.YEARS.getDuration().getSeconds() ? new hxe1(localDateTimeOfEpochSecond.getMonthValue(), String.valueOf(localDateTimeOfEpochSecond.getDayOfMonth())) : new lxe1(localDateTimeOfEpochSecond.getMonthValue(), String.valueOf(localDateTimeOfEpochSecond.getDayOfMonth()), String.valueOf(localDateTimeOfEpochSecond.getYear()));
            case 17:
                tr3 tr3Var = (tr3) obj;
                sxc0 sxc0Var = tr3Var.b;
                bqq0 bqq0Var = sxc0Var.a;
                qn90 qn90Var = sxc0Var.c;
                mml mmlVar = bqq0Var.e;
                kml kmlVar = mmlVar instanceof kml ? (kml) mmlVar : null;
                String str4 = kmlVar != null ? kmlVar.a : null;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = str4;
                boolean z3 = qn90Var instanceof on90;
                boolean z4 = qn90Var instanceof b8e0;
                boolean z5 = z4 && !((b8e0) qn90Var).getItems().isEmpty();
                jvc0 jvc0VarA = ((u5s) obj2).a(tr3Var);
                w7c0 w7c0Var = tr3Var.c;
                return new jwm1(str5, z3, (!((z4 || z3 || (qn90Var instanceof pn90)) ? true : qn90Var instanceof qn90 ? qn90Var.a instanceof b8e0 : false) || w7c0Var.a(x9v0Var) == null || w7c0Var.a(kf90Var) == null) ? false : true, z5, jvc0VarA.a, jvc0VarA.b);
            case 18:
                sot sotVar = (sot) obj;
                boolean z6 = sotVar instanceof not;
                mml mmlVar2 = jml.a;
                if (z6) {
                    not notVar = (not) sotVar;
                    List listT = ryo1.t(notVar.a);
                    mml mmlVar3 = notVar.b;
                    if (!(mmlVar3 instanceof lml)) {
                        mmlVar2 = mmlVar3;
                    }
                    utr utrVarA = a(mmlVar2, list3);
                    return new lot(new fqq0((as3) null, utrVarA.a, new jf20(list3, listT), mmlVar2, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 497), utrVarA.b);
                }
                if (sotVar instanceof rot) {
                    rot rotVar = (rot) sotVar;
                    mml mmlVar4 = rotVar.c;
                    vod1 vod1Var = rotVar.b;
                    String str6 = vod1Var.a;
                    if ((!(mmlVar4 instanceof lml) || !u890.j(((lml) mmlVar4).a, str6)) && (mmlVar4 instanceof jml)) {
                        lml lmlVar = new lml(str6, vod1Var.b);
                        utr utrVarA2 = a(lmlVar, rotVar.d);
                        return new lot(new fqq0((as3) null, utrVarA2.a, (jf20) null, lmlVar, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 501), utrVarA2.b);
                    }
                } else if (sotVar instanceof qot) {
                    qot qotVar = (qot) sotVar;
                    mml mmlVar5 = qotVar.c;
                    if ((mmlVar5 instanceof lml) && u890.j(((lml) mmlVar5).a, qotVar.b.a)) {
                        List listT2 = ryo1.t(qotVar.a);
                        utr utrVarA3 = a(mmlVar2, list3);
                        return new lot(new fqq0((as3) null, utrVarA3.a, new jf20(list3, listT2), mmlVar2, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 497), utrVarA3.b);
                    }
                } else if (sotVar instanceof pot) {
                    pot potVar = (pot) sotVar;
                    List listT3 = ryo1.t(potVar.a);
                    d6c0 d6c0Var = potVar.c;
                    List list5 = potVar.d;
                    if (listT3.isEmpty()) {
                        listSingletonList = list5;
                        list = listSingletonList;
                    } else {
                        tka0 tka0VarB = rc11.a.b(d6c0Var.getClass());
                        List list6 = list5;
                        boolean z7 = list6 instanceof Collection;
                        if (!z7 || !list6.isEmpty()) {
                            Iterator it6 = list6.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (rc11.a.b(((d6c0) it6.next()).getClass()).equals(tka0VarB)) {
                                        listSingletonList = list5;
                                        list = listSingletonList;
                                    }
                                }
                            }
                        }
                        if (d6c0Var.a || list5.isEmpty()) {
                            list = list5;
                            List list7 = listT3;
                            if ((list7 instanceof Collection) && list7.isEmpty()) {
                                listSingletonList = list;
                            } else {
                                Iterator it7 = list7.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        listSingletonList = list;
                                    } else if (rc11.a.b(((d6c0) it7.next()).getClass()).equals(tka0VarB)) {
                                        listSingletonList = Collections.singletonList(d6c0Var);
                                    }
                                }
                            }
                        } else {
                            List list8 = listT3;
                            boolean z8 = list8 instanceof Collection;
                            if (z8 && list8.isEmpty()) {
                                list = list5;
                                if (z8) {
                                    it = list8.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            listSingletonList = list;
                                        } else if (rc11.a.b(((d6c0) it.next()).getClass()).equals(tka0VarB)) {
                                            listSingletonList = Collections.singletonList(d6c0Var);
                                        }
                                    }
                                } else {
                                    it = list8.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            listSingletonList = list;
                                        } else if (rc11.a.b(((d6c0) it.next()).getClass()).equals(tka0VarB)) {
                                            listSingletonList = Collections.singletonList(d6c0Var);
                                        }
                                    }
                                }
                            } else {
                                Iterator it8 = list8.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        d6c0 d6c0Var2 = (d6c0) it8.next();
                                        if (z7 && list6.isEmpty()) {
                                            list = list5;
                                            list2 = list6;
                                        } else {
                                            Iterator it9 = list6.iterator();
                                            while (true) {
                                                if (!it9.hasNext()) {
                                                    list = list5;
                                                    list2 = list6;
                                                } else if (((d6c0) it9.next()).getClass() == d6c0Var2.getClass()) {
                                                    List listA2 = d6c0Var2.a();
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (Object obj4 : list6) {
                                                        List list9 = list5;
                                                        List list10 = list6;
                                                        if (((d6c0) obj4).getClass() != d6c0Var2.getClass()) {
                                                            arrayList4.add(obj4);
                                                        }
                                                        list6 = list10;
                                                        list5 = list9;
                                                    }
                                                    list = list5;
                                                    list2 = list6;
                                                    if (iro1.t(listA2, arrayList4, d6c0Var)) {
                                                        listSingletonList = o7h.j0(o7h.O0(d6c0Var, list));
                                                    }
                                                }
                                            }
                                        }
                                        list6 = list2;
                                        list5 = list;
                                    } else {
                                        list = list5;
                                        if (z8 || !list8.isEmpty()) {
                                            it = list8.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    listSingletonList = list;
                                                } else if (rc11.a.b(((d6c0) it.next()).getClass()).equals(tka0VarB)) {
                                                    listSingletonList = Collections.singletonList(d6c0Var);
                                                }
                                            }
                                        } else {
                                            listSingletonList = list;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    List list11 = listSingletonList;
                    ArrayList arrayList5 = new ArrayList(q7h.U(list11, 10));
                    Iterator it10 = list11.iterator();
                    while (it10.hasNext()) {
                        arrayList5.add(rc11.a.b(((d6c0) it10.next()).getClass()));
                    }
                    List list12 = list;
                    ArrayList arrayList6 = new ArrayList(q7h.U(list12, 10));
                    Iterator it11 = list12.iterator();
                    while (it11.hasNext()) {
                        arrayList6.add(rc11.a.b(((d6c0) it11.next()).getClass()));
                    }
                    if (!arrayList5.equals(arrayList6)) {
                        utr utrVarA4 = a(potVar.b, listSingletonList);
                        return new lot(new fqq0((as3) null, utrVarA4.a, new jf20(listSingletonList, listT3), (mml) null, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 505), utrVarA4.b);
                    }
                } else {
                    if (!(sotVar instanceof oot)) {
                        eg.o();
                        return null;
                    }
                    oot ootVar = (oot) sotVar;
                    ArrayList arrayList7 = new ArrayList(ootVar.d);
                    Iterator it12 = arrayList7.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it12.hasNext()) {
                            i13 = -1;
                        } else if (((d6c0) it12.next()).getClass() != ootVar.c.getClass()) {
                            i13++;
                        }
                    }
                    if (i13 >= 0) {
                        List listT4 = ryo1.t(ootVar.a);
                        List listSubList = arrayList7.subList(0, i13);
                        utr utrVarA5 = a(ootVar.b, listSubList);
                        return new lot(new fqq0((as3) null, utrVarA5.a, new jf20(listSubList, listT4), (mml) null, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 505), utrVarA5.b);
                    }
                }
                return kot.a;
            case 19:
                ((uds) obj2).invoke((ssi0) obj);
                return rih1Var;
            case 20:
                jyc jycVar = (jyc) obj;
                if (jycVar != null) {
                    ((ght) obj2).c.b(jycVar);
                    return rih1Var;
                }
                hhg1.n("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case 21:
                le20 le20Var = (le20) obj;
                List listI0 = f46.i0(new z460[]{le20Var.c, le20Var.d, le20Var.a, le20Var.b});
                ArrayList arrayList8 = new ArrayList(q7h.U(listI0, 10));
                Iterator it13 = listI0.iterator();
                while (it13.hasNext()) {
                    arrayList8.add((Completable) ((iwu) obj2).invoke((z460) it13.next()));
                }
                return Completable.l(arrayList8);
            case 22:
                return ((be) ((jkp0) obj2).b).callSingle("spotify.puffin_esperanto.proto.PuffinService", "EnterProcessingEnvironment", Empty.n()).map(o9x0.c).ignoreElement().p(xbp1.a1);
            case 23:
                l3c1 l3c1Var = (l3c1) obj;
                return Single.fromCallable(new e71((Object) l3c1Var, (Object) this, (byte) 9)).onErrorResumeNext(new lmw(l3c1Var, (byte) 19));
            case 24:
                e890 e890Var2 = (e890) obj2;
                g8b0 g8b0Var = (g8b0) obj;
                LinkedHashSet linkedHashSet = e890Var2.b;
                ArrayList arrayList9 = new ArrayList(q7h.U(linkedHashSet, 10));
                Iterator it14 = linkedHashSet.iterator();
                while (it14.hasNext()) {
                    arrayList9.add(((a8b0) it14.next()).y0(g8b0Var));
                    z2 = true;
                }
                if (z2) {
                    a8b0 a8b0Var = e890Var2.a;
                    a8b0 a8b0VarV0 = a8b0Var != null ? a8b0Var.y0(g8b0Var) : null;
                    arrayList9.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList9);
                    linkedHashSet2.hashCode();
                    e890 e890Var3 = new e890(linkedHashSet2);
                    e890Var3.a = a8b0VarV0;
                    e890Var = e890Var3;
                }
                if (e890Var != null) {
                    e890Var2 = e890Var;
                }
                return e890Var2.a();
            case 25:
                tr3 tr3Var2 = (tr3) obj;
                w7c0 w7c0Var2 = tr3Var2.c;
                sxc0 sxc0Var2 = tr3Var2.b;
                qn90 qn90Var2 = sxc0Var2.c;
                if (!(((qn90Var2 instanceof b8e0) || (qn90Var2 instanceof on90) || (qn90Var2 instanceof pn90)) ? true : qn90Var2 instanceof qn90 ? qn90Var2.a instanceof b8e0 : false) || w7c0Var2.a(x9v0Var) == null || w7c0Var2.a(kf90Var) == null || !(sxc0Var2.c instanceof on90) || ((collection = (Collection) w7c0Var2.a(vg60.a)) != null && !collection.isEmpty())) {
                    z = false;
                } else if (((evm1) obj2).p()) {
                    Object objA = w7c0Var2.a(qzi0.a);
                    rzi0 rzi0Var = objA instanceof rzi0 ? (rzi0) objA : null;
                    List list13 = rzi0Var != null ? rzi0Var.a : null;
                    if (list13 != null && !list13.isEmpty()) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                return ((s4w0) obj2).b((String) obj).distinctUntilChanged();
            case 27:
                h8b0 h8b0Var = (h8b0) obj2;
                kf30 kf30Var2 = (kf30) obj;
                kf30 kf30Var3 = d8a0.a;
                hep0.d0.getClass();
                kl21 kl21Var = (kl21) ((ffr) gep0.b.c).invoke(kf30Var2);
                if (kl21Var != null) {
                    return kl21Var;
                }
                e8a0 e8a0Var = (e8a0) ((ffr) d8a0.c.c).invoke(kf30Var2);
                if (e8a0Var == null) {
                    return kl21.a;
                }
                h8b0 h8b0Var2 = e8a0Var.b;
                return (h8b0Var2 == null || h8b0Var2.d - h8b0Var.d > 0) ? e8a0Var.a : e8a0Var.c;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                mmr0 mmr0Var = (mmr0) obj;
                String str7 = (String) mmr0Var.a;
                String str8 = (String) mmr0Var.b;
                List listSingletonList3 = Collections.singletonList(cg5.a(((oia0) obj2).a.e, cy30.p("'", str7, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str8, "()' stdlib extension instead"), str8 + "()", "HIDDEN"));
                return listSingletonList3.isEmpty() ? rzs0.g : new hg5(listSingletonList3, (byte) 0);
            default:
                eqb0 eqb0Var = (eqb0) obj2;
                ajn0 ajn0Var2 = l7a0.a;
                return l7a0.b(eqb0Var.a, (cb11) obj, eqb0Var.c);
        }
    }

    public /* synthetic */ p5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public p5(Object obj) {
        this.a = (byte) 14;
        this.b = (Object[]) obj;
    }
}

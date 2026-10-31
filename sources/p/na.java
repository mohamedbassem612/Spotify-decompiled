package p;

import android.content.Context;
import android.os.Build;
import androidx.car.app.k;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class na implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public na(mw7 mw7Var) {
        this.a = (byte) 7;
        this.c = mw7Var;
        this.b = Build.VERSION.SDK_INT >= 26 ? f46.S0(new Integer[]{3, 22, 19, 4}) : f46.S0(new Integer[]{3, 19, 4});
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    /* JADX WARN: Code duplicated, block: B:143:0x0512  */
    /* JADX WARN: Code duplicated, block: B:144:0x0515  */
    /* JADX WARN: Code duplicated, block: B:145:0x0518  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [p.lqb0] */
    /* JADX WARN: Type inference failed for: r2v71, types: [p.lqb0] */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v26, types: [p.p7a0, p.qv30, p.xdg] */
    public final Object invoke() throws i9n {
        boolean z;
        r2n r2nVar;
        boolean z2;
        tma0 tma0VarY;
        tma0 tma0Var;
        ?? arrayList;
        ?? r11;
        ?? r2;
        mmr0 mmr0Var;
        ArrayList arrayListD;
        byte b = this.a;
        ArrayList arrayList2 = z6x.a;
        rih1 rih1Var = rih1.a;
        boolean z3 = false;
        int i = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new oa((pa) obj2, (s1c1) obj);
            case 1:
                e0h1.b.getClass();
                return y3o1.j0(Collections.EMPTY_LIST, new iub0(voe0.e, new ka(this, (byte) 1)), e0h1.c, ((pa) obj2).g(), false);
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                o7h.x0(((Map) obj2).entrySet(), sb, ", ", "(", ")", ye3.d, 48);
                return sb.toString();
            case 3:
                f390 f390Var = (f390) ((ynb0) obj).get();
                k kVar = ((ia61) ((iwc) obj2)).c;
                Objects.requireNonNull(kVar);
                f390Var.a(kVar);
                return rih1Var;
            case 4:
                o860 o860Var = (o860) obj;
                return zf5.b((zf5) ((uw0) o860Var.b).Y, (r8a0) ((znb0) o860Var.d).getValue(), ((leg) obj2).getAnnotations());
            case 5:
                o860 o860Var2 = (o860) obj;
                return zf5.b((zf5) ((uw0) o860Var2.b).Y, (r8a0) ((znb0) o860Var2.d).getValue(), (fg5) obj2);
            case 6:
                float f = ((Context) obj).getResources().getConfiguration().fontScale;
                htl1 htl1Var = (htl1) ((jtl1) obj2).b.a.getValue();
                return Boolean.valueOf(!u890.j(htl1Var != null ? htl1Var.a : null, ltl1.b) ? f < 1.5f : f < 1.3f);
            case 7:
                for (qt7 qt7Var : ((mw7) obj).c()) {
                    if (((Set) obj2).contains(Integer.valueOf(qt7Var.getType()))) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 8:
                x7f1 x7f1Var = ((szg1) obj).n;
                return new u7h(z4p1.A(mlv.c.a(((Number) ((Function0) obj2).invoke()).floatValue()), x7f1Var.a, x7f1Var.b));
            case 9:
                nft nftVar = (nft) obj;
                String str = (String) obj2;
                mla0 mla0Var = nftVar.h;
                String str2 = nftVar.i;
                mla0Var.getClass();
                Collection collectionL1 = str.equals("<init>") ? o7h.l1(mla0Var.B()) : mla0Var.D(ajn0.e(str));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : collectionL1) {
                    if (u890.j(i141.c((ov30) obj3).f(), str2)) {
                        arrayList3.add(obj3);
                    }
                }
                if (arrayList3.size() == 1) {
                    return (ov30) o7h.V0(arrayList3);
                }
                String strY0 = o7h.y0(collectionL1, "\n", (String) null, (String) null, aht.W0, 30);
                StringBuilder sbN = gvg.n("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbN.append(mla0Var);
                sbN.append(':');
                sbN.append(strY0.length() == 0 ? " no members found" : "\n".concat(strY0));
                throw new i9n(sbN.toString());
            case 10:
                rgt rgtVar = (rgt) obj;
                Function0 function0 = (Function0) obj2;
                List listR0 = rgtVar.b.r0();
                if (listR0.isEmpty()) {
                    return arrayList2;
                }
                List list = listR0;
                ArrayList arrayList4 = new ArrayList(q7h.U(list, 10));
                int i2 = 0;
                for (Object obj4 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    e1h1 e1h1Var = (e1h1) obj4;
                    if (function0 == null) {
                        z2 = false;
                        r2nVar = null;
                    } else {
                        z2 = false;
                        r2nVar = new r2n(new pgt(rgtVar, (byte) 1), i2, false ? 1 : 0);
                    }
                    if (e1h1Var.c()) {
                        tma0VarY = tma0.c;
                    } else {
                        rgt rgtVar2 = new rgt(e1h1Var.b(), r2nVar, z2);
                        int iC = l1d.C(e1h1Var.a());
                        if (iC != 0) {
                            if (iC == 1) {
                                tma0Var = new tma0(2, rgtVar2);
                            } else {
                                if (iC != 2) {
                                    eg.o();
                                    return null;
                                }
                                tma0Var = new tma0(3, rgtVar2);
                            }
                            tma0VarY = tma0Var;
                        } else {
                            tma0 tma0Var2 = tma0.c;
                            tma0VarY = bqn1.y(rgtVar2);
                        }
                    }
                    arrayList4.add(tma0VarY);
                    i2 = i3;
                }
                return arrayList4;
            case 11:
                wht whtVar = (wht) obj;
                return o7h.l1(((kf5) ((ks6) whtVar.Y.b).e).n(whtVar.U0, (tfy0) obj2));
            case 12:
                return ((Single) ((g7t) obj).invoke("", "")).flatMap(new efr(this, (byte) 17));
            case 13:
                zh91 zh91Var = new zh91();
                Iterator it = ((qv30) obj2).l().iterator();
                while (it.hasNext()) {
                    zh91Var.add(((ov30) it.next()).d((l1h1) obj));
                }
                return zh91Var;
            case 14:
                eqy0 eqy0Var = (eqy0) obj2;
                ima1 ima1Var = eqy0Var.a;
                return yoi1.i(c4p1.F(ima1Var.o(), ima1Var, fqy0.a, h9a1.X0), o6x.a).filter(p5x0.c).map(new rpv0(eqy0Var, (byte) 8)).startWith(Single.fromCallable(new sra(eqy0Var, (byte) 18))).flatMap(new h0y(this, (byte) 17));
            case 15:
                hce1 hce1Var = (hce1) obj;
                return new x010(yoi1.g(((Single) ((na) hce1Var.c).invoke()).flatMapObservable(new xq81(hce1Var, (byte) 26))), yoi1.g(((iov0) obj2).a()), new mnl(3, (lnm) null, (byte) 25), (byte) 1);
            case 16:
                nnr nnrVarK = ((g0l) obj).k();
                f0u f0uVar = nnrVarK != null ? nnrVarK.c : null;
                switch (f0uVar == null ? -1 : wm40.a[f0uVar.ordinal()]) {
                    case -1:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        switch (((j0u) obj2).a.ordinal()) {
                            case 0:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 15:
                            case 16:
                                return h0u.SMARTPHONE;
                            case 1:
                            case 14:
                                return h0u.COMPUTER;
                            case 2:
                                return h0u.TABLET;
                            default:
                                eg.o();
                                return null;
                        }
                    case 0:
                    default:
                        eg.o();
                        return null;
                    case 1:
                    case 2:
                        return h0u.COMPUTER;
                    case 3:
                        return h0u.TABLET;
                    case 4:
                        return h0u.SMARTPHONE;
                    case 5:
                        return h0u.SPEAKER;
                    case 6:
                        return h0u.TV;
                    case 7:
                        return h0u.AUTOMOBILE;
                    case 8:
                        return h0u.WEARABLE;
                }
            case 17:
                Single singleObserveOn = ((Flowable) obj).z().observeOn((Scheduler) obj2);
                nn40 nn40Var = nn40.b;
                return singleObserveOn.map(new mka((byte) 12)).map(zi20.d);
            case 18:
                ((gx80) obj).Y = ((ex80) obj2).a();
                return rih1Var;
            case 19:
                return Observable.defer(new yj1((t0t) obj2, (byte) 28)).flatMap(new mjv(this, (byte) 29));
            case 20:
                ((o2a0) obj).N0 = ((k2a0) obj2).a();
                return rih1Var;
            case 21:
                return ((ajm0) ((uw0) ((o860) obj).b).X).e.k(((k7a0) obj2).a).m();
            case 22:
                iia0 iia0Var = (iia0) obj;
                voe0 voe0Var = (voe0) obj2;
                iu30 iu30Var = iia0Var.b;
                ajm0 ajm0Var = iia0Var.a;
                eeg eegVar = new eeg((n9r) iu30Var.invoke(ajm0Var), iia0.g, 4, 2, Collections.singletonList(ajm0Var.e.f()), voe0Var);
                eegVar.r0(new crg(voe0Var, eegVar), w7x.a, null);
                return eegVar;
            case 23:
                lia0 lia0Var = (lia0) obj;
                return new oia0(lia0Var.m(), (voe0) obj2, new x5u(lia0Var, (byte) 16));
            case 24:
                oia0 oia0Var = (oia0) obj;
                ajm0 ajm0Var2 = oia0Var.g().a;
                iia0.d.getClass();
                return x1p1.j(ajm0Var2, iia0.h, new poj0((voe0) obj2, oia0Var.g().a)).m();
            case 25:
                hqb0 hqb0Var = (hqb0) obj;
                o860 o860Var3 = hqb0Var.t;
                uw0 uw0Var = (uw0) o860Var3.b;
                return new hqb0(new o860(new uw0((voe0) uw0Var.d, (m7y0) uw0Var.e, (uqv0) uw0Var.f, (zht) uw0Var.g, (nfb) uw0Var.h, (q881) uw0Var.i, (va20) uw0Var.t, (ajm0) uw0Var.X, (wd11) uw0Var.c, (zf5) uw0Var.Y, (sua) uw0Var.Z, (bao0) uw0Var.b, (oi) uw0Var.N0, (uic) uw0Var.O0), (b1h1) o860Var3.c, (znb0) o860Var3.d), hqb0Var.k(), hqb0Var.h, (beg) obj2);
            case 26:
                bla0 bla0Var = (bla0) obj2;
                jfg jfgVarS = ((a8b0) obj).t0().s();
                if (jfgVarS instanceof beg) {
                    Class clsP = bpi1.p((beg) jfgVarS);
                    if (clsP != null) {
                        Class cls = bla0Var.b;
                        if (u890.j(cls.getSuperclass(), clsP)) {
                            Type genericSuperclass = cls.getGenericSuperclass();
                            genericSuperclass.getClass();
                            return genericSuperclass;
                        }
                        int iP0 = f46.p0(cls.getInterfaces(), clsP);
                        if (iP0 >= 0) {
                            Type type = cls.getGenericInterfaces()[iP0];
                            type.getClass();
                            return type;
                        }
                        ofr.i("No superclass of ", bla0Var, " in Java reflection for ", jfgVarS);
                    } else {
                        ofr.i("Unsupported superclass of ", bla0Var, ": ", jfgVarS);
                    }
                } else {
                    mna0.d(jfgVarS, "Supertype not a class: ");
                }
                return null;
            case 27:
                h7b0 h7b0Var = (h7b0) obj;
                c1h1 c1h1Var = (c1h1) obj2;
                y3b0 y3b0Var = h7b0Var.b.c;
                if (y3b0Var != null) {
                    return ajo1.B(y3b0Var, h7b0Var.a.a().n().getClassLoader(), c1h1Var, new x5u(h7b0Var, (byte) 25));
                }
                u890.C("type");
                throw null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                lqb0 lqb0Var = (lqb0) obj;
                o860 o860Var4 = (o860) obj2;
                eg5 eg5Var = rzs0.g;
                mb11 mb11Var = lqb0Var.o;
                o860 o860Var5 = lqb0Var.b;
                beg begVar = lqb0Var.n;
                List listK0 = z561.k0(new sgg1(ib11.a, z561.U(hb11.a, f46.I(mb11Var.a.getDeclaredConstructors()))));
                ArrayList arrayList5 = new ArrayList(listK0.size());
                Iterator it2 = listK0.iterator();
                while (it2.hasNext()) {
                    pb11 pb11Var = (pb11) it2.next();
                    p7a0 p7a0VarN1 = p7a0.N1(begVar, flo1.n(o860Var5, pb11Var), z3, wdx0.b(pb11Var));
                    o860 o860VarN = ryn1.n(o860Var5, p7a0VarN1, pb11Var, begVar.n().size(), (znb0) o860Var5.d);
                    Constructor constructor = pb11Var.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        arrayListD = arrayList2;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) f46.a0(i, genericParameterTypes.length, genericParameterTypes);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            bhn0.A(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) f46.a0(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
                        }
                        arrayListD = pb11Var.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    na30 na30VarT = yqb0.t(o860VarN, p7a0VarN1, arrayListD);
                    List listN = begVar.n();
                    ArrayList typeParameters = pb11Var.getTypeParameters();
                    Iterator it3 = it2;
                    ArrayList arrayList6 = new ArrayList(q7h.U(typeParameters, 10));
                    Iterator it4 = typeParameters.iterator();
                    while (it4.hasNext()) {
                        y0h1 y0h1VarB = ((b1h1) o860VarN.c).b((ac11) it4.next());
                        y0h1VarB.getClass();
                        arrayList6.add(y0h1VarB);
                    }
                    p7a0VarN1.L1(na30VarT.a, kuo1.k(pb11Var.e()), o7h.N0(arrayList6, listN));
                    p7a0VarN1.D1(false);
                    p7a0VarN1.E1(na30VarT.b);
                    p7a0VarN1.F1(begVar.m());
                    arrayList5.add(p7a0VarN1);
                    lqb0Var = lqb0Var;
                    it2 = it3;
                    z3 = false;
                    i = 1;
                }
                lqb0 lqb0Var2 = lqb0Var;
                boolean zI = mb11Var.i();
                Class cls2 = mb11Var.a;
                if (zI) {
                    Object obj5 = o860Var5.b;
                    p7a0 p7a0VarN2 = p7a0.N1(begVar, eg5Var, true, wdx0.b(mb11Var));
                    ArrayList<yb11> arrayListG = mb11Var.g();
                    ArrayList arrayList7 = new ArrayList(arrayListG.size());
                    o8a0 o8a0VarU = bs51.u(2, false, (drb0) null, 6);
                    int i4 = 0;
                    for (yb11 yb11Var : arrayListG) {
                        arrayList7.add(new tsi1(p7a0VarN2, null, i4, eg5Var, yb11Var.c(), ((st60) o860Var5.e).L(yb11Var.f(), o8a0VarU), false, false, false, null, wdx0.b(yb11Var)));
                        i4++;
                    }
                    p7a0VarN2.E1(false);
                    lht visibility = begVar.getVisibility();
                    if (visibility.equals(y7a0.b)) {
                        visibility = y7a0.c;
                    }
                    p7a0VarN2.K1(arrayList7, visibility);
                    p7a0VarN2.D1(false);
                    p7a0VarN2.F1(begVar.m());
                    int i5 = 2;
                    String strM = h0p1.m(p7a0VarN2, 2);
                    if (arrayList5.isEmpty()) {
                        arrayList5.add(p7a0VarN2);
                        Object obj6 = o860Var4.b;
                    } else {
                        Iterator it5 = arrayList5.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                arrayList5.add(p7a0VarN2);
                                Object obj7 = o860Var4.b;
                            } else if (!h0p1.m((xdg) it5.next(), i5).equals(strM)) {
                                i5 = 2;
                            }
                        }
                    }
                }
                sua suaVar = (sua) ((uw0) o860Var4.b).Z;
                boolean zIsEmpty = arrayList5.isEmpty();
                List listN2 = arrayList5;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls2.isAnnotation();
                    cls2.isInterface();
                    if (zIsAnnotation) {
                        Object obj8 = o860Var5.b;
                        st60 st60Var = (st60) o860Var5.e;
                        ?? N1 = p7a0.N1(begVar, eg5Var, true, wdx0.b(mb11Var));
                        if (zIsAnnotation) {
                            Collection collectionE = mb11Var.e();
                            arrayList = new ArrayList(collectionE.size());
                            o8a0 o8a0VarU2 = bs51.u(2, true, (drb0) null, 6);
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList<vb11> arrayList9 = new ArrayList();
                            for (Object obj9 : collectionE) {
                                if (u890.j(((vb11) obj9).c(), eia0.b)) {
                                    arrayList8.add(obj9);
                                } else {
                                    arrayList9.add(obj9);
                                }
                            }
                            arrayList8.size();
                            vb11 vb11Var = (vb11) o7h.s0(arrayList8);
                            if (vb11Var != null) {
                                zb11 zb11VarG = vb11Var.g();
                                if (zb11VarG instanceof gb11) {
                                    gb11 gb11Var = (gb11) zb11VarG;
                                    mmr0Var = new mmr0(st60Var.J(gb11Var, o8a0VarU2, true), st60Var.L(gb11Var.b, o8a0VarU2));
                                } else {
                                    mmr0Var = new mmr0(st60Var.L(zb11VarG, o8a0VarU2), (Object) null);
                                }
                                ?? r3 = lqb0Var2;
                                r3.u(arrayList, N1, 0, vb11Var, (a8b0) mmr0Var.a, (a8b0) mmr0Var.b);
                                r2 = r3;
                            } else {
                                r2 = lqb0Var2;
                            }
                            int i6 = vb11Var != null ? 1 : 0;
                            int i7 = 0;
                            for (vb11 vb11Var2 : arrayList9) {
                                r2.u(arrayList, N1, i7 + i6, vb11Var2, st60Var.L(vb11Var2.g(), o8a0VarU2), null);
                                i7++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        N1.E1(false);
                        lht visibility2 = begVar.getVisibility();
                        if (visibility2.equals(y7a0.b)) {
                            visibility2 = y7a0.c;
                        }
                        N1.K1(arrayList, visibility2);
                        N1.D1(true);
                        N1.F1(begVar.m());
                        r11 = N1;
                    } else {
                        r11 = 0;
                    }
                    listN2 = p7h.N((Object) r11);
                }
                return o7h.l1(suaVar.m(o860Var4, listN2));
            default:
                return new nqb0(((oqb0) obj).a, (wb11) obj2);
        }
    }

    public /* synthetic */ na(q9r q9rVar, Object obj, byte b) {
        this.a = b;
        this.b = q9rVar;
        this.c = obj;
    }

    public /* synthetic */ na(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}

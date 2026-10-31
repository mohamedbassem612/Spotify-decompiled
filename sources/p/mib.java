package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mib implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mib(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.c = obj;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(int i, lnm lnmVar) {
        ykb1 ykb1Var;
        if (lnmVar instanceof ykb1) {
            ykb1Var = (ykb1) lnmVar;
            int i2 = ykb1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ykb1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                ykb1Var = new ykb1(this, lnmVar);
            }
        } else {
            ykb1Var = new ykb1(this, lnmVar);
        }
        Object obj = ykb1Var.a;
        int i3 = ykb1Var.c;
        rih1 rih1Var = rih1.a;
        if (i3 != 0) {
            if (i3 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (i > 0) {
            l811 l811Var = (l811) this.c;
            if (!l811Var.a) {
                l811Var.a = true;
                vr20 vr20Var = (vr20) this.b;
                ykb1Var.c = 1;
                Object objEmit = vr20Var.emit(cy71.a, ykb1Var);
                d9n d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r6.b(r7, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(p.kh81 r7, p.lnm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.yg81
            if (r0 == 0) goto L13
            r0 = r8
            p.yg81 r0 = (p.yg81) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.yg81 r0 = new p.yg81
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.kh81 r7 = r0.a
            p.hm5.M(r8)
            goto L49
        L37:
            p.hm5.M(r8)
            java.lang.Object r8 = r6.b
            p.xab1 r8 = (p.xab1) r8
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = p.op71.p(r8, r0)
            if (r8 != r5) goto L49
            goto L57
        L49:
            java.lang.Object r6 = r6.c
            p.ssw0 r6 = (p.ssw0) r6
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.b(r7, r0)
            if (r6 != r5) goto L58
        L57:
            return r5
        L58:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mib.c(p.kh81, p.lnm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r11 == r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(p.lae1 r12, p.lnm r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mib.e(p.lae1, p.lnm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:119:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:159:0x034c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0393  */
    /* JADX WARN: Code duplicated, block: B:201:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:260:0x0517  */
    /* JADX WARN: Code duplicated, block: B:282:0x0575  */
    /* JADX WARN: Code duplicated, block: B:309:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:335:0x065e  */
    /* JADX WARN: Code duplicated, block: B:337:0x0668  */
    /* JADX WARN: Code duplicated, block: B:338:0x066a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x066c  */
    /* JADX WARN: Code duplicated, block: B:341:0x0678  */
    /* JADX WARN: Code duplicated, block: B:342:0x067a  */
    /* JADX WARN: Code duplicated, block: B:350:0x0694  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x0203  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public final Object emit(Object obj, lnm lnmVar) throws NoWhenBranchMatchedException, AbortFlowException {
        lib libVar;
        vr20 vr20Var;
        Set setK;
        Set setK2;
        int iOrdinal;
        agl aglVar;
        fko fkoVar;
        udr udrVar;
        vr20 vr20Var2;
        rq00 rq00Var;
        nt20 nt20Var;
        bu20 bu20Var;
        ju20 ju20Var;
        yu20 yu20Var;
        ksp0 ksp0Var;
        mp11 mp11Var;
        xsm1 xsm1Var;
        Object obj2 = obj;
        byte b = this.a;
        int i = 2;
        int i2 = 0;
        int i3 = 0;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                if (lnmVar instanceof lib) {
                    libVar = (lib) lnmVar;
                    int i4 = libVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        libVar.b = i4 - Integer.MIN_VALUE;
                    } else {
                        libVar = new lib(this, lnmVar);
                    }
                } else {
                    libVar = new lib(this, lnmVar);
                }
                Object objI = libVar.a;
                int i5 = libVar.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i2 = libVar.d;
                        setK = libVar.g;
                        setK2 = libVar.f;
                        vr20Var = libVar.c;
                        hm5.M(objI);
                    } else {
                        if (i5 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objI);
                    }
                    return rih1Var;
                }
                hm5.M(objI);
                vr20Var = (vr20) obj4;
                mmr0 mmr0Var = (mmr0) obj2;
                Map map = (Map) mmr0Var.a;
                Map map2 = (Map) mmr0Var.b;
                setK = oqo1.k(map);
                setK2 = oqo1.k(map2);
                bpb1 bpb1Var = ((oib) obj3).f;
                libVar.c = vr20Var;
                libVar.f = setK2;
                libVar.g = setK;
                libVar.d = 0;
                libVar.b = 1;
                objI = b5p1.i(bpb1Var, libVar);
                if (objI == d9nVar) {
                    return d9nVar;
                }
                yvg1 yvg1Var = new yvg1(setK, setK2, objI);
                libVar.c = null;
                libVar.f = null;
                libVar.g = null;
                libVar.d = i2;
                libVar.b = 2;
                if (vr20Var.emit(yvg1Var, libVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 1:
                mmr0 mmr0Var2 = (mmr0) obj2;
                vvc vvcVar = (vvc) obj4;
                Context context = vvcVar.b;
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = (ComponentName) obj3;
                bma1 bma1Var = vvc.e;
                kly0 kly0Var = vvcVar.c;
                try {
                    if (context.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionCode >= ((Number) mmr0Var2.b).intValue()) {
                        iOrdinal = ((m84) mmr0Var2.a).ordinal();
                        if (iOrdinal == 0) {
                            i = 1;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                eg.o();
                                return null;
                            }
                            if (((dma1) kly0Var.get()).h(bma1Var, false)) {
                                i = 1;
                            }
                        }
                    } else if (((dma1) kly0Var.get()).h(bma1Var, false)) {
                        iOrdinal = ((m84) mmr0Var2.a).ordinal();
                        if (iOrdinal == 0) {
                            i = 1;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                eg.o();
                                return null;
                            }
                            if (((dma1) kly0Var.get()).h(bma1Var, false)) {
                                i = 1;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                packageManager.setComponentEnabledSetting(componentName, i, 1);
                return rih1Var;
            case 2:
                ((Boolean) obj2).getClass();
                ((sfn0) obj4).a((String) obj3);
                return rih1Var;
            case 3:
                if (lnmVar instanceof agl) {
                    aglVar = (agl) lnmVar;
                    int i6 = aglVar.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        aglVar.b = i6 - Integer.MIN_VALUE;
                    } else {
                        aglVar = new agl(this, lnmVar);
                    }
                } else {
                    aglVar = new agl(this, lnmVar);
                }
                Object obj5 = aglVar.a;
                int i7 = aglVar.b;
                if (i7 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var3 = (vr20) obj4;
                    cgl cglVar = (cgl) obj2;
                    if (lls0.a((lls0) obj3) && cglVar != cgl.a) {
                        z2 = true;
                    }
                    Boolean boolM = yah0.m(z2);
                    aglVar.b = 1;
                    if (vr20Var3.emit(boolM, aglVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i7 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof fko) {
                    fkoVar = (fko) lnmVar;
                    int i8 = fkoVar.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        fkoVar.b = i8 - Integer.MIN_VALUE;
                    } else {
                        fkoVar = new fko(this, lnmVar);
                    }
                } else {
                    fkoVar = new fko(this, lnmVar);
                }
                Object obj6 = fkoVar.a;
                int i9 = fkoVar.b;
                if (i9 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var4 = (vr20) obj4;
                    Set set = ((ijo) obj2).a;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (u890.j((String) it.next(), ((yjo) obj3).c)) {
                                z = true;
                            }
                        }
                    }
                    Boolean boolM2 = yah0.m(z);
                    fkoVar.b = 1;
                    if (vr20Var4.emit(boolM2, fkoVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i9 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof udr) {
                    udrVar = (udr) lnmVar;
                    int i10 = udrVar.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        udrVar.b = i10 - Integer.MIN_VALUE;
                    } else {
                        udrVar = new udr(this, lnmVar);
                    }
                } else {
                    udrVar = new udr(this, lnmVar);
                }
                Object obj7 = udrVar.a;
                int i11 = udrVar.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i3 = udrVar.d;
                        vr20Var2 = udrVar.c;
                        hm5.M(obj7);
                    } else {
                        if (i11 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj7);
                    }
                    return rih1Var;
                }
                hm5.M(obj7);
                vr20 vr20Var5 = (vr20) obj4;
                rdr rdrVar = ((vdr) obj3).c;
                udrVar.c = vr20Var5;
                udrVar.d = 0;
                udrVar.b = 1;
                Object objC = rdrVar.c((List) obj2, udrVar);
                if (objC == d9nVar) {
                    return d9nVar;
                }
                vr20Var2 = vr20Var5;
                obj7 = objC;
                udrVar.c = null;
                udrVar.d = i3;
                udrVar.b = 2;
                if (vr20Var2.emit(obj7, udrVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 6:
                ((Number) obj2).doubleValue();
                a8l a8lVar = (a8l) obj3;
                yzs yzsVar = (yzs) obj4;
                fpr fprVar = yzsVar.e;
                List list = (List) fprVar.i.a.getValue();
                if (list.isEmpty() || o7h.q0(list) != a8lVar) {
                    Object objS0 = o7h.s0(list);
                    Objects.toString(a8lVar);
                    Objects.toString(objS0);
                } else {
                    boolean zBooleanValue = ((Boolean) fprVar.h.a.getValue()).booleanValue();
                    nqs nqsVar = yzsVar.j;
                    if (zBooleanValue) {
                        if (nqsVar != null) {
                            nqsVar.a();
                        }
                        yzsVar.j = null;
                    } else if (nqsVar == null || nqsVar.d()) {
                        l0l l0lVarC = ((inr) ((g0l) yzsVar.a.get())).c();
                        if (l0lVarC != null) {
                            yzsVar.j = ((qor) yzsVar.b.get()).d(new n6l(new zfr(yzsVar, l0lVarC, (byte) 26)), new l6l(), Long.valueOf(yzsVar.f.a()));
                        }
                    } else {
                        nqs nqsVar2 = yzsVar.j;
                        if (nqsVar2 != null) {
                            nqsVar2.h();
                        }
                    }
                }
                return rih1Var;
            case 7:
                p5v p5vVar = (qt80) obj2;
                ArrayList arrayList = (ArrayList) obj4;
                if (p5vVar instanceof o5v) {
                    arrayList.add(p5vVar);
                } else if (p5vVar instanceof p5v) {
                    arrayList.remove(p5vVar.a());
                } else if (p5vVar instanceof n5v) {
                    arrayList.remove(((n5v) p5vVar).a());
                }
                ((ven0) obj3).setValue(yah0.m(!arrayList.isEmpty()));
                return rih1Var;
            case 8:
                if (lnmVar instanceof rq00) {
                    rq00Var = (rq00) lnmVar;
                    int i12 = rq00Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        rq00Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        rq00Var = new rq00(this, lnmVar);
                    }
                } else {
                    rq00Var = new rq00(this, lnmVar);
                }
                Object obj8 = rq00Var.a;
                int i13 = rq00Var.b;
                if (i13 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var6 = (vr20) obj4;
                    Map map3 = (Map) obj2;
                    Set set2 = (Set) obj3;
                    int iS = zno1.s(q7h.U(set2, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                    for (Object obj9 : set2) {
                        Boolean bool = (Boolean) map3.get((String) obj9);
                        linkedHashMap.put(obj9, new j3r(yah0.m(bool != null ? bool.booleanValue() : false)));
                    }
                    rq00Var.b = 1;
                    if (vr20Var6.emit(linkedHashMap, rq00Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i13 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 9:
                if (lnmVar instanceof nt20) {
                    nt20Var = (nt20) lnmVar;
                    int i14 = nt20Var.c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        nt20Var.c = i14 - Integer.MIN_VALUE;
                    } else {
                        nt20Var = new nt20(this, lnmVar);
                    }
                } else {
                    nt20Var = new nt20(this, lnmVar);
                }
                Object obj10 = nt20Var.a;
                int i15 = nt20Var.c;
                try {
                    if (i15 == 0) {
                        hm5.M(obj10);
                        nt20Var.c = 1;
                        if (((vr20) obj4).emit(obj2, nt20Var) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i15 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj10);
                    }
                    return rih1Var;
                } catch (Throwable th) {
                    ((p811) obj3).a = th;
                    throw th;
                }
            case 10:
                if (lnmVar instanceof bu20) {
                    bu20Var = (bu20) lnmVar;
                    int i16 = bu20Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        bu20Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        bu20Var = new bu20(this, lnmVar);
                    }
                } else {
                    bu20Var = new bu20(this, lnmVar);
                }
                Object objInvoke = bu20Var.a;
                int i17 = bu20Var.b;
                if (i17 == 0) {
                    hm5.M(objInvoke);
                    bu20Var.b = 1;
                    objInvoke = ((xu30) obj3).invoke((vr20) obj4, obj2, bu20Var);
                    if (objInvoke == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i17 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objInvoke);
                }
                if (((Boolean) objInvoke).booleanValue()) {
                    return rih1Var;
                }
                throw new AbortFlowException(this);
            case 11:
                if (lnmVar instanceof ju20) {
                    ju20Var = (ju20) lnmVar;
                    int i18 = ju20Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ju20Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        ju20Var = new ju20(this, lnmVar);
                    }
                } else {
                    ju20Var = new ju20(this, lnmVar);
                }
                Object objInvoke2 = ju20Var.a;
                int i19 = ju20Var.b;
                if (i19 == 0) {
                    hm5.M(objInvoke2);
                    ju20Var.d = obj2;
                    ju20Var.b = 1;
                    objInvoke2 = ((vu30) obj4).invoke(obj2, ju20Var);
                    if (objInvoke2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i19 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = ju20Var.d;
                    hm5.M(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return rih1Var;
                }
                ((p811) obj3).a = obj2;
                throw new AbortFlowException(this);
            case 12:
                if (lnmVar instanceof yu20) {
                    yu20Var = (yu20) lnmVar;
                    int i20 = yu20Var.c;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        yu20Var.c = i20 - Integer.MIN_VALUE;
                    } else {
                        yu20Var = new yu20(this, lnmVar);
                    }
                } else {
                    yu20Var = new yu20(this, lnmVar);
                }
                Object obj11 = yu20Var.a;
                int i21 = yu20Var.c;
                if (i21 == 0) {
                    hm5.M(obj11);
                    vr20 vr20Var7 = (vr20) obj4;
                    n811 n811Var = (n811) obj3;
                    int i22 = n811Var.a;
                    n811Var.a = i22 + 1;
                    if (i22 < 0) {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                    aa80 aa80Var = new aa80(i22, obj2);
                    yu20Var.c = 1;
                    if (vr20Var7.emit(aa80Var, yu20Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 13:
                hk50 hk50Var = (kk50) obj2;
                if (!(hk50Var instanceof ik50)) {
                    if (hk50Var instanceof hk50) {
                        ((bpb1) obj4).l(mqo1.A(hk50Var.a()));
                    } else if (hk50Var instanceof jk50) {
                        dk50 dk50Var = (dk50) obj3;
                        c921.y(cto1.q(dk50Var.f.d.c), (o8n) null, 0, new f530(((jk50) hk50Var).a(), dk50Var, (Object) null, (lnm) null, (byte) 11), 3);
                    } else if (!(hk50Var instanceof gk50)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1Var;
            case 14:
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                ((ven0) obj4).setValue(bool2);
                ((ven0) obj3).setValue(Boolean.TRUE);
                return rih1Var;
            case 15:
                if (lnmVar instanceof ksp0) {
                    ksp0Var = (ksp0) lnmVar;
                    int i23 = ksp0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ksp0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        ksp0Var = new ksp0(this, lnmVar);
                    }
                } else {
                    ksp0Var = new ksp0(this, lnmVar);
                }
                Object obj12 = ksp0Var.a;
                int i24 = ksp0Var.b;
                if (i24 == 0) {
                    hm5.M(obj12);
                    jvp0 jvp0Var = (jvp0) obj2;
                    jvp0Var.getClass();
                    List listN = p7h.N(bbp1.p(jvp0Var, ((nsp0) obj3).c));
                    ksp0Var.b = 1;
                    if (((vr20) obj4).emit(listN, ksp0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i24 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var;
            case 16:
                yqg yqgVar = (yqg) obj3;
                if (lnmVar instanceof mp11) {
                    mp11Var = (mp11) lnmVar;
                    int i25 = mp11Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        mp11Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        mp11Var = new mp11(this, lnmVar);
                    }
                } else {
                    mp11Var = new mp11(this, lnmVar);
                }
                Object obj13 = mp11Var.a;
                int i26 = mp11Var.b;
                if (i26 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var8 = (vr20) obj4;
                    PlayerState playerState = (PlayerState) obj2;
                    Object yp11Var = playerState.track().c() ? (!playerState.isPlaying() || playerState.isPaused()) ? new yp11(((Number) playerState.position(yqgVar.b()).e(yah0.q(0L))).longValue(), ((Number) playerState.duration().e(yah0.q(0L))).longValue(), playerState.contextUri(), ((ContextTrack) playerState.track().b()).uri()) : new zp11(((Number) playerState.position(yqgVar.b()).e(yah0.q(0L))).longValue(), ((Number) playerState.duration().e(yah0.q(0L))).longValue(), playerState.contextUri(), ((ContextTrack) playerState.track().b()).uri()) : new xp11(playerState.contextUri());
                    mp11Var.b = 1;
                    if (vr20Var8.emit(yp11Var, mp11Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i26 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var;
            case 17:
                return e((lae1) obj2, lnmVar);
            case 18:
                return c((kh81) obj2, lnmVar);
            case 19:
                return b(((Number) obj2).intValue(), lnmVar);
            case 20:
                c9n c9nVar = (c9n) obj4;
                qt80 qt80Var = (qt80) obj2;
                o95 o95Var = (o95) obj3;
                if (qt80Var instanceof ry20) {
                    c921.y(c9nVar, (o8n) null, 4, new b(o95Var, (lnm) null, (byte) 22), 1);
                } else if (qt80Var instanceof sy20) {
                    c921.y(c9nVar, (o8n) null, 4, new b(o95Var, (lnm) null, (byte) 23), 1);
                }
                return rih1Var;
            case 21:
                qt80 qt80Var2 = (qt80) obj2;
                qhe1 qhe1Var = (qhe1) obj3;
                n811 n811Var2 = (n811) obj4;
                if (qt80Var2 instanceof r9w0) {
                    n811Var2.a++;
                } else if ((qt80Var2 instanceof s9w0) || (qt80Var2 instanceof q9w0)) {
                    n811Var2.a--;
                }
                boolean z3 = n811Var2.a > 0;
                if (qhe1.H1(qhe1Var) != z3) {
                    qhe1.I1(qhe1Var, z3);
                    dio1.y(qhe1Var);
                }
                return rih1Var;
            default:
                if (lnmVar instanceof xsm1) {
                    xsm1Var = (xsm1) lnmVar;
                    int i27 = xsm1Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        xsm1Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        xsm1Var = new xsm1(this, lnmVar);
                    }
                } else {
                    xsm1Var = new xsm1(this, lnmVar);
                }
                Object obj14 = xsm1Var.a;
                int i28 = xsm1Var.b;
                if (i28 == 0) {
                    hm5.M(obj14);
                    vr20 vr20Var9 = (vr20) obj4;
                    ArrayList<mmr0> arrayListV1 = o7h.v1((ArrayList) obj3, ((CollectionPlatformEsperantoContainsResponse) obj2).o().p());
                    int iS2 = zno1.s(q7h.U(arrayListV1, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                    for (mmr0 mmr0Var3 : arrayListV1) {
                        mmr0 mmr0VarN = oqn1.n(mmr0Var3.a, mmr0Var3.b);
                        linkedHashMap2.put(mmr0VarN.a, mmr0VarN.b);
                    }
                    xsm1Var.b = 1;
                    if (vr20Var9.emit(linkedHashMap2, xsm1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i28 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ mib(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}

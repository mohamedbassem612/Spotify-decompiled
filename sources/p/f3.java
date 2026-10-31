package p;

import android.os.Bundle;
import android.view.View;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f3 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                f3 f3Var = new f3((avl1) this.e, (lnm) obj5, (byte) 0);
                f3Var.c = (c3) obj2;
                f3Var.d = (a3) obj3;
                return f3Var.invokeSuspend(rih1Var);
            case 1:
                f3 f3Var2 = new f3((avl1) this.e, (lnm) obj5, (byte) 1);
                f3Var2.c = (bm1) obj;
                f3Var2.d = (tqw) obj4;
                return f3Var2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                f3 f3Var3 = new f3((int) b2, (lnm) obj5, (byte) 2);
                f3Var3.c = (s7n0) obj;
                f3Var3.b = zBooleanValue;
                f3Var3.d = (PlayerState) obj3;
                f3Var3.e = (e3q0) obj4;
                return f3Var3.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                f3 f3Var4 = new f3((int) b2, (lnm) obj5, (byte) 3);
                f3Var4.c = (ix11) obj;
                f3Var4.d = (k1r) obj2;
                f3Var4.e = (u7h) obj3;
                f3Var4.b = zBooleanValue2;
                return f3Var4.invokeSuspend(rih1Var);
            case 4:
                f3 f3Var5 = new f3((avl1) this.e, (lnm) obj5, (byte) 4);
                f3Var5.c = (jey0) obj;
                f3Var5.d = (r600) obj3;
                return f3Var5.invokeSuspend(rih1Var);
            case 5:
                f3 f3Var6 = new f3((tm) this.d, (qtr) this.e, (lnm) obj5, b2);
                f3Var6.c = (lk9) obj3;
                return f3Var6.invokeSuspend(rih1Var);
            case 6:
                f3 f3Var7 = new f3((avl1) this.e, (lnm) obj5, (byte) 6);
                f3Var7.c = (c3a) obj2;
                f3Var7.d = (a3a) obj3;
                return f3Var7.invokeSuspend(rih1Var);
            case 7:
                f3 f3Var8 = new f3((avl1) this.e, (lnm) obj5, (byte) 7);
                f3Var8.c = (q600) obj3;
                f3Var8.d = (tqw) obj4;
                return f3Var8.invokeSuspend(rih1Var);
            case 8:
                f3 f3Var9 = new f3((avl1) this.e, (lnm) obj5, (byte) 8);
                f3Var9.c = (yfh) obj;
                f3Var9.d = (xfh) obj3;
                return f3Var9.invokeSuspend(rih1Var);
            case 9:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                f3 f3Var10 = new f3((int) b2, (lnm) obj5, (byte) 9);
                f3Var10.c = (eww0) obj;
                f3Var10.d = (oa10) obj2;
                f3Var10.b = zBooleanValue3;
                f3Var10.e = (Boolean) obj4;
                return f3Var10.invokeSuspend(rih1Var);
            case 10:
                f3 f3Var11 = new f3((avl1) this.e, (lnm) obj5, (byte) 10);
                f3Var11.c = (d960) obj2;
                f3Var11.d = (a960) obj3;
                return f3Var11.invokeSuspend(rih1Var);
            case 11:
                f3 f3Var12 = new f3((avl1) this.e, (lnm) obj5, (byte) 11);
                f3Var12.c = (qw91) obj;
                f3Var12.d = (pw91) obj3;
                return f3Var12.invokeSuspend(rih1Var);
            case 12:
                f3 f3Var13 = new f3((avl1) this.e, (lnm) obj5, (byte) 12);
                f3Var13.c = (n4z) obj2;
                f3Var13.d = (h4z) obj3;
                return f3Var13.invokeSuspend(rih1Var);
            case 13:
                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                f3 f3Var14 = new f3((int) b2, (lnm) obj5, (byte) 13);
                f3Var14.c = (a7q0) obj;
                f3Var14.d = (uxn) obj2;
                f3Var14.e = (pn30) obj3;
                f3Var14.b = zBooleanValue4;
                return f3Var14.invokeSuspend(rih1Var);
            case 14:
                f3 f3Var15 = new f3((avl1) this.e, (lnm) obj5, (byte) 14);
                f3Var15.c = (a980) obj;
                f3Var15.d = (z880) obj3;
                return f3Var15.invokeSuspend(rih1Var);
            case 15:
                f3 f3Var16 = new f3((avl1) this.e, (lnm) obj5, (byte) 15);
                f3Var16.c = (sv90) obj2;
                f3Var16.d = (lv90) obj3;
                return f3Var16.invokeSuspend(rih1Var);
            case 16:
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                f3 f3Var17 = new f3((int) b2, (lnm) obj5, (byte) 16);
                f3Var17.c = (k1r) obj;
                f3Var17.d = (k1r) obj2;
                f3Var17.b = zBooleanValue5;
                f3Var17.e = (k1r) obj4;
                return f3Var17.invokeSuspend(rih1Var);
            case 17:
                f3 f3Var18 = new f3((avl1) this.e, (lnm) obj5, (byte) 17);
                f3Var18.c = (q7k0) obj3;
                f3Var18.d = (tqw) obj4;
                return f3Var18.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                f3 f3Var19 = new f3((avl1) this.e, (lnm) obj5, (byte) 18);
                f3Var19.c = (lum0) obj3;
                f3Var19.d = (tqw) obj4;
                return f3Var19.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                f3 f3Var20 = new f3((avl1) this.e, (lnm) obj5, (byte) 19);
                f3Var20.c = (oop0) obj2;
                f3Var20.d = (tqw) obj4;
                return f3Var20.invokeSuspend(rih1Var);
            case 20:
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                f3 f3Var21 = new f3((int) b2, (lnm) obj5, (byte) 20);
                f3Var21.c = (v4u0) obj;
                f3Var21.d = (mp91) obj2;
                f3Var21.b = zBooleanValue6;
                f3Var21.e = (List) obj4;
                return f3Var21.invokeSuspend(rih1Var);
            case 21:
                boolean zBooleanValue7 = ((Boolean) obj4).booleanValue();
                f3 f3Var22 = new f3((int) b2, (lnm) obj5, (byte) 21);
                f3Var22.c = (zkm) obj;
                f3Var22.d = (hwt) obj2;
                f3Var22.e = (i091) obj3;
                f3Var22.b = zBooleanValue7;
                return f3Var22.invokeSuspend(rih1Var);
            case 22:
                f3 f3Var23 = new f3((avl1) this.e, (lnm) obj5, (byte) 22);
                f3Var23.c = (qcz0) obj2;
                f3Var23.d = (tqw) obj4;
                return f3Var23.invokeSuspend(rih1Var);
            case 23:
                f3 f3Var24 = new f3((avl1) this.e, (lnm) obj5, (byte) 23);
                f3Var24.c = (d721) obj;
                f3Var24.d = (c721) obj3;
                return f3Var24.invokeSuspend(rih1Var);
            case 24:
                f3 f3Var25 = new f3((avl1) this.e, (lnm) obj5, (byte) 24);
                f3Var25.c = (p671) obj2;
                f3Var25.d = (tqw) obj4;
                return f3Var25.invokeSuspend(rih1Var);
            case 25:
                f3 f3Var26 = new f3((qtr) this.d, (dea0) this.e, (lnm) obj5, (byte) 25);
                f3Var26.c = (xf81) obj3;
                return f3Var26.invokeSuspend(rih1Var);
            case 26:
                f3 f3Var27 = new f3((avl1) this.e, (lnm) obj5, (byte) 26);
                f3Var27.c = (em91) obj2;
                f3Var27.d = (tqw) obj4;
                return f3Var27.invokeSuspend(rih1Var);
            case 27:
                f3 f3Var28 = new f3((avl1) this.e, (lnm) obj5, (byte) 27);
                f3Var28.c = (eha1) obj3;
                f3Var28.d = (tqw) obj4;
                return f3Var28.invokeSuspend(rih1Var);
            default:
                f3 f3Var29 = new f3((avl1) this.e, (lnm) obj5, (byte) 28);
                f3Var29.c = (luf1) obj;
                f3Var29.d = (juf1) obj3;
                return f3Var29.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        gx11 gx11Var;
        hpc1 hpc1VarK;
        xgn0 xgn0Var;
        Object objB;
        ou80 ou80Var;
        ou80 ou80Var2;
        lsn0 lsn0Var;
        Object objI;
        m231 m231Var;
        boolean z = false;
        tv80 tv80Var = null;
        switch (this.a) {
            case 0:
                c3 c3Var = (c3) this.c;
                a3 a3Var = (a3) this.d;
                d9n d9nVar = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (!u890.j(a3Var, a3.a)) {
                        eg.o();
                        return null;
                    }
                    f1n0 f1n0Var = ((n3) this.e).e;
                    dwn0 dwn0Var = new dwn0(c3Var.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (f1n0Var.c(dwn0Var, null, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                bm1 bm1Var = (bm1) this.c;
                tqw tqwVar = (tqw) this.d;
                d9n d9nVar2 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    yxb0 yxb0Var = (yxb0) this.e;
                    Single singleC = ((oj3) yxb0Var.d).c(Collections.singletonList(bm1Var.a), ((lik1) yxb0Var.c).a, bm1Var.a, bm1Var.b, new gj3(27, tqwVar != null ? n3o1.y(tqwVar) : null));
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (fc11.j(singleC, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 2:
                s7n0 s7n0Var = (s7n0) this.c;
                boolean z4 = this.b;
                PlayerState playerState = (PlayerState) this.d;
                e3q0 e3q0Var = (e3q0) this.e;
                hm5.M(obj);
                playerState.getClass();
                return new gd3(s7n0Var, playerState, z4, e3q0Var);
            case 3:
                ix11 ix11Var = (ix11) this.c;
                i1r i1rVar = (k1r) this.d;
                u7h u7hVar = (u7h) this.e;
                boolean z5 = this.b;
                hm5.M(obj);
                if (!(ix11Var instanceof gx11)) {
                    return ix11Var;
                }
                su6 su6VarA = su6.a(((gx11) ix11Var).a, (String) null, u7hVar, (List) null, 3583);
                if (z5 && su6VarA.d == 0 && su6VarA.e == 0) {
                    z = true;
                }
                if (i1rVar instanceof i1r) {
                    gx11Var = new gx11(su6.a(su6VarA, ((jo70) i1rVar.a).a, (u7h) null, (List) null, 3967));
                } else {
                    if (z) {
                        return i1rVar instanceof h1r ? new hx11(((h1r) i1rVar).a) : ex11.a;
                    }
                    gx11Var = new gx11(su6VarA);
                }
                return gx11Var;
            case 4:
                d9n d9nVar3 = rih1.a;
                jey0 jey0Var = (jey0) this.c;
                r600 r600Var = (r600) this.d;
                d9n d9nVar4 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    k8e0 k8e0Var = jey0Var.a;
                    if (k8e0Var instanceof k8e0) {
                        ymm0 ymm0Var = ((kp7) this.e).X;
                        k8e0 k8e0Var2 = k8e0Var;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        x6o0 x6o0Var = (x6o0) ymm0Var.b;
                        int iOrdinal = r600Var.ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        x6o0Var.q(r600Var, k8e0Var2, (tv80) null);
                        if (d9nVar3 == d9nVar4) {
                            return d9nVar4;
                        }
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar3;
            case 5:
                tm tmVar = (tm) this.d;
                lk9 lk9Var = (lk9) this.c;
                d9n d9nVar5 = d9n.a;
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        if (u890.j(lk9Var, kk9.a)) {
                            hpc1VarK = tmVar.k();
                        } else {
                            if (!u890.j(lk9Var, jk9.a)) {
                                eg.o();
                                return null;
                            }
                            hpc1VarK = null;
                        }
                        Completable completableA = ((nqc1) tmVar.d).a(hpc1VarK);
                        this.c = null;
                        this.b = true;
                        if (fc11.i(completableA, this) == d9nVar5) {
                            return d9nVar5;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    break;
                } catch (Throwable unused) {
                }
                return rih1.a;
            case 6:
                rih1 rih1Var = rih1.a;
                e3a e3aVar = (e3a) this.e;
                xgn0 xgn0Var2 = e3aVar.c;
                c3a c3aVar = (c3a) this.c;
                a3a a3aVar = (a3a) this.d;
                d9n d9nVar6 = d9n.a;
                boolean z8 = this.b;
                try {
                    if (!z8) {
                        hm5.M(obj);
                        if (!u890.j(a3aVar, a3a.a)) {
                            eg.o();
                            return null;
                        }
                        nji0 nji0Var = c3aVar.c;
                        lji0 lji0Var = nji0Var instanceof lji0 ? (lji0) nji0Var : null;
                        if (lji0Var != null && xgn0Var2.g()) {
                            tji0 tji0Var = e3aVar.a;
                            String str = c3aVar.a;
                            boolean z9 = !lji0Var.a;
                            this.c = null;
                            this.d = null;
                            this.b = true;
                            objB = tji0Var.b(str, this, z9);
                            if (objB == d9nVar6) {
                                return d9nVar6;
                            }
                        }
                        return rih1Var;
                    }
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = ((e331) obj).a;
                    if (e331.a(objB) != null) {
                        kt91 kt91Var = e3aVar.b;
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958507});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        xgn0Var = xgn0Var2;
                        try {
                            kt91Var.k(new er91((fs91) null, "", 2131958507, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        } catch (Throwable th) {
                            th = th;
                            xgn0Var.c((Object) null);
                            throw th;
                        }
                        break;
                    } else {
                        xgn0Var = xgn0Var2;
                    }
                    xgn0Var.c((Object) null);
                    return rih1Var;
                } catch (Throwable th2) {
                    th = th2;
                    xgn0Var = xgn0Var2;
                }
                break;
            case 7:
                res resVar = (res) this.e;
                tq90 tq90Var = (tq90) resVar.f;
                iwz iwzVar = (q600) this.c;
                tqw tqwVar2 = (tqw) this.d;
                d9n d9nVar7 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    if (iwzVar instanceof iwz) {
                        i3b i3bVar = (i3b) resVar.g;
                        if (tqwVar2 != null && (ou80Var2 = n3o1.y(tqwVar2).a) != null) {
                            tv80Var = ou80Var2.a;
                        }
                        i3bVar.i(tv80Var, iwzVar.a);
                    } else if (iwzVar instanceof lyz) {
                        tq90Var.a(((lyz) iwzVar).a, hr90.Y);
                    } else if (iwzVar instanceof uzz) {
                        tq90Var.a(((uzz) iwzVar).a, hr90.Z);
                    } else {
                        if (!(iwzVar instanceof tzz)) {
                            eg.o();
                            return null;
                        }
                        byp bypVar = (byp) resVar.e;
                        String str2 = (tqwVar2 == null || (ou80Var = n3o1.y(tqwVar2).a) == null) ? null : ou80Var.a;
                        bca0 bca0Var = new bca0(new wea0(xea0.X), ((tzz) iwzVar).a, Collections.singleton(ko90.e), null);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (bypVar.B(str2, bca0Var, this) == d9nVar7) {
                            return d9nVar7;
                        }
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 8:
                yfh yfhVar = (yfh) this.c;
                xfh xfhVar = (xfh) this.d;
                d9n d9nVar8 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    if (xfhVar instanceof wfh) {
                        jd6 jd6Var = (jd6) this.e;
                        String str3 = ((wfh) xfhVar).a;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (jd6Var.k(yfhVar, str3, this) == d9nVar8) {
                            return d9nVar8;
                        }
                    } else {
                        if (!(xfhVar instanceof vfh)) {
                            eg.o();
                            return null;
                        }
                        vos0 vos0Var = (vos0) ((jd6) this.e).f;
                        String strO = o6p1.o(yfhVar);
                        String str4 = ((vfh) xfhVar).a;
                        if (ihc1.e1(str4).toString().length() == 0) {
                            vos0Var.a(strO);
                        } else {
                            synchronized (vos0Var.b) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap(vos0Var.c());
                                linkedHashMap.put(strO, str4);
                                vos0Var.d(linkedHashMap);
                            }
                        }
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 9:
                eww0 eww0Var = (eww0) this.c;
                oa10 oa10Var = (oa10) this.d;
                boolean z12 = this.b;
                Boolean bool = (Boolean) this.e;
                hm5.M(obj);
                bool.getClass();
                return new pa10(eww0Var, oa10Var, z12, bool.booleanValue());
            case 10:
                d960 d960Var = (d960) this.c;
                a960 a960Var = (a960) this.d;
                d9n d9nVar9 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    b960 b960Var = d960Var.b;
                    if (b960Var != null) {
                        nl9 nl9Var = (nl9) this.e;
                        if (w0s.a[a960Var.ordinal()] != 1) {
                            eg.o();
                            return null;
                        }
                        String str5 = d960Var.a;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (nl9Var.i(str5, b960Var, this) == d9nVar9) {
                            return d9nVar9;
                        }
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 11:
                rih1 rih1Var2 = rih1.a;
                ers ersVar = (ers) this.e;
                qw91 qw91Var = (qw91) this.c;
                pw91 pw91Var = (pw91) this.d;
                d9n d9nVar10 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    if (brs.a[pw91Var.ordinal()] != 1) {
                        eg.o();
                        return null;
                    }
                    ersVar.b.invoke();
                    ijr ijrVar = ersVar.a;
                    String str6 = qw91Var.a;
                    String str7 = qw91Var.b;
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (ijrVar.f(str6, str7, this) == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 12:
                yxb0 yxb0Var2 = (yxb0) this.e;
                i4z i4zVar = (n4z) this.c;
                h4z h4zVar = (h4z) this.d;
                d9n d9nVar11 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    if (u890.j(h4zVar, g4z.a)) {
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (yxb0Var2.l(i4zVar, this) == d9nVar11) {
                            return d9nVar11;
                        }
                    } else {
                        if (!u890.j(h4zVar, f4z.a)) {
                            eg.o();
                            return null;
                        }
                        ((jab) yxb0Var2.d).a();
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                a7q0 a7q0Var = (a7q0) this.c;
                uxn uxnVar = (uxn) this.d;
                pn30 pn30Var = (pn30) this.e;
                boolean z16 = this.b;
                hm5.M(obj);
                return new yv50(a7q0Var, uxnVar, pn30Var, z16);
            case 14:
                a980 a980Var = (a980) this.c;
                z880 z880Var = (z880) this.d;
                d9n d9nVar12 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    if (z880Var == null) {
                        eg.o();
                        return null;
                    }
                    o3s o3sVar = (o3s) ((ynb0) ((ng20) this.e).b).get();
                    String str8 = a980Var.a;
                    d980 d980Var = z880Var.a;
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (o3sVar.b(str8, d980Var, this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 15:
                sv90 sv90Var = (sv90) this.c;
                lv90 lv90Var = (lv90) this.d;
                d9n d9nVar13 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    yxb0 yxb0Var3 = (yxb0) this.e;
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (yxb0Var3.i(sv90Var, lv90Var, this) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 16:
                k1r k1rVar = (k1r) this.c;
                k1r k1rVar2 = (k1r) this.d;
                boolean z19 = this.b;
                k1r k1rVar3 = (k1r) this.e;
                hm5.M(obj);
                return new dmj0(k1rVar, k1rVar2, z19, k1rVar3);
            case 17:
                q7k0 q7k0Var = (q7k0) this.c;
                tqw tqwVar3 = (tqw) this.d;
                d9n d9nVar14 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    if (!u890.j(q7k0Var, q7k0.a)) {
                        eg.o();
                        return null;
                    }
                    xu30 xu30Var = (xu30) ((jd6) this.e).f;
                    tv80 tv80VarY = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (xu30Var.invoke(q7k0Var, tv80VarY, this) == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                rih1 rih1Var3 = rih1.a;
                lum0 lum0Var = (lum0) this.c;
                tqw tqwVar4 = (tqw) this.d;
                d9n d9nVar15 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    tv80 tv80VarY2 = tqwVar4 != null ? n3o1.y(tqwVar4) : null;
                    if (rum0.a[lum0Var.ordinal()] != 1) {
                        eg.o();
                        return null;
                    }
                    gum0 gum0Var = (gum0) ((ynb0) ((nl9) this.e).e).get();
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    Object objY = fn31.Y(gum0Var.c, new hyg0(gum0Var, tv80VarY2, (lnm) null, (byte) 15), this);
                    if (objY != d9nVar15) {
                        objY = rih1Var3;
                    }
                    if (objY == d9nVar15) {
                        return d9nVar15;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                res resVar2 = (res) this.e;
                oop0 oop0Var = (oop0) this.c;
                tqw tqwVar5 = (tqw) this.d;
                d9n d9nVar16 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    String strA = upp0.a();
                    Single singleC2 = ((oj3) resVar2.e).c(Collections.singletonList(strA), ((lik1) resVar2.d).a, strA, oop0Var.a, new gj3(27, tqwVar5 != null ? n3o1.y(tqwVar5) : null));
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (fc11.j(singleC2, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 20:
                v4u0 v4u0Var = (v4u0) this.c;
                mp91 mp91Var = (mp91) this.d;
                boolean z23 = this.b;
                List list = (List) this.e;
                hm5.M(obj);
                xzc0 xzc0Var = v4u0Var.b;
                Set set = v4u0Var.c;
                w4u0 w4u0Var = v4u0Var.d;
                Set set2 = w4u0Var.a;
                g3d0 g3d0Var = w4u0Var.b;
                u4u0 u4u0Var = v4u0Var.a;
                return new t4u0(g3d0Var, set2, list, set, xzc0Var, z23, u4u0Var.a, mp91Var, u4u0Var.b, v4u0Var.e);
            case 21:
                zkm zkmVar = (zkm) this.c;
                hwt hwtVar = (hwt) this.d;
                i091 i091Var = (i091) this.e;
                boolean z24 = this.b;
                hm5.M(obj);
                return new xaw0(zkmVar, hwtVar, i091Var, z24);
            case 22:
                rwj rwjVar = (rwj) this.e;
                qcz0 qcz0Var = (qcz0) this.c;
                tqw tqwVar6 = (tqw) this.d;
                d9n d9nVar17 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    if (tqwVar6 != null) {
                        tv80 tv80VarY3 = n3o1.y(tqwVar6);
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        lsn0Var = new lsn0(yon1.L5().c, tv80VarY3.a);
                    } else {
                        lsn0Var = jsn0.a;
                    }
                    mwn0 mwn0Var = (mwn0) rwjVar.f;
                    mwn0Var.e(lsn0Var);
                    mwn0Var.f(lsn0Var);
                    tv80 tv80VarY4 = tqwVar6 != null ? n3o1.y(tqwVar6) : null;
                    kdy0 kdy0Var = (kdy0) rwjVar.d;
                    if (!(qcz0Var instanceof pcz0) && !(qcz0Var instanceof ocz0)) {
                        eg.o();
                        return null;
                    }
                    CompletableOnErrorComplete completableOnErrorCompleteO = kdy0Var.o(ycz0.a, tv80VarY4 != null ? tv80VarY4.a : null);
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (fc11.i(completableOnErrorCompleteO, this) == d9nVar17) {
                        return d9nVar17;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 23:
                j721 j721Var = (j721) this.e;
                ggx0 ggx0Var = j721Var.b;
                d721 d721Var = (d721) this.c;
                c721 c721Var = (c721) this.d;
                d9n d9nVar18 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    if (u890.j(c721Var, a721.a)) {
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (j721Var.e(d721Var, this) == d9nVar18) {
                            return d9nVar18;
                        }
                    } else if (u890.j(c721Var, b721.a)) {
                        fn31.T(j721Var.a, (o8n) null, 0, new h721(j721Var, d721Var, (lnm) null, (byte) 0), 3);
                        ggx0Var.invoke();
                    } else {
                        if (!u890.j(c721Var, z621.a)) {
                            eg.o();
                            return null;
                        }
                        ggx0Var.invoke();
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 24:
                im0 im0Var = (im0) this.e;
                rih1 rih1Var4 = rih1.a;
                p671 p671Var = (p671) this.c;
                tqw tqwVar7 = (tqw) this.d;
                d9n d9nVar19 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    if (p671Var.a) {
                        Flowable flowable = im0Var.b;
                        vbm[] vbmVarArr = q601.a;
                        kge kgeVar = new kge(flowable);
                        this.c = p671Var;
                        this.d = tqwVar7;
                        this.b = true;
                        objI = b5p1.i(kgeVar, this);
                        if (objI == d9nVar19) {
                            return d9nVar19;
                        }
                    }
                    return rih1Var4;
                }
                if (!z27) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objI = obj;
                PlayerState playerState2 = (PlayerState) objI;
                wa71 wa71VarG = im0Var.g(playerState2);
                if (u890.j(((ContextTrack) playerState2.track().b()).uri(), p671Var.b) && u890.j(wa71VarG.a, p671Var.c)) {
                    xh71.b((xh71) im0Var.d, wa71VarG, (Bundle) null, new vm71("now-playing"), tqwVar7 != null ? n3o1.y(tqwVar7) : null, (List) null, 18);
                }
                return rih1Var4;
            case 25:
                m231 m231Var2 = rih1.a;
                xf81 xf81Var = (xf81) this.c;
                d9n d9nVar20 = d9n.a;
                boolean z28 = this.b;
                try {
                    if (!z28) {
                        hm5.M(obj);
                        if (!u890.j(xf81Var, xf81.a)) {
                            eg.o();
                            return null;
                        }
                        dea0 dea0Var = (dea0) this.e;
                        q8n q8nVar = dea0Var.b;
                        b751 b751Var = new b751(dea0Var, (lnm) null, (byte) 18);
                        this.c = null;
                        this.b = true;
                        if (fn31.Y(q8nVar, b751Var, this) == d9nVar20) {
                            return d9nVar20;
                        }
                    } else {
                        if (!z28) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = m231Var2;
                    break;
                } catch (Throwable th3) {
                    m231Var = new m231(th3);
                }
                if (e331.a(m231Var) != null) {
                    op71.x(getContext());
                }
                return m231Var2;
            case 26:
                qm91 qm91Var = (qm91) this.e;
                em91 em91Var = (em91) this.c;
                tqw tqwVar8 = (tqw) this.d;
                d9n d9nVar21 = d9n.a;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    jm91 jm91Var = em91Var.f;
                    if (u890.j(jm91Var, im91.a)) {
                        Completable completableG = ((hj91) qm91Var.e).g(em91Var.a, tqwVar8 != null ? n3o1.y(tqwVar8) : null);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        if (fc11.i(completableG, this) == d9nVar21) {
                            return d9nVar21;
                        }
                    } else if (jm91Var instanceof hm91) {
                        kt91 kt91Var2 = ((a78) qm91Var.g).a;
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963921});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        kt91Var2.k(new er91((fs91) null, "", 2131963921, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    } else if (!u890.j(jm91Var, gm91.a)) {
                        eg.o();
                        return null;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 27:
                et90 et90Var = (et90) this.e;
                eha1 eha1Var = (eha1) this.c;
                tqw tqwVar9 = (tqw) this.d;
                d9n d9nVar22 = d9n.a;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    tv80 tv80VarD = cvl1.d(tqwVar9);
                    if (lha1.a[eha1Var.ordinal()] != 1) {
                        eg.o();
                        return null;
                    }
                    uk71 uk71Var = (uk71) et90Var.d;
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (uk71Var.invoke(tv80VarD, this) == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                rih1 rih1Var5 = rih1.a;
                luf1 luf1Var = (luf1) this.c;
                juf1 juf1Var = (juf1) this.d;
                d9n d9nVar23 = d9n.a;
                boolean z31 = this.b;
                if (!z31) {
                    hm5.M(obj);
                    if (suf1.a[juf1Var.ordinal()] != 1) {
                        eg.o();
                        return null;
                    }
                    wuf1 wuf1Var = (wuf1) ((ynb0) ((nl9) this.e).f).get();
                    if (!u890.j(luf1Var.b, cvf1.a)) {
                        eg.o();
                        return null;
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    Object objY2 = fn31.Y(wuf1Var.c, new vbc1(wuf1Var, (lnm) null, (byte) 9), this);
                    if (objY2 != d9nVar23) {
                        objY2 = rih1Var5;
                    }
                    if (objY2 == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z31) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3() {
        super(5, (lnm) null);
        this.a = (byte) 20;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(avl1 avl1Var, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = avl1Var;
    }
}

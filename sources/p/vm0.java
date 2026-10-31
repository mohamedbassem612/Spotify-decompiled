package p;

import android.content.Context;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vm0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                vm0 vm0Var = new vm0((int) b2, (lnm) obj3, (byte) 0);
                vm0Var.c = (l62) obj;
                vm0Var.b = zBooleanValue;
                return vm0Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var2 = new vm0((int) b2, (lnm) obj3, (byte) 1);
                vm0Var2.c = (wq0) obj;
                vm0Var2.b = zBooleanValue2;
                return vm0Var2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                vm0 vm0Var3 = new vm0((int) b2, (lnm) obj3, (byte) 2);
                vm0Var3.b = zBooleanValue3;
                vm0Var3.c = (yv21) obj2;
                return vm0Var3.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var4 = new vm0(b2, (lnm) obj3, b2);
                vm0Var4.c = (ioj0) obj;
                vm0Var4.b = zBooleanValue4;
                return vm0Var4.invokeSuspend(rih1Var);
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                vm0 vm0Var5 = new vm0((int) b2, (lnm) obj3, (byte) 4);
                vm0Var5.b = zBooleanValue5;
                vm0Var5.c = (z7d) obj2;
                return vm0Var5.invokeSuspend(rih1Var);
            case 5:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var6 = new vm0((int) b2, (lnm) obj3, (byte) 5);
                vm0Var6.c = (j7d) obj;
                vm0Var6.b = zBooleanValue6;
                return vm0Var6.invokeSuspend(rih1Var);
            case 6:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var7 = new vm0((int) b2, (lnm) obj3, (byte) 6);
                vm0Var7.c = (tu90) obj;
                vm0Var7.b = zBooleanValue7;
                return vm0Var7.invokeSuspend(rih1Var);
            case 7:
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var8 = new vm0((int) b2, (lnm) obj3, (byte) 7);
                vm0Var8.c = (vir0) obj;
                vm0Var8.b = zBooleanValue8;
                return vm0Var8.invokeSuspend(rih1Var);
            case 8:
                boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                vm0 vm0Var9 = new vm0((int) b2, (lnm) obj3, (byte) 8);
                vm0Var9.b = zBooleanValue9;
                vm0Var9.c = (ial) obj2;
                return vm0Var9.invokeSuspend(rih1Var);
            case 9:
                boolean zBooleanValue10 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var10 = new vm0((int) b2, (lnm) obj3, (byte) 9);
                vm0Var10.c = (th61) obj;
                vm0Var10.b = zBooleanValue10;
                return vm0Var10.invokeSuspend(rih1Var);
            case 10:
                boolean zBooleanValue11 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var11 = new vm0((int) b2, (lnm) obj3, (byte) 10);
                vm0Var11.c = (g0o) obj;
                vm0Var11.b = zBooleanValue11;
                return vm0Var11.invokeSuspend(rih1Var);
            case 11:
                boolean zBooleanValue12 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var12 = new vm0((int) b2, (lnm) obj3, (byte) 11);
                vm0Var12.c = (e4o) obj;
                vm0Var12.b = zBooleanValue12;
                return vm0Var12.invokeSuspend(rih1Var);
            case 12:
                return new vm0(this.c, (lnm) obj3, (byte) 12).invokeSuspend(rih1Var);
            case 13:
                return new vm0(this.c, (lnm) obj3, (byte) 13).invokeSuspend(rih1Var);
            case 14:
                boolean zBooleanValue13 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var13 = new vm0((int) b2, (lnm) obj3, (byte) 14);
                vm0Var13.c = (j430) obj;
                vm0Var13.b = zBooleanValue13;
                return vm0Var13.invokeSuspend(rih1Var);
            case 15:
                boolean zBooleanValue14 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var14 = new vm0((int) b2, (lnm) obj3, (byte) 15);
                vm0Var14.c = (ea6) obj;
                vm0Var14.b = zBooleanValue14;
                return vm0Var14.invokeSuspend(rih1Var);
            case 16:
                return new vm0(this.c, (lnm) obj3, (byte) 16).invokeSuspend(rih1Var);
            case 17:
                return new vm0(this.c, (lnm) obj3, (byte) 17).invokeSuspend(rih1Var);
            case 18:
                return new vm0(this.c, (lnm) obj3, (byte) 18).invokeSuspend(rih1Var);
            case 19:
                return new vm0(this.c, (lnm) obj3, (byte) 19).invokeSuspend(rih1Var);
            case 20:
                boolean zBooleanValue15 = ((Boolean) obj).booleanValue();
                vm0 vm0Var15 = new vm0((int) b2, (lnm) obj3, (byte) 20);
                vm0Var15.b = zBooleanValue15;
                vm0Var15.c = (Set) obj2;
                return vm0Var15.invokeSuspend(rih1Var);
            case 21:
                boolean zBooleanValue16 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var16 = new vm0((int) b2, (lnm) obj3, (byte) 21);
                vm0Var16.c = (zec0) obj;
                vm0Var16.b = zBooleanValue16;
                return vm0Var16.invokeSuspend(rih1Var);
            case 22:
                return new vm0(this.c, (lnm) obj3, (byte) 22).invokeSuspend(rih1Var);
            case 23:
                boolean zBooleanValue17 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var17 = new vm0((int) b2, (lnm) obj3, (byte) 23);
                vm0Var17.c = (e090) obj;
                vm0Var17.b = zBooleanValue17;
                return vm0Var17.invokeSuspend(rih1Var);
            case 24:
                boolean zBooleanValue18 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var18 = new vm0((int) b2, (lnm) obj3, (byte) 24);
                vm0Var18.c = (v6y0) obj;
                vm0Var18.b = zBooleanValue18;
                return vm0Var18.invokeSuspend(rih1Var);
            case 25:
                return new vm0(this.c, (lnm) obj3, (byte) 25).invokeSuspend(rih1Var);
            case 26:
                boolean zBooleanValue19 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var19 = new vm0((int) b2, (lnm) obj3, (byte) 26);
                vm0Var19.c = (hwt) obj;
                vm0Var19.b = zBooleanValue19;
                return vm0Var19.invokeSuspend(rih1Var);
            case 27:
                boolean zBooleanValue20 = ((Boolean) obj2).booleanValue();
                vm0 vm0Var20 = new vm0((int) b2, (lnm) obj3, (byte) 27);
                vm0Var20.c = (Long) obj;
                vm0Var20.b = zBooleanValue20;
                return vm0Var20.invokeSuspend(rih1Var);
            case 28:
                return new vm0(this.c, (lnm) obj3, (byte) 28).invokeSuspend(rih1Var);
            default:
                return new vm0(this.c, (lnm) obj3, (byte) 29).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0347  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        switch (b) {
            case 0:
                l62 l62Var = (l62) this.c;
                boolean z3 = this.b;
                hm5.M(obj);
                return new mmr0(l62Var, Boolean.valueOf(z3));
            case 1:
                wq0 wq0Var = (wq0) this.c;
                boolean z4 = this.b;
                hm5.M(obj);
                return new zq0(wq0Var.a, wq0Var.b, z4, wq0Var.c, wq0Var.d, wq0Var.e);
            case 2:
                boolean z5 = this.b;
                yv21 yv21Var = (yv21) this.c;
                hm5.M(obj);
                return new mmr0(Boolean.valueOf(z5), yv21Var);
            case 3:
                ioj0 ioj0Var = (ioj0) this.c;
                boolean z6 = this.b;
                hm5.M(obj);
                return new ia10(ioj0Var, z6);
            case 4:
                boolean z7 = this.b;
                x7d x7dVar = (z7d) this.c;
                hm5.M(obj);
                if (x7dVar instanceof x7d) {
                    ArrayList arrayList = x7dVar.a;
                    if (arrayList.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                zks0 zks0Var = ((goe) it.next()).c;
                                if (zks0Var.a() || zks0Var.g() || zks0Var.h()) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        }
                    }
                } else {
                    z = false;
                }
                if (z7 && z) {
                    z2 = true;
                }
                return new j9f(z2);
            case 5:
                j7d j7dVar = (j7d) this.c;
                boolean z8 = this.b;
                hm5.M(obj);
                return new gkf(j7dVar, z8);
            case 6:
                tu90 tu90Var = (tu90) this.c;
                boolean z9 = this.b;
                hm5.M(obj);
                return new mmr0(tu90Var, Boolean.valueOf(z9));
            case 7:
                vir0 vir0Var = (vir0) this.c;
                boolean z10 = this.b;
                hm5.M(obj);
                return z10 ? vir0Var : new tir0(2);
            case 8:
                boolean z11 = this.b;
                ial ialVar = (ial) this.c;
                hm5.M(obj);
                return new ts81(z11, ialVar.a);
            case 9:
                th61 th61Var = (th61) this.c;
                boolean z12 = this.b;
                hm5.M(obj);
                if (z12) {
                    return !th61Var.b ? nbl.b : nbl.c;
                }
                return nbl.a;
            case 10:
                g0o g0oVar = (g0o) this.c;
                boolean z13 = this.b;
                hm5.M(obj);
                return new b0o(g0oVar, z13);
            case 11:
                e4o e4oVar = (e4o) this.c;
                boolean z14 = this.b;
                hm5.M(obj);
                return new e4o(e4oVar.a, e4oVar.b, e4oVar.c, e4oVar.d, e4oVar.e, z14);
            case 12:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    a680 a680Var = (a680) ((p2o0) this.c).d;
                    this.b = true;
                    return a680Var.h(true, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z15) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    eqa0 eqa0Var = ((k6y) this.c).e;
                    this.b = true;
                    return eqa0Var.a(msg.b, 7, s6y.b, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z16) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                j430 j430Var = (j430) this.c;
                boolean z17 = this.b;
                hm5.M(obj);
                return new u910(new s630(j430Var.a.a), j430Var.c, z17, j430Var.b);
            case 15:
                ea6 ea6Var = (ea6) this.c;
                boolean z18 = this.b;
                hm5.M(obj);
                if (z18 && ea6Var.a == rxx0.a && ea6Var.b != l2r0.c && ea6Var.m) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 16:
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gw9 gw9Var = (gw9) ((g2z) this.c).c;
                this.b = true;
                gw9Var.a(false, this);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case 17:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    y160 y160Var = new y160((pzw) this.c, (lnm) null, (byte) 16);
                    this.b = true;
                    return smo1.s(y160Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z20) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                haa0 haa0Var = (haa0) this.c;
                v4o0 v4o0Var = (v4o0) haa0Var.c;
                Context context = (Context) haa0Var.b;
                n4o0 n4o0Var = new n4o0(new n0o0(context.getString(2131952974), p7h.M(new String[]{context.getString(2131952972), context.getString(2131952971), context.getString(2131952973)}), context.getString(2131952970)), o0o0.a, m0o0.a);
                this.b = true;
                return v4o0Var.b(n4o0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 19:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    y160 y160Var2 = new y160((dea0) this.c, (lnm) null, (byte) 17);
                    this.b = true;
                    return smo1.s(y160Var2, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z22) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z23 = this.b;
                Set set = (Set) this.c;
                hm5.M(obj);
                return new gz51(set, z23);
            case 21:
                zec0 zec0Var = (zec0) this.c;
                boolean z24 = this.b;
                hm5.M(obj);
                return new bfc0(zec0Var, z24);
            case 22:
                p1f0 p1f0Var = (p1f0) this.c;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (((AtomicInteger) p1f0Var.h).decrementAndGet() != 0) {
                    return d9nVar;
                }
                wo70 wo70Var = (oo70) p1f0Var.d;
                uzm0 uzm0Var = uzm0.a;
                this.b = true;
                return wo70Var.h(uzm0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 23:
                e090 e090Var = (e090) this.c;
                boolean z26 = this.b;
                hm5.M(obj);
                return new mmr0(e090Var, Boolean.valueOf(z26));
            case 24:
                v6y0 v6y0Var = (v6y0) this.c;
                boolean z27 = this.b;
                hm5.M(obj);
                return new jot0(v6y0Var, z27);
            case 25:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    zuw0 zuw0Var = ((c8u0) this.c).c;
                    this.b = true;
                    return zuw0Var.d(false, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z28) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                hwt hwtVar = (hwt) this.c;
                boolean z29 = this.b;
                hm5.M(obj);
                return new mmr0(hwtVar, Boolean.valueOf(z29));
            case 27:
                Long l = (Long) this.c;
                boolean z30 = this.b;
                hm5.M(obj);
                if (z30) {
                    return new Integer((int) l.longValue());
                }
                return null;
            case 28:
                boolean z31 = this.b;
                if (!z31) {
                    hm5.M(obj);
                    Single map = ((vpp0) ((k811) this.c).b).callSingle("spotify.offline_esperanto.proto.Offline", "RemoveAllDownloads", Empty.n()).map(va20.S0);
                    this.b = true;
                    return fc11.j(map, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z31) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z32 = this.b;
                if (!z32) {
                    hm5.M(obj);
                    zuw0 zuw0Var2 = (zuw0) ((e821) this.c).c;
                    this.b = true;
                    return zuw0Var2.e(false, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z32) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}

package p;

import android.graphics.Bitmap;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class df6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df6(jti0 jti0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, drr0 drr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 14;
        this.b = jti0Var;
        this.f = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
        this.e = ven0Var4;
        this.g = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                return new df6(this.b, obj5, obj4, obj3, obj6, obj2, lnmVar, (byte) 0);
            case 1:
                df6 df6Var = new df6((byte) 1, obj5, obj4, obj3, obj6, obj2, lnmVar);
                df6Var.b = obj;
                return df6Var;
            case 2:
                return new df6(this.b, obj5, obj4, obj3, obj6, obj2, lnmVar, (byte) 2);
            case 3:
                return new df6(this.b, obj5, obj4, obj3, obj6, obj2, lnmVar, (byte) 3);
            case 4:
                return new df6(this.b, obj5, (ven0) obj6, obj4, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                df6 df6Var2 = new df6((byte) 5, obj5, obj4, obj3, obj6, obj2, lnmVar);
                df6Var2.b = obj;
                return df6Var2;
            case 6:
                return new df6(this.b, obj5, obj4, obj3, obj6, obj2, lnmVar, (byte) 6);
            case 7:
                df6 df6Var3 = new df6((byte) 7, obj5, obj4, obj3, obj6, obj2, lnmVar);
                df6Var3.b = obj;
                return df6Var3;
            case 8:
                return new df6(this.b, obj5, (ven0) obj6, obj4, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                return new df6(this.b, obj5, obj4, obj3, obj6, obj2, lnmVar, (byte) 9);
            case 10:
                return new df6(this.b, obj5, (ven0) obj6, obj4, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 10);
            case 11:
                df6 df6Var4 = new df6((Set) obj4, (dw91) obj5, (gw70) obj3, (dw91) obj6, (iu30) obj2, lnmVar);
                df6Var4.b = obj;
                return df6Var4;
            case 12:
                df6 df6Var5 = new df6((o0i) obj5, (h680) obj4, (pe) obj3, (idg1) obj2, (ven0) obj6, lnmVar);
                df6Var5.b = obj;
                return df6Var5;
            case 13:
                return new df6((oxj1) this.b, (Function0) obj5, (rk41) obj4, (ven0) obj6, (ven0) obj3, (frr0) obj2, lnmVar);
            default:
                return new df6((jti0) this.b, (ven0) obj6, (ven0) obj5, (ven0) obj4, (ven0) obj3, (drr0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 5:
                create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 7:
                create((ebr) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0410  */
    public final Object invokeSuspend(Object obj) {
        boolean zIsPowerSaveMode;
        m231 m231Var;
        o091 o091Var;
        c5h c5hVar;
        float f;
        int i = 3;
        boolean z = true;
        switch (this.a) {
            case 0:
                tf6 tf6Var = tf6.a;
                tf6 tf6Var2 = tf6.b;
                dw91 dw91Var = (dw91) this.c;
                lf6 lf6Var = (lf6) this.d;
                ue6 ue6Var = (ue6) lf6Var.f;
                hm5.M(obj);
                kes kesVar = (kes) this.b;
                int iO = kesVar.o();
                err0 err0Var = (hdn0) this.e;
                if (iO != err0Var.s()) {
                    int iS = err0Var.s();
                    Object obj2 = dw91Var.get(new Integer(iS));
                    Boolean bool = Boolean.TRUE;
                    m5d0 m5d0VarY = wgo1.y((se6) ue6Var.b.get(iS), iS, u890.j(obj2, bool) ? tf6Var2 : tf6Var);
                    err0Var.t(kesVar.o());
                    if (u890.j(dw91Var.get(new Integer(kesVar.o())), bool)) {
                        tf6Var = tf6Var2;
                    }
                    ((ven0) this.f).setValue(wgo1.y((se6) ue6Var.b.get(kesVar.o()), kesVar.o(), tf6Var));
                    if (m5d0VarY != null) {
                        xf6 xf6Var = (xf6) lf6Var.g;
                        String str = (String) lf6Var.h;
                        uf6 uf6Var = m5d0VarY.a;
                        int i2 = m5d0VarY.b;
                        String str2 = m5d0VarY.c;
                        tf6 tf6Var3 = m5d0VarY.d;
                        zIsPowerSaveMode = kesVar.o() > iS;
                        b7x b7xVar = b7x.a;
                        y3m0 y3m0VarB = xf6Var.b(str, uf6Var, i2, str2, tf6Var3);
                        y6h1 y6h1Var = y3m0VarB.b;
                        r6h1 r6h1Var = y3m0VarB.c.b;
                        xf6Var.c.m(zIsPowerSaveMode ? new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis()) : new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis()), (xj61) null);
                    }
                    int i3 = ue6Var.d;
                    if (i3 != 0) {
                        ((qam1) this.g).a(i3);
                    }
                }
                return rih1.a;
            case 1:
                m231 m231Var2 = rih1.a;
                hm5.M(obj);
                xcu0 xcu0Var = (xcu0) this.c;
                mna mnaVar = (mna) this.d;
                BatteryManager batteryManager = mnaVar.u1;
                Integer numValueOf = batteryManager != null ? Integer.valueOf(batteryManager.getIntProperty(4)) : null;
                if (numValueOf != null && numValueOf.intValue() == Integer.MIN_VALUE) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
                PowerManager powerManager = mnaVar.v1;
                zIsPowerSaveMode = powerManager != null ? powerManager.isPowerSaveMode() : false;
                String str3 = xcu0Var.a;
                long j = xcu0Var.b;
                boolean z2 = xcu0Var.c;
                long j2 = xcu0Var.d;
                String str4 = xcu0Var.e;
                float f2 = xcu0Var.f;
                float f3 = xcu0Var.g;
                String str5 = (4095 & 128) != 0 ? xcu0Var.h : null;
                String str6 = xcu0Var.i;
                int i4 = xcu0Var.j;
                boolean z3 = xcu0Var.k;
                String str7 = xcu0Var.l;
                int i5 = (4095 & 4096) != 0 ? xcu0Var.m : iIntValue;
                if ((4095 & 8192) != 0) {
                    zIsPowerSaveMode = xcu0Var.n;
                }
                ufp0 ufp0Var = (ufp0) ((xu30) this.e).invoke((i3i0) this.f, new xcu0(str3, j, z2, j2, str4, f2, f3, str5, str6, i4, z3, str7, i5, zIsPowerSaveMode), (n900) this.g);
                try {
                    mnaVar.q1.a(ufp0Var);
                    m231Var = m231Var2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.d(l1d.m("Failed to send ", rc11.a.b(ufp0Var.getClass()).r()), new Object[]{thA});
                }
                return m231Var2;
            case 2:
                rih1 rih1Var = rih1.a;
                hm5.M(obj);
                myw mywVar = (mgo1) this.b;
                myw mywVar2 = mywVar instanceof myw ? mywVar : null;
                md80 md80Var = (md80) ((ven0) this.f).getValue();
                if (md80Var == null) {
                    md80Var = (md80) ((ven0) this.g).getValue();
                }
                if (mywVar2 != null && md80Var != null && md80Var != md80.c && ((fjt) this.c) == fjt.a) {
                    iu30 iu30Var = (iu30) this.d;
                    at80 at80Var = (at80) this.e;
                    int iC = l1d.C(mywVar2.c);
                    if (iC != 0) {
                        if (iC != 1) {
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                            i = 5;
                        }
                        iu30Var.invoke(new ng80(i, md80Var, at80Var));
                    }
                }
                return rih1Var;
            case 3:
                hm5.M(obj);
                Set setKeySet = ((Map) ((tob1) this.c).getValue()).keySet();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                iu30 iu30Var2 = (iu30) this.d;
                c380 c380Var = (c380) this.e;
                Integer num = (Integer) this.f;
                tyq tyqVar = (tyq) this.g;
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Number) it.next()).intValue();
                    linkedHashSet.add(tyqVar.getData().a(iu30Var2.invoke(new pyg(c380Var.get(iIntValue2), num != null && num.intValue() == iIntValue2, cu9.X0, null, false))));
                }
                ((rhg0) this.b).a(linkedHashSet, (ArrayList) null, (ArrayList) null);
                return rih1.a;
            case 4:
                hm5.M(obj);
                if (((v3d) this.b) != null && ((Bitmap) ((ven0) this.f).getValue()) == null && ((gmw0) ((ven0) this.d).getValue()) != null) {
                    ven0 ven0Var = (ven0) this.f;
                    gmw0 gmw0Var = (gmw0) ((ven0) this.d).getValue();
                    ven0Var.setValue(gmw0Var != null ? gmw0Var.getBitmap() : null);
                    ((ven0) this.e).setValue((v3d) this.b);
                    ((ven0) this.g).setValue(((a4d) this.c).c.a.b);
                }
                return rih1.a;
            case 5:
                l811 l811Var = (l811) this.d;
                l811 l811Var2 = (l811) this.c;
                i1r i1rVar = (k1r) this.b;
                hm5.M(obj);
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                q9f q9fVar = i1rVar2 != null ? (q9f) i1rVar2.a : null;
                l811Var2.a = xsf.b(q9fVar);
                me30 me30Var = ((g5h) this.e).e;
                o091Var = q9fVar != null ? q9fVar.f : null;
                o3r o3rVar = l5h.a;
                int iOrdinal = me30Var.a(o091Var).ordinal();
                if (iOrdinal != 30 && iOrdinal != 31) {
                    z = false;
                }
                l811Var.a = z;
                h141 h141Var = (h141) this.f;
                e5h e5hVar = (e5h) h141Var.getState();
                p811 p811Var = (p811) this.g;
                c5h c5hVar2 = c5h.a;
                boolean z4 = l811Var2.a;
                if (z4) {
                    c5hVar = c5hVar2;
                } else {
                    Object obj3 = p811Var.a;
                    c5h c5hVar3 = c5h.b;
                    if (obj3 == c5hVar3 || l811Var.a) {
                        c5hVar = c5hVar3;
                    } else {
                        c5hVar = c5hVar2;
                    }
                }
                h141Var.e(e5h.a(e5hVar, false, null, false, null, c5hVar, z4, 8191));
                return rih1.a;
            case 6:
                Float f4 = (Float) this.d;
                yr80 yr80Var = (yr80) this.c;
                hm5.M(obj);
                y9e1 y9e1Var = (y9e1) this.b;
                if (y9e1Var != null) {
                    zrm0 zrm0Var = y9e1Var.b;
                    if (yr80Var != null && f4 != null && zrm0Var.f == 2 && zrm0Var.i(1)) {
                        int iC2 = zrm0Var.c(1, true) + 1;
                        do {
                            iC2--;
                            f = y9e1Var.c(iC2 < 0 ? 0 : iC2).a;
                            if (iC2 > 0) {
                            }
                            ((ven0) this.f).setValue(new qr80((((long) jch0.U(f)) << 32) | (((long) jch0.U(y9e1Var.f(1) - jch0.U(f4.floatValue()))) & 4294967295L)));
                            ((ven0) this.g).setValue(((fih) this.e).b.substring(0, iC2));
                        } while (f > ((int) (y9e1Var.c >> 32)) - ((int) (yr80Var.a >> 32)));
                        ((ven0) this.f).setValue(new qr80((((long) jch0.U(f)) << 32) | (((long) jch0.U(y9e1Var.f(1) - jch0.U(f4.floatValue()))) & 4294967295L)));
                        ((ven0) this.g).setValue(((fih) this.e).b.substring(0, iC2));
                    }
                }
                return rih1.a;
            case 7:
                ebr ebrVar = (ebr) this.b;
                hm5.M(obj);
                boolean zBooleanValue = ((Boolean) ((iu30) this.c).invoke(ebrVar.a())).booleanValue();
                l811 l811Var3 = (l811) this.d;
                if (!l811Var3.a && zBooleanValue) {
                    l811Var3.a = true;
                    ((Function0) this.e).invoke();
                }
                l811 l811Var4 = (l811) this.f;
                if (!l811Var4.a && (!(ebrVar instanceof dbr) || zBooleanValue)) {
                    l811Var4.a = true;
                    ((Function0) this.g).invoke();
                }
                return rih1.a;
            case 8:
                ven0 ven0Var2 = (ven0) this.d;
                hm5.M(obj);
                j8z j8zVar = (j8z) ((ven0) this.f).getValue();
                o091Var = j8zVar != null ? j8zVar.a.h : null;
                if (u890.j(o091Var, l091.a)) {
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        ((ven0) this.e).setValue(((jr30) this.b).a(((rcz) this.c).a));
                        ((ven0) this.g).setValue(Boolean.TRUE);
                        ven0Var2.setValue(Boolean.FALSE);
                    }
                } else if (o091Var != null) {
                    ven0Var2.setValue(Boolean.TRUE);
                }
                return rih1.a;
            case 9:
                Set set = (Set) this.f;
                kbf0 kbf0Var = (kbf0) this.c;
                rih1 rih1Var2 = rih1.a;
                hm5.M(obj);
                fcf0 fcf0VarC = ((ncf0) this.b).c();
                if (fcf0VarC != null) {
                    if (((Number) kbf0Var.getValue()).floatValue() >= 0.99f) {
                        ((Function0) this.d).invoke();
                    } else {
                        List list = (List) this.e;
                        ArrayList<String> arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (!set.contains((String) obj4)) {
                                arrayList.add(obj4);
                            }
                        }
                        iu30 iu30Var3 = (iu30) this.g;
                        for (String str8 : arrayList) {
                            ntg0 ntg0VarD = fcf0VarC.d(str8);
                            if (ntg0VarD != null) {
                                if (((Number) kbf0Var.getValue()).floatValue() >= ntg0VarD.b / fcf0VarC.m) {
                                    set.add(str8);
                                    iu30Var3.invoke(str8);
                                }
                            }
                        }
                    }
                }
                return rih1Var2;
            case 10:
                hm5.M(obj);
                olo0 olo0Var = (olo0) this.b;
                if (olo0Var.f) {
                    ((Function0) ((ven0) this.f).getValue()).invoke();
                    fn31.T((c9n) this.c, (o8n) null, 0, new g((vy71) this.d, (lnm) null, (byte) 19), 3);
                }
                ven0 ven0Var3 = (ven0) this.e;
                mlo0 mlo0Var = olo0Var.d;
                ven0Var3.setValue(Boolean.valueOf(mlo0Var != null ? mlo0Var.d : false));
                ven0 ven0Var4 = (ven0) this.g;
                llo0 llo0Var = olo0Var.e;
                ven0Var4.setValue(Boolean.valueOf(llo0Var != null ? llo0Var.d : false));
                return rih1.a;
            case 11:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                Set set2 = (Set) this.d;
                dw91 dw91Var2 = (dw91) this.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : set2) {
                    if (!dw91Var2.containsKey((String) obj5)) {
                        arrayList2.add(obj5);
                    }
                }
                gw70 gw70Var = (gw70) this.e;
                dw91 dw91Var3 = (dw91) this.c;
                dw91 dw91Var4 = (dw91) this.f;
                iu30 iu30Var4 = (iu30) this.g;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    fn31.T(c9nVar, (o8n) null, 0, new lu91(gw70Var, (String) it2.next(), dw91Var3, dw91Var4, iu30Var4, null), 3);
                }
                return rih1.a;
            case 12:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                fn31.T(c9nVar2, (o8n) null, 0, new jdg1((o0i) this.c, (h680) this.d, (pe) this.e, (idg1) this.g, (ven0) this.f, null, (byte) 0), 3);
                return rih1.a;
            case 13:
                kxj1 kxj1Var = hxj1.a;
                ejj1 ejj1Var = ((oxj1) this.b).a;
                rk41 rk41Var = (rk41) this.d;
                Object obj6 = rk41Var.c;
                hm5.M(obj);
                ven0 ven0Var5 = (ven0) this.f;
                cjj1 cjj1Var = (cjj1) ven0Var5.getValue();
                if (!u890.j(cjj1Var, zij1.a)) {
                    if (u890.j(cjj1Var, ajj1.a)) {
                        ven0 ven0Var6 = (ven0) this.e;
                        if (!rk41Var.a && !((Boolean) ven0Var6.getValue()).booleanValue()) {
                            ejj1Var.f();
                        }
                        ycl1 ycl1Var = (ycl1) obj6;
                        if (!((Boolean) ven0Var6.getValue()).booleanValue()) {
                            kxj1Var = ixj1.a;
                        }
                        ycl1Var.b(kxj1Var);
                    } else if (cjj1Var instanceof wij1) {
                        ejj1Var.d().f();
                        ((ycl1) obj6).b(kxj1Var);
                        ((frr0) this.g).t(((wij1) ((cjj1) ven0Var5.getValue())).a);
                    } else if (cjj1Var instanceof bjj1) {
                        ejj1Var.d().f();
                        ((ycl1) obj6).b(kxj1Var);
                    } else if (!u890.j(cjj1Var, xij1.a)) {
                        if (!(cjj1Var instanceof yij1)) {
                            eg.o();
                            return null;
                        }
                        ((ycl1) obj6).b(gxj1.a);
                    } else if (!ejj1Var.d) {
                        ((Function0) this.c).invoke();
                    }
                }
                return rih1.a;
            default:
                ven0 ven0Var7 = (ven0) this.d;
                ven0 ven0Var8 = (ven0) this.c;
                ven0 ven0Var9 = (ven0) this.f;
                hm5.M(obj);
                Integer num2 = (Integer) ((jti0) this.b).g;
                if (num2 != null) {
                    faa0 faa0Var = (faa0) ven0Var9.getValue();
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    ven0Var9.setValue((Object) null);
                    faa0 faa0Var2 = (faa0) ven0Var8.getValue();
                    if (faa0Var2 != null) {
                        faa0Var2.d((CancellationException) null);
                    }
                    ven0Var8.setValue((Object) null);
                    faa0 faa0Var3 = (faa0) ven0Var7.getValue();
                    if (faa0Var3 != null) {
                        faa0Var3.d((CancellationException) null);
                    }
                    ven0Var7.setValue((Object) null);
                    ((ven0) this.e).setValue(Boolean.FALSE);
                    ((drr0) this.g).t(num2.intValue());
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df6(Object obj, Object obj2, ven0 ven0Var, Object obj3, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.f = ven0Var;
        this.d = obj3;
        this.e = ven0Var2;
        this.g = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df6(Set set, dw91 dw91Var, gw70 gw70Var, dw91 dw91Var2, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.d = set;
        this.c = dw91Var;
        this.e = gw70Var;
        this.f = dw91Var2;
        this.g = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df6(o0i o0iVar, h680 h680Var, pe peVar, idg1 idg1Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.c = o0iVar;
        this.d = h680Var;
        this.e = peVar;
        this.g = idg1Var;
        this.f = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df6(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df6(oxj1 oxj1Var, Function0 function0, rk41 rk41Var, ven0 ven0Var, ven0 ven0Var2, frr0 frr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.b = oxj1Var;
        this.c = function0;
        this.d = rk41Var;
        this.f = ven0Var;
        this.e = ven0Var2;
        this.g = frr0Var;
    }
}

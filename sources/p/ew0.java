package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.contextmenu.platform.ContextMenuContentLoadException;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import spotify.your_library_tags_esperanto.proto.DecoratedClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ew0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ew0 ew0Var = new ew0((fw0) obj4, (lnm) obj3, (byte) 0);
                ew0Var.c = (Intent) obj;
                return ew0Var.invokeSuspend(rih1Var);
            case 1:
                return new ew0((q24) this.c, (swn) obj4, (lnm) obj3, (byte) 1).invokeSuspend(rih1Var);
            case 2:
                return new ew0((q24) this.c, (swn) obj4, (lnm) obj3, (byte) 2).invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ew0 ew0Var2 = new ew0((vw5) obj4, (lnm) obj3, (byte) 3);
                ew0Var2.c = (j7p0) obj;
                ew0Var2.b = zBooleanValue;
                return ew0Var2.invokeSuspend(rih1Var);
            case 4:
                ew0 ew0Var3 = new ew0((i7e0) obj4, (lnm) obj3, (byte) 4);
                ew0Var3.c = (vr20) obj;
                return ew0Var3.invokeSuspend(rih1Var);
            case 5:
                return new ew0((ix7) this.c, (ev8) obj4, (lnm) obj3, (byte) 5).invokeSuspend(rih1Var);
            case 6:
                ew0 ew0Var4 = new ew0((ix7) obj4, (lnm) obj3, (byte) 6);
                ew0Var4.c = (th61) obj2;
                return ew0Var4.invokeSuspend(rih1Var);
            case 7:
                ew0 ew0Var5 = new ew0((z2h) obj4, (lnm) obj3, (byte) 7);
                ew0Var5.c = (lqa) obj2;
                return ew0Var5.invokeSuspend(rih1Var);
            case 8:
                ew0 ew0Var6 = new ew0((s6d) obj4, (lnm) obj3, (byte) 8);
                ew0Var6.c = (Intent) obj;
                return ew0Var6.invokeSuspend(rih1Var);
            case 9:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ew0 ew0Var7 = new ew0((k7d) obj4, (lnm) obj3, (byte) 9);
                ew0Var7.b = zBooleanValue2;
                ew0Var7.c = (Integer) obj2;
                return ew0Var7.invokeSuspend(rih1Var);
            case 10:
                ew0 ew0Var8 = new ew0((owh) obj4, (lnm) obj3, (byte) 10);
                ew0Var8.c = (iwh) obj;
                return ew0Var8.invokeSuspend(rih1Var);
            case 11:
                ew0 ew0Var9 = new ew0((sw9) obj4, (lnm) obj3, (byte) 11);
                ew0Var9.c = (vr20) obj;
                return ew0Var9.invokeSuspend(rih1Var);
            case 12:
                ew0 ew0Var10 = new ew0((stk) obj4, (lnm) obj3, (byte) 12);
                ew0Var10.c = (vr20) obj;
                return ew0Var10.invokeSuspend(rih1Var);
            case 13:
                ew0 ew0Var11 = new ew0((kwl) obj4, (lnm) obj3, (byte) 13);
                ew0Var11.c = (owl) obj;
                return ew0Var11.invokeSuspend(rih1Var);
            case 14:
                ew0 ew0Var12 = new ew0((d520) obj4, (lnm) obj3, (byte) 14);
                ew0Var12.c = (Throwable) obj2;
                return ew0Var12.invokeSuspend(rih1Var);
            case 15:
                ew0 ew0Var13 = new ew0((rfm) obj4, (lnm) obj3, (byte) 15);
                ew0Var13.c = (Throwable) obj2;
                return ew0Var13.invokeSuspend(rih1Var);
            case 16:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ew0 ew0Var14 = new ew0((k9r) obj4, (lnm) obj3, (byte) 16);
                ew0Var14.b = zBooleanValue3;
                ew0Var14.c = (l0l) obj2;
                return ew0Var14.invokeSuspend(rih1Var);
            case 17:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                ew0 ew0Var15 = new ew0((s2s) obj4, (lnm) obj3, (byte) 17);
                ew0Var15.c = (List) obj;
                ew0Var15.b = zBooleanValue4;
                return ew0Var15.invokeSuspend(rih1Var);
            case 18:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                ew0 ew0Var16 = new ew0((gfr) obj4, (lnm) obj3, (byte) 18);
                ew0Var16.c = (jxm1) obj;
                ew0Var16.b = zBooleanValue5;
                return ew0Var16.invokeSuspend(rih1Var);
            case 19:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                ew0 ew0Var17 = new ew0((y4s) obj4, (lnm) obj3, (byte) 19);
                ew0Var17.c = (c5a1) obj;
                ew0Var17.b = zBooleanValue6;
                return ew0Var17.invokeSuspend(rih1Var);
            case 20:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                ew0 ew0Var18 = new ew0((mwu) obj4, (lnm) obj3, (byte) 20);
                ew0Var18.c = (cxc0) obj;
                ew0Var18.b = zBooleanValue7;
                return ew0Var18.invokeSuspend(rih1Var);
            case 21:
                ew0 ew0Var19 = new ew0((myq0) obj4, (lnm) obj3, (byte) 21);
                ew0Var19.c = (vr20) obj;
                return ew0Var19.invokeSuspend(rih1Var);
            case 22:
                ew0 ew0Var20 = new ew0((ff20) obj4, (lnm) obj3, (byte) 22);
                ew0Var20.c = (vr20) obj;
                return ew0Var20.invokeSuspend(rih1Var);
            case 23:
                ew0 ew0Var21 = new ew0((o030) obj4, (lnm) obj3, (byte) 23);
                ew0Var21.c = (Intent) obj;
                return ew0Var21.invokeSuspend(rih1Var);
            case 24:
                ew0 ew0Var22 = new ew0((Bundle) obj4, (lnm) obj3, (byte) 24);
                ew0Var22.c = (cy5) obj2;
                return ew0Var22.invokeSuspend(rih1Var);
            case 25:
                ew0 ew0Var23 = new ew0((String) obj4, (lnm) obj3, (byte) 25);
                ew0Var23.c = (cy5) obj2;
                return ew0Var23.invokeSuspend(rih1Var);
            case 26:
                ew0 ew0Var24 = new ew0((uh80) obj4, (lnm) obj3, (byte) 26);
                ew0Var24.c = (vr20) obj;
                return ew0Var24.invokeSuspend(rih1Var);
            case 27:
                ew0 ew0Var25 = new ew0((wf2) obj4, (lnm) obj3, (byte) 27);
                ew0Var25.c = (Intent) obj;
                return ew0Var25.invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ew0 ew0Var26 = new ew0((Set) obj4, (lnm) obj3, (byte) 28);
                ew0Var26.c = (vr20) obj;
                return ew0Var26.invokeSuspend(rih1Var);
            default:
                ew0 ew0Var27 = new ew0((cag0) obj4, (lnm) obj3, (byte) 29);
                ew0Var27.c = (vr20) obj;
                return ew0Var27.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objI;
        Object value;
        Object value2;
        int i;
        bp90 bp90Var;
        byte b = this.a;
        crn0 crn0Var = crn0.a;
        boolean z = false;
        Object obj2 = rih1.a;
        crn0 crn0Var2 = d9n.a;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                Intent intent = (Intent) this.c;
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        Set set = s4b1.f;
                        s4b1 s4b1VarX = uic.x(intent.getDataString());
                        yqu0 yqu0Var = (yqu0) ((fw0) obj3).b;
                        String strH = s4b1VarX.h();
                        this.c = null;
                        this.b = true;
                        Object objY = fn31.Y((q8n) yqu0Var.b, new pew0(yqu0Var, strH, false, (lnm) null, (byte) 4), this);
                        if (objY == crn0Var2) {
                            obj2 = objY;
                        }
                        if (obj2 == crn0Var2) {
                            crn0Var = crn0Var2;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return crn0Var;
                } catch (Exception e) {
                    op71.x(getContext());
                    n57.g("Request failed", e);
                    return crn0Var;
                }
            case 1:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    p24 p24Var = ((q24) this.c).b;
                    this.b = true;
                    return ((swn) obj3).invoke(p24Var, this) == crn0Var2 ? crn0Var2 : obj2;
                }
                if (z3) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    p24 p24Var2 = ((q24) this.c).b;
                    this.b = true;
                    return ((swn) obj3).invoke(p24Var2, this) == crn0Var2 ? crn0Var2 : obj2;
                }
                if (z4) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                j7p0 j7p0Var = (j7p0) this.c;
                boolean z5 = this.b;
                hm5.M(obj);
                if (j7p0Var instanceof g7p0) {
                    if (z5) {
                        z = true;
                    }
                } else if (!(j7p0Var instanceof f7p0) && !(j7p0Var instanceof h7p0) && !(j7p0Var instanceof i7p0)) {
                    eg.o();
                    return null;
                }
                return Boolean.valueOf(z);
            case 4:
                vr20 vr20Var = (vr20) this.c;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dob1 dob1Var = new dob1((i7e0) obj3);
                this.c = null;
                this.b = true;
                return vr20Var.emit(dob1Var, this) == crn0Var2 ? crn0Var2 : obj2;
            case 5:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    xj8 xj8Var = (xj8) ((ix7) this.c).d;
                    ev8 ev8Var = (ev8) obj3;
                    kr8 kr8Var = new kr8(ev8Var.a, ev8Var.b, ev8Var.c);
                    this.b = true;
                    objA = xj8Var.a(kr8Var, this);
                    if (objA == crn0Var2) {
                        return crn0Var2;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                gv8 gv8Var = hv8.Companion;
                String str = ((nr8) objA).a;
                gv8Var.getClass();
                return new hv8(true, null, str);
            case 6:
                th61 th61Var = (th61) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        objI = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG = yoi1.g(((v5n) ((ix7) obj3).c).b(th61Var.a));
                this.c = null;
                this.b = true;
                objI = b5p1.i(ezcVarG, this);
                if (objI == crn0Var2) {
                    return crn0Var2;
                }
                eww0 eww0Var = (eww0) ((spq0) objI).b();
                String str2 = eww0Var.f;
                if (eww0Var.l && str2 != null) {
                    for (String str3 : eww0Var.e) {
                        if (!u890.j(str3, str2)) {
                        }
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                str3 = str2;
                idi1 idi1Var = jdi1.Companion;
                String str4 = eww0Var.b;
                idi1Var.getClass();
                return new jdi1(str4, str3, true, (String) null, 8);
            case 7:
                lqa lqaVar = (lqa) this.c;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.b = true;
                Object objJ = oap1.J(lqaVar, (z2h) obj3, this);
                return objJ == crn0Var2 ? crn0Var2 : objJ;
            case 8:
                Intent intent2 = (Intent) this.c;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.b = true;
                List list = s6d.e;
                Object objB = ((s6d) obj3).b(intent2, this);
                return objB == crn0Var2 ? crn0Var2 : objB;
            case 9:
                boolean z11 = this.b;
                Integer num = (Integer) this.c;
                hm5.M(obj);
                if (z11) {
                    return j7d.a;
                }
                if (num != null) {
                    return num.intValue() >= ((k7d) obj3).b.a() ? j7d.c : j7d.b;
                }
                return j7d.d;
            case 10:
                iwh iwhVar = (iwh) this.c;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return ((owh) obj3).e(iwhVar, this) == crn0Var2 ? crn0Var2 : obj2;
                }
                if (z12) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                sw9 sw9Var = (sw9) obj3;
                dma1 dma1Var = (dma1) sw9Var.c;
                vr20 vr20Var2 = (vr20) this.c;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bma1 bma1Var = jvo0.a;
                int iL = dma1Var.l(bma1Var, 0) + 1;
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.b(bma1Var, iL);
                hma1VarEdit.h();
                wkk wkkVar = new wkk(dma1Var.l(bma1Var, 0) < sw9Var.b);
                this.c = null;
                this.b = true;
                return vr20Var2.emit(wkkVar, this) == crn0Var2 ? crn0Var2 : obj2;
            case 12:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ztc ztcVarA = ztc.a((ztc) ((stk) obj3).c.getValue(), (mia1) null, z6x.a, 0, 251);
                this.c = null;
                this.b = true;
                return vr20Var3.emit(ztcVarA, this) == crn0Var2 ? crn0Var2 : obj2;
            case 13:
                owl owlVar = (owl) this.c;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kwl kwlVar = (kwl) obj3;
                String str5 = owlVar.a;
                this.c = null;
                this.b = true;
                bpb1 bpb1Var = (bpb1) kwlVar.d.c;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, str5));
                kwlVar.c.f(str5);
                bpb1 bpb1Var2 = (bpb1) kwlVar.e.c;
                do {
                    value2 = bpb1Var2.getValue();
                } while (!bpb1Var2.k(value2, str5));
                Object objN = kwlVar.f.n(str5, this);
                if (objN != crn0Var2) {
                    objN = obj2;
                }
                return objN == crn0Var2 ? crn0Var2 : obj2;
            case 14:
                d520 d520Var = (d520) obj3;
                Throwable th = (Throwable) this.c;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((kdn0) d520Var.g).m(l3r.d);
                j1 j1Var = (j1) d520Var.d;
                this.c = null;
                this.b = true;
                return j1Var.invoke(th, this) == crn0Var2 ? crn0Var2 : obj2;
            case 15:
                Throwable th2 = (Throwable) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rfm rfmVar = (rfm) obj3;
                this.c = null;
                this.b = true;
                if ((th2 instanceof IOException) || (th2 instanceof TimeoutException)) {
                    i = 2131955895;
                } else {
                    i = 2131954373;
                    if (!(th2 instanceof ContextMenuContentLoadException)) {
                        n57.g("Unexpected error loading context menu", th2);
                    }
                }
                q8n q8nVar = rfmVar.f2;
                if (q8nVar == null) {
                    u890.C("mainDispatcher");
                    throw null;
                }
                Object objY2 = fn31.Y(q8nVar, new nx5(rfmVar, i, (lnm) null, (byte) 3), this);
                if (objY2 != crn0Var2) {
                    objY2 = obj2;
                }
                return objY2 == crn0Var2 ? crn0Var2 : obj2;
            case 16:
                boolean z18 = this.b;
                l0l l0lVar = (l0l) this.c;
                hm5.M(obj);
                b0a0 b0a0Var = (b0a0) ((k9r) obj3).d;
                return new s5c(z18, l0lVar, ((no4) b0a0Var.a.get()).d(), ((no4) b0a0Var.a.get()).S());
            case 17:
                ynb0 ynb0Var = ((s2s) obj3).a;
                List list2 = (List) this.c;
                boolean z19 = this.b;
                hm5.M(obj);
                if (z19) {
                    return new gd80(new qb80(ob80.a), (xpw) ynb0Var.get());
                }
                if (list2.isEmpty()) {
                    return new gd80(new qb80(nb80.a), (xpw) ynb0Var.get());
                }
                return null;
            case 18:
                jxm1 jxm1Var = (jxm1) this.c;
                boolean z20 = this.b;
                hm5.M(obj);
                h290 h290Var = jxm1Var.a;
                if (((!h290Var.isEmpty() && ((DecoratedClass) o7h.q0(h290Var)).o().size() >= 2) || h290Var.size() >= 2) && z20) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                c5a1 c5a1Var = (c5a1) this.c;
                boolean z21 = this.b;
                hm5.M(obj);
                b0a0 b0a0Var2 = ((y4s) obj3).a;
                ynb0 ynb0Var2 = b0a0Var2.a;
                ynb0 ynb0Var3 = b0a0Var2.a;
                boolean zM = ((no4) ynb0Var2.get()).M();
                l4a0 l4a0Var = l4a0.b;
                if (zM) {
                    l4a0 l4a0Var2 = c5a1Var.d;
                    boolean z22 = l4a0Var2 != l4a0.c;
                    boolean z23 = l4a0Var2 == l4a0Var || ((no4) ynb0Var3.get()).o();
                    l4a0 l4a0Var3 = l4a0.a;
                    bp90Var = new bp90(z22, z23, l4a0Var2 == l4a0Var, p7h.M(new l4a0[]{l4a0Var, l4a0Var3}).contains(l4a0Var2), l4a0Var2 == l4a0Var, z23 || (!z21 && ((no4) ynb0Var3.get()).z()), l4a0Var2 == l4a0Var3);
                } else {
                    boolean z24 = ((no4) ynb0Var3.get()).I() && c5a1Var.c;
                    boolean z25 = c5a1Var.b;
                    boolean z26 = z25 || ((no4) ynb0Var3.get()).o();
                    boolean z27 = c5a1Var.a;
                    bp90Var = new bp90(z27, z26, c5a1Var.d == l4a0Var, z26 || z24, z25, z27 && (z26 || (!z21 && ((no4) ynb0Var3.get()).z())), c5a1Var.a && !z25);
                }
                return bp90Var;
            case 20:
                mwu mwuVar = (mwu) obj3;
                cxc0 cxc0Var = (cxc0) this.c;
                boolean z28 = this.b;
                hm5.M(obj);
                if (z28 || mwuVar.f) {
                    if (gyo1.G(cxc0Var.j, new dlc0[]{dlc0.d, dlc0.h, dlc0.g, dlc0.f}) && mwuVar.c.c(cxc0Var.f.q)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 21:
                vr20 vr20Var4 = (vr20) this.c;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    if (vr20Var4.emit(pfy.a, this) == crn0Var2) {
                        return crn0Var2;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((myq0) obj3).m(3, 1);
                return obj2;
            case 22:
                vr20 vr20Var5 = (vr20) this.c;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                evz evzVarB = ((ff20) obj3).b();
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var5, evzVarB, this) == crn0Var2 ? crn0Var2 : obj2;
            case 23:
                Intent intent3 = (Intent) this.c;
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set set2 = s4b1.f;
                v5b1 v5b1Var = uic.x(intent3.getDataString()).d;
                czu0 czu0Var = v5b1Var instanceof czu0 ? (czu0) v5b1Var : null;
                if (czu0Var == null) {
                    return crn0Var;
                }
                String str6 = czu0Var.a;
                String str7 = czu0Var.c;
                String str8 = czu0Var.b;
                s4b1 s4b1VarX2 = uic.x(intent3.getDataString());
                Bundle extras = intent3.getExtras();
                this.c = null;
                this.b = true;
                Object objC = ((o030) obj3).c(str6, str7, str8, s4b1VarX2, extras, this);
                return objC == crn0Var2 ? crn0Var2 : objC;
            case 24:
                boolean z32 = this.b;
                if (z32) {
                    if (z32) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cy5 cy5Var = (cy5) this.c;
                this.b = true;
                cy5Var.getClass();
                Object objG = cy5Var.g(new vx5((Bundle) obj3), this);
                if (objG != crn0Var2) {
                    objG = obj2;
                }
                return objG == crn0Var2 ? crn0Var2 : obj2;
            case 25:
                boolean z33 = this.b;
                if (z33) {
                    if (z33) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cy5 cy5Var2 = (cy5) this.c;
                this.b = true;
                cy5Var2.getClass();
                Object objG2 = cy5Var2.g(new ux5((String) obj3), this);
                if (objG2 != crn0Var2) {
                    objG2 = obj2;
                }
                return objG2 == crn0Var2 ? crn0Var2 : obj2;
            case 26:
                vr20 vr20Var6 = (vr20) this.c;
                boolean z34 = this.b;
                if (z34) {
                    if (z34) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uh80 uh80Var = (uh80) obj3;
                uh80Var.getClass();
                this.c = null;
                this.b = true;
                return vr20Var6.emit(uh80Var, this) == crn0Var2 ? crn0Var2 : obj2;
            case 27:
                Intent intent4 = (Intent) this.c;
                boolean z35 = this.b;
                if (z35) {
                    if (z35) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set set3 = s4b1.f;
                byu0 byu0Var = uic.x(intent4.getDataString()).d;
                byu0 byu0Var2 = byu0Var instanceof byu0 ? byu0Var : null;
                if (byu0Var2 == null) {
                    hhg1.n("Expected playlist invite URI");
                    return null;
                }
                il00 il00Var = (il00) ((wf2) obj3).b;
                String strZ = uic.y(byu0Var2.a).z();
                if (strZ == null) {
                    strZ = "<missing-uri>";
                }
                String str9 = byu0Var2.b;
                this.c = null;
                this.b = true;
                Object objH = il00Var.h(strZ, str9, this);
                return objH == crn0Var2 ? crn0Var2 : objH;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                vr20 vr20Var7 = (vr20) this.c;
                boolean z36 = this.b;
                if (z36) {
                    if (z36) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set set4 = (Set) obj3;
                int iS = zno1.s(q7h.U(set4, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj4 : set4) {
                    linkedHashMap.put(obj4, wl90.a);
                }
                this.c = null;
                this.b = true;
                return vr20Var7.emit(linkedHashMap, this) == crn0Var2 ? crn0Var2 : obj2;
            default:
                vr20 vr20Var8 = (vr20) this.c;
                boolean z37 = this.b;
                if (z37) {
                    if (z37) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qag0 qag0Var = new qag0(!((cag0) obj3).d);
                this.c = null;
                this.b = true;
                return vr20Var8.emit(qag0Var, this) == crn0Var2 ? crn0Var2 : obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }
}

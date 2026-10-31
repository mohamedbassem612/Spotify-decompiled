package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class td1 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td1(Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.d = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        byte b2 = 4;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                td1 td1Var = new td1(this.d, (lnm) obj4, (byte) 0);
                td1Var.c = (sd1) obj2;
                return td1Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                td1 td1Var2 = new td1((int) b2, (lnm) obj4, (byte) 1);
                td1Var2.c = (k1r) obj;
                td1Var2.d = (nm6) obj2;
                td1Var2.b = zBooleanValue;
                return td1Var2.invokeSuspend(rih1Var);
            case 2:
                td1 td1Var3 = new td1(this.d, (lnm) obj4, (byte) 2);
                td1Var3.c = (tqw) obj3;
                return td1Var3.invokeSuspend(rih1Var);
            case 3:
                td1 td1Var4 = new td1(this.d, (lnm) obj4, (byte) 3);
                td1Var4.c = (ad90) obj2;
                return td1Var4.invokeSuspend(rih1Var);
            case 4:
                td1 td1Var5 = new td1((umf0) this.d, (lnm) obj4, b2);
                td1Var5.c = (s0a0) obj;
                return td1Var5.invokeSuspend(rih1Var);
            case 5:
                td1 td1Var6 = new td1(this.d, (lnm) obj4, (byte) 5);
                td1Var6.c = (tv80) obj3;
                return td1Var6.invokeSuspend(rih1Var);
            case 6:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                td1 td1Var7 = new td1((int) b2, (lnm) obj4, (byte) 6);
                td1Var7.c = (Integer) obj;
                td1Var7.b = zBooleanValue2;
                td1Var7.d = (lax) obj3;
                return td1Var7.invokeSuspend(rih1Var);
            case 7:
                td1 td1Var8 = new td1(this.d, (lnm) obj4, (byte) 7);
                td1Var8.c = (zed0) obj2;
                return td1Var8.invokeSuspend(rih1Var);
            case 8:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                td1 td1Var9 = new td1((int) b2, (lnm) obj4, (byte) 8);
                td1Var9.b = zBooleanValue3;
                td1Var9.c = (Boolean) obj2;
                td1Var9.d = (List) obj3;
                return td1Var9.invokeSuspend(rih1Var);
            case 9:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                td1 td1Var10 = new td1((int) b2, (lnm) obj4, (byte) 9);
                td1Var10.c = (Boolean) obj;
                td1Var10.b = zBooleanValue4;
                td1Var10.d = (Boolean) obj3;
                return td1Var10.invokeSuspend(rih1Var);
            case 10:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                td1 td1Var11 = new td1((int) b2, (lnm) obj4, (byte) 10);
                td1Var11.c = (s7n0) obj;
                td1Var11.b = zBooleanValue5;
                td1Var11.d = (e3q0) obj3;
                return td1Var11.invokeSuspend(rih1Var);
            case 11:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                td1 td1Var12 = new td1((int) b2, (lnm) obj4, (byte) 11);
                td1Var12.b = zBooleanValue6;
                td1Var12.c = (ibk0) obj2;
                td1Var12.d = (nl61) obj3;
                return td1Var12.invokeSuspend(rih1Var);
            case 12:
                boolean zBooleanValue7 = ((Boolean) obj3).booleanValue();
                td1 td1Var13 = new td1((int) b2, (lnm) obj4, (byte) 12);
                td1Var13.c = (cxc0) obj;
                td1Var13.d = (ly50) obj2;
                td1Var13.b = zBooleanValue7;
                return td1Var13.invokeSuspend(rih1Var);
            case 13:
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                td1 td1Var14 = new td1((int) b2, (lnm) obj4, (byte) 13);
                td1Var14.c = (l0l) obj;
                td1Var14.b = zBooleanValue8;
                td1Var14.d = (Boolean) obj3;
                return td1Var14.invokeSuspend(rih1Var);
            case 14:
                td1 td1Var15 = new td1(this.d, (lnm) obj4, (byte) 14);
                td1Var15.c = (vwb1) obj2;
                return td1Var15.invokeSuspend(rih1Var);
            case 15:
                td1 td1Var16 = new td1(this.d, (lnm) obj4, (byte) 15);
                td1Var16.c = (String) obj2;
                return td1Var16.invokeSuspend(rih1Var);
            case 16:
                td1 td1Var17 = new td1(this.d, (lnm) obj4, (byte) 16);
                td1Var17.c = (t7m1) obj2;
                return td1Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                td1 td1Var18 = new td1(this.d, (lnm) obj4, (byte) 17);
                td1Var18.c = (tzm1) obj2;
                return td1Var18.invokeSuspend(rih1Var);
            default:
                td1 td1Var19 = new td1(this.d, (lnm) obj4, (byte) 18);
                td1Var19.c = (wzm1) obj2;
                return td1Var19.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        rh7 rh7Var;
        Uri uri;
        Object objJ;
        Object obj2;
        Object obj3;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i = 0;
        i = 0;
        rih1 rih1Var = d9n.a;
        rih1 rih1Var2 = rih1.a;
        switch (b) {
            case 0:
                sd1 sd1Var = (sd1) this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (sd1Var == null) {
                        eg.o();
                        return null;
                    }
                    f1n0 f1n0Var = ((ud1) this.d).b;
                    dwn0 dwn0Var = new dwn0("spotify:chat-trusted-circle", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                    this.c = null;
                    this.b = true;
                    if (f1n0.d(f1n0Var, dwn0Var, this) == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 1:
                k1r k1rVar = (k1r) this.c;
                nm6 nm6Var = (nm6) this.d;
                boolean z2 = this.b;
                hm5.M(obj);
                return new pch(k1rVar, nm6Var, z2);
            case 2:
                tqw tqwVar = (tqw) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    tdo tdoVar = (tdo) ((br0) this.d).c;
                    tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                    this.c = null;
                    this.b = true;
                    Object objY = fn31.Y(tdoVar.c, new h210(tv80VarY, tdoVar, (lnm) null, (byte) 25), this);
                    if (objY != rih1Var) {
                        objY = rih1Var2;
                    }
                    if (objY == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 3:
                ad90 ad90Var = (ad90) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (ad90Var == null) {
                    eg.o();
                    return null;
                }
                f1n0 f1n0Var2 = (f1n0) ((ng20) this.d).b;
                dwn0 dwn0Var2 = new dwn0(nik1.e5.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                this.c = null;
                this.b = true;
                if (f1n0.d(f1n0Var2, dwn0Var2, this) == rih1Var) {
                    return rih1Var;
                }
                return rih1Var2;
            case 4:
                umf0 umf0Var = (umf0) this.d;
                s0a0 s0a0Var = (s0a0) this.c;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    pp90 pp90Var = (pp90) ((c9c0) umf0Var.d).b.current().getValue();
                    if (pp90Var != null) {
                        t0a0 t0a0Var = (t0a0) umf0Var.e;
                        String str = s0a0Var.b;
                        this.c = null;
                        this.b = true;
                        if (t0a0Var.a(pp90Var, str, this) == rih1Var) {
                            return rih1Var;
                        }
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 5:
                tv80 tv80Var = (tv80) this.c;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    g6c0 g6c0Var = (g6c0) ((kly0) ((v6a0) this.d).c).get();
                    this.c = null;
                    this.b = true;
                    if (g6c0Var.a(tv80Var, this) == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 6:
                Integer num = (Integer) this.c;
                boolean z7 = this.b;
                lax laxVar = (lax) this.d;
                hm5.M(obj);
                return new v9d0(num, z7, laxVar);
            case 7:
                et90 et90Var = (et90) this.d;
                zed0 zed0Var = (zed0) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!u890.j(zed0Var, zed0.a)) {
                    eg.o();
                    return null;
                }
                ((r241) et90Var.d).a("share-listening-activity", "1");
                f1n0 f1n0Var3 = (f1n0) et90Var.c;
                this.c = null;
                this.b = true;
                if (f1n0Var3.a(this) == rih1Var) {
                    return rih1Var;
                }
                return rih1Var2;
            case 8:
                boolean z9 = this.b;
                Boolean bool = (Boolean) this.c;
                List list = (List) this.d;
                hm5.M(obj);
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                qfd qfdVar = (qfd) o7h.s0(list);
                boolean z10 = (qfdVar != null ? qfdVar.c : 0) == 3;
                qfd qfdVar2 = (qfd) o7h.s0(list);
                if (qfdVar2 != null && (rh7Var = qfdVar2.d) != null) {
                    i = rh7Var.a;
                }
                return new y2u0(i, z9, zBooleanValue, z10);
            case 9:
                Boolean bool2 = (Boolean) this.c;
                boolean z11 = this.b;
                Boolean bool3 = (Boolean) this.d;
                hm5.M(obj);
                return Boolean.valueOf(bool2.booleanValue() || z11 || bool3.booleanValue());
            case 10:
                s7n0 s7n0Var = (s7n0) this.c;
                boolean z12 = this.b;
                e3q0 e3q0Var = (e3q0) this.d;
                hm5.M(obj);
                return new ue81(s7n0Var, z12, e3q0Var instanceof d3q0);
            case 11:
                boolean z13 = this.b;
                ibk0 ibk0Var = (ibk0) this.c;
                nl61 nl61Var = (nl61) this.d;
                hm5.M(obj);
                return new vbb1(z13, ibk0Var.b(), nl61Var);
            case 12:
                cxc0 cxc0Var = (cxc0) this.c;
                ly50 ly50Var = (ly50) this.d;
                boolean z14 = this.b;
                hm5.M(obj);
                return new lcb1(cxc0Var, ly50Var, z14);
            case 13:
                l0l l0lVar = (l0l) this.c;
                boolean z15 = this.b;
                Boolean bool4 = (Boolean) this.d;
                hm5.M(obj);
                return new yvg1(l0lVar, Boolean.valueOf(z15), bool4);
            case 14:
                cxb1 cxb1Var = (cxb1) this.d;
                vwb1 vwb1Var = (vwb1) this.c;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (vwb1Var == null) {
                    eg.o();
                    return null;
                }
                String str2 = vwb1Var.a;
                cxb1Var.b.invoke(str2);
                y441 y441Var = cxb1Var.e;
                this.c = null;
                this.b = true;
                y441Var.r(2, str2);
                if (rih1Var2 == rih1Var) {
                    return rih1Var;
                }
                return rih1Var2;
            case 15:
                ua91 ua91Var = (ua91) this.d;
                String str3 = (String) this.c;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    uri = Uri.parse(str3);
                    if (u890.j(str3, "https://support.spotify.com")) {
                        g341 g341Var = (g341) ((kly0) ua91Var.c).get();
                        uri.getClass();
                        Single singleB = g341Var.b(uri);
                        this.c = null;
                        this.b = true;
                        objJ = fc11.j(singleB, this);
                        if (objJ == rih1Var) {
                            return rih1Var;
                        }
                    }
                    z710 z710Var = (z710) ua91Var.d;
                    uri.getClass();
                    z710.c(z710Var, uri, false, 6);
                    return rih1Var2;
                }
                if (!z17) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objJ = obj;
                uri = (Uri) objJ;
                z710 z710Var2 = (z710) ua91Var.d;
                uri.getClass();
                z710.c(z710Var2, uri, false, 6);
                return rih1Var2;
            case 16:
                vbe1 vbe1Var = (vbe1) this.d;
                t7m1 t7m1Var = (t7m1) this.c;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(t7m1Var, s7m1.a)) {
                    ((uqv0) vbe1Var.d).j((String) vbe1Var.c);
                } else {
                    if (!(t7m1Var instanceof r7m1)) {
                        eg.o();
                        return null;
                    }
                    o7m1 o7m1Var = (o7m1) vbe1Var.e;
                    String str4 = ((r7m1) t7m1Var).a;
                    this.c = null;
                    this.b = true;
                    llm llmVar = o7m1Var.j;
                    if ((llmVar == null ? Boolean.TRUE : fn31.q(llmVar, (o8n) null, 0, new gqj1(o7m1Var, str4, (lnm) null, (byte) 28), 3).Q(this)) == rih1Var) {
                        return rih1Var;
                    }
                }
                return rih1Var2;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vzm1 vzm1Var = (vzm1) this.d;
                tzm1 tzm1Var = (tzm1) this.c;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!u890.j(tzm1Var, tzm1.a)) {
                    eg.o();
                    return null;
                }
                l911 l911Var = vzm1Var.d;
                hma1 hma1VarEdit = l911Var.a.edit();
                hma1VarEdit.a(l911Var.e, true);
                hma1VarEdit.g();
                u911 u911Var = vzm1Var.b;
                if (u911Var != null) {
                    String str5 = vzm1Var.a;
                    i8h1 i8h1Var = u911Var.a;
                    wtl0 wtl0Var = (wtl0) u911Var.e.getValue();
                    wtl0Var.getClass();
                    x6h1 x6h1VarC = wtl0Var.b.c();
                    x6h1VarC.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    obj2 = null;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC.a(), wtl0Var.a, System.currentTimeMillis()), (xj61) null);
                } else {
                    obj2 = null;
                }
                x390 x390Var = vzm1Var.c;
                this.c = obj2;
                this.b = true;
                ((iu30) x390Var.b).invoke(((y811) x390Var.c).d);
                if (rih1Var2 == rih1Var) {
                    return rih1Var;
                }
                return rih1Var2;
            default:
                yzm1 yzm1Var = (yzm1) this.d;
                wzm1 wzm1Var = (wzm1) this.c;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!u890.j(wzm1Var, wzm1.a)) {
                    eg.o();
                    return null;
                }
                l911 l911Var2 = yzm1Var.d;
                hma1 hma1VarEdit2 = l911Var2.a.edit();
                hma1VarEdit2.a(l911Var2.e, true);
                hma1VarEdit2.g();
                u911 u911Var2 = yzm1Var.b;
                if (u911Var2 != null) {
                    String str6 = yzm1Var.a;
                    i8h1 i8h1Var2 = u911Var2.a;
                    wtl0 wtl0Var2 = (wtl0) u911Var2.f.getValue();
                    wtl0Var2.getClass();
                    x6h1 x6h1VarC2 = wtl0Var2.b.c();
                    x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    obj3 = null;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6)), x6h1VarC2.a(), wtl0Var2.a, System.currentTimeMillis()), (xj61) null);
                } else {
                    obj3 = null;
                }
                frl1 frl1Var = yzm1Var.c;
                this.c = obj3;
                this.b = true;
                ((iu30) frl1Var.b).invoke(((x811) frl1Var.c).b);
                if (rih1Var2 == rih1Var) {
                    return rih1Var;
                }
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td1(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}

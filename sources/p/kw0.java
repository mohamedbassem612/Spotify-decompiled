package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kw0 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(res resVar, ven0 ven0Var, tob1 tob1Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 12;
        this.d = resVar;
        this.e = ven0Var;
        this.f = tob1Var;
    }

    private final Object e(Object obj) {
        Object objB;
        cm0 cm0Var = (cm0) this.f;
        lzn0 lzn0Var = (lzn0) cm0Var.g;
        a7a1 a7a1Var = (a7a1) cm0Var.c;
        m9a1 m9a1Var = (m9a1) this.c;
        l9a1 l9a1Var = (l9a1) this.d;
        tqw tqwVar = (tqw) this.e;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (!z) {
            hm5.M(obj);
            if (!u890.j(l9a1Var, l9a1.b)) {
                if (u890.j(l9a1Var, l9a1.a)) {
                    lzn0Var.a("spotify:internal:songdna:about", cvl1.d(tqwVar), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            }
            if (a7a1Var.d && m9a1Var.f) {
                return rih1Var;
            }
            String strL = cm0Var.l(m9a1Var);
            String str = m9a1Var.c;
            if (strL != null) {
                lzn0Var.a(strL, cvl1.d(tqwVar), (Bundle) null);
                return rih1Var;
            }
            if (!a7a1Var.c) {
                vu1 vu1Var = (vu1) cm0Var.d;
                List list = m9a1Var.b;
                String str2 = (String) cm0Var.i;
                vu1.b(vu1Var, list, str2, str2, cvl1.d(tqwVar), (dy1) null, 48);
                return rih1Var;
            }
            if (m9a1Var.b.isEmpty() || str.length() == 0) {
                kt91 kt91Var = (kt91) cm0Var.f;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962730});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131962730, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            }
            op31 op31Var = (op31) cm0Var.e;
            List list2 = m9a1Var.b;
            String str3 = (String) cm0Var.i;
            this.c = null;
            this.d = null;
            this.e = null;
            this.b = true;
            objB = op31.b(op31Var, str, list2, str3, str3, mp31.a, this);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objB = obj;
        }
        ((py21) objB).b(new n9a1(cm0Var, (byte) 0), new n9a1(cm0Var, (byte) 1));
        return rih1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                kw0 kw0Var = new kw0(this.e, obj5, (lnm) obj4, (byte) 0);
                kw0Var.c = (jw0) obj;
                kw0Var.d = (hw0) obj2;
                return kw0Var.invokeSuspend(rih1Var);
            case 1:
                kw0 kw0Var2 = new kw0((xpw) obj5, (lnm) obj4, (byte) 1);
                kw0Var2.d = (be2) obj2;
                kw0Var2.e = (tqw) obj3;
                return kw0Var2.invokeSuspend(rih1Var);
            case 2:
                ((Boolean) obj2).getClass();
                kw0 kw0Var3 = new kw0(this.e, obj5, (lnm) obj4, (byte) 2);
                kw0Var3.c = (String) obj;
                kw0Var3.d = (String) obj3;
                return kw0Var3.invokeSuspend(rih1Var);
            case 3:
                kw0 kw0Var4 = new kw0((xpw) obj5, (lnm) obj4, (byte) 3);
                kw0Var4.c = (lr3) obj;
                kw0Var4.d = (kr3) obj2;
                kw0Var4.e = (tqw) obj3;
                return kw0Var4.invokeSuspend(rih1Var);
            case 4:
                kw0 kw0Var5 = new kw0(this.e, obj5, (lnm) obj4, (byte) 4);
                kw0Var5.c = (bw7) obj;
                kw0Var5.d = (zv7) obj2;
                return kw0Var5.invokeSuspend(rih1Var);
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kw0 kw0Var6 = new kw0(this.e, obj5, (lnm) obj4, (byte) 5);
                kw0Var6.b = zBooleanValue;
                kw0Var6.c = (Map) obj2;
                kw0Var6.d = (k1r) obj3;
                return kw0Var6.invokeSuspend(rih1Var);
            case 6:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                kw0 kw0Var7 = new kw0(this.e, obj5, (lnm) obj4, (byte) 6);
                kw0Var7.c = (py21) obj;
                kw0Var7.b = zBooleanValue2;
                kw0Var7.d = (ibk0) obj3;
                return kw0Var7.invokeSuspend(rih1Var);
            case 7:
                kw0 kw0Var8 = new kw0((xpw) obj5, (lnm) obj4, (byte) 7);
                kw0Var8.c = (c2w) obj;
                kw0Var8.d = (b2w) obj2;
                kw0Var8.e = (tqw) obj3;
                return kw0Var8.invokeSuspend(rih1Var);
            case 8:
                kw0 kw0Var9 = new kw0(this.e, obj5, (lnm) obj4, (byte) 8);
                kw0Var9.c = (v9y) obj;
                kw0Var9.d = (s9y) obj2;
                return kw0Var9.invokeSuspend(rih1Var);
            case 9:
                kw0 kw0Var10 = new kw0((xpw) obj5, (lnm) obj4, (byte) 9);
                kw0Var10.c = (xhy) obj;
                kw0Var10.d = (uhy) obj2;
                kw0Var10.e = (tqw) obj3;
                return kw0Var10.invokeSuspend(rih1Var);
            case 10:
                kw0 kw0Var11 = new kw0(this.e, obj5, (lnm) obj4, (byte) 10);
                kw0Var11.c = (g2n0) obj;
                kw0Var11.d = (e2n0) obj2;
                return kw0Var11.invokeSuspend(rih1Var);
            case 11:
                kw0 kw0Var12 = new kw0((xkr0) obj5, this.b, (lnm) obj4);
                kw0Var12.c = (l57) obj;
                kw0Var12.d = (mmr0) obj2;
                kw0Var12.e = (YourLibraryResponse) obj3;
                return kw0Var12.invokeSuspend(rih1Var);
            case 12:
                kw0 kw0Var13 = new kw0((res) this.d, (ven0) this.e, (tob1) obj5, (lnm) obj4);
                kw0Var13.c = (doy0) obj2;
                return kw0Var13.invokeSuspend(rih1Var);
            case 13:
                kw0 kw0Var14 = new kw0((xpw) obj5, (lnm) obj4, (byte) 13);
                kw0Var14.c = (nx01) obj;
                kw0Var14.d = (mx01) obj2;
                kw0Var14.e = (tqw) obj3;
                return kw0Var14.invokeSuspend(rih1Var);
            case 14:
                kw0 kw0Var15 = new kw0((xpw) obj5, (lnm) obj4, (byte) 14);
                kw0Var15.d = (ef71) obj2;
                kw0Var15.e = (tqw) obj3;
                return kw0Var15.invokeSuspend(rih1Var);
            case 15:
                kw0 kw0Var16 = new kw0((xpw) obj5, (lnm) obj4, (byte) 15);
                kw0Var16.c = (wp71) obj;
                kw0Var16.d = (tp71) obj2;
                kw0Var16.e = (tqw) obj3;
                return kw0Var16.invokeSuspend(rih1Var);
            case 16:
                kw0 kw0Var17 = new kw0((xpw) obj5, (lnm) obj4, (byte) 16);
                kw0Var17.c = (m9a1) obj;
                kw0Var17.d = (l9a1) obj2;
                kw0Var17.e = (tqw) obj3;
                return kw0Var17.invokeSuspend(rih1Var);
            case 17:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                kw0 kw0Var18 = new kw0(this.e, obj5, (lnm) obj4, (byte) 17);
                kw0Var18.b = zBooleanValue3;
                kw0Var18.c = (i091) obj2;
                kw0Var18.d = (String) obj3;
                return kw0Var18.invokeSuspend(rih1Var);
            case 18:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                kw0 kw0Var19 = new kw0(this.e, obj5, (lnm) obj4, (byte) 18);
                kw0Var19.c = (c221) obj;
                kw0Var19.b = zBooleanValue4;
                kw0Var19.d = (Map) obj3;
                return kw0Var19.invokeSuspend(rih1Var);
            default:
                kw0 kw0Var20 = new kw0((xpw) obj5, (lnm) obj4, (byte) 19);
                kw0Var20.c = (rwg1) obj;
                kw0Var20.d = (qwg1) obj2;
                kw0Var20.e = (tqw) obj3;
                return kw0Var20.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x023c  */
    /* JADX WARN: Code duplicated, block: B:270:0x0765  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:403:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:409:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:464:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:466:0x0bc3  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a85 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0a83 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:? A[LOOP:3: B:401:0x0a69->B:497:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ac A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #1 {all -> 0x00dd, blocks: (B:44:0x00d6, B:74:0x019f, B:77:0x01ac, B:79:0x01bc, B:81:0x01c0, B:83:0x01c6, B:85:0x01da, B:86:0x01e1, B:71:0x018f), top: B:487:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:44:0x00d6, B:74:0x019f, B:77:0x01ac, B:79:0x01bc, B:81:0x01c0, B:83:0x01c6, B:85:0x01da, B:86:0x01e1, B:71:0x018f), top: B:487:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0 A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:44:0x00d6, B:74:0x019f, B:77:0x01ac, B:79:0x01bc, B:81:0x01c0, B:83:0x01c6, B:85:0x01da, B:86:0x01e1, B:71:0x018f), top: B:487:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:44:0x00d6, B:74:0x019f, B:77:0x01ac, B:79:0x01bc, B:81:0x01c0, B:83:0x01c6, B:85:0x01da, B:86:0x01e1, B:71:0x018f), top: B:487:0x00d2 }] */
    public final Object invokeSuspend(Object obj) {
        vb2 vb2Var;
        Object objP;
        tv80 tv80VarY;
        Iterator it;
        Object obj2;
        aw7 aw7Var;
        Object next;
        int i;
        int i2;
        int i3;
        Object objEmit;
        Integer num;
        int i4;
        wb2 wb2Var;
        Object objP2;
        Object objE;
        t7q0 t7q0Var;
        String strD;
        tv80 tv80VarY2;
        boolean z;
        byte b = this.a;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                jw0 jw0Var = (jw0) this.c;
                hw0 hw0Var = (hw0) this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!u890.j(hw0Var, hw0.a)) {
                    eg.o();
                    return null;
                }
                iw0 iw0Var = (iw0) this.e;
                if (!iw0Var.e) {
                    return d9nVar;
                }
                mcu0 mcu0Var = (mcu0) ((qj0) obj3).e;
                String str = jw0Var.a.a;
                long j = iw0Var.b;
                this.c = null;
                this.d = null;
                this.b = true;
                return mcu0Var.b(str, j, null, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 1:
                be2 be2Var = (be2) this.d;
                tqw tqwVar = (tqw) this.e;
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vb2Var = (vb2) this.c;
                    hm5.M(obj);
                    objP = obj;
                    cb2 cb2Var = new cb2(((Number) objP).intValue());
                    if (tqwVar != null) {
                        tv80VarY = n3o1.y(tqwVar);
                    } else {
                        tv80VarY = null;
                    }
                    vb2.b(vb2Var, cb2Var, true, tv80VarY);
                    return d9nVar;
                }
                hm5.M(obj);
                if (!u890.j(be2Var, be2.a)) {
                    eg.o();
                    return null;
                }
                tm tmVar = (tm) obj3;
                vb2Var = (vb2) tmVar.c;
                k7d k7dVar = (k7d) tmVar.e;
                this.d = null;
                this.e = tqwVar;
                this.c = vb2Var;
                this.b = true;
                objP = yah0.p(k7dVar.b.a());
                if (objP == d9nVar2) {
                    return d9nVar2;
                }
                cb2 cb2Var2 = new cb2(((Number) objP).intValue());
                if (tqwVar != null) {
                    tv80VarY = n3o1.y(tqwVar);
                } else {
                    tv80VarY = null;
                }
                vb2.b(vb2Var, cb2Var2, true, tv80VarY);
                return d9nVar;
            case 2:
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.d = null;
                this.b = true;
                return eio1.p(((fq2) this.e).d, str2, str3, (String) obj3, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 3:
                tm tmVar2 = (tm) obj3;
                lr3 lr3Var = (lr3) this.c;
                ir3 ir3Var = (kr3) this.d;
                tqw tqwVar2 = (tqw) this.e;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    if (ir3Var instanceof ir3) {
                        ((r241) tmVar2.d).a("publish-activity", ir3Var.a ? "1" : "0");
                        return d9nVar;
                    }
                    if (ir3Var instanceof jr3) {
                        String strConcat = z6b1.a(lr3Var.a).concat(":followers");
                        f1n0 f1n0Var = (f1n0) tmVar2.e;
                        tv80 tv80VarY3 = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                        dwn0 dwn0Var = new dwn0(strConcat, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY3 != null ? new bwn0(tv80VarY3) : null);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return f1n0.d(f1n0Var, dwn0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
                    }
                    eg.o();
                } else {
                    if (z5) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 4:
                yxb0 yxb0Var = (yxb0) this.e;
                bw7 bw7Var = (bw7) this.c;
                yv7 yv7Var = (zv7) this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    it = bw7Var.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (u890.j(((aw7) next).b, yv7Var.a)) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    aw7Var = (aw7) obj2;
                    if (aw7Var != null) {
                        return d9nVar;
                    }
                    ((ven0) obj3).setValue(((Context) yxb0Var.c).getString(2131958566, aw7Var.a));
                    return d9nVar;
                }
                hm5.M(obj);
                if (u890.j(yv7Var, xv7.a)) {
                    cw7 cw7Var = (cw7) yxb0Var.f;
                    lzn0 lzn0Var = cw7Var.b;
                    if (lzn0Var.j(cw7Var.a)) {
                        lzn0Var.e();
                        return d9nVar;
                    }
                    cw7Var.c.l();
                    return d9nVar;
                }
                if (!(yv7Var instanceof yv7)) {
                    eg.o();
                    return null;
                }
                haa0 haa0Var = (haa0) yxb0Var.d;
                String str4 = yv7Var.a;
                this.c = bw7Var;
                this.d = yv7Var;
                this.b = true;
                try {
                    ((dw7) haa0Var.b).a.onNext(Optional.ofNullable(Locale.forLanguageTag(str4)));
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (u890.j(((aw7) next).b, yv7Var.a)) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                } catch (Throwable unused) {
                }
                if (d9nVar == d9nVar2) {
                    return d9nVar2;
                }
                it = bw7Var.b.iterator();
                aw7Var = (aw7) obj2;
                if (aw7Var != null) {
                    return d9nVar;
                }
                ((ven0) obj3).setValue(((Context) yxb0Var.c).getString(2131958566, aw7Var.a));
                return d9nVar;
            case 5:
                tck tckVar = (tck) this.e;
                boolean z7 = this.b;
                Map map = (Map) this.c;
                i1r i1rVar = (k1r) this.d;
                hm5.M(obj);
                if (!(i1rVar instanceof i1r)) {
                    return new lsk(z7, (ksk) null, (c8c0) null, false, b7x.a);
                }
                qxc0 qxc0Var = (qxc0) i1rVar.a;
                c8c0 c8c0VarA = ((d8c0) tckVar.e).a(qxc0Var.U0, map);
                fp8 fp8Var = (fp8) tckVar.d;
                String str5 = (String) obj3;
                boolean z8 = qxc0Var.X0;
                String str6 = qxc0Var.e;
                me30 me30Var = (me30) fp8Var.b;
                if (str6 == null) {
                    str6 = "";
                }
                ksk kskVar = new ksk(str5, z8, me30Var.a(str6));
                CharSequence charSequence = (CharSequence) qxc0Var.X.get("image_url");
                return new lsk(z7, kskVar, c8c0VarA, !(charSequence == null || charSequence.length() == 0), qxc0Var.X);
            case 6:
                py21 py21Var = (py21) this.c;
                boolean z9 = this.b;
                ibk0 ibk0Var = (ibk0) this.d;
                hm5.M(obj);
                return new wqv(py21Var, z9, ibk0Var, ((thk0) this.e).a().a.containsKey(((yqv) obj3).a));
            case 7:
                c2w c2wVar = (c2w) this.c;
                b2w b2wVar = (b2w) this.d;
                tqw tqwVar3 = (tqw) this.e;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    if (b2wVar != null) {
                        if (c2wVar.a.length() == 0) {
                            return d9nVar;
                        }
                        tv80 tv80VarY4 = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                        e2w e2wVar = (e2w) obj3;
                        q8n q8nVar = e2wVar.b;
                        piu piuVar = new piu(e2wVar, c2wVar, tv80VarY4, (lnm) null, (byte) 4);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return fn31.Y(q8nVar, piuVar, this) == d9nVar2 ? d9nVar2 : d9nVar;
                    }
                    eg.o();
                } else {
                    if (z10) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 8:
                z9y z9yVar = (z9y) obj3;
                iu30 iu30Var = (iu30) this.e;
                v9y v9yVar = (v9y) this.c;
                l9y l9yVar = (s9y) this.d;
                boolean z11 = this.b;
                if (z11) {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    z9yVar.f.g();
                    return d9nVar;
                }
                hm5.M(obj);
                if (l9yVar instanceof r9y) {
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, null, ((r9y) l9yVar).a, null, null, null, null, 0, false, null, 32639));
                    return d9nVar;
                }
                if (l9yVar instanceof q9y) {
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, null, null, null, null, null, null, 0, false, null, 32639));
                    return d9nVar;
                }
                if (l9yVar instanceof h9y) {
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, new lsd(((h9y) l9yVar).a), null, null, null, null, null, 0, false, null, 32703));
                    return d9nVar;
                }
                if (l9yVar instanceof j9y) {
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, null, null, null, null, null, ((j9y) l9yVar).a, 0, false, null, 30719));
                    return d9nVar;
                }
                if (l9yVar instanceof f9y) {
                    int iC = l1d.C(v9yVar.Z);
                    if (iC == 0) {
                        i4 = 2;
                    } else if (iC == 1) {
                        i4 = 3;
                    } else if (iC == 2) {
                        i4 = 1;
                    } else {
                        eg.o();
                    }
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, null, null, null, null, null, null, i4, false, null, 28671));
                    return d9nVar;
                }
                if (l9yVar instanceof p9y) {
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, null, null, null, null, null, null, 0, !v9yVar.N0, null, 24575));
                    return d9nVar;
                }
                if (l9yVar instanceof k9y) {
                    ax70 ax70VarB = v9yVar.b();
                    ax70 ax70Var = ((k9y) l9yVar).a;
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, u890.j(ax70VarB, ax70Var) ? null : new ksd(ax70Var), null, null, null, null, null, 0, false, null, 32703));
                    return d9nVar;
                }
                if (l9yVar instanceof n9y) {
                    Iterator it2 = v9yVar.O0.iterator();
                    if (it2.hasNext()) {
                        num = new Integer(((t5t0) it2.next()).a);
                        while (it2.hasNext()) {
                            Integer num2 = new Integer(((t5t0) it2.next()).a);
                            if (num.compareTo(num2) < 0) {
                                num = num2;
                            }
                        }
                    } else {
                        num = null;
                    }
                    int iIntValue = (num != null ? num.intValue() : -1) + 1;
                    nxb1 nxb1Var = ((n9y) l9yVar).a;
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, null, null, null, null, null, null, 0, false, o7h.O0(new t5t0(iIntValue, nxb1Var.a, nxb1Var.b, 0.0f, 0.0f, 0.0f, 1.0f), v9yVar.O0), 16255));
                    return d9nVar;
                }
                if (l9yVar instanceof o9y) {
                    ArrayList arrayList = new ArrayList(v9yVar.O0);
                    int size = arrayList.size();
                    o9y o9yVar = (o9y) l9yVar;
                    int i5 = o9yVar.a;
                    if (i5 >= 0 && i5 < size) {
                        t5t0 t5t0Var = (t5t0) arrayList.get(i5);
                        arrayList.set(i5, new t5t0(t5t0Var.a, t5t0Var.b, t5t0Var.c, o9yVar.b, o9yVar.c, o9yVar.d, yoi1.o(o9yVar.e, 0.33f, 3.0f)));
                    }
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, null, null, null, null, null, null, 0, false, arrayList, 16383));
                    return d9nVar;
                }
                if (l9yVar instanceof l9y) {
                    ArrayList arrayList2 = new ArrayList(v9yVar.O0);
                    int size2 = arrayList2.size();
                    int i6 = l9yVar.a;
                    if (i6 >= 0 && i6 < size2) {
                        arrayList2.remove(i6);
                    }
                    iu30Var.invoke(v9y.a(v9yVar, null, 0L, null, false, null, null, null, null, null, null, null, null, 0, false, arrayList2, 16383));
                    return d9nVar;
                }
                if ((l9yVar instanceof m9y) || (l9yVar instanceof g9y)) {
                    return d9nVar;
                }
                if (l9yVar instanceof i9y) {
                    tl40 tl40Var = z9yVar.g;
                    String str7 = v9yVar.c;
                    vef0 vef0Var = v9yVar.i;
                    msd msdVar = v9yVar.g;
                    kw9 kw9Var = v9yVar.t;
                    chf0 chf0Var = v9yVar.Y;
                    int i7 = v9yVar.Z;
                    boolean z12 = v9yVar.N0;
                    List list = v9yVar.O0;
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (vef0Var != null) {
                        lsd lsdVar = msdVar instanceof lsd ? (lsd) msdVar : null;
                        d9h d9hVar = lsdVar != null ? lsdVar.a : null;
                        ksd ksdVar = msdVar instanceof ksd ? (ksd) msdVar : null;
                        ax70 ax70Var2 = ksdVar != null ? ksdVar.a : null;
                        if (d9hVar != null) {
                            kw9Var = new kw9(z4p1.G(d9hVar.a), z4p1.G(d9hVar.b));
                        }
                        if (kw9Var == null) {
                            objEmit = d9nVar;
                        } else {
                            List listL1 = o7h.l1(vef0Var.d.d());
                            int iG = d9hVar != null ? z4p1.G(d9hVar.c) : vef0Var.e;
                            String str8 = ax70Var2 != null ? ax70Var2.b : null;
                            v8y t8yVar = str8 != null ? new t8y(str8, ax70Var2.c) : new u8y(kw9Var);
                            List<t5t0> list2 = list;
                            ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                            for (Iterator it3 = list2.iterator(); it3.hasNext(); it3 = it3) {
                                t5t0 t5t0Var2 = (t5t0) it3.next();
                                arrayList3.add(new w8y(t5t0Var2.a, t5t0Var2.b, t5t0Var2.c, t5t0Var2.d, t5t0Var2.e, t5t0Var2.f, t5t0Var2.g));
                            }
                            a9y a9yVar = tl40Var.a;
                            ConcurrentHashMap concurrentHashMap = a9yVar.b;
                            yqg yqgVar = a9yVar.a;
                            x8y x8yVar = new x8y(listL1, t8yVar, iG, chf0Var, i7, z12, arrayList3);
                            concurrentHashMap.entrySet().removeIf(new z8y((byte) 0, yqgVar.b()));
                            concurrentHashMap.put(str7, new y8y(x8yVar, yqgVar.b()));
                            Parcelable.Creator<cay> creator = cay.CREATOR;
                            cqs0 cqs0Var = vef0Var.d;
                            int i8 = kw9Var.a;
                            int i9 = kw9Var.b;
                            int iOrdinal = chf0Var.ordinal();
                            if (iOrdinal == 0) {
                                i = 3;
                                i2 = 1;
                            } else if (iOrdinal == 1) {
                                i = 3;
                                i2 = 2;
                            } else if (iOrdinal != 2) {
                                i = 3;
                                if (iOrdinal == 3) {
                                    i2 = 4;
                                } else {
                                    eg.o();
                                }
                            } else {
                                i = 3;
                                i2 = 3;
                            }
                            int iC2 = l1d.C(i7);
                            if (iC2 == 0) {
                                i3 = 1;
                            } else if (iC2 == 1) {
                                i3 = 2;
                            } else if (iC2 == 2) {
                                i3 = i;
                            } else {
                                eg.o();
                            }
                            ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                            for (t5t0 t5t0Var3 : list2) {
                                arrayList4.add(new v5t0(t5t0Var3.a, t5t0Var3.b, t5t0Var3.c, t5t0Var3.d, t5t0Var3.e, t5t0Var3.f, t5t0Var3.g));
                                i9 = i9;
                            }
                            objEmit = cay.X.emit(new cay(str7, cqs0Var, i8, i9, iG, i2, i3, z12, str8, arrayList4), this);
                            if (objEmit != d9nVar2) {
                                objEmit = d9nVar;
                            }
                            if (objEmit != d9nVar2) {
                                objEmit = d9nVar;
                            }
                        }
                    } else {
                        objEmit = d9nVar;
                    }
                    if (objEmit == d9nVar2) {
                        return d9nVar2;
                    }
                    z9yVar.f.g();
                    return d9nVar;
                }
                eg.o();
                return null;
            case 9:
                zhy zhyVar = (zhy) obj3;
                xhy xhyVar = (xhy) this.c;
                uhy uhyVar = (uhy) this.d;
                tqw tqwVar4 = (tqw) this.e;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    if (u890.j(uhyVar, thy.a)) {
                        zhyVar.b.f(new dwn0(xhyVar.a.g, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                        return d9nVar;
                    }
                    if (u890.j(uhyVar, shy.a)) {
                        zeu zeuVar = zhyVar.a;
                        String str9 = xhyVar.a.c;
                        boolean z14 = xhyVar.b;
                        tv80 tv80VarY5 = tqwVar4 != null ? n3o1.y(tqwVar4) : null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        Object objI = fc11.i(((oj3) zeuVar.a).c(Collections.singletonList(str9), str9, "", z14, new gj3(27, tv80VarY5)).ignoreElement(), this);
                        if (objI != d9nVar2) {
                            objI = d9nVar;
                        }
                        return objI == d9nVar2 ? d9nVar2 : d9nVar;
                    }
                    eg.o();
                } else {
                    if (z13) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 10:
                g2n0 g2n0Var = (g2n0) this.c;
                e2n0 e2n0Var = (e2n0) this.d;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    if (u890.j(e2n0Var, e2n0.a)) {
                        f2n0 f2n0Var = (f2n0) this.e;
                        if (!f2n0Var.f) {
                            return d9nVar;
                        }
                        mcu0 mcu0Var2 = (mcu0) ((ldo) obj3).d;
                        String str10 = g2n0Var.b.a;
                        long j2 = f2n0Var.b;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return mcu0Var2.b(str10, j2, null, this) == d9nVar2 ? d9nVar2 : d9nVar;
                    }
                    eg.o();
                } else {
                    if (z15) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 11:
                l57 l57Var = (l57) this.c;
                mmr0 mmr0Var = (mmr0) this.d;
                YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) this.e;
                hm5.M(obj);
                xkr0 xkr0Var = (xkr0) obj3;
                go1 go1VarA = xkr0Var.b.a((YourLibraryResponse) mmr0Var.a, yourLibraryResponse, new l57(l57Var.a, l57Var.b, l57Var.c, l57Var.d, l57Var.e, l57Var.f, l57Var.g, l57Var.h, l57Var.i, l57Var.j, l57Var.k, l57Var.l, l57Var.m, l57Var.n, this.b));
                Object obj4 = mmr0Var.b;
                go1 go1VarA2 = go1.a(go1VarA, ((Number) obj4).longValue(), (ArrayList) null, (List) null, 61);
                boolean zIsEmpty = go1VarA2.c.isEmpty();
                mt1 mt1Var = xkr0Var.c;
                int i10 = !zIsEmpty ? mt1Var.a : mt1Var.b;
                if (!this.b || go1VarA2.d.size() >= i10 || ((YourLibraryResponse) mmr0Var.a).q().t() <= 0) {
                    return go1VarA2;
                }
                xkr0Var.f.l(obj4);
                return null;
            case 12:
                ven0 ven0Var = (ven0) this.e;
                doy0 doy0Var = (doy0) this.c;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    if (doy0Var instanceof coy0) {
                        ven0Var.setValue(Boolean.TRUE);
                        return d9nVar;
                    }
                    if (doy0Var instanceof aoy0) {
                        ven0Var.setValue(Boolean.FALSE);
                        return d9nVar;
                    }
                    if ((doy0Var instanceof zny0) || (doy0Var instanceof boy0)) {
                        res resVar = (res) this.d;
                        List list3 = (List) ((tob1) obj3).getValue();
                        this.c = null;
                        this.b = true;
                        return resVar.q(list3, this) == d9nVar2 ? d9nVar2 : d9nVar;
                    }
                    eg.o();
                } else {
                    if (z16) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 13:
                nx01 nx01Var = (nx01) this.c;
                mx01 mx01Var = (mx01) this.d;
                tqw tqwVar5 = (tqw) this.e;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    if (ox01.a[mx01Var.ordinal()] == 1) {
                        if (tqwVar5 == null) {
                            return d9nVar;
                        }
                        tv80 tv80VarY6 = n3o1.y(tqwVar5);
                        f1n0 f1n0Var2 = ((ud1) obj3).b;
                        String str11 = nx01Var.a;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return f1n0.f(f1n0Var2, str11, tv80VarY6, this) == d9nVar2 ? d9nVar2 : d9nVar;
                    }
                    eg.o();
                } else {
                    if (z17) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 14:
                ef71 ef71Var = (ef71) this.d;
                tqw tqwVar6 = (tqw) this.e;
                boolean z18 = this.b;
                if (z18) {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wb2Var = (wb2) this.c;
                    hm5.M(obj);
                    objP2 = obj;
                    vb2.b(wb2Var, new cb2(((Number) objP2).intValue()), true, tqwVar6 != null ? n3o1.y(tqwVar6) : null);
                    return d9nVar;
                }
                hm5.M(obj);
                if (!(ef71Var instanceof ef71)) {
                    eg.o();
                    return null;
                }
                rwj rwjVar = (rwj) obj3;
                wb2Var = (wb2) rwjVar.f;
                k7d k7dVar2 = (k7d) rwjVar.e;
                this.d = null;
                this.e = tqwVar6;
                this.c = wb2Var;
                this.b = true;
                objP2 = yah0.p(k7dVar2.b.a());
                if (objP2 == d9nVar2) {
                    return d9nVar2;
                }
                vb2.b(wb2Var, new cb2(((Number) objP2).intValue()), true, tqwVar6 != null ? n3o1.y(tqwVar6) : null);
                return d9nVar;
            case 15:
                yp71 yp71Var = (yp71) obj3;
                bpb1 bpb1Var = yp71Var.i;
                wp71 wp71Var = (wp71) this.c;
                rp71 rp71Var = (tp71) this.d;
                tqw tqwVar7 = (tqw) this.e;
                boolean z19 = this.b;
                try {
                    if (z19) {
                        if (!z19) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objE = obj;
                        t7q0Var = (t7q0) objE;
                        if (t7q0Var != null) {
                            Set set = s4b1.f;
                            strD = uic.x(wp71Var.getDestination()).D();
                            if (strD != null) {
                                throw new IllegalStateException("Navigation URI is not valid");
                            }
                            lzn0 lzn0Var2 = yp71Var.b;
                            if (tqwVar7 != null) {
                                tv80VarY2 = n3o1.y(tqwVar7);
                            } else {
                                tv80VarY2 = null;
                            }
                            pcf.a(lzn0Var2, strD, tv80VarY2, mno1.h(new mmr0[]{new mmr0("OnPlatformShareData", t7q0Var)}));
                        }
                        Boolean bool = Boolean.FALSE;
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, bool);
                        return d9nVar;
                    }
                    hm5.M(obj);
                    if (!(rp71Var instanceof pp71) && !(rp71Var instanceof sp71)) {
                        if (u890.j(rp71Var, qp71.a)) {
                            String strO = iro1.o(wp71Var.b());
                            jjz jjzVar = yp71Var.d;
                            Context context = yp71Var.a;
                            jjzVar.a(new xiz(new ejz(context.getString(2131953770)), new yiz(context.getString(2131953769, strO)), new ajz(context.getString(2131953768))), new qv61(yp71Var, (byte) 15), da71.Q0);
                            return d9nVar;
                        }
                        if (!(rp71Var instanceof rp71)) {
                            eg.o();
                            return null;
                        }
                        if (wp71Var.b().size() != 1) {
                            return d9nVar;
                        }
                        w4i1 w4i1Var = (w4i1) o7h.q0(wp71Var.b());
                        String strY = tqwVar7 != null ? n3o1.y(tqwVar7) : null;
                        za21 za21Var = rp71Var.a;
                        to71 to71Var = (to71) yp71Var.f.get();
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        yon1.C0();
                        to71Var.a(w4i1Var, strY, za21Var);
                        return d9nVar;
                    }
                    if (((Boolean) bpb1Var.getValue()).booleanValue()) {
                        return d9nVar;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool2);
                    this.c = wp71Var;
                    this.d = null;
                    this.e = tqwVar7;
                    this.b = true;
                    objE = yp71Var.e(wp71Var, this);
                    if (objE == d9nVar2) {
                        return d9nVar2;
                    }
                    t7q0Var = (t7q0) objE;
                    if (t7q0Var != null) {
                        Set set2 = s4b1.f;
                        strD = uic.x(wp71Var.getDestination()).D();
                        if (strD != null) {
                            throw new IllegalStateException("Navigation URI is not valid");
                        }
                        lzn0 lzn0Var3 = yp71Var.b;
                        if (tqwVar7 != null) {
                            tv80VarY2 = n3o1.y(tqwVar7);
                        } else {
                            tv80VarY2 = null;
                        }
                        pcf.a(lzn0Var3, strD, tv80VarY2, mno1.h(new mmr0[]{new mmr0("OnPlatformShareData", t7q0Var)}));
                    }
                    Boolean bool3 = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool3);
                    return d9nVar;
                } catch (Throwable th) {
                    Boolean bool4 = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool4);
                    throw th;
                }
            case 16:
                return e(obj);
            case 17:
                boolean z20 = this.b;
                i091 i091Var = (i091) this.c;
                String str12 = (String) this.d;
                hm5.M(obj);
                if (z20 && i091Var != null && u890.j(str12, (String) this.e)) {
                    lsm0 lsm0Var = i091Var.a;
                    if (!u890.j(lsm0Var != null ? lsm0Var.a : null, (String) obj3) || (!(ebp1.q(i091Var) || (i091Var.h instanceof j091)) || i091Var.g)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                c221 c221Var = (c221) this.c;
                boolean z21 = this.b;
                Map map2 = (Map) this.d;
                hm5.M(obj);
                o93 o93Var = (o93) this.e;
                String str13 = ((hti0) obj3).a;
                c221Var.getClass();
                return o93Var.e(str13, c221Var, z21, map2);
            default:
                rwg1 rwg1Var = (rwg1) this.c;
                qwg1 qwg1Var = (qwg1) this.d;
                tqw tqwVar8 = (tqw) this.e;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    if (u890.j(qwg1Var, qwg1.a)) {
                        fns fnsVar = igu.a;
                        bs50 bs50Var = pyf0.a;
                        ku91 ku91Var = new ku91((twg1) obj3, rwg1Var, tqwVar8, (lnm) null, (byte) 20);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return fn31.Y(bs50Var, ku91Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
                    }
                    eg.o();
                } else {
                    if (z22) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw0(xpw xpwVar, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.f = xpwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(xkr0 xkr0Var, boolean z, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 11;
        this.f = xkr0Var;
        this.b = z;
    }
}

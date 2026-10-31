package p;

import android.view.View;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rre1 extends hab0 implements xu30 {
    public static final rre1 N0;
    public static final rre1 O0;
    public static final rre1 P0;
    public static final rre1 Q0;
    public static final rre1 R0;
    public static final rre1 S0;
    public static final rre1 T0;
    public static final rre1 U0;
    public static final rre1 V0;
    public static final rre1 W0;
    public static final rre1 X;
    public static final rre1 X0;
    public static final rre1 Y;
    public static final rre1 Y0;
    public static final rre1 Z;
    public static final rre1 Z0;
    public static final rre1 a1;
    public static final rre1 b;
    public static final rre1 b1;
    public static final rre1 c;
    public static final rre1 d;
    public static final rre1 e;
    public static final rre1 f;
    public static final rre1 g;
    public static final rre1 h;
    public static final rre1 i;
    public static final rre1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new rre1(i2, (byte) 0);
        c = new rre1(i2, (byte) 1);
        d = new rre1(i2, (byte) 2);
        e = new rre1(i2, (byte) 3);
        f = new rre1(i2, (byte) 4);
        g = new rre1(i2, (byte) 5);
        h = new rre1(i2, (byte) 6);
        i = new rre1(i2, (byte) 7);
        t = new rre1(i2, (byte) 8);
        X = new rre1(i2, (byte) 9);
        Y = new rre1(i2, (byte) 10);
        Z = new rre1(i2, (byte) 11);
        N0 = new rre1(i2, (byte) 12);
        O0 = new rre1(i2, (byte) 13);
        P0 = new rre1(i2, (byte) 14);
        Q0 = new rre1(i2, (byte) 15);
        R0 = new rre1(i2, (byte) 16);
        S0 = new rre1(i2, (byte) 17);
        T0 = new rre1(i2, (byte) 18);
        U0 = new rre1(i2, (byte) 19);
        V0 = new rre1(i2, (byte) 20);
        W0 = new rre1(i2, (byte) 21);
        X0 = new rre1(i2, (byte) 22);
        Y0 = new rre1(i2, (byte) 23);
        Z0 = new rre1(i2, (byte) 24);
        a1 = new rre1(i2, (byte) 25);
        b1 = new rre1(i2, (byte) 26);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rre1(Object obj, byte b2) {
        super(3);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x045a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x045c  */
    /* JADX WARN: Code duplicated, block: B:193:0x047d  */
    /* JADX WARN: Code duplicated, block: B:285:0x048d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:? A[LOOP:1: B:191:0x0477->B:286:?, LOOP_END, SYNTHETIC] */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        ep20 ep20Var;
        String str2;
        ben benVar;
        String str3;
        String str4;
        String str5;
        mq70 mq70Var;
        up70 up70VarA;
        mq70 mq70Var2;
        List list;
        up70 up70Var;
        String str6;
        my7 my7Var;
        Object next;
        String str7;
        i08 i08Var;
        byte b2 = this.a;
        String str8 = "";
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        i08Var = null;
        i08Var = null;
        i08Var = null;
        i08Var = null;
        i08 i08Var2 = null;
        str = null;
        String str9 = null;
        switch (b2) {
            case 0:
                if (obj2 == null) {
                    return rih1Var;
                }
                bhn0.d();
                return null;
            case 1:
                uxk0 uxk0Var = (uxk0) obj;
                rte1 rte1Var = (rte1) obj2;
                ite1 ite1Var = (ite1) obj3;
                py9 py9Var = uxk0Var.b.c;
                y6h1 y6h1Var = uxk0Var.a;
                pje1 pje1Var = rte1Var.p;
                lte1 lte1Var = rte1Var.h;
                if (ite1Var.equals(gte1.a)) {
                    if ((lte1Var != null ? lte1Var.c : null) != null) {
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", lte1Var.c.a), new mmr0("share_id", "share-concert")})), x6h1VarC.a(), py9Var.b, System.currentTimeMillis());
                    } else {
                        oje1 oje1Var = pje1Var != null ? pje1Var.g : null;
                        if (oje1Var instanceof nje1) {
                            nje1 nje1Var = (nje1) oje1Var;
                            String str10 = nje1Var.a;
                            x6h1 x6h1VarC2 = y6h1Var.c();
                            x6h1VarC2.i.add(new a7h1("purchase_action_button", str10, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", nje1Var.b)), x6h1VarC2.a(), py9Var.b, System.currentTimeMillis());
                        } else if (oje1Var instanceof kje1) {
                            if (lte1Var == null || !lte1Var.e) {
                                x6h1 x6h1VarC3 = y6h1Var.c();
                                x6h1VarC3.i.add(new a7h1("curation_action_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC3.j = false;
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", ((kje1) oje1Var).a)), x6h1VarC3.a(), py9Var.b, System.currentTimeMillis());
                            } else {
                                x6h1 x6h1VarC4 = y6h1Var.c();
                                x6h1VarC4.i.add(new a7h1("curation_action_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC4.j = false;
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", ((kje1) oje1Var).a)), x6h1VarC4.a(), py9Var.b, System.currentTimeMillis());
                            }
                        } else if (u890.j(oje1Var, jje1.a)) {
                            x6h1 x6h1VarC5 = y6h1Var.c();
                            x6h1VarC5.i.add(new a7h1("cant_attend_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), py9Var.b, System.currentTimeMillis());
                        } else if (oje1Var instanceof mje1) {
                            x6h1 x6h1VarC6 = y6h1Var.c();
                            x6h1VarC6.i.add(new a7h1("not_interested_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC6.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", ((mje1) oje1Var).a)), x6h1VarC6.a(), py9Var.b, System.currentTimeMillis());
                        } else {
                            if (!(oje1Var instanceof lje1)) {
                                if (oje1Var == null) {
                                    return null;
                                }
                                eg.o();
                                return null;
                            }
                            x6h1 x6h1VarC7 = y6h1Var.c();
                            x6h1VarC7.i.add(new a7h1("navigation_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC7.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((lje1) oje1Var).a)), x6h1VarC7.a(), py9Var.b, System.currentTimeMillis());
                        }
                    }
                } else {
                    if (!ite1Var.equals(hte1.a)) {
                        eg.o();
                        return null;
                    }
                    if (pje1Var == null || (str = pje1Var.h) == null) {
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var.c();
                    x6h1VarC8.i.add(new a7h1("footer_navigation_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC8.a(), py9Var.b, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                uxk0 uxk0Var2 = (uxk0) obj;
                py9 py9Var2 = uxk0Var2.b.c;
                y6h1 y6h1Var2 = uxk0Var2.a;
                pje1 pje1Var2 = ((uue1) obj2).l;
                oje1 oje1Var2 = pje1Var2 != null ? pje1Var2.g : null;
                if (oje1Var2 instanceof nje1) {
                    nje1 nje1Var2 = (nje1) oje1Var2;
                    String str11 = nje1Var2.a;
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("purchase_action_button", str11, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", nje1Var2.b)), x6h1VarC9.a(), py9Var2.b, System.currentTimeMillis());
                } else {
                    if (!(oje1Var2 instanceof lje1)) {
                        return null;
                    }
                    x6h1 x6h1VarC10 = y6h1Var2.c();
                    x6h1VarC10.i.add(new a7h1("navigation_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((lje1) oje1Var2).a)), x6h1VarC10.a(), py9Var2.b, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 3:
                igf1 igf1Var = (igf1) obj2;
                igf1Var.getClass();
                return new xgf1((ygf1) obj, igf1Var);
            case 4:
                View view = (View) obj;
                hsl1 hsl1Var = (hsl1) obj2;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((uc80) obj3).d + hsl1Var.a.i(519).d);
                return hsl1Var;
            case 5:
                hll hllVar = (hll) obj2;
                a7q0 a7q0Var = (a7q0) obj3;
                return new oxf1((jo70) obj, hllVar != null ? hllVar.b : null, a7q0Var != null ? Long.valueOf(a7q0Var.c) : null);
            case 6:
                ((nzf1) obj).d.invoke(((mzf1) obj2).a);
                return rih1Var;
            case 7:
                return new ktl0((mtl0) obj, 1, Integer.valueOf(((Number) obj3).intValue()));
            case 8:
                View view2 = (View) obj;
                hsl1 hsl1Var2 = (hsl1) obj2;
                view2.setPadding(view2.getPaddingLeft(), ((uc80) obj3).b + hsl1Var2.a.i(519).b, view2.getPaddingRight(), view2.getPaddingBottom());
                return hsl1Var2;
            case 9:
                return null;
            case 10:
                return xyn1.r(69, (r6h1) obj3);
            case 11:
                xkk1 xkk1Var = (xkk1) obj2;
                qxc0 qxc0Var = (qxc0) obj3;
                String str12 = ((jo70) obj).a;
                if (ihc1.y0(str12)) {
                    String str13 = qxc0Var != null ? qxc0Var.a : null;
                    str12 = str13 != null ? str13 : "";
                }
                String strA = (qxc0Var == null || (benVar = qxc0Var.b) == null) ? null : benVar.a(1);
                o3r o3rVar = zsh1.a;
                if (strA != null) {
                    if (ihc1.y0(strA)) {
                        strA = null;
                    }
                    if (strA != null) {
                        str9 = strA;
                    } else if (xkk1Var != null) {
                        ep20Var = new ep20(z561.X(qmh1.d1, z561.V(f46.I(new mq70[]{xkk1Var.a, xkk1Var.f}))));
                        while (ep20Var.hasNext()) {
                            str2 = ((up70) ep20Var.next()).a.a;
                            if (!ihc1.y0(str2)) {
                                str9 = str2;
                            }
                        }
                    }
                } else if (xkk1Var != null) {
                    ep20Var = new ep20(z561.X(qmh1.d1, z561.V(f46.I(new mq70[]{xkk1Var.a, xkk1Var.f}))));
                    while (ep20Var.hasNext()) {
                        str2 = ((up70) ep20Var.next()).a.a;
                        if (!ihc1.y0(str2)) {
                            str9 = str2;
                        }
                    }
                }
                return new qmu0(str12, str9);
            case 12:
                avi1 avi1Var = (avi1) obj;
                String str14 = ((jo70) obj2).a;
                mq70 mq70Var3 = ((xkk1) obj3).a;
                up70 up70VarA2 = mq70Var3.a(vp70.c);
                up70 up70VarA3 = mq70Var3.a(vp70.e);
                if (up70VarA2 == null) {
                    up70VarA2 = up70VarA3;
                }
                if (up70VarA2 != null && (str4 = up70VarA2.a.a) != null) {
                    str8 = str4;
                }
                if (avi1Var == null || (str3 = avi1Var.a) == null) {
                    str3 = str14;
                }
                return new jvi1(str8, str3, str14, avi1Var != null ? avi1Var.a : null);
            case 13:
                View view3 = (View) obj;
                hsl1 hsl1Var3 = (hsl1) obj2;
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), ((uc80) obj3).d + hsl1Var3.a.i(519).d);
                return hsl1Var3;
            case 14:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                xkk1 xkk1Var3 = (xkk1) obj3;
                if (xkk1Var2 == null) {
                    xkk1Var2 = new xkk1((mq70) null, (mq70) null, (mq70) null, 63);
                }
                return new ggj1(jo70Var, xkk1Var2, xkk1Var3);
            case 15:
                long j = ((hjl) obj3).a;
                q5t0 q5t0VarH = ((afh0) obj2).H(hjl.b(j, 0, 0, 0, hjl.h(j) + 2, 7));
                return ((ifh0) obj).S(q5t0VarH.a, hjl.h(j), b7xVar, new oyc1(q5t0VarH, (byte) 5));
            case 16:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(1914790274);
                uwr uwrVar = cbx.a;
                qim0 qim0VarS = exd0.s((qim0) obj, new vfe1((byte) 9, cbx.a(x340Var).a.d));
                x340Var.r(false);
                return qim0VarS;
            case 17:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-612354878);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarS2 = exd0.s((qim0) obj, new vfe1((byte) 10, cbx.a(x340Var2).a.d));
                x340Var2.r(false);
                return qim0VarS2;
            case 18:
                jo70 jo70Var2 = (jo70) obj;
                xkk1 xkk1Var4 = (xkk1) obj2;
                ddz ddzVar = (ddz) obj3;
                if (xkk1Var4 == null) {
                    xkk1Var4 = new xkk1((mq70) null, (mq70) null, (mq70) null, 63);
                }
                return new d4k1(jo70Var2, xkk1Var4, ddzVar);
            case 19:
                View view4 = (View) obj;
                hsl1 hsl1Var4 = (hsl1) obj2;
                view4.setPadding(view4.getPaddingLeft(), hsl1Var4.a.i(519).b, view4.getPaddingRight(), view4.getPaddingBottom());
                return hsl1Var4;
            case 20:
                q5t0 q5t0VarH2 = ((afh0) obj2).H(((hjl) obj3).a);
                return ((ifh0) obj).S(q5t0VarH2.a, q5t0VarH2.b / 2, b7xVar, new oyc1(q5t0VarH2, (byte) 7));
            case 21:
                return rih1Var;
            case 22:
                if (obj2 == null) {
                    return rih1Var;
                }
                bhn0.d();
                return null;
            case 23:
                jo70 jo70Var3 = (jo70) obj;
                xkk1 xkk1Var5 = (xkk1) obj2;
                xkk1 xkk1Var6 = (xkk1) obj3;
                if (jo70Var3 == null) {
                    return r6g1.a;
                }
                sz6 sz6Var = (xkk1Var5 == null || (mq70Var2 = xkk1Var5.a) == null || (list = mq70Var2.a) == null || (up70Var = (up70) o7h.s0(list)) == null || (str6 = up70Var.a.a) == null) ? q17.c : new sz6(str6, u37.b);
                String str15 = (xkk1Var6 == null || (mq70Var = xkk1Var6.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null) ? null : up70VarA.a.a;
                io70 io70Var = jo70Var3.e;
                if (io70Var != null && (str5 = io70Var.a) != null) {
                    str8 = str5;
                }
                return new q6g1(new xn70(str8, str15, io70Var != null ? io70Var.b : null), new bv11(jo70Var3.a, (String) null, (Long) null, (Long) null, lqs0.d, 0, false, fg91.b, (h540) null, (vno1) null, (c380) null, sz6Var, false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67106670));
            case 24:
                ifh0 ifh0Var = (ifh0) obj;
                long j2 = ((hjl) obj3).a;
                q5t0 q5t0VarH3 = ((afh0) obj2).H(hjl.b(j2, 0, (jch0.U(ifh0Var.X0(ixm1.b)) * 2) + hjl.i(j2), 0, 0, 13));
                return ifh0Var.S(q5t0VarH3.a, q5t0VarH3.b, b7xVar, new oyc1(q5t0VarH3, (byte) 8));
            case 25:
                tqw tqwVar = (tqw) obj3;
                iu30 iu30Var = ((w0n1) obj).a;
                int iOrdinal = ((v0n1) obj2).ordinal();
                if (iOrdinal == 0) {
                    if (tqwVar == null) {
                        return rih1Var;
                    }
                    iu30Var.invoke(new d1n1("spotify:home?facet=music-following-chip", n3o1.y(tqwVar)));
                    return rih1Var;
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                if (tqwVar == null) {
                    return rih1Var;
                }
                iu30Var.invoke(new d1n1("spotify:home?facet=podcasts-following-chip", n3o1.y(tqwVar)));
                return rih1Var;
            case 26:
                v1n1 v1n1Var = (v1n1) obj;
                if (w1n1.a[((u1n1) obj2).ordinal()] == 1) {
                    v1n1Var.a.invoke(i1n1.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                n8h1 n8h1Var = (n8h1) obj;
                s70 s70Var = (s70) obj3;
                l70 l70Var = ((m70) obj2).c;
                if (!(s70Var instanceof q70)) {
                    if (s70Var instanceof r70) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                if (l70Var instanceof j70) {
                    pwl0 pwl0Var = (pwl0) n8h1Var;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), pwl0Var.a, pwl0Var.b.b, System.currentTimeMillis());
                }
                if (l70Var instanceof i70) {
                    return (w7h1) ((i70) l70Var).b.invoke(n8h1Var);
                }
                if (l70Var instanceof k70) {
                    return null;
                }
                eg.o();
                return null;
            case 28:
                d7u0 d7u0Var = (d7u0) obj;
                xkk1 xkk1Var7 = (xkk1) obj2;
                qtt0 qtt0Var = (qtt0) obj3;
                if (d7u0Var != null) {
                    Iterator it = d7u0Var.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            my7 my7Var2 = (my7) next;
                            if (!(my7Var2.a instanceof b58) || my7Var2.c == null) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    my7Var = (my7) next;
                } else {
                    my7Var = null;
                }
                if (my7Var == null) {
                    return new j08(xkk1Var7 != null ? y08.g(xkk1Var7) : null, qtt0Var, 2);
                }
                b58 b58Var = (b58) my7Var.a;
                z1u0 z1u0Var = my7Var.c;
                z1u0Var.getClass();
                return new j08(xkk1Var7 != null ? y08.g(xkk1Var7) : null, new i08("spotify-audio://".concat(b58Var.a), new h08(jfv.h(z1u0Var.a), jfv.h(z1u0Var.b))), qtt0Var);
            default:
                pjw0 pjw0Var = (pjw0) obj;
                xkk1 xkk1Var8 = (xkk1) obj2;
                qtt0 qtt0Var2 = (qtt0) obj3;
                njw0 njw0Var = pjw0Var != null ? pjw0Var.b : null;
                String strG = xkk1Var8 != null ? y08.g(xkk1Var8) : null;
                if (njw0Var instanceof ljw0) {
                    jo7 jo7Var = ((ljw0) njw0Var).a.a;
                    if (jo7Var.a.a.length() > 0) {
                        i08Var = new i08(jo7Var.a.a, null);
                        i08Var2 = i08Var;
                    }
                } else if (njw0Var instanceof mjw0) {
                    ko7 ko7Var = ((mjw0) njw0Var).a.c;
                    if (ko7Var != null && (str7 = ko7Var.a.a.a) != null) {
                        if (str7.length() <= 0) {
                            str7 = null;
                        }
                        if (str7 != null) {
                            i08Var = new i08(str7, null);
                            i08Var2 = i08Var;
                        }
                    }
                } else if (njw0Var != null) {
                    eg.o();
                    return null;
                }
                return new j08(strG, i08Var2, qtt0Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rre1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }
}

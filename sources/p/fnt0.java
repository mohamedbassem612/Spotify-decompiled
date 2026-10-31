package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fnt0 extends hab0 implements vu30 {
    public static final fnt0 N0;
    public static final fnt0 O0;
    public static final fnt0 P0;
    public static final fnt0 Q0;
    public static final fnt0 R0;
    public static final fnt0 S0;
    public static final fnt0 T0;
    public static final fnt0 U0;
    public static final fnt0 V0;
    public static final fnt0 W0;
    public static final fnt0 X;
    public static final fnt0 X0;
    public static final fnt0 Y;
    public static final fnt0 Y0;
    public static final fnt0 Z;
    public static final fnt0 Z0;
    public static final fnt0 a1;
    public static final fnt0 b;
    public static final fnt0 b1;
    public static final fnt0 c;
    public static final fnt0 c1;
    public static final fnt0 d;
    public static final fnt0 d1;
    public static final fnt0 e;
    public static final fnt0 e1;
    public static final fnt0 f;
    public static final fnt0 g;
    public static final fnt0 h;
    public static final fnt0 i;
    public static final fnt0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new fnt0(i2, (byte) 0);
        c = new fnt0(i2, (byte) 1);
        d = new fnt0(i2, (byte) 2);
        e = new fnt0(i2, (byte) 3);
        f = new fnt0(i2, (byte) 4);
        g = new fnt0(i2, (byte) 5);
        h = new fnt0(i2, (byte) 6);
        i = new fnt0(i2, (byte) 7);
        t = new fnt0(i2, (byte) 8);
        X = new fnt0(i2, (byte) 9);
        Y = new fnt0(i2, (byte) 10);
        Z = new fnt0(i2, (byte) 11);
        N0 = new fnt0(i2, (byte) 12);
        O0 = new fnt0(i2, (byte) 13);
        P0 = new fnt0(i2, (byte) 14);
        Q0 = new fnt0(i2, (byte) 15);
        R0 = new fnt0(i2, (byte) 16);
        S0 = new fnt0(i2, (byte) 17);
        T0 = new fnt0(i2, (byte) 18);
        U0 = new fnt0(i2, (byte) 19);
        V0 = new fnt0(i2, (byte) 20);
        W0 = new fnt0(i2, (byte) 21);
        X0 = new fnt0(i2, (byte) 22);
        Y0 = new fnt0(i2, (byte) 23);
        Z0 = new fnt0(i2, (byte) 24);
        a1 = new fnt0(i2, (byte) 25);
        b1 = new fnt0(i2, (byte) 26);
        c1 = new fnt0(i2, (byte) 27);
        d1 = new fnt0(i2, (byte) 28);
        e1 = new fnt0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fnt0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        mq70 mq70Var;
        up70 up70VarA;
        xkk1 xkk1Var;
        mq70 mq70Var2;
        up70 up70VarA2;
        Boolean boolValueOf;
        boolean z;
        String str;
        String strY0;
        List list;
        mq70 mq70Var3;
        up70 up70VarA3;
        i1r i1rVar;
        List list2;
        String str2;
        o940 o940Var;
        v740 v740Var;
        byte b2 = this.a;
        vp70 vp70Var = vp70.c;
        int i2 = 2;
        int i3 = 0;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        i1r i1rVar2 = null;
        switch (b2) {
            case 0:
                return ((rnt0) obj).d();
            case 1:
                return ((rnt0) obj).d();
            case 2:
                return ((rnt0) obj).d();
            case 3:
                return ((rnt0) obj).d();
            case 4:
                jot0 jot0Var = (jot0) obj2;
                return new iot0(((hot0) obj).c, jot0Var.a, jot0Var.b);
            case 5:
                kqt0 kqt0Var = (kqt0) obj;
                return new lqt0(kqt0Var.a, kqt0Var.b, ((jqt0) obj2).a, kqt0Var.c);
            case 6:
                return new tqt0((sqt0) obj, (iix0) obj2);
            case 7:
                lvt0 lvt0Var = (lvt0) obj;
                kvt0 kvt0Var = (kvt0) obj2;
                String str3 = kvt0Var.a;
                return str3 == null ? nvt0.a : new mvt0(lvt0Var.a, str3, lvt0Var.b, kvt0Var.b, lvt0Var.c);
            case 8:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                if (xkk1Var2 != null && (mq70Var = xkk1Var2.a) != null && (up70VarA = mq70Var.a(vp70Var)) != null) {
                    i1rVar2 = up70VarA.a.a;
                }
                return new kvt0(jo70Var.a, i1rVar2);
            case 9:
                mmr0 mmr0Var = (mmr0) obj2;
                Boolean bool = (Boolean) mmr0Var.a;
                int iOrdinal = ((ktl) mmr0Var.b).ordinal();
                if (iOrdinal != 1 && (iOrdinal == 2 || bool.booleanValue())) {
                    i2 = 1;
                }
                return new axt0(i2, obj);
            case 10:
                return new dxt0((cxt0) obj2, obj);
            case 11:
                mtl mtlVar = (mtl) obj2;
                return new ext0((Boolean) obj, mtlVar != null ? mtlVar.a : null);
            case 12:
                return new ecu0((uqo) obj, (String) ((PlayerState) obj2).contextMetadata().get("player.arch"));
            case 13:
                return Boolean.valueOf(u890.j(((PlayerState) obj).track().h(), ((PlayerState) obj2).track().h()));
            case 14:
                i1r i1rVar3 = (k1r) obj2;
                i1r i1rVar4 = ((jgu0) obj).b;
                if (i1rVar4.length() == 0) {
                    i1r i1rVar5 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                    if (i1rVar5 != null && (xkk1Var = (xkk1) i1rVar5.a) != null && (mq70Var2 = xkk1Var.a) != null && (up70VarA2 = mq70Var2.a(vp70.b)) != null) {
                        i1rVar2 = up70VarA2.a.a;
                    }
                    i1rVar4 = i1rVar2 != null ? i1rVar2 : "";
                }
                return new kgu0(i1rVar4);
            case 15:
                fhu0 fhu0Var = (fhu0) obj;
                p910 p910Var = (p910) obj2;
                String str4 = fhu0Var.a;
                String str5 = fhu0Var.b;
                CharSequence charSequence = fhu0Var.c;
                String str6 = fhu0Var.d;
                boolean z4 = p910Var.b;
                boolean z5 = p910Var.c && !z4p1.z(fhu0Var);
                String str7 = fhu0Var.e;
                d8r0 d8r0Var = fhu0Var.f;
                int i4 = p910Var.a;
                List list3 = fhu0Var.h;
                o940 o940Var2 = fhu0Var.l;
                return new ghu0(str4, str5, charSequence, str6, str7, d8r0Var, z4, z5, i4, list3, (o940Var2 != null ? o940Var2.b : null) == k940.b, !z4p1.z(fhu0Var));
            case 16:
                wju0 wju0Var = (wju0) obj;
                xju0 xju0Var = (xju0) obj2;
                String str8 = xju0Var.b;
                String strY1 = ihc1.Y0(wju0Var.b, '?');
                String str9 = wju0Var.a;
                if (u890.j(str9, xju0Var.a) && strY1.equals(str8)) {
                    return !u890.j(wju0Var.c, xju0Var.j) ? Next.h(xju0.a(xju0Var, (String) null, (Boolean) null, false, (String) null, (ArrayList) null, (Boolean) null, 0, (String) null, wju0Var.c, (vju0) null, (bku0) null, 3583)) : Next.j();
                }
                boolean zEquals = strY1.equals(str8);
                String str10 = wju0Var.a;
                String str11 = wju0Var.c;
                if (!zEquals) {
                    return Next.i(new xju0(xju0Var.h, 3452, str10, strY1, str11), Collections.singleton(new eju0(strY1)));
                }
                xju0 xju0VarA = xju0.a(xju0Var, str10, (Boolean) null, false, (String) null, (ArrayList) null, (Boolean) null, 0, (String) null, str11, (vju0) null, (bku0) null, 446);
                List list4 = xju0VarA.f;
                if (xju0VarA.d) {
                    List list5 = list4;
                    if ((list5 instanceof Collection) && list5.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = list5.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                            } else if (u890.j(((uju0) it.next()).a, str9)) {
                                z = true;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    boolValueOf = null;
                }
                if (u890.j(boolValueOf, Boolean.TRUE)) {
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i3 = -1;
                        } else if (!u890.j(((uju0) it2.next()).a, str9)) {
                            i3++;
                        }
                    }
                    if (i3 > 0) {
                        i1rVar2 = ((uju0) list4.get(i3 - 1)).b;
                    }
                }
                return Next.h(xju0.a(xju0VarA, (String) null, boolValueOf, false, (String) null, (ArrayList) null, (Boolean) null, 0, i1rVar2, (String) null, (vju0) null, (bku0) null, 3835));
            case 17:
                return First.c((xju0) obj2, Collections.singleton(new eju0(ihc1.Y0(((wju0) obj).b, '?'))));
            case 18:
                return new uqi0((List) obj, (qxc0) obj2);
            case 19:
                ynu0 ynu0Var = (ynu0) obj;
                zuc0 zuc0Var = ((cou0) obj2).a;
                fjf1 fjf1Var = zuc0Var.p;
                fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
                String str12 = zuc0Var.i;
                i1r i1rVarY0 = fjf1Var2 != null ? o7h.y0(fjf1Var2.b, (CharSequence) null, (String) null, (String) null, rku0.X0, 31) : null;
                return new aou0(new znu0(str12, i1rVarY0 != null ? i1rVarY0 : ""), fjf1Var2 != null ? fjf1Var2.a.a().a(1) : null, zuc0Var.d, zuc0Var.c, ynu0Var.a, ynu0Var.b);
            case 20:
                return new kou0(((jou0) obj).a, (String) obj2);
            case 21:
                ((Number) obj).intValue();
                return ((fji0) obj2).a.a;
            case 22:
                nqu0 nqu0Var = (nqu0) obj;
                i1r i1rVar6 = (k1r) obj2;
                String str13 = nqu0Var.a;
                boolean z6 = i1rVar6 instanceof i1r;
                i1r i1rVar7 = z6 ? i1rVar6 : null;
                pqu0 pqu0Var = i1rVar7 != null ? (pqu0) i1rVar7.a : null;
                jo70 jo70Var2 = pqu0Var != null ? pqu0Var.a : null;
                xkk1 xkk1Var3 = pqu0Var != null ? pqu0Var.b : null;
                hll hllVar = pqu0Var != null ? pqu0Var.c : null;
                if (jo70Var2 == null || (str2 = jo70Var2.a) == null) {
                    str = str13;
                } else {
                    if (ihc1.y0(str2)) {
                        str2 = str13;
                    }
                    str = str2;
                }
                if (jo70Var2 == null || (list2 = jo70Var2.d) == null) {
                    strY0 = null;
                } else {
                    List list6 = list2;
                    ArrayList arrayList = new ArrayList(q7h.U(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((ho70) it3.next()).a);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (!ihc1.y0((String) obj3)) {
                            arrayList2.add(obj3);
                        }
                    }
                    strY0 = o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                }
                String str14 = strY0 == null ? "" : strY0;
                if (xkk1Var3 != null && (mq70Var3 = xkk1Var3.a) != null && (up70VarA3 = mq70Var3.a(vp70Var)) != null && (i1rVar = up70VarA3.a.a) != null && !ihc1.y0(i1rVar)) {
                    i1rVar2 = i1rVar;
                }
                return new oqu0(nqu0Var.b, str13, str, str14, i1rVar2, !z6, (hllVar == null || (list = hllVar.b) == null || !list.contains(ell.b)) ? false : true);
            case 23:
                bsu0 bsu0Var = (bsu0) obj;
                d910 d910Var = (d910) obj2;
                boolean z7 = d910Var.a;
                if (d910Var.b && ((o940Var = bsu0Var.j) == null || !o940Var.a())) {
                    z3 = true;
                }
                return new fsu0(bsu0Var, z7, z3, bsu0Var.h);
            case 24:
                u2v0 u2v0Var = (u2v0) obj;
                g910 g910Var = (g910) obj2;
                return new v2v0(u2v0Var.a, u2v0Var.b, u2v0Var.c, u2v0Var.d, u2v0Var.e, u2v0Var.f, u2v0Var.g, u2v0Var.h, u2v0Var.i, g910Var.b, g910Var.a, g910Var.c, g910Var.d, g910Var.e, u2v0Var.m, u2v0Var.n, u2v0Var.o, u2v0Var.f16p, u2v0Var.q, u2v0Var.r, u2v0Var.s);
            case 25:
                String str15 = (String) obj;
                k1r k1rVar = (k1r) obj2;
                i1rVar2 = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                if (i1rVar2 != null && (v740Var = (v740) i1rVar2.a) != null && (!v740Var.a.isEmpty())) {
                    z2 = true;
                }
                return new ka10(str15, z2);
            case 26:
                return ((s4v0) obj).b;
            case 27:
                return ((t4v0) obj).b;
            case 28:
                return null;
            default:
                c7v0 c7v0Var = (c7v0) obj;
                return new b7v0(l4o1.U((ContextTrack) obj2) ? 1 : 2, c7v0Var.a, c7v0Var.b);
        }
    }
}

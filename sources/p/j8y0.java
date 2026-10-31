package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j8y0 extends hab0 implements vu30 {
    public static final j8y0 N0;
    public static final j8y0 O0;
    public static final j8y0 P0;
    public static final j8y0 Q0;
    public static final j8y0 R0;
    public static final j8y0 S0;
    public static final j8y0 T0;
    public static final j8y0 U0;
    public static final j8y0 V0;
    public static final j8y0 W0;
    public static final j8y0 X;
    public static final j8y0 X0;
    public static final j8y0 Y;
    public static final j8y0 Y0;
    public static final j8y0 Z;
    public static final j8y0 Z0;
    public static final j8y0 a1;
    public static final j8y0 b;
    public static final j8y0 b1;
    public static final j8y0 c;
    public static final j8y0 c1;
    public static final j8y0 d;
    public static final j8y0 d1;
    public static final j8y0 e;
    public static final j8y0 e1;
    public static final j8y0 f;
    public static final j8y0 g;
    public static final j8y0 h;
    public static final j8y0 i;
    public static final j8y0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new j8y0(i2, (byte) 0);
        c = new j8y0(i2, (byte) 1);
        d = new j8y0(i2, (byte) 2);
        e = new j8y0(i2, (byte) 3);
        f = new j8y0(i2, (byte) 4);
        g = new j8y0(i2, (byte) 5);
        h = new j8y0(i2, (byte) 6);
        i = new j8y0(i2, (byte) 7);
        t = new j8y0(i2, (byte) 8);
        X = new j8y0(i2, (byte) 9);
        Y = new j8y0(i2, (byte) 10);
        Z = new j8y0(i2, (byte) 11);
        N0 = new j8y0(i2, (byte) 12);
        O0 = new j8y0(i2, (byte) 13);
        P0 = new j8y0(i2, (byte) 14);
        Q0 = new j8y0(i2, (byte) 15);
        R0 = new j8y0(i2, (byte) 16);
        S0 = new j8y0(i2, (byte) 17);
        T0 = new j8y0(i2, (byte) 18);
        U0 = new j8y0(i2, (byte) 19);
        V0 = new j8y0(i2, (byte) 20);
        W0 = new j8y0(i2, (byte) 21);
        X0 = new j8y0(i2, (byte) 22);
        Y0 = new j8y0(i2, (byte) 23);
        Z0 = new j8y0(i2, (byte) 24);
        a1 = new j8y0(i2, (byte) 25);
        b1 = new j8y0(i2, (byte) 26);
        c1 = new j8y0(i2, (byte) 27);
        d1 = new j8y0(i2, (byte) 28);
        e1 = new j8y0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8y0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        lby0 lby0VarH;
        Set setSingleton;
        String str;
        mq70 mq70Var;
        List list;
        up70 up70Var;
        mq70 mq70Var2;
        List list2;
        up70 up70Var2;
        goj0 goj0VarA;
        byte b2 = this.a;
        String str2 = "";
        boolean z = false;
        rih1 rih1Var = rih1.a;
        String str3 = null;
        switch (b2) {
            case 0:
                d8y0 d8y0Var = (d8y0) obj;
                e8y0 e8y0Var = (e8y0) obj2;
                return new e8y0(e8y0Var.a, d8y0Var.a, d8y0Var.b, d8y0Var.c, e8y0Var.e, d8y0Var.d, d8y0Var.e, e8y0Var.h, e8y0Var.i);
            case 1:
                hwq hwqVar = (hwq) obj;
                qfd qfdVar = ((u8y0) obj2).a;
                return new t8y0(hwqVar, (qfdVar != null ? qfdVar.c : 0) == 3);
            case 2:
                return First.c((n9y0) obj2, Collections.singleton(new e9y0((a3y0) obj)));
            case 3:
                g9y0 g9y0Var = (i9y0) obj2;
                String str4 = ((n9y0) obj).a;
                if (g9y0Var instanceof g9y0) {
                    g9y0 g9y0Var2 = g9y0Var;
                    if (!u890.j(g9y0Var2.a, str4)) {
                        return Next.j();
                    }
                    h7y0 h7y0Var = g9y0Var2.b;
                    return Next.h(new n9y0(str4, new k9y0(new s9y0(h7y0Var.c, h7y0Var.e, h7y0Var.a, h7y0Var.b))));
                }
                if (g9y0Var instanceof f9y0) {
                    return u890.j(((f9y0) g9y0Var).a, str4) ? Next.h(new n9y0(str4, j9y0.a)) : Next.j();
                }
                if (g9y0Var.equals(h9y0.a)) {
                    return Next.i(new n9y0(str4, l9y0.a), Collections.singleton(new e9y0(new a3y0(str4))));
                }
                eg.o();
                return null;
            case 4:
                return Next.h((qay0) obj2);
            case 5:
                qay0 qay0Var = (qay0) obj2;
                return qay0Var.b instanceof nay0 ? First.c(qay0Var, Collections.singleton(new cay0(qay0Var.a))) : First.b(qay0Var);
            case 6:
                iby0 iby0Var = (iby0) obj;
                lby0 lby0Var = (mby0) obj2;
                int i2 = iby0Var.a;
                if (lby0Var instanceof lby0) {
                    lby0VarH = lby0.h(lby0Var, i2, (wkt) null, 14);
                } else if (lby0Var instanceof jby0) {
                    lby0VarH = jby0.h((jby0) lby0Var, i2, (wkt) null, 14);
                } else {
                    if (!(lby0Var instanceof kby0)) {
                        eg.o();
                        return null;
                    }
                    lby0VarH = kby0.h((kby0) lby0Var, iby0Var.a, null, null, 0, 1022);
                }
                return Next.h(lby0VarH);
            case 7:
                iby0 iby0Var2 = (iby0) obj;
                mby0 mby0Var = (mby0) obj2;
                if (mby0Var instanceof kby0) {
                    kby0 kby0Var = (kby0) mby0Var;
                    setSingleton = Collections.singleton(new yay0(kby0Var.i, kby0Var.t));
                } else {
                    setSingleton = Collections.singleton(new zay0(iby0Var2.c, iby0Var2.b));
                }
                return First.c(mby0Var, setSingleton);
            case 8:
                return new gby0(((Number) obj).intValue(), (w8d1) obj2);
            case 9:
                String str5 = ((ncy0) obj2).a;
                tcy0 tcy0Var = (tcy0) jhc1.t((Bundle) obj, "STATE_KEY_PromptedWorldSectionElement", tcy0.class);
                return tcy0Var == null ? new scy0(str5) : tcy0Var;
            case 10:
                return ((zby0) obj).c;
            case 11:
                ((Number) obj2).intValue();
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                return rih1Var;
            case 13:
                String str6 = (g3d0) obj;
                qxc0 qxc0Var = (qxc0) obj2;
                str3 = str6 instanceof b3d0 ? (b3d0) str6 : null;
                if (str3 == null) {
                    return Boolean.FALSE;
                }
                ArrayList arrayList = qxc0Var.Y;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof b3d0) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((b3d0) it.next()).b());
                }
                return Boolean.valueOf(!o7h.p1(arrayList3).contains(str3.b()));
            case 14:
                p1z0 p1z0Var = (p1z0) obj;
                t1z0 t1z0Var = (t1z0) obj2;
                if (p1z0Var.b && (t1z0Var instanceof r1z0)) {
                    t1z0Var = s1z0.a;
                }
                return new u1z0(p1z0Var.a, t1z0Var, p1z0Var.c, p1z0Var.d, p1z0Var.e, p1z0Var.h);
            case 15:
                b3z0 b3z0Var = (b3z0) obj;
                return Next.h(new p3z0(b3z0Var.a, b3z0Var.b, b3z0Var.c, b3z0Var.d, b3z0Var.e, b3z0Var.f, b3z0Var.g, ((p3z0) obj2).h));
            case 16:
                mmr0 mmr0Var = (mmr0) obj2;
                se10 se10Var = (se10) mmr0Var.a;
                boolean z2 = ((bbz0) mmr0Var.b).a;
                return new w6z0(z2, se10Var, z2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return kw21.a((kw21) obj, (String) obj2, null, null, 60);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return kw21.a((kw21) obj, null, null, (hlk0) obj2, 15);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return kw21.a((kw21) obj, null, (String) obj2, null, 51);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                z79 z79Var = (z79) obj2;
                return new gaz0(z79Var.a, z79Var.b, z79Var.c);
            case 22:
                return new iez0((bez0) obj2);
            case 23:
                return Next.j();
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                fiz0 fiz0Var = (fiz0) obj2;
                fiz0Var.getClass();
                return u890.j(fiz0Var.Y, nbe0.a) ? First.c(fiz0Var, Collections.singleton(new thz0(fiz0Var.a))) : First.b(fiz0Var);
            case 25:
                tiz0 tiz0Var = (tiz0) obj;
                i1r i1rVar = (k1r) obj2;
                if ((i1rVar instanceof i1r) && (str = ((siz0) i1rVar.a).a) != null) {
                    str2 = str;
                }
                return new uiz0(str2, tiz0Var.b, tiz0Var.c, tiz0Var.d);
            case 26:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                String str7 = jo70Var != null ? jo70Var.a : null;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                    str3 = up70Var.a.a;
                }
                return new ejz0(str7, str3);
            case 27:
                ekz0 ekz0Var = (ekz0) obj;
                i1r i1rVar2 = (k1r) obj2;
                String str8 = ekz0Var.a;
                if (!(i1rVar2 instanceof i1r)) {
                    return new fkz0(str8, "", (String) null);
                }
                String str9 = ekz0Var.b;
                return new fkz0(str8, str9 != null ? nhc1.W(str9, "{entityName}", ((dkz0) i1rVar2.a).a) : ((dkz0) i1rVar2.a).a, ((dkz0) i1rVar2.a).b);
            case 28:
                xkk1 xkk1Var2 = (xkk1) obj2;
                String str10 = ((jo70) obj).a;
                if (xkk1Var2 != null && (mq70Var2 = xkk1Var2.a) != null && (list2 = mq70Var2.a) != null && (up70Var2 = (up70) o7h.s0(list2)) != null) {
                    str3 = up70Var2.a.a;
                }
                return new dkz0(str10, str3);
            default:
                String str11 = ((ssz0) obj).a;
                hoj0 hoj0VarC = ((ioj0) obj2).c(r9v0.class, str11);
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && ((ez00) goj0VarA.a) != null) {
                    z = true;
                }
                return new tsz0(str11, z);
        }
    }
}

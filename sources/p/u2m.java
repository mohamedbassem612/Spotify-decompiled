package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u2m extends hab0 implements vu30 {
    public static final u2m N0;
    public static final u2m O0;
    public static final u2m P0;
    public static final u2m Q0;
    public static final u2m R0;
    public static final u2m S0;
    public static final u2m T0;
    public static final u2m U0;
    public static final u2m V0;
    public static final u2m W0;
    public static final u2m X;
    public static final u2m X0;
    public static final u2m Y;
    public static final u2m Y0;
    public static final u2m Z;
    public static final u2m Z0;
    public static final u2m a1;
    public static final u2m b;
    public static final u2m b1;
    public static final u2m c;
    public static final u2m c1;
    public static final u2m d;
    public static final u2m d1;
    public static final u2m e;
    public static final u2m e1;
    public static final u2m f;
    public static final u2m g;
    public static final u2m h;
    public static final u2m i;
    public static final u2m t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new u2m(i2, (byte) 0);
        c = new u2m(i2, (byte) 1);
        d = new u2m(i2, (byte) 2);
        e = new u2m(i2, (byte) 3);
        f = new u2m(i2, (byte) 4);
        g = new u2m(i2, (byte) 5);
        h = new u2m(i2, (byte) 6);
        i = new u2m(i2, (byte) 7);
        t = new u2m(i2, (byte) 8);
        X = new u2m(i2, (byte) 9);
        Y = new u2m(i2, (byte) 10);
        Z = new u2m(i2, (byte) 11);
        N0 = new u2m(i2, (byte) 12);
        O0 = new u2m(i2, (byte) 13);
        P0 = new u2m(i2, (byte) 14);
        Q0 = new u2m(i2, (byte) 15);
        R0 = new u2m(i2, (byte) 16);
        S0 = new u2m(i2, (byte) 17);
        T0 = new u2m(i2, (byte) 18);
        U0 = new u2m(i2, (byte) 19);
        V0 = new u2m(i2, (byte) 20);
        W0 = new u2m(i2, (byte) 21);
        X0 = new u2m(i2, (byte) 22);
        Y0 = new u2m(i2, (byte) 23);
        Z0 = new u2m(i2, (byte) 24);
        a1 = new u2m(i2, (byte) 25);
        b1 = new u2m(i2, (byte) 26);
        c1 = new u2m(i2, (byte) 27);
        d1 = new u2m(i2, (byte) 28);
        e1 = new u2m(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2m(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.ArrayList] */
    public final Object invoke(Object obj, Object obj2) {
        c9 c9VarF;
        String str;
        mq70 mq70Var;
        List list;
        up70 up70Var;
        String str2;
        mq70 mq70Var2;
        List list2;
        up70 up70Var2;
        ?? SingletonList;
        Map mapA;
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        boolean z = false;
        String str3 = null;
        switch (b2) {
            case 0:
                s2m s2mVar = (s2m) obj2;
                HashSet hashSetA = Effects.a(new c2m[]{w1m.a, y1m.a, x1m.a});
                String str4 = s2mVar.b;
                return str4.length() > 0 ? First.c(s2m.a(s2mVar, null, null, null, null, null, null, true, null, 895), dm61.x0(new a2m(str4, s2mVar.g), hashSetA)) : First.c(s2mVar, hashSetA);
            case 1:
                String str5 = ((l7m) obj).a;
                return Next.i(m7m.a((m7m) obj2, str5, null, 2), Collections.singleton(new x6m(str5)));
            case 2:
                String str6 = ((l7m) obj).a;
                return First.c(m7m.a((m7m) obj2, str6, null, 2), Collections.singleton(new x6m(str6)));
            case 3:
                return null;
            case 4:
                iun0 iun0Var = (iun0) obj2;
                String str7 = iun0Var.a;
                String str8 = iun0Var.b;
                String str9 = ihc1.y0(str8) ? null : str8;
                String str10 = iun0Var.c;
                return new pbm(str7, str9, ihc1.y0(str10) ? null : str10, iun0Var.d, iun0Var.e);
            case 5:
                jem jemVar = (jem) obj;
                hem hemVar = (hem) obj2;
                kjm kjmVar = hemVar.a;
                boolean z2 = kjmVar.c;
                if (z2) {
                    return new qem(jemVar.c);
                }
                if (z2) {
                    eg.o();
                    return null;
                }
                List list3 = hemVar.b;
                igm igmVar = kjmVar.a;
                if (list3 == null || (c9VarF = mqo1.F(list3)) == null) {
                    c9VarF = fg91.b;
                }
                return new pem(igmVar, c9VarF, hemVar.c, jemVar.c, jemVar.d, hemVar.d, new gu61(jemVar.a));
            case 6:
                jo70 jo70Var = (jo70) obj;
                uwz0 uwz0Var = (uwz0) obj2;
                str3 = jo70Var != null ? jo70Var.a : null;
                if (str3 == null) {
                    str3 = "";
                }
                return new aem(str3, !(uwz0Var instanceof swz0));
            case 7:
                lem lemVar = (lem) obj;
                return new rem(lemVar.b, ((ffm) obj2).a, lemVar.d);
            case 8:
                zkm zkmVar = (zkm) obj;
                zkm zkmVar2 = (zkm) obj2;
                if (u890.j(zkmVar.a, zkmVar2.a) && u890.j(zkmVar.b, zkmVar2.b) && zkmVar.d == zkmVar2.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return new umm((xmm) obj2, (zmm) obj);
            case 10:
                if (u890.j(((jh5) obj).a, hvm.a) && (obj2 instanceof trm)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                trm trmVar = (trm) obj;
                Set set = (Set) obj2;
                if ((trmVar instanceof prm) || (trmVar instanceof qrm) || (trmVar instanceof srm)) {
                    return set;
                }
                if (trmVar instanceof rrm) {
                    return w7xVar;
                }
                eg.o();
                return null;
            case 12:
                return ((trm) obj) instanceof srm ? (Set) obj2 : w7xVar;
            case 13:
                u890.j(((jh5) obj).a, jd0.l);
                return Boolean.FALSE;
            case 14:
                return ((((trm) obj) instanceof srm) && ((Set) obj2).contains(null)) ? Collections.singleton(null) : w7xVar;
            case 15:
                return Next.j();
            case 16:
                return (bsm) obj2;
            case 17:
                jo70 jo70Var2 = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                String str11 = jo70Var2.a;
                ho70 ho70Var = (ho70) o7h.s0(jo70Var2.d);
                String str12 = ho70Var != null ? ho70Var.a : null;
                up70 up70Var3 = (up70) o7h.s0(xkk1Var.a.a);
                return new zrm(str11, str12, up70Var3 != null ? up70Var3.a.a : null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new nsm(((Boolean) obj2).booleanValue());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                jo70 jo70Var3 = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                if (jo70Var3 == null || (str = jo70Var3.a) == null || str.length() == 0) {
                    str = null;
                }
                if (xkk1Var2 != null && (mq70Var = xkk1Var2.a) != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                    str3 = up70Var.a.a;
                }
                return new s2o(str, str3, false);
            case 20:
                jo70 jo70Var4 = (jo70) obj;
                xkk1 xkk1Var3 = (xkk1) obj2;
                if (jo70Var4 == null || (str2 = jo70Var4.a) == null || str2.length() == 0) {
                    str2 = null;
                }
                if (xkk1Var3 != null && (mq70Var2 = xkk1Var3.a) != null && (list2 = mq70Var2.a) != null && (up70Var2 = (up70) o7h.s0(list2)) != null) {
                    str3 = up70Var2.a.a;
                }
                return new gho0(str2, str3);
            case 21:
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a.toString()));
                }
                if (pla1Var instanceof qla1) {
                    return new j3r(((qla1) pla1Var).a);
                }
                eg.o();
                return null;
            case 22:
                prm prmVar = (trm) obj;
                Set set2 = (Set) obj2;
                if (prmVar instanceof prm) {
                    List list4 = prmVar.a;
                    SingletonList = new ArrayList(q7h.U(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        SingletonList.add(((tjn) it.next()).a);
                    }
                } else if (prmVar instanceof rrm) {
                    SingletonList = Collections.singletonList(((rrm) prmVar).a);
                } else {
                    if (!(prmVar instanceof qrm)) {
                        if (prmVar instanceof srm) {
                            throw null;
                        }
                        eg.o();
                        return null;
                    }
                    SingletonList = Collections.singletonList(((qrm) prmVar).a);
                }
                Iterable iterable = (Iterable) SingletonList;
                boolean z3 = iterable instanceof Collection;
                if (!z3 || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (((nvm) it2.next()) instanceof kvm) {
                            return set2;
                        }
                    }
                }
                if (z3 && ((Collection) iterable).isEmpty()) {
                    return w7xVar;
                }
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    if (((nvm) it3.next()) instanceof lvm) {
                        Set set3 = set2;
                        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                            Iterator it4 = set3.iterator();
                            if (it4.hasNext()) {
                                throw pze0.g(it4);
                            }
                        }
                    }
                }
                return w7xVar;
            case 23:
                return new rxm((jo70) obj, (k1r) obj2, (f7a1) null, (xkk1) null);
            case 24:
                return new u7h(u7h.j);
            case 25:
                x6n x6nVar = (x6n) obj;
                rla1 rla1Var = (rla1) obj2;
                if (rla1Var instanceof qla1) {
                    return new j3r(((qla1) rla1Var).a);
                }
                if (!(rla1Var instanceof pla1)) {
                    eg.o();
                    return null;
                }
                return new h3r(new d3r("Failed to observe " + x6nVar));
            case 26:
                return new g6g1((xkk1) obj, (pjw0) obj2);
            case 27:
                Object[] objArr = (Object[]) obj2;
                Logger.b((String) obj, Arrays.copyOf(objArr, objArr.length));
                return rih1.a;
            case 28:
                ykn yknVar = (ykn) obj;
                bln blnVar = (bln) obj2;
                boolean z4 = yknVar.c != null;
                t7q0 t7q0Var = yknVar.b;
                List list5 = yknVar.d;
                if (list5 != null) {
                    List list6 = list5;
                    int iS = zno1.s(q7h.U(list6, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    mapA = new LinkedHashMap(iS);
                    for (Object obj3 : list6) {
                        mapA.put(((w4i1) obj3).a, obj3);
                    }
                } else {
                    mapA = blnVar.a();
                }
                return Next.i(new zkn(yknVar.a, z6x.a, t7q0Var, z4, null, null, mapA, 1, w4i1.f, false, false), Effects.a(new okn[]{new mkn(yknVar.b.getUri())}));
            default:
                return (emn) obj2;
        }
    }
}

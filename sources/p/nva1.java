package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nva1 extends hab0 implements vu30 {
    public static final nva1 N0;
    public static final nva1 O0;
    public static final nva1 P0;
    public static final nva1 Q0;
    public static final nva1 R0;
    public static final nva1 S0;
    public static final nva1 T0;
    public static final nva1 U0;
    public static final nva1 V0;
    public static final nva1 W0;
    public static final nva1 X;
    public static final nva1 X0;
    public static final nva1 Y;
    public static final nva1 Y0;
    public static final nva1 Z;
    public static final nva1 Z0;
    public static final nva1 a1;
    public static final nva1 b;
    public static final nva1 b1;
    public static final nva1 c;
    public static final nva1 c1;
    public static final nva1 d;
    public static final nva1 d1;
    public static final nva1 e;
    public static final nva1 e1;
    public static final nva1 f;
    public static final nva1 g;
    public static final nva1 h;
    public static final nva1 i;
    public static final nva1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new nva1(i2, (byte) 0);
        c = new nva1(i2, (byte) 1);
        d = new nva1(i2, (byte) 2);
        e = new nva1(i2, (byte) 3);
        f = new nva1(i2, (byte) 4);
        g = new nva1(i2, (byte) 5);
        h = new nva1(i2, (byte) 6);
        i = new nva1(i2, (byte) 7);
        t = new nva1(i2, (byte) 8);
        X = new nva1(i2, (byte) 9);
        Y = new nva1(i2, (byte) 10);
        Z = new nva1(i2, (byte) 11);
        N0 = new nva1(i2, (byte) 12);
        O0 = new nva1(i2, (byte) 13);
        P0 = new nva1(i2, (byte) 14);
        Q0 = new nva1(i2, (byte) 15);
        R0 = new nva1(i2, (byte) 16);
        S0 = new nva1(i2, (byte) 17);
        T0 = new nva1(i2, (byte) 18);
        U0 = new nva1(i2, (byte) 19);
        V0 = new nva1(i2, (byte) 20);
        W0 = new nva1(i2, (byte) 21);
        X0 = new nva1(i2, (byte) 22);
        Y0 = new nva1(i2, (byte) 23);
        Z0 = new nva1(i2, (byte) 24);
        a1 = new nva1(i2, (byte) 25);
        b1 = new nva1(i2, (byte) 26);
        c1 = new nva1(i2, (byte) 27);
        d1 = new nva1(i2, (byte) 28);
        e1 = new nva1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nva1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0381  */
    /* JADX WARN: Code duplicated, block: B:194:0x047b  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        boolean z;
        Integer num;
        boolean z2;
        List list;
        Map map;
        List list2;
        boolean z3;
        Map map2;
        List list3;
        ahb1 ahb1VarL;
        Set setY;
        byte b2 = this.a;
        List list4 = z6x.a;
        fll fllVar = fll.c;
        switch (b2) {
            case 0:
                hua1 hua1Var = (hua1) obj2;
                String str = hua1Var.a;
                String str2 = hua1Var.b;
                return First.c(hua1Var, f46.S0(new era1[]{new vqa1(str, str2), new uqa1(str, str2, hua1Var.c)}));
            case 1:
                wwa1 wwa1Var = (wwa1) obj2;
                Float f2 = ((uwa1) obj).b;
                hll hllVar = wwa1Var.b;
                boolean zP = t2p1.p(wwa1Var.f);
                ro7 ro7Var = wwa1Var.c;
                if (ro7Var != null) {
                    i2 = 1;
                    z = false;
                    int iS = jch0.S(ro7Var.a * ((double) (f2 != null ? f2.floatValue() : 1.0f)));
                    Integer numValueOf = Integer.valueOf(iS);
                    if (iS <= 0) {
                        numValueOf = null;
                    }
                    num = numValueOf;
                } else {
                    i2 = 1;
                    z = false;
                    num = null;
                }
                int i3 = (f2 == null || f2.floatValue() <= 1.0f) ? 2 : i2;
                boolean z4 = wwa1Var.d == qtt0.c ? i2 : z;
                h2v h2vVar = wwa1Var.a;
                if (!((hllVar == null || (list2 = hllVar.d) == null) ? z : list2.contains(fllVar)) || zP) {
                    z2 = z;
                } else {
                    qxc0 qxc0Var = wwa1Var.e;
                    if (u890.j((qxc0Var == null || (map = qxc0Var.X) == null) ? null : (String) map.get("fully_cached_files_only"), "true")) {
                        z2 = z;
                    } else {
                        z2 = i2;
                    }
                }
                list = hllVar != null ? hllVar.b : null;
                if (list != null) {
                    list4 = list;
                }
                return new vwa1(num, i3, z4, z2, h2vVar, mqo1.A(list4));
            case 2:
                return new ywa1((qxc0) obj, (String) obj2);
            case 3:
                return new y0b1(((Number) obj2).intValue(), (x0b1) obj);
            case 4:
                return Long.valueOf(dqz0.b.k(((Number) obj).longValue(), ((Number) obj2).longValue()));
            case 5:
                return new ArrayList((Set) obj2);
            case 6:
                Boolean bool = (Boolean) obj2;
                return new ucb1((qxc0) obj, bool != null ? bool.booleanValue() : false);
            case 7:
                ndb1 ndb1Var = (ndb1) obj;
                pdb1 pdb1Var = (pdb1) obj2;
                hll hllVar2 = pdb1Var.b;
                boolean z5 = t2p1.p(pdb1Var.d) || pdb1Var.e;
                boolean z6 = ndb1Var.b;
                h2v h2vVar2 = pdb1Var.a;
                if (!((hllVar2 == null || (list3 = hllVar2.d) == null) ? false : list3.contains(fllVar)) || z5) {
                    z3 = false;
                } else {
                    qxc0 qxc0Var2 = pdb1Var.c;
                    if (u890.j((qxc0Var2 == null || (map2 = qxc0Var2.X) == null) ? null : (String) map2.get("fully_cached_files_only"), "true")) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                list = hllVar2 != null ? hllVar2.b : null;
                if (list != null) {
                    list4 = list;
                }
                return new odb1(z6, z3, h2vVar2, mqo1.A(list4));
            case 8:
                return new neb1((qxc0) obj, (vnb1) obj2);
            case 9:
                return new qeb1((qxc0) obj, (vnb1) obj2);
            case 10:
                return new ueb1((qxc0) obj, (vnb1) obj2);
            case 11:
                lfb1 lfb1Var = (lfb1) obj2;
                return new kfb1(lfb1Var.b, lfb1Var.a, ((jfb1) obj).b);
            case 12:
                xgb1 xgb1Var = (xgb1) obj;
                ahb1 ahb1Var = (bhb1) obj2;
                int i4 = xgb1Var.a;
                if (ahb1Var instanceof ahb1) {
                    ahb1VarL = ahb1.l(ahb1Var, i4, (wkt) null, 62);
                } else if (ahb1Var instanceof ygb1) {
                    ahb1VarL = ygb1.l((ygb1) ahb1Var, i4, (wkt) null, 62);
                } else {
                    if (!(ahb1Var instanceof zgb1)) {
                        eg.o();
                        return null;
                    }
                    ahb1VarL = zgb1.l((zgb1) ahb1Var, xgb1Var.a, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (ArrayList) null, 0, false, (cuu0) null, 32766);
                }
                if (ahb1Var instanceof zgb1) {
                    zgb1 zgb1Var = (zgb1) ahb1Var;
                    if (i4 != zgb1Var.a) {
                        setY = xyn1.y(zgb1Var, dxo1.w(i4));
                    } else {
                        setY = w7x.a;
                    }
                } else {
                    setY = w7x.a;
                }
                return Next.i(ahb1VarL, setY);
            case 13:
                zgb1 zgb1Var2 = (bhb1) obj2;
                if (zgb1Var2 instanceof zgb1) {
                    zgb1 zgb1Var3 = zgb1Var2;
                    return First.c(zgb1Var2, xyn1.y(zgb1Var3, dxo1.w(zgb1Var3.a)));
                }
                if (zgb1Var2 instanceof ygb1) {
                    return First.b(new ahb1(zgb1Var2.h(), zgb1Var2.g(), zgb1Var2.a(), zgb1Var2.j(), (wkt) null, zgb1Var2.b()));
                }
                if (zgb1Var2 instanceof ahb1) {
                    return First.b(zgb1Var2);
                }
                eg.o();
                return null;
            case 14:
                return new vgb1(((Number) obj).intValue(), (w8d1) obj2);
            case 15:
                return (rib1) obj2;
            case 16:
                return new u7h(((afx) obj).d.b);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                bwb1 bwb1Var = (bwb1) obj2;
                ewb1 ewb1Var = (ewb1) jhc1.t((Bundle) obj, "stickers-element-state-key", ewb1.class);
                return ewb1Var == null ? new ewb1(bwb1Var.a, (String) null, (String) null, (String) null, false, (cwb1) null, (iwb1) null, false, 510) : ewb1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (pyb1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                List list5 = ((nyb1) obj).a;
                ArrayList<rvb1> arrayList = new ArrayList();
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    r7h.W(((mwb1) it.next()).c, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (rvb1 rvb1Var : arrayList) {
                    String str3 = rvb1Var.a;
                    smc0 smc0VarN = k4p1.n();
                    smc0VarN.addAll(rvb1Var.g);
                    smc0VarN.addAll(rvb1Var.e);
                    fxb1 fxb1Var = rvb1Var.f;
                    fxb1 fxb1Var2 = fxb1Var instanceof fxb1 ? fxb1Var : null;
                    if (fxb1Var2 != null) {
                        smc0VarN.add(fxb1Var2.a);
                    }
                    arrayList2.add(new zwb1(str3, k4p1.k(smc0VarN)));
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (hashSet.add(((zwb1) obj3).a)) {
                        arrayList3.add(obj3);
                    }
                }
                return new ywb1(arrayList3);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                String str4 = (String) obj;
                qla1 qla1Var = (rla1) obj2;
                if (!(qla1Var instanceof pla1)) {
                    if (qla1Var instanceof qla1) {
                        ixb1 ixb1Var = (ixb1) qla1Var.a;
                        return new j3r(new pyb1(ixb1Var.a, ixb1Var.b, ixb1Var.c));
                    }
                    eg.o();
                    return null;
                }
                return new h3r(new d3r("Failed to fetch sticker for key " + str4 + ": " + ((pla1) qla1Var).a));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                myb1 myb1Var = (myb1) obj;
                qla1 qla1Var2 = (rla1) obj2;
                if (!(qla1Var2 instanceof pla1)) {
                    if (qla1Var2 instanceof qla1) {
                        nwb1 nwb1Var = (nwb1) qla1Var2.a;
                        return new j3r(new nyb1(nwb1Var.a, nwb1Var.b, nwb1Var.c));
                    }
                    eg.o();
                    return null;
                }
                return new h3r(new d3r("Failed to fetch stickers for key " + myb1Var + ": " + ((pla1) qla1Var2).a));
            case 22:
                mmr0 mmr0Var = (mmr0) obj2;
                return new azb1(((Boolean) mmr0Var.a).booleanValue(), (ub10) mmr0Var.b, ((zyb1) obj).b);
            case 23:
                q0c1 q0c1Var = (q0c1) obj2;
                long j = q0c1Var.a;
                long j2 = q0c1Var.b;
                long j3 = q0c1Var.c;
                long j4 = q0c1Var.d;
                return new n0c1((uqo) obj, new o0c1((j - j2) - j3, j4, j3 - j4, j2));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Next.j();
            case 25:
                return (ijc1) obj2;
            case 26:
                pze0.m(obj);
                return new ijc1();
            case 27:
                return new u7h(((afx) obj).b.a);
            case 28:
                return new u7h(((afx) obj).b.a);
            default:
                bsc1 bsc1Var = (bsc1) jhc1.t((Bundle) obj, "SubtitlesPageElementStateKey", bsc1.class);
                return bsc1Var == null ? new bsc1() : bsc1Var;
        }
    }
}

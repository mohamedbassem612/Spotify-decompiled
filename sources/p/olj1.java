package p;

import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class olj1 extends hab0 implements vu30 {
    public static final olj1 N0;
    public static final olj1 O0;
    public static final olj1 P0;
    public static final olj1 Q0;
    public static final olj1 R0;
    public static final olj1 S0;
    public static final olj1 T0;
    public static final olj1 U0;
    public static final olj1 V0;
    public static final olj1 W0;
    public static final olj1 X;
    public static final olj1 X0;
    public static final olj1 Y;
    public static final olj1 Y0;
    public static final olj1 Z;
    public static final olj1 Z0;
    public static final olj1 a1;
    public static final olj1 b;
    public static final olj1 b1;
    public static final olj1 c;
    public static final olj1 c1;
    public static final olj1 d;
    public static final olj1 d1;
    public static final olj1 e;
    public static final olj1 e1;
    public static final olj1 f;
    public static final olj1 g;
    public static final olj1 h;
    public static final olj1 i;
    public static final olj1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new olj1(i2, (byte) 0);
        c = new olj1(i2, (byte) 1);
        d = new olj1(i2, (byte) 2);
        e = new olj1(i2, (byte) 3);
        f = new olj1(i2, (byte) 4);
        g = new olj1(i2, (byte) 5);
        h = new olj1(i2, (byte) 6);
        i = new olj1(i2, (byte) 7);
        t = new olj1(i2, (byte) 8);
        X = new olj1(i2, (byte) 9);
        Y = new olj1(i2, (byte) 10);
        Z = new olj1(i2, (byte) 11);
        N0 = new olj1(i2, (byte) 12);
        O0 = new olj1(i2, (byte) 13);
        P0 = new olj1(i2, (byte) 14);
        Q0 = new olj1(i2, (byte) 15);
        R0 = new olj1(i2, (byte) 16);
        S0 = new olj1(i2, (byte) 17);
        T0 = new olj1(i2, (byte) 18);
        U0 = new olj1(i2, (byte) 19);
        V0 = new olj1(i2, (byte) 20);
        W0 = new olj1(i2, (byte) 21);
        X0 = new olj1(i2, (byte) 22);
        Y0 = new olj1(i2, (byte) 23);
        Z0 = new olj1(i2, (byte) 24);
        a1 = new olj1(i2, (byte) 25);
        b1 = new olj1(i2, (byte) 26);
        c1 = new olj1(i2, (byte) 27);
        d1 = new olj1(i2, (byte) 28);
        e1 = new olj1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ olj1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        Float fValueOf;
        fwk1 parcelable;
        switch (this.a) {
            case 0:
                qla1 qla1Var = (rla1) obj2;
                if (qla1Var instanceof pla1) {
                    return new h3r(new d3r(((pla1) qla1Var).a.toString()));
                }
                if (qla1Var instanceof qla1) {
                    return new j3r(qla1Var.a);
                }
                eg.o();
                return null;
            case 1:
                mmr0 mmr0Var = (mmr0) obj2;
                return new xpj1((String) mmr0Var.b, (Set) mmr0Var.a);
            case 2:
                return new bqj1((hll) obj, (String) obj2);
            case 3:
                return zso1.c0(((ofr0) obj).c, (op80) obj2);
            case 4:
                return ((tii0) obj).b;
            case 5:
                vnb1 vnb1Var = (vnb1) obj;
                qfd qfdVar = (qfd) obj2;
                if (vnb1Var == null || !vnb1Var.b) {
                    o3r o3rVar = wwj1.a;
                    if ((qfdVar != null ? qfdVar.c : 0) != 3) {
                        if (qfdVar != null) {
                            ArrayList arrayList = qfdVar.e;
                            Set set = wwj1.d;
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (set.contains((l131) it.next())) {
                                    }
                                }
                            }
                        }
                        return (qfdVar == null || !qfdVar.b) ? l6u.a : j6u.a;
                    }
                }
                return m6u.a;
            case 6:
                return new yxj1(((zxj1) obj2).a);
            case 7:
                return new nzj1((jo70) obj, (xkk1) obj2);
            case 8:
                e2v e2vVar = (h2v) obj;
                vxp0 vxp0Var = (vxp0) obj2;
                if (e2vVar == null || e2vVar.equals(d2v.a) || e2vVar.equals(g2v.a)) {
                    fValueOf = null;
                } else if (e2vVar.equals(f2v.a)) {
                    fValueOf = Float.valueOf(0.0f);
                } else if (e2vVar.equals(c2v.a)) {
                    fValueOf = Float.valueOf(1.0f);
                } else {
                    if (!(e2vVar instanceof e2v)) {
                        eg.o();
                        return null;
                    }
                    fValueOf = Float.valueOf(yoi1.o(e2vVar.a, 0.0f, 1.0f));
                }
                return new izu(fValueOf, vxp0Var != null ? new hzu(vxp0Var.a, vxp0Var.b, vxp0Var.c) : null);
            case 9:
                lg11 lg11Var = (lg11) obj;
                return new y0k1(lg11Var.a, lg11Var.m, lg11Var.n, lg11Var.o, false, false, false);
            case 10:
                long j = ((Offset) obj).a;
                ((Number) obj2).floatValue();
                return rih1.a;
            case 11:
                i3k1 i3k1Var = (i3k1) obj;
                String str = (String) obj2;
                return new h3k1(str.length() != 0 ? str : null, i3k1Var.c, i3k1Var.b);
            case 12:
                return First.c((e4k1) obj2, Collections.singleton(new u3k1((k3k1) obj)));
            case 13:
                return Next.h((s5k1) obj2);
            case 14:
                return new dak1(((cak1) obj).a);
            case 15:
                return new kak1(((jak1) obj).a);
            case 16:
                return new u7h(((afx) obj).b.e);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new u7h(((afx) obj).a.b.c());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new u7h(((afx) obj).c.e);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new u7h(((afx) obj).b.d);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new u7h(((afx) obj).b.d);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new u7h(((afx) obj).b.d);
            case 22:
                gek1 gek1Var = (gek1) obj;
                return new hek1(gek1Var.a, gek1Var.b, gek1Var.c, gek1Var.d, gek1Var.e, ((iek1) obj2).a, gek1Var.g, gek1Var.h);
            case 23:
                return new xjk1(obj, ((Boolean) obj2).booleanValue());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Next.j();
            case 25:
                return First.c((dnk1) obj2, Collections.singleton(nnk1.a));
            case 26:
                return ((iqk1) obj).g;
            case 27:
                return new ypk1(((xpk1) obj).a);
            case 28:
                bwk1 bwk1Var = (cwk1) obj;
                Bundle bundle = (Bundle) obj2;
                if (bundle != null && (parcelable = bundle.getParcelable("voting-model-v2-key")) != null) {
                    return parcelable;
                }
                if (bwk1Var instanceof bwk1) {
                    return bwk1Var.a;
                }
                if ((bwk1Var instanceof awk1) || (bwk1Var instanceof zvk1)) {
                    eg.m("unreachable");
                    return null;
                }
                eg.o();
                return null;
            default:
                return (eyk1) obj;
        }
    }
}

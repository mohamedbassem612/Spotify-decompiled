package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gbw0 extends hab0 implements vu30 {
    public static final gbw0 N0;
    public static final gbw0 O0;
    public static final gbw0 P0;
    public static final gbw0 Q0;
    public static final gbw0 R0;
    public static final gbw0 S0;
    public static final gbw0 T0;
    public static final gbw0 U0;
    public static final gbw0 V0;
    public static final gbw0 W0;
    public static final gbw0 X;
    public static final gbw0 X0;
    public static final gbw0 Y;
    public static final gbw0 Y0;
    public static final gbw0 Z;
    public static final gbw0 Z0;
    public static final gbw0 a1;
    public static final gbw0 b;
    public static final gbw0 b1;
    public static final gbw0 c;
    public static final gbw0 c1;
    public static final gbw0 d;
    public static final gbw0 d1;
    public static final gbw0 e;
    public static final gbw0 e1;
    public static final gbw0 f;
    public static final gbw0 g;
    public static final gbw0 h;
    public static final gbw0 i;
    public static final gbw0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new gbw0(i2, (byte) 0);
        c = new gbw0(i2, (byte) 1);
        d = new gbw0(i2, (byte) 2);
        e = new gbw0(i2, (byte) 3);
        f = new gbw0(i2, (byte) 4);
        g = new gbw0(i2, (byte) 5);
        h = new gbw0(i2, (byte) 6);
        i = new gbw0(i2, (byte) 7);
        t = new gbw0(i2, (byte) 8);
        X = new gbw0(i2, (byte) 9);
        Y = new gbw0(i2, (byte) 10);
        Z = new gbw0(i2, (byte) 11);
        N0 = new gbw0(i2, (byte) 12);
        O0 = new gbw0(i2, (byte) 13);
        P0 = new gbw0(i2, (byte) 14);
        Q0 = new gbw0(i2, (byte) 15);
        R0 = new gbw0(i2, (byte) 16);
        S0 = new gbw0(i2, (byte) 17);
        T0 = new gbw0(i2, (byte) 18);
        U0 = new gbw0(i2, (byte) 19);
        V0 = new gbw0(i2, (byte) 20);
        W0 = new gbw0(i2, (byte) 21);
        X0 = new gbw0(i2, (byte) 22);
        Y0 = new gbw0(i2, (byte) 23);
        Z0 = new gbw0(i2, (byte) 24);
        a1 = new gbw0(i2, (byte) 25);
        b1 = new gbw0(i2, (byte) 26);
        c1 = new gbw0(i2, (byte) 27);
        d1 = new gbw0(i2, (byte) 28);
        e1 = new gbw0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbw0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        z6x0 parcelable;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return ((rei0) obj).c;
            case 1:
                return ((sei0) obj).c;
            case 2:
                return ((rei0) obj).c;
            case 3:
                return ((sei0) obj).c;
            case 4:
                long j = ((yr80) obj).a;
                long j2 = ((yr80) obj2).a;
                return fiw0.b;
            case 5:
                return ((ukw0) obj).b;
            case 6:
                cpw0 cpw0Var = (cpw0) obj;
                dpw0 dpw0Var = (dpw0) obj2;
                boolean z2 = dpw0Var.d;
                l2r0 l2r0Var = cpw0Var.a;
                String str = cpw0Var.b;
                return z2 ? Next.h(dpw0.a(dpw0Var, false, l2r0Var, str, 9)) : Next.h(dpw0.a(dpw0Var, cpw0Var.c, l2r0Var, str, 8));
            case 7:
                c1x0 c1x0Var = (c1x0) obj;
                e1x0 e1x0Var = (e1x0) obj2;
                return new d1x0(e1x0Var.a, e1x0Var.b, e1x0Var.d, e1x0Var.c, c1x0Var.a, e1x0Var.e, c1x0Var.b);
            case 8:
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (parcelable = bundle.getParcelable("compose_profile_entity_model")) == null) ? new z6x0() : parcelable.b();
            case 9:
                ((Number) obj2).intValue();
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                return rih1Var;
            case 11:
                return new mmr0((vnb1) obj, (qp31) obj2);
            case 12:
                return new pgx0((iix0) obj, (hll) obj2);
            case 13:
                return new wgx0((vgx0) obj, (iix0) obj2);
            case 14:
                if (!u890.j(((jh5) obj).a, hjx0.a) || (!(obj2 instanceof qz) && !(obj2 instanceof rz))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                fvf1 fvf1Var = (fvf1) obj2;
                return new kjx0(fvf1Var.a, fvf1Var.b);
            case 16:
                return ((pmx0) obj).b;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((unx0) obj).b;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((rkw0) obj).b;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((skw0) obj).b;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new ipx0(((Boolean) obj2).booleanValue());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Intent intent = (Intent) obj;
                Set set = s4b1.f;
                return new hux0(4, uic.x(intent.getDataString()).i(2), null, wqn1.r("session_id", intent), wqn1.r("refinement_session_id", intent), false, u890.j(wqn1.r("has_completed_refinement", intent), "true"));
            case 22:
                hwx0 hwx0Var = (hwx0) obj2;
                bw91 bw91Var = hwx0Var.a;
                ArrayList arrayList = new ArrayList();
                ek60 ek60VarListIterator = bw91Var.listIterator();
                while (true) {
                    ek60 ek60Var = ek60VarListIterator;
                    if (ek60Var.hasNext()) {
                        fwx0 fwx0Var = (fwx0) ek60Var.next();
                        r7h.W(p7h.M(new String[]{fwx0Var.a, fwx0Var.b}), arrayList);
                    } else {
                        bw91 bw91Var2 = hwx0Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        ek60 ek60VarListIterator2 = bw91Var2.listIterator();
                        while (true) {
                            ek60 ek60Var2 = ek60VarListIterator2;
                            if (!ek60Var2.hasNext()) {
                                return p7h.M(new List[]{arrayList, arrayList2});
                            }
                            fwx0 fwx0Var2 = (fwx0) ek60Var2.next();
                            r7h.W(p7h.M(new String[]{fwx0Var2.a, fwx0Var2.b}), arrayList2);
                        }
                    }
                }
                break;
            case 23:
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new xah1((qxc0) obj, (String) obj2);
            case 25:
                return Next.h((c2y0) obj2);
            case 26:
                return ((s67) obj).f;
            case 27:
                return Next.h((z3y0) obj2);
            case 28:
                return new y6y0((cxc0) obj, ((x6y0) obj2).a);
            default:
                qla1 qla1Var = (rla1) obj2;
                if (qla1Var instanceof qla1) {
                    return new j3r(qla1Var.a);
                }
                if (qla1Var instanceof pla1) {
                    return new h3r(new d3r(((pla1) qla1Var).a.toString()));
                }
                eg.o();
                return null;
        }
    }
}

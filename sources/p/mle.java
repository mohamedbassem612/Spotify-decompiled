package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mle extends hab0 implements iu30 {
    public static final mle N0;
    public static final mle O0;
    public static final mle P0;
    public static final mle Q0;
    public static final mle R0;
    public static final mle S0;
    public static final mle T0;
    public static final mle U0;
    public static final mle V0;
    public static final mle W0;
    public static final mle X;
    public static final mle X0;
    public static final mle Y;
    public static final mle Y0;
    public static final mle Z;
    public static final mle Z0;
    public static final mle a1;
    public static final mle b;
    public static final mle b1;
    public static final mle c;
    public static final mle c1;
    public static final mle d;
    public static final mle d1;
    public static final mle e;
    public static final mle e1;
    public static final mle f;
    public static final mle g;
    public static final mle h;
    public static final mle i;
    public static final mle t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new mle(i2, (byte) 0);
        c = new mle(i2, (byte) 1);
        d = new mle(i2, (byte) 2);
        e = new mle(i2, (byte) 3);
        f = new mle(i2, (byte) 4);
        g = new mle(i2, (byte) 5);
        h = new mle(i2, (byte) 6);
        i = new mle(i2, (byte) 7);
        t = new mle(i2, (byte) 8);
        X = new mle(i2, (byte) 9);
        Y = new mle(i2, (byte) 10);
        Z = new mle(i2, (byte) 11);
        N0 = new mle(i2, (byte) 12);
        O0 = new mle(i2, (byte) 13);
        P0 = new mle(i2, (byte) 14);
        Q0 = new mle(i2, (byte) 15);
        R0 = new mle(i2, (byte) 16);
        S0 = new mle(i2, (byte) 17);
        T0 = new mle(i2, (byte) 18);
        U0 = new mle(i2, (byte) 19);
        V0 = new mle(i2, (byte) 20);
        W0 = new mle(i2, (byte) 21);
        X0 = new mle(i2, (byte) 22);
        Y0 = new mle(i2, (byte) 23);
        Z0 = new mle(i2, (byte) 24);
        a1 = new mle(i2, (byte) 25);
        b1 = new mle(i2, (byte) 26);
        c1 = new mle(i2, (byte) 27);
        d1 = new mle(i2, (byte) 28);
        e1 = new mle(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mle(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2 = "";
        boolean z = true;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(fno1.j((dxc0) obj));
            case 1:
                if (!(obj instanceof cob1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 3:
                uv11 uv11Var = (uv11) obj;
                String str3 = uv11Var.b;
                String str4 = uv11Var.d;
                return new noa0(str3, uv11Var.a, str4 != null ? str4 : "");
            case 4:
                cob1 cob1Var = (cob1) obj;
                if (cob1Var == null) {
                    return null;
                }
                int iOrdinal = cob1Var.ordinal();
                if (iOrdinal == 0) {
                    return rrt0.b;
                }
                if (iOrdinal == 1) {
                    return rrt0.c;
                }
                if (iOrdinal == 2) {
                    return rrt0.a;
                }
                eg.o();
                return null;
            case 5:
                return ((uv11) obj).a;
            case 6:
                return ((uv11) obj).a;
            case 7:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof jo70) {
                        arrayList.add(obj2);
                    }
                }
                jo70 jo70Var = (jo70) o7h.s0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof hll) {
                        arrayList2.add(obj3);
                    }
                }
                hll hllVar = (hll) o7h.s0(arrayList2);
                if (jo70Var == null) {
                    return r6g1.a;
                }
                io70 io70Var = jo70Var.e;
                if (io70Var != null && (str = io70Var.a) != null) {
                    str2 = str;
                }
                xn70 xn70Var = new xn70(str2, (String) null, 4, (String) null);
                String str5 = jo70Var.a;
                Long lValueOf = hllVar != null ? Long.valueOf(jfv.h(hllVar.a)) : null;
                List list2 = hllVar != null ? hllVar.b : null;
                if (list2 == null) {
                    list2 = z6x.a;
                }
                return new q6g1(xn70Var, new bv11(str5, (String) null, (Long) null, lValueOf, (u380) null, 0, false, mqo1.A(list2), (h540) null, (vno1) null, (c380) null, (boo1) null, false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67108726));
            case 8:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 10:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 12:
                return w7x.a;
            case 13:
                return aqb0.e((aqb0) obj, nim0.a);
            case 14:
                return new qvc0((String) obj, (c3d0) null, Collections.singleton(tqc0.a), (mqz0) null, 10);
            case 15:
                return (List) obj;
            case 16:
                return Boolean.valueOf(obj instanceof List);
            case 17:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (String) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (iix0) obj;
            case 20:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 22:
                ope opeVar = (ope) obj;
                return new ppe(opeVar.a, opeVar.b, opeVar.c, false);
            case 23:
                return Integer.valueOf(((Number) obj).intValue());
            case 24:
                return Integer.valueOf(((Number) obj).intValue());
            case 25:
                return Integer.valueOf(((Number) obj).intValue());
            case 26:
                return Integer.valueOf(-((Number) obj).intValue());
            case 27:
                b261.c((e261) obj);
                return rih1.a;
            case 28:
                return l1d.m("spotify:chat-pick-content:", ((jse) obj).a);
            default:
                return mno1.h(new mmr0[]{new mmr0("chat_details", (bve) obj)});
        }
    }
}

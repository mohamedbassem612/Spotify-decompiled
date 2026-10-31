package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rje extends hab0 implements iu30 {
    public static final rje N0;
    public static final rje O0;
    public static final rje P0;
    public static final rje Q0;
    public static final rje R0;
    public static final rje S0;
    public static final rje T0;
    public static final rje U0;
    public static final rje V0;
    public static final rje W0;
    public static final rje X;
    public static final rje X0;
    public static final rje Y;
    public static final rje Y0;
    public static final rje Z;
    public static final rje Z0;
    public static final rje a1;
    public static final rje b;
    public static final rje b1;
    public static final rje c;
    public static final rje c1;
    public static final rje d;
    public static final rje d1;
    public static final rje e;
    public static final rje e1;
    public static final rje f;
    public static final rje g;
    public static final rje h;
    public static final rje i;
    public static final rje t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rje(i2, (byte) 0);
        c = new rje(i2, (byte) 1);
        d = new rje(i2, (byte) 2);
        e = new rje(i2, (byte) 3);
        f = new rje(i2, (byte) 4);
        g = new rje(i2, (byte) 5);
        h = new rje(i2, (byte) 6);
        i = new rje(i2, (byte) 7);
        t = new rje(i2, (byte) 8);
        X = new rje(i2, (byte) 9);
        Y = new rje(i2, (byte) 10);
        Z = new rje(i2, (byte) 11);
        N0 = new rje(i2, (byte) 12);
        O0 = new rje(i2, (byte) 13);
        P0 = new rje(i2, (byte) 14);
        Q0 = new rje(i2, (byte) 15);
        R0 = new rje(i2, (byte) 16);
        S0 = new rje(i2, (byte) 17);
        T0 = new rje(i2, (byte) 18);
        U0 = new rje(i2, (byte) 19);
        V0 = new rje(i2, (byte) 20);
        W0 = new rje(i2, (byte) 21);
        X0 = new rje(i2, (byte) 22);
        Y0 = new rje(i2, (byte) 23);
        Z0 = new rje(i2, (byte) 24);
        a1 = new rje(i2, (byte) 25);
        b1 = new rje(i2, (byte) 26);
        c1 = new rje(i2, (byte) 27);
        d1 = new rje(i2, (byte) 28);
        e1 = new rje(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rje(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        mq70 mq70Var;
        List list;
        up70 up70Var;
        String str;
        r1f1 q1f1Var;
        String str2 = "";
        boolean z = true;
        String str3 = null;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof l631);
            case 1:
                if (obj != null) {
                    return (l631) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.audiobook.resumechapter.ResumeChapter");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof List);
            case 3:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 4:
                return new w2l0((i3l0) obj, "podcast/show/audiobook");
            case 5:
                return new w2l0((i3l0) obj, "podcast/show/audiobook");
            case 6:
                return new v0l0((i3l0) obj);
            case 7:
                return new w0l0((i3l0) obj);
            case 8:
                return (String) obj;
            case 9:
                return (iix0) obj;
            case 10:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 12:
                return ((uv11) obj).a;
            case 13:
                return ((uv11) obj).a;
            case 14:
                return ((uv11) obj).a;
            case 15:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof jo70) {
                        arrayList.add(obj2);
                    }
                }
                jo70 jo70Var = (jo70) o7h.s0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof xkk1) {
                        arrayList2.add(obj3);
                    }
                }
                xkk1 xkk1Var = (xkk1) o7h.s0(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof hll) {
                        arrayList3.add(obj4);
                    }
                }
                hll hllVar = (hll) o7h.s0(arrayList3);
                if (jo70Var == null) {
                    return r6g1.a;
                }
                io70 io70Var = jo70Var.e;
                if (io70Var != null && (str = io70Var.a) != null) {
                    str2 = str;
                }
                xn70 xn70Var = new xn70(str2, (String) null, 4, (String) null);
                String str4 = jo70Var.a;
                String str5 = jo70Var.c;
                List list3 = hllVar != null ? hllVar.b : null;
                if (list3 == null) {
                    list3 = z6x.a;
                }
                c380 c380VarA = mqo1.A(list3);
                if (xkk1Var != null && (mq70Var = xkk1Var.b) != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                    str3 = up70Var.a.a;
                }
                return new q6g1(xn70Var, new bv11(str4, str5, (Long) null, (Long) null, (u380) null, 0, false, c380VarA, (h540) null, (vno1) null, (c380) null, new sz6(str3, u37.a), false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67106652));
            case 16:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 20:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 22:
                n271 n271Var = (n271) obj;
                z771 z771Var = n271Var.a;
                int i2 = n271Var.b;
                q1f1 q1f1Var2 = n271Var.c;
                q1f1Var2.getClass();
                if (q1f1Var2 instanceof r1f1) {
                    q1f1Var = r1f1.a;
                } else if (q1f1Var2 instanceof p1f1) {
                    q1f1Var = p1f1.a;
                } else {
                    if (!(q1f1Var2 instanceof q1f1)) {
                        eg.o();
                        return null;
                    }
                    q1f1Var = new q1f1(q1f1Var2.a);
                }
                return new ale(z771Var, i2, q1f1Var);
            case 23:
                return (ale) obj;
            case 24:
                return new ile("", false);
            case 25:
                return ((hle) obj).a;
            case 26:
                return new gle(((jo70) obj).a);
            case 27:
                return Boolean.valueOf(obj instanceof jo70);
            case 28:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            default:
                return fno1.f((String) obj);
        }
    }
}

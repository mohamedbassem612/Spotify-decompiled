package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p761 extends hab0 implements iu30 {
    public static final p761 N0;
    public static final p761 O0;
    public static final p761 P0;
    public static final p761 Q0;
    public static final p761 R0;
    public static final p761 S0;
    public static final p761 T0;
    public static final p761 U0;
    public static final p761 V0;
    public static final p761 W0;
    public static final p761 X;
    public static final p761 X0;
    public static final p761 Y;
    public static final p761 Y0;
    public static final p761 Z;
    public static final p761 Z0;
    public static final p761 a1;
    public static final p761 b;
    public static final p761 b1;
    public static final p761 c;
    public static final p761 c1;
    public static final p761 d;
    public static final p761 d1;
    public static final p761 e;
    public static final p761 e1;
    public static final p761 f;
    public static final p761 g;
    public static final p761 h;
    public static final p761 i;
    public static final p761 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new p761(i2, (byte) 0);
        c = new p761(i2, (byte) 1);
        d = new p761(i2, (byte) 2);
        e = new p761(i2, (byte) 3);
        f = new p761(i2, (byte) 4);
        g = new p761(i2, (byte) 5);
        h = new p761(i2, (byte) 6);
        i = new p761(i2, (byte) 7);
        t = new p761(i2, (byte) 8);
        X = new p761(i2, (byte) 9);
        Y = new p761(i2, (byte) 10);
        Z = new p761(i2, (byte) 11);
        N0 = new p761(i2, (byte) 12);
        O0 = new p761(i2, (byte) 13);
        P0 = new p761(i2, (byte) 14);
        Q0 = new p761(i2, (byte) 15);
        R0 = new p761(i2, (byte) 16);
        S0 = new p761(i2, (byte) 17);
        T0 = new p761(i2, (byte) 18);
        U0 = new p761(i2, (byte) 19);
        V0 = new p761(i2, (byte) 20);
        W0 = new p761(i2, (byte) 21);
        X0 = new p761(i2, (byte) 22);
        Y0 = new p761(i2, (byte) 23);
        Z0 = new p761(i2, (byte) 24);
        a1 = new p761(i2, (byte) 25);
        b1 = new p761(i2, (byte) 26);
        c1 = new p761(i2, (byte) 27);
        d1 = new p761(i2, (byte) 28);
        e1 = new p761(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p761(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return (zc8) obj;
            case 1:
                return Boolean.valueOf(obj instanceof List);
            case 2:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 3:
                return new qvc0((String) obj, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 4:
                return new ih31((List) obj);
            case 5:
                return Boolean.valueOf(obj instanceof zc8);
            case 6:
                if (obj != null) {
                    return (zc8) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiobookspecifics.AudiobookSpecifics");
                return null;
            case 7:
                return new qvc0((String) obj, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 8:
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof i1r) {
                    Iterable iterable = (Iterable) i1rVar.a;
                    ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((pvc0) it.next()).c);
                    }
                    return new v761(arrayList);
                }
                if (i1rVar instanceof h1r) {
                    return x761.a;
                }
                if (i1rVar.equals(j1r.a)) {
                    return w761.a;
                }
                eg.o();
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof List);
            case 10:
                return (k1r) obj;
            case 11:
                String str = (String) obj;
                Double dA0 = nhc1.a0(str);
                if (dA0 == null) {
                    return str;
                }
                double dDoubleValue = dA0.doubleValue();
                long j = (long) dDoubleValue;
                return dDoubleValue == ((double) j) ? String.valueOf(j) : String.valueOf(dDoubleValue);
            case 12:
                return (String) obj;
            case 13:
                return (jo70) obj;
            case 14:
                return Boolean.valueOf(obj instanceof jo70);
            case 15:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 16:
                return new qvc0((String) obj, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 17:
                return (List) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof List);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 20:
                return new s460(2, 1006, ((o761) obj).a, (String) null, (String) null, (String) null, false);
            case 21:
                return nmb1.a;
            case 22:
                return Collections.singletonList(((j861) obj).a);
            case 23:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 25:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 27:
                return (String) obj;
            case 28:
                return (String) obj;
            default:
                r861 r861Var = (r861) obj;
                return new k761(r861Var.a, r861Var.b);
        }
    }
}

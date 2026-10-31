package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ket extends hab0 implements iu30 {
    public static final ket N0;
    public static final ket O0;
    public static final ket P0;
    public static final ket Q0;
    public static final ket R0;
    public static final ket S0;
    public static final ket T0;
    public static final ket U0;
    public static final ket V0;
    public static final ket W0;
    public static final ket X;
    public static final ket X0;
    public static final ket Y;
    public static final ket Y0;
    public static final ket Z;
    public static final ket Z0;
    public static final ket a1;
    public static final ket b;
    public static final ket b1;
    public static final ket c;
    public static final ket c1;
    public static final ket d;
    public static final ket d1;
    public static final ket e;
    public static final ket e1;
    public static final ket f;
    public static final ket g;
    public static final ket h;
    public static final ket i;
    public static final ket t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ket(i2, (byte) 0);
        c = new ket(i2, (byte) 1);
        d = new ket(i2, (byte) 2);
        e = new ket(i2, (byte) 3);
        f = new ket(i2, (byte) 4);
        g = new ket(i2, (byte) 5);
        h = new ket(i2, (byte) 6);
        i = new ket(i2, (byte) 7);
        t = new ket(i2, (byte) 8);
        X = new ket(i2, (byte) 9);
        Y = new ket(i2, (byte) 10);
        Z = new ket(i2, (byte) 11);
        N0 = new ket(i2, (byte) 12);
        O0 = new ket(i2, (byte) 13);
        P0 = new ket(i2, (byte) 14);
        Q0 = new ket(i2, (byte) 15);
        R0 = new ket(i2, (byte) 16);
        S0 = new ket(i2, (byte) 17);
        T0 = new ket(i2, (byte) 18);
        U0 = new ket(i2, (byte) 19);
        V0 = new ket(i2, (byte) 20);
        W0 = new ket(i2, (byte) 21);
        X0 = new ket(i2, (byte) 22);
        Y0 = new ket(i2, (byte) 23);
        Z0 = new ket(i2, (byte) 24);
        a1 = new ket(i2, (byte) 25);
        b1 = new ket(i2, (byte) 26);
        c1 = new ket(i2, (byte) 27);
        d1 = new ket(i2, (byte) 28);
        e1 = new ket(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ket(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        int i2 = 0;
        switch (this.a) {
            case 0:
                return (String) obj;
            case 1:
                return (pnt) obj;
            case 2:
                return (String) obj;
            case 3:
                return (iix0) obj;
            case 4:
                if (!(obj instanceof z070) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (z070) obj;
            case 6:
                if (!(obj instanceof mdz) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mdz) obj;
            case 8:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 10:
                if (!(obj instanceof pnt) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pnt) obj;
            case 12:
                return new tet("", false);
            case 13:
                return new ugc1(poo1.A((PlayerState) obj));
            case 14:
                y8e y8eVar = (y8e) obj;
                String str = y8eVar.a;
                String str2 = y8eVar.b;
                List list = y8eVar.c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    x8e x8eVar = (x8e) obj2;
                    arrayList.add(new d9e(i2, x8eVar.a, x8eVar.b));
                    i2 = i3;
                }
                return new w8e(str, str2, arrayList);
            case 15:
                return ((elt) obj).a;
            case 16:
                return ((jo70) obj).a;
            case 17:
                return Boolean.valueOf(obj instanceof jo70);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ArrayList<ilt> arrayList2 = ((klt) obj).h;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (ilt iltVar : arrayList2) {
                    arrayList3.add(new elt(iltVar.a, iltVar.b));
                }
                return arrayList3;
            case 20:
                return ((klt) obj).a;
            case 21:
                return ((klt) obj).a;
            case 22:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 24:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 26:
                return new s460(2, 974, ((h460) obj).b, (String) null, (String) null, (String) null, false);
            case 27:
                return w7x.a;
            case 28:
                return ((tlt) obj).a;
            default:
                return ((tlt) obj).a;
        }
    }
}

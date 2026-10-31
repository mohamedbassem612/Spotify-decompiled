package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pod1 extends hab0 implements iu30 {
    public static final pod1 N0;
    public static final pod1 O0;
    public static final pod1 P0;
    public static final pod1 Q0;
    public static final pod1 R0;
    public static final pod1 S0;
    public static final pod1 T0;
    public static final pod1 U0;
    public static final pod1 V0;
    public static final pod1 W0;
    public static final pod1 X;
    public static final pod1 X0;
    public static final pod1 Y;
    public static final pod1 Y0;
    public static final pod1 Z;
    public static final pod1 Z0;
    public static final pod1 a1;
    public static final pod1 b;
    public static final pod1 b1;
    public static final pod1 c;
    public static final pod1 c1;
    public static final pod1 d;
    public static final pod1 d1;
    public static final pod1 e;
    public static final pod1 e1;
    public static final pod1 f;
    public static final pod1 g;
    public static final pod1 h;
    public static final pod1 i;
    public static final pod1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new pod1(i2, (byte) 0);
        c = new pod1(i2, (byte) 1);
        d = new pod1(i2, (byte) 2);
        e = new pod1(i2, (byte) 3);
        f = new pod1(i2, (byte) 4);
        g = new pod1(i2, (byte) 5);
        h = new pod1(i2, (byte) 6);
        i = new pod1(i2, (byte) 7);
        t = new pod1(i2, (byte) 8);
        X = new pod1(i2, (byte) 9);
        Y = new pod1(i2, (byte) 10);
        Z = new pod1(i2, (byte) 11);
        N0 = new pod1(i2, (byte) 12);
        O0 = new pod1(i2, (byte) 13);
        P0 = new pod1(i2, (byte) 14);
        Q0 = new pod1(i2, (byte) 15);
        R0 = new pod1(i2, (byte) 16);
        S0 = new pod1(i2, (byte) 17);
        T0 = new pod1(i2, (byte) 18);
        U0 = new pod1(i2, (byte) 19);
        V0 = new pod1(i2, (byte) 20);
        W0 = new pod1(i2, (byte) 21);
        X0 = new pod1(i2, (byte) 22);
        Y0 = new pod1(i2, (byte) 23);
        Z0 = new pod1(i2, (byte) 24);
        a1 = new pod1(i2, (byte) 25);
        b1 = new pod1(i2, (byte) 26);
        c1 = new pod1(i2, (byte) 27);
        d1 = new pod1(i2, (byte) 28);
        e1 = new pod1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pod1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                woc wocVar = (woc) obj;
                if (wocVar instanceof uoc) {
                    return new kqc0(((uoc) wocVar).a);
                }
                if (wocVar.equals(voc.a)) {
                    return lqc0.a;
                }
                eg.o();
                return null;
            case 1:
                b261.d((e261) obj);
                return rih1Var;
            case 2:
                b261.d((e261) obj);
                return rih1Var;
            case 3:
                b261.d((e261) obj);
                return rih1Var;
            case 4:
                List list = (List) obj;
                return new mmr0(list.get(0), list.get(1));
            case 5:
                return ((jpd1) obj).a;
            case 6:
                return b7x.a;
            case 7:
                return (String) obj;
            case 8:
                return (String) obj;
            case 9:
                psd1 psd1Var = (psd1) obj;
                String str = psd1Var.d;
                return str == null ? psd1Var.e : str;
            case 10:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 12:
                return Boolean.valueOf(obj instanceof jo70);
            case 13:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 14:
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                return rih1Var;
            case 17:
                b261.c((e261) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b261.c((e261) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 21:
                return (String) obj;
            case 22:
                return (xkk1) obj;
            case 23:
                return vvd1.h((xa5) obj);
            case 24:
                return vvd1.h((xa5) obj);
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return mno1.h(new mmr0[]{new mmr0("teen_education_consent_checked", Boolean.valueOf(((shm0) obj).c))});
            case 27:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                b261.c((e261) obj);
                return rih1Var;
            default:
                b261.c((e261) obj);
                return rih1Var;
        }
    }
}

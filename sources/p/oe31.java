package p;

import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oe31 extends hab0 implements iu30 {
    public static final oe31 N0;
    public static final oe31 O0;
    public static final oe31 P0;
    public static final oe31 Q0;
    public static final oe31 R0;
    public static final oe31 S0;
    public static final oe31 T0;
    public static final oe31 U0;
    public static final oe31 V0;
    public static final oe31 W0;
    public static final oe31 X;
    public static final oe31 X0;
    public static final oe31 Y;
    public static final oe31 Y0;
    public static final oe31 Z;
    public static final oe31 Z0;
    public static final oe31 a1;
    public static final oe31 b;
    public static final oe31 b1;
    public static final oe31 c;
    public static final oe31 c1;
    public static final oe31 d;
    public static final oe31 d1;
    public static final oe31 e;
    public static final oe31 e1;
    public static final oe31 f;
    public static final oe31 g;
    public static final oe31 h;
    public static final oe31 i;
    public static final oe31 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new oe31(i2, (byte) 0);
        c = new oe31(i2, (byte) 1);
        d = new oe31(i2, (byte) 2);
        e = new oe31(i2, (byte) 3);
        f = new oe31(i2, (byte) 4);
        g = new oe31(i2, (byte) 5);
        h = new oe31(i2, (byte) 6);
        i = new oe31(i2, (byte) 7);
        t = new oe31(i2, (byte) 8);
        X = new oe31(i2, (byte) 9);
        Y = new oe31(i2, (byte) 10);
        Z = new oe31(i2, (byte) 11);
        N0 = new oe31(i2, (byte) 12);
        O0 = new oe31(i2, (byte) 13);
        P0 = new oe31(i2, (byte) 14);
        Q0 = new oe31(i2, (byte) 15);
        R0 = new oe31(i2, (byte) 16);
        S0 = new oe31(i2, (byte) 17);
        T0 = new oe31(i2, (byte) 18);
        U0 = new oe31(i2, (byte) 19);
        V0 = new oe31(i2, (byte) 20);
        W0 = new oe31(i2, (byte) 21);
        X0 = new oe31(i2, (byte) 22);
        Y0 = new oe31(i2, (byte) 23);
        Z0 = new oe31(i2, (byte) 24);
        a1 = new oe31(i2, (byte) 25);
        b1 = new oe31(i2, (byte) 26);
        c1 = new oe31(i2, (byte) 27);
        d1 = new oe31(i2, (byte) 28);
        e1 = new oe31(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe31(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof zc8);
            case 1:
                if (obj != null) {
                    return (zc8) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiobookspecifics.AudiobookSpecifics");
                return null;
            case 2:
                return f4i1.f("\u2068", (String) obj, "\u2069");
            case 3:
                return ((te31) obj).a;
            case 4:
                return ((se31) obj).a;
            case 5:
                return new uho(((ef31) obj).a, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254);
            case 6:
                return ((ef31) obj).a;
            case 7:
                return ((ef31) obj).a;
            case 8:
                return ((ef31) obj).a;
            case 9:
                return ((ef31) obj).a;
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
                if (!(obj instanceof myv0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (myv0) obj;
            case 14:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 16:
                return Boolean.valueOf(obj instanceof jo70);
            case 17:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return f6o1.A(s6x.a, new ViewGroup.LayoutParams(0, 0), (ScrollCardType) null, 2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((n761) obj).a;
            case 20:
                ((ji50) obj).b.put(rih1.class, new b7t0(new cdk1(d9x.a), jh31.b));
                return rih1Var;
            case 21:
                two1.v((dnc0) obj, new huz(Collections.singletonList(new h8k1(rih1Var, rih1Var)), (byte) 10), false, V0);
                return rih1Var;
            case 22:
                return RiveAnimation.s((byte[]) obj);
            case 23:
                return ((RiveAnimation) obj).toByteArray();
            case 24:
                return rih1Var;
            case 25:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) obj).byteValue() & 255)}, 1));
            case 26:
                return rih1Var;
            case 27:
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}

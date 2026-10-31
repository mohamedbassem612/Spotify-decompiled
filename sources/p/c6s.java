package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c6s extends hab0 implements iu30 {
    public static final c6s N0;
    public static final c6s O0;
    public static final c6s P0;
    public static final c6s Q0;
    public static final c6s R0;
    public static final c6s S0;
    public static final c6s T0;
    public static final c6s U0;
    public static final c6s V0;
    public static final c6s W0;
    public static final c6s X;
    public static final c6s X0;
    public static final c6s Y;
    public static final c6s Y0;
    public static final c6s Z;
    public static final c6s Z0;
    public static final c6s a1;
    public static final c6s b;
    public static final c6s b1;
    public static final c6s c;
    public static final c6s c1;
    public static final c6s d;
    public static final c6s d1;
    public static final c6s e;
    public static final c6s e1;
    public static final c6s f;
    public static final c6s g;
    public static final c6s h;
    public static final c6s i;
    public static final c6s t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new c6s(i2, (byte) 0);
        c = new c6s(i2, (byte) 1);
        d = new c6s(i2, (byte) 2);
        e = new c6s(i2, (byte) 3);
        f = new c6s(i2, (byte) 4);
        g = new c6s(i2, (byte) 5);
        h = new c6s(i2, (byte) 6);
        i = new c6s(i2, (byte) 7);
        t = new c6s(i2, (byte) 8);
        X = new c6s(i2, (byte) 9);
        Y = new c6s(i2, (byte) 10);
        Z = new c6s(i2, (byte) 11);
        N0 = new c6s(i2, (byte) 12);
        O0 = new c6s(i2, (byte) 13);
        P0 = new c6s(i2, (byte) 14);
        Q0 = new c6s(i2, (byte) 15);
        R0 = new c6s(i2, (byte) 16);
        S0 = new c6s(i2, (byte) 17);
        T0 = new c6s(i2, (byte) 18);
        U0 = new c6s(i2, (byte) 19);
        V0 = new c6s(i2, (byte) 20);
        W0 = new c6s(i2, (byte) 21);
        X0 = new c6s(i2, (byte) 22);
        Y0 = new c6s(i2, (byte) 23);
        Z0 = new c6s(i2, (byte) 24);
        a1 = new c6s(i2, (byte) 25);
        b1 = new c6s(i2, (byte) 26);
        c1 = new c6s(i2, (byte) 27);
        d1 = new c6s(i2, (byte) 28);
        e1 = new c6s(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6s(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return rih1Var;
            case 2:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 3:
                uhj0 parcelable = ((Bundle) obj).getParcelable("webviewElementState");
                return parcelable != null ? uhj0.a(parcelable, (MessageResponseToken) null, (iwq) null, (String) null, true, false, (yhj0) null, false, (shj0) null, (Bundle) null, 503) : new uhj0();
            case 4:
                return rih1Var;
            case 5:
                return new c7v0(1, ((Boolean) obj).booleanValue());
            case 6:
                return new lo51(((Boolean) obj).booleanValue());
            case 7:
                return new sl1(true);
            case 8:
                return new sl1(true);
            case 9:
                return new k68((String) obj);
            case 10:
                return new euy(false);
            case 11:
                return new xsy((String) obj, false);
            case 12:
                return new jhl0((khl0) obj, (byte) 3);
            case 13:
                return new jhl0((khl0) obj, (byte) 1);
            case 14:
                return new jhl0((khl0) obj, (byte) 4);
            case 15:
                return new jhl0((khl0) obj, (byte) 2);
            case 16:
                return new jhl0((khl0) obj, (byte) 0);
            case 17:
                return new om51(false);
            case 18:
                return new lo51(((Boolean) obj).booleanValue());
            case 19:
                return new gom0(z6x.a, b7x.a);
            case 20:
                return new zom0(7);
            case 21:
                return ((ho70) obj).a;
            case 22:
                return l4o1.b0((ContextTrack) obj);
            case 23:
                return rih1Var;
            case 24:
                return w2t0.a;
            case 25:
                Map.Entry entry = (Map.Entry) obj;
                return xcg1.i((String) entry.getKey(), ": ", ((l650) entry.getValue()).name().toLowerCase(Locale.ROOT));
            case 26:
                return ((bzn) obj).a;
            case 27:
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return rih1Var;
            default:
                return pc21.a;
        }
    }
}

package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rs11 extends hab0 implements vu30 {
    public static final rs11 N0;
    public static final rs11 O0;
    public static final rs11 P0;
    public static final rs11 Q0;
    public static final rs11 R0;
    public static final rs11 S0;
    public static final rs11 T0;
    public static final rs11 U0;
    public static final rs11 V0;
    public static final rs11 W0;
    public static final rs11 X;
    public static final rs11 X0;
    public static final rs11 Y;
    public static final rs11 Y0;
    public static final rs11 Z;
    public static final rs11 Z0;
    public static final rs11 a1;
    public static final rs11 b;
    public static final rs11 b1;
    public static final rs11 c;
    public static final rs11 c1;
    public static final rs11 d;
    public static final rs11 d1;
    public static final rs11 e;
    public static final rs11 e1;
    public static final rs11 f;
    public static final rs11 g;
    public static final rs11 h;
    public static final rs11 i;
    public static final rs11 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new rs11(i2, (byte) 0);
        c = new rs11(i2, (byte) 1);
        d = new rs11(i2, (byte) 2);
        e = new rs11(i2, (byte) 3);
        f = new rs11(i2, (byte) 4);
        g = new rs11(i2, (byte) 5);
        h = new rs11(i2, (byte) 6);
        i = new rs11(i2, (byte) 7);
        t = new rs11(i2, (byte) 8);
        X = new rs11(i2, (byte) 9);
        Y = new rs11(i2, (byte) 10);
        Z = new rs11(i2, (byte) 11);
        N0 = new rs11(i2, (byte) 12);
        O0 = new rs11(i2, (byte) 13);
        P0 = new rs11(i2, (byte) 14);
        Q0 = new rs11(i2, (byte) 15);
        R0 = new rs11(i2, (byte) 16);
        S0 = new rs11(i2, (byte) 17);
        T0 = new rs11(i2, (byte) 18);
        U0 = new rs11(i2, (byte) 19);
        V0 = new rs11(i2, (byte) 20);
        W0 = new rs11(i2, (byte) 21);
        X0 = new rs11(i2, (byte) 22);
        Y0 = new rs11(i2, (byte) 23);
        Z0 = new rs11(i2, (byte) 24);
        a1 = new rs11(i2, (byte) 25);
        b1 = new rs11(i2, (byte) 26);
        c1 = new rs11(i2, (byte) 27);
        d1 = new rs11(i2, (byte) 28);
        e1 = new rs11(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs11(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        yi21 yi21Var;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                Logger.l((Throwable) obj2, "Failure from createGeneration endpoint", new Object[0]);
                return new twk((gmc1) obj);
            case 12:
                o621 o621Var = (o621) obj2;
                ContextTrack contextTrack = o621Var.a;
                String strUri = contextTrack.uri();
                boolean z = Boolean.parseBoolean((String) contextTrack.metadata().get("collection.can_ban"));
                boolean z2 = Boolean.parseBoolean((String) contextTrack.metadata().get("collection.is_banned"));
                Boolean bool = o621Var.b;
                return new q621(strUri, z, z2, bool != null ? bool.booleanValue() : l4o1.J(contextTrack), o621Var.c.c, o621Var.d);
            case 13:
                return new e721(((d721) obj).b, (f721) obj2);
            case 14:
                w821 w821Var = (w821) obj;
                return Next.h(new x821(w821Var.a, w821Var.b, w821Var.c, w821Var.d, false, false, w821Var.e, w821Var.f));
            case 15:
                return new ia21(((ctr0) obj).b.a, false);
            case 16:
                n511 n511Var = (n511) obj;
                float f2 = n511Var.b;
                float f3 = n511Var.d;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((n511) obj2).f() & 4294967295L));
                return Boolean.valueOf(fIntBitsToFloat >= f2 && fIntBitsToFloat < f3);
            case 17:
                n511 n511Var2 = (n511) obj;
                float f4 = n511Var2.a;
                float f5 = n511Var2.c;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((n511) obj2).f() >> 32));
                return Boolean.valueOf(fIntBitsToFloat2 >= f4 && fIntBitsToFloat2 < f5);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new xf21(((Bundle) obj).getBoolean("markLaterAsUnplayed"));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                mh21 mh21Var = (mh21) obj;
                return Next.i(qh21.a((qh21) obj2, false, true, new oh21(mh21Var.b, mh21Var.c, mh21Var.d), 1), Collections.singleton(new kg21(mh21Var.a)));
            case 20:
                mh21 mh21Var2 = (mh21) obj;
                qh21 qh21Var = (qh21) obj2;
                qh21Var.getClass();
                return First.c(qh21.a(qh21Var, false, true, new oh21(mh21Var2.b, mh21Var2.c, mh21Var2.d), 1), Collections.singleton(new kg21(mh21Var2.a)));
            case 21:
                mmr0 mmr0Var = (mmr0) obj;
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (yi21Var = (yi21) bundle.getParcelable("report_a_problem_model")) == null) ? new yi21((String) mmr0Var.a, (String) mmr0Var.b, qqw0.a, "", true, false, o7a.a, "https://contentreporting.spotify.com/mobile/content-policy", xr10.a, false) : yi21Var;
            case 22:
                return new dr21((j6k) obj, (lhe0) obj2);
            case 23:
                return new u7h(u7h.b);
            case 24:
                return Boolean.valueOf(((vr21) obj2).a);
            case 25:
                ka31 ka31Var = (ka31) obj;
                Bundle bundle2 = (Bundle) obj2;
                if (bundle2 != null) {
                    if (ka31Var instanceof ja31) {
                        return ja31.a((ja31) ka31Var, bundle2.getBoolean("isAudioMuted"));
                    }
                    if (!(ka31Var instanceof ia31)) {
                        eg.o();
                        return null;
                    }
                }
                return ka31Var;
            case 26:
                return null;
            case 27:
                return rih1.a;
            case 28:
                return null;
            default:
                return null;
        }
    }
}

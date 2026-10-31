package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.PlayerState;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vc40 extends hab0 implements iu30 {
    public static final vc40 N0;
    public static final vc40 O0;
    public static final vc40 P0;
    public static final vc40 Q0;
    public static final vc40 R0;
    public static final vc40 S0;
    public static final vc40 T0;
    public static final vc40 U0;
    public static final vc40 V0;
    public static final vc40 W0;
    public static final vc40 X;
    public static final vc40 X0;
    public static final vc40 Y;
    public static final vc40 Y0;
    public static final vc40 Z;
    public static final vc40 Z0;
    public static final vc40 a1;
    public static final vc40 b;
    public static final vc40 b1;
    public static final vc40 c;
    public static final vc40 c1;
    public static final vc40 d;
    public static final vc40 d1;
    public static final vc40 e;
    public static final vc40 e1;
    public static final vc40 f;
    public static final vc40 g;
    public static final vc40 h;
    public static final vc40 i;
    public static final vc40 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new vc40(i2, (byte) 0);
        c = new vc40(i2, (byte) 1);
        d = new vc40(i2, (byte) 2);
        e = new vc40(i2, (byte) 3);
        f = new vc40(i2, (byte) 4);
        g = new vc40(i2, (byte) 5);
        h = new vc40(i2, (byte) 6);
        i = new vc40(i2, (byte) 7);
        t = new vc40(i2, (byte) 8);
        X = new vc40(i2, (byte) 9);
        Y = new vc40(i2, (byte) 10);
        Z = new vc40(i2, (byte) 11);
        N0 = new vc40(i2, (byte) 12);
        O0 = new vc40(i2, (byte) 13);
        P0 = new vc40(i2, (byte) 14);
        Q0 = new vc40(i2, (byte) 15);
        R0 = new vc40(i2, (byte) 16);
        S0 = new vc40(i2, (byte) 17);
        T0 = new vc40(i2, (byte) 18);
        U0 = new vc40(i2, (byte) 19);
        V0 = new vc40(i2, (byte) 20);
        W0 = new vc40(i2, (byte) 21);
        X0 = new vc40(i2, (byte) 22);
        Y0 = new vc40(i2, (byte) 23);
        Z0 = new vc40(i2, (byte) 24);
        a1 = new vc40(i2, (byte) 25);
        b1 = new vc40(i2, (byte) 26);
        c1 = new vc40(i2, (byte) 27);
        d1 = new vc40(i2, (byte) 28);
        e1 = new vc40(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc40(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        k940 k940Var = k940.b;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (k1r) obj;
            case 1:
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                mg40 mg40Var = (mg40) obj;
                return new ng40(mg40Var.a, mg40Var.b, mg40Var.c);
            case 4:
                ((qtr) obj).b(new kr(5, (lnm) null, (byte) 16));
                return rih1Var;
            case 5:
                return ((o3m0) obj).l();
            case 6:
                return new h3l0((i3l0) obj);
            case 7:
                ri40 ri40Var = (ri40) obj;
                String str = ri40Var.b;
                CharSequence charSequence = ri40Var.c;
                String str2 = ri40Var.d;
                o940 o940Var = ri40Var.j;
                return new ij40(str, charSequence, str2, z6x.a, (o940Var != null ? o940Var.b : null) == k940Var);
            case 8:
                return new bx21(2131954499);
            case 9:
                String strContextUri = ((PlayerState) obj).contextUri();
                int i2 = aqz0.a;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(strContextUri);
                int iOrdinal = s4b1VarX.c.ordinal();
                return new ugc1((iOrdinal == 342 || iOrdinal == 754) ? gm50.o(s4b1VarX.j(), Locale.getDefault()) : "");
            case 10:
                return poo1.J((PlayerState) obj);
            case 11:
                ej40 ej40Var = (ej40) obj;
                String str3 = ej40Var.b;
                CharSequence charSequence2 = ej40Var.c;
                String str4 = ej40Var.d;
                List list = ej40Var.g;
                o940 o940Var2 = ej40Var.h;
                return new ij40(str3, charSequence2, str4, list, (o940Var2 != null ? o940Var2.b : null) == k940Var);
            case 12:
                return Integer.valueOf(((Number) obj).intValue());
            case 13:
                return Integer.valueOf(-((Number) obj).intValue());
            case 14:
                return hm5.P(xay.m(irn1.o0(600, 0, (dlv) null, 6), N0), xay.q(irn1.o0(600, 0, (dlv) null, 6), O0));
            case 15:
                return rih1Var;
            case 16:
                ((kd31) obj).f(false);
                return rih1Var;
            case 17:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((kd31) obj).b(0.5f);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((kd31) obj).b(0.5f);
                return rih1Var;
            case 20:
                return new gzk0((i3l0) obj);
            case 21:
                return new j0l0((i3l0) obj);
            case 22:
                return new szk0((i3l0) obj);
            case 23:
                return new k0l0((i3l0) obj);
            case 24:
                i250 i250VarH0 = ((kb61) obj).h0();
                if (i250VarH0.a.d()) {
                    t1u0 t1u0Var = i250VarH0.b;
                    t1u0.d(t1u0Var.Z, new q1u0(t1u0Var, "google_desktop_close", (byte) 0));
                }
                return rih1Var;
            case 25:
                t2d1 t2d1Var = (t2d1) obj;
                return sqg0.J(new mmr0[]{new mmr0("IS_SUPPORTED", t2d1Var.a ? "1" : "0"), new mmr0("REASON", h4b1.l(t2d1Var.b))});
            case 26:
                long j = ((Offset) obj).a;
                return rih1Var;
            case 27:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                return mno1.h(new mmr0[]{new mmr0("graduation_approved_model", (p750) obj)});
            default:
                b261.c((e261) obj);
                return rih1Var;
        }
    }
}

package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z1f0 extends hab0 implements iu30 {
    public static final z1f0 N0;
    public static final z1f0 O0;
    public static final z1f0 P0;
    public static final z1f0 Q0;
    public static final z1f0 R0;
    public static final z1f0 S0;
    public static final z1f0 T0;
    public static final z1f0 U0;
    public static final z1f0 V0;
    public static final z1f0 W0;
    public static final z1f0 X;
    public static final z1f0 X0;
    public static final z1f0 Y;
    public static final z1f0 Y0;
    public static final z1f0 Z;
    public static final z1f0 Z0;
    public static final z1f0 a1;
    public static final z1f0 b;
    public static final z1f0 b1;
    public static final z1f0 c;
    public static final z1f0 c1;
    public static final z1f0 d;
    public static final z1f0 d1;
    public static final z1f0 e;
    public static final z1f0 e1;
    public static final z1f0 f;
    public static final z1f0 g;
    public static final z1f0 h;
    public static final z1f0 i;
    public static final z1f0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new z1f0(i2, (byte) 0);
        c = new z1f0(i2, (byte) 1);
        d = new z1f0(i2, (byte) 2);
        e = new z1f0(i2, (byte) 3);
        f = new z1f0(i2, (byte) 4);
        g = new z1f0(i2, (byte) 5);
        h = new z1f0(i2, (byte) 6);
        i = new z1f0(i2, (byte) 7);
        t = new z1f0(i2, (byte) 8);
        X = new z1f0(i2, (byte) 9);
        Y = new z1f0(i2, (byte) 10);
        Z = new z1f0(i2, (byte) 11);
        N0 = new z1f0(i2, (byte) 12);
        O0 = new z1f0(i2, (byte) 13);
        P0 = new z1f0(i2, (byte) 14);
        Q0 = new z1f0(i2, (byte) 15);
        R0 = new z1f0(i2, (byte) 16);
        S0 = new z1f0(i2, (byte) 17);
        T0 = new z1f0(i2, (byte) 18);
        U0 = new z1f0(i2, (byte) 19);
        V0 = new z1f0(i2, (byte) 20);
        W0 = new z1f0(i2, (byte) 21);
        X0 = new z1f0(i2, (byte) 22);
        Y0 = new z1f0(i2, (byte) 23);
        Z0 = new z1f0(i2, (byte) 24);
        a1 = new z1f0(i2, (byte) 25);
        b1 = new z1f0(i2, (byte) 26);
        c1 = new z1f0(i2, (byte) 27);
        d1 = new z1f0(i2, (byte) 28);
        e1 = new z1f0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1f0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 1:
                cas casVar = (a7m0) obj;
                casVar.a = x5d0.Z0;
                casVar.d = i0f0.d;
                return rih1Var;
            case 2:
                return r6x.a;
            case 3:
                return (z3f0) obj;
            case 4:
                lxo0 lxo0Var = (lxo0) obj;
                return new sy01(lxo0Var.a, lxo0Var.b, lxo0Var.c, lxo0Var.d, lxo0Var.e);
            case 5:
                b261.c((e261) obj);
                return rih1Var;
            case 6:
                return mno1.h(new mmr0[]{new mmr0("LyricsCardElementSavedStateKey", (tef0) obj)});
            case 7:
                tef0 tef0Var = (tef0) jhc1.t((Bundle) obj, "LyricsCardElementSavedStateKey", tef0.class);
                if (tef0Var != null) {
                    return tef0Var;
                }
                eg.m("Saved state not found");
                return null;
            case 8:
                return rih1Var;
            case 9:
                b261.B((e261) obj, "#LyricsCardTextTag");
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                return new j2l0((i3l0) obj);
            case 12:
                jgf0 jgf0Var = (jgf0) obj;
                return jgf0Var.g != null ? jgf0Var : jgf0.a(jgf0Var, UUID.randomUUID().toString());
            case 13:
                return new f8f0(cay.Y, (byte) 3);
            case 14:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 15:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", jgf0.class);
            case 16:
                return Integer.valueOf(((Number) obj).intValue());
            case 17:
                return Integer.valueOf(((Number) obj).intValue());
            case 18:
                return hm5.P(xay.o(irn1.o0(0, 150, (dlv) null, 5), R0).a(xay.e(2, irn1.o0(0, 150, (dlv) null, 5))), xay.s(irn1.o0(0, 0, (dlv) null, 7), S0).a(xay.f(2, irn1.o0(0, 0, (dlv) null, 7))));
            case 19:
                return rc11.a.b(((ob30) obj).getClass());
            case 20:
                b261.d((e261) obj);
                return rih1Var;
            case 21:
                b261.d((e261) obj);
                return rih1Var;
            case 22:
                return Integer.valueOf(((bff0) obj).a);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Integer.valueOf(((bff0) obj).b);
            case 24:
                return Integer.valueOf(((bff0) obj).c);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return Integer.valueOf(((bff0) obj).d);
            case 26:
                return Integer.valueOf(((bff0) obj).e);
            case 27:
                uel0 uel0VarC = mno1.C((op80) obj);
                uel0 uel0Var = uel0VarC instanceof uel0 ? uel0VarC : null;
                if (uel0Var != null) {
                    return new h3h1(new e4f0(uel0Var, (byte) 8));
                }
                return null;
            case 28:
                return new glf0();
            default:
                return rih1Var;
        }
    }
}

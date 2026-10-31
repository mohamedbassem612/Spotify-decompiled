package p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class klf0 extends hab0 implements iu30 {
    public static final klf0 N0;
    public static final klf0 O0;
    public static final klf0 P0;
    public static final klf0 Q0;
    public static final klf0 R0;
    public static final klf0 S0;
    public static final klf0 T0;
    public static final klf0 U0;
    public static final klf0 V0;
    public static final klf0 W0;
    public static final klf0 X;
    public static final klf0 X0;
    public static final klf0 Y;
    public static final klf0 Y0;
    public static final klf0 Z;
    public static final klf0 Z0;
    public static final klf0 a1;
    public static final klf0 b;
    public static final klf0 b1;
    public static final klf0 c;
    public static final klf0 c1;
    public static final klf0 d;
    public static final klf0 d1;
    public static final klf0 e;
    public static final klf0 e1;
    public static final klf0 f;
    public static final klf0 g;
    public static final klf0 h;
    public static final klf0 i;
    public static final klf0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new klf0(i2, (byte) 0);
        c = new klf0(i2, (byte) 1);
        d = new klf0(i2, (byte) 2);
        e = new klf0(i2, (byte) 3);
        f = new klf0(i2, (byte) 4);
        g = new klf0(i2, (byte) 5);
        h = new klf0(i2, (byte) 6);
        i = new klf0(i2, (byte) 7);
        t = new klf0(i2, (byte) 8);
        X = new klf0(i2, (byte) 9);
        Y = new klf0(i2, (byte) 10);
        Z = new klf0(i2, (byte) 11);
        N0 = new klf0(i2, (byte) 12);
        O0 = new klf0(i2, (byte) 13);
        P0 = new klf0(i2, (byte) 14);
        Q0 = new klf0(i2, (byte) 15);
        R0 = new klf0(i2, (byte) 16);
        S0 = new klf0(i2, (byte) 17);
        T0 = new klf0(i2, (byte) 18);
        U0 = new klf0(i2, (byte) 19);
        V0 = new klf0(i2, (byte) 20);
        W0 = new klf0(i2, (byte) 21);
        X0 = new klf0(i2, (byte) 22);
        Y0 = new klf0(i2, (byte) 23);
        Z0 = new klf0(i2, (byte) 24);
        a1 = new klf0(i2, (byte) 25);
        b1 = new klf0(i2, (byte) 26);
        c1 = new klf0(i2, (byte) 27);
        d1 = new klf0(i2, (byte) 28);
        e1 = new klf0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ klf0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        z = true;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                b261.d((e261) obj);
                return rih1Var;
            case 2:
                return mno1.h(new mmr0[]{new mmr0("XrLyricsElementSavedStateKey", (qtf0) obj)});
            case 3:
                qtf0 qtf0Var = (qtf0) jhc1.t((Bundle) obj, "XrLyricsElementSavedStateKey", qtf0.class);
                if (qtf0Var != null) {
                    return qtf0Var;
                }
                eg.m("Saved state not found");
                return null;
            case 4:
                return ((mxo0) obj).a;
            case 5:
                return w7x.a;
            case 6:
                qnf0 qnf0Var = (qnf0) obj;
                ay61 ay61Var = qnf0Var.a;
                k9h k9hVar = (k9h) ay61Var.f.get(ay61Var.g);
                int i2 = k9hVar.c;
                int i3 = k9hVar.a;
                kw9 kw9Var = new kw9(i3, k9hVar.b);
                String str = ay61Var.d;
                bef0 bef0Var = ay61Var.h;
                String str2 = ay61Var.c;
                String str3 = ay61Var.a;
                String str4 = ay61Var.b;
                cqs0 cqs0Var = ay61Var.e;
                int i4 = k9hVar.e;
                int i5 = k9hVar.f;
                int i6 = bmq0.i(i3);
                boolean z2 = ay61Var.i;
                int i7 = z2 ? 3 : 1;
                c380 c380Var = ay61Var.X;
                gy71 gy71Var = ay61Var.Y;
                return new rnf0(kw9Var, str, bef0Var, new vef0(str2, str3, str4, cqs0Var, i2, i4, i5, i6, i7, c380Var, z2, gy71Var != null ? gy71Var.b : false, 1536), qnf0Var.b, qnf0Var.d, (String) null, (ArrayList) null, (String) null, 896);
            case 7:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                uwr uwrVar = cbx.a;
                DrawScope.d0(lslVar, ((vex) zex.a.e).f, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1Var;
            case 8:
                return nik1.S0.a;
            case 9:
                return new mpf0(UUID.randomUUID().toString(), new kpf0(((fpf0) obj).c));
            case 10:
                return new f8f0(cay.Y, (byte) 5);
            case 11:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 12:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", mpf0.class);
            case 13:
                return rih1Var;
            case 14:
                return new iqf0();
            case 15:
                return mno1.h(new mmr0[]{new mmr0("stickers-picker-element-state-key", (iqf0) obj)});
            case 16:
                ((xas) obj).a(Q0, ujf0.i);
                return rih1Var;
            case 17:
                return new myb1("MESSAGING_LYRICS");
            case 18:
                return "country_code";
            case 19:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 21:
                return Boolean.valueOf(obj instanceof nyb1);
            case 22:
                if (obj != null) {
                    return (nyb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.stickers.datasource.StickersPackTable.Item");
                return null;
            case 23:
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return rih1Var;
            case 27:
                b261.F((e261) obj, false);
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                long j = ((Offset) obj).a;
                return rih1Var;
        }
    }
}

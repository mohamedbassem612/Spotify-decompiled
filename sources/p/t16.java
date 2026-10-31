package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t16 extends hab0 implements iu30 {
    public static final t16 N0;
    public static final t16 O0;
    public static final t16 P0;
    public static final t16 Q0;
    public static final t16 R0;
    public static final t16 S0;
    public static final t16 T0;
    public static final t16 U0;
    public static final t16 V0;
    public static final t16 W0;
    public static final t16 X;
    public static final t16 X0;
    public static final t16 Y;
    public static final t16 Y0;
    public static final t16 Z;
    public static final t16 Z0;
    public static final t16 a1;
    public static final t16 b;
    public static final t16 b1;
    public static final t16 c;
    public static final t16 c1;
    public static final t16 d;
    public static final t16 d1;
    public static final t16 e;
    public static final t16 e1;
    public static final t16 f;
    public static final t16 g;
    public static final t16 h;
    public static final t16 i;
    public static final t16 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new t16(i2, (byte) 0);
        c = new t16(i2, (byte) 1);
        d = new t16(i2, (byte) 2);
        e = new t16(i2, (byte) 3);
        f = new t16(i2, (byte) 4);
        g = new t16(i2, (byte) 5);
        h = new t16(i2, (byte) 6);
        i = new t16(i2, (byte) 7);
        t = new t16(i2, (byte) 8);
        X = new t16(i2, (byte) 9);
        Y = new t16(i2, (byte) 10);
        Z = new t16(i2, (byte) 11);
        N0 = new t16(i2, (byte) 12);
        O0 = new t16(i2, (byte) 13);
        P0 = new t16(i2, (byte) 14);
        Q0 = new t16(i2, (byte) 15);
        R0 = new t16(i2, (byte) 16);
        S0 = new t16(i2, (byte) 17);
        T0 = new t16(i2, (byte) 18);
        U0 = new t16(i2, (byte) 19);
        V0 = new t16(i2, (byte) 20);
        W0 = new t16(i2, (byte) 21);
        X0 = new t16(i2, (byte) 22);
        Y0 = new t16(i2, (byte) 23);
        Z0 = new t16(i2, (byte) 24);
        a1 = new t16(i2, (byte) 25);
        b1 = new t16(i2, (byte) 26);
        c1 = new t16(i2, (byte) 27);
        d1 = new t16(i2, (byte) 28);
        e1 = new t16(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t16(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Bespoke2026Content bespoke2026ContentQ;
        byte b2 = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 1:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 3:
                kd31 kd31Var = (kd31) obj;
                kd31Var.i(1);
                kd31Var.b(1.0f);
                return rih1Var;
            case 4:
                lsl lslVar = (lsl) obj;
                mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{new u7h(u7h.b), new u7h(u7h.j)}), Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) - lslVar.X0(96.0f), Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)), 8);
                lslVar.s1();
                DrawScope.S0(lslVar, mic0VarS, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                return rih1Var;
            case 5:
                return Collections.singleton(((ger0) obj).a);
            case 6:
                return Collections.singleton(((ger0) obj).a);
            case 7:
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                return ((gd6) obj).a;
            case 10:
                return ((gd6) obj).b;
            case 11:
                return new qvc0(l1d.m("spotify:list:artist-connections:", blo1.l(((gd6) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 12:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 16:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((kd31) obj).i(1);
                return rih1Var;
            case 20:
                b261.d((e261) obj);
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                StoryCard storyCard = (StoryCard) obj;
                if (storyCard != null && (bespoke2026ContentQ = storyCard.q()) != null && bespoke2026ContentQ.T()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                b261.c((e261) obj);
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                b261.F((e261) obj, true);
                return rih1Var;
            case 26:
                b261.F((e261) obj, true);
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

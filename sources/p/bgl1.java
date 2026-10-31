package p;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bgl1 {
    public static final bgl1 N0;
    public static final bgl1 O0;
    public static final bgl1 P0;
    public static final bgl1 Q0;
    public static final bgl1 R0;
    public static final bgl1 S0;
    public static final bgl1 T0;
    public static final bgl1 U0;
    public static final bgl1 V0;
    public static final /* synthetic */ bgl1[] W0;
    public static final bgl1 X;
    public static final bgl1 Y;
    public static final bgl1 Z;
    public static final List a;
    public static final bgl1 b;
    public static final bgl1 c;
    public static final bgl1 d;
    public static final bgl1 e;
    public static final bgl1 f;
    public static final bgl1 g;
    public static final bgl1 h;
    public static final bgl1 i;
    public static final bgl1 t;

    static {
        bgl1 bgl1Var = new bgl1("NONE", 0);
        b = bgl1Var;
        bgl1 bgl1Var2 = new bgl1("TURN_LEFT", 1);
        c = bgl1Var2;
        bgl1 bgl1Var3 = new bgl1("TURN_RIGHT", 2);
        d = bgl1Var3;
        bgl1 bgl1Var4 = new bgl1("KEEP_LEFT", 3);
        e = bgl1Var4;
        bgl1 bgl1Var5 = new bgl1("KEEP_RIGHT", 4);
        f = bgl1Var5;
        bgl1 bgl1Var6 = new bgl1("CONTINUE_STRAIGHT", 5);
        g = bgl1Var6;
        bgl1 bgl1Var7 = new bgl1("ROUNDABOUT_ENTER", 6);
        h = bgl1Var7;
        bgl1 bgl1Var8 = new bgl1("ROUNDABOUT_EXIT", 7);
        i = bgl1Var8;
        bgl1 bgl1Var9 = new bgl1("ROUNDABOUT_LEFT", 8);
        t = bgl1Var9;
        bgl1 bgl1Var10 = new bgl1("ROUNDABOUT_EXIT_LEFT", 9);
        X = bgl1Var10;
        bgl1 bgl1Var11 = new bgl1("ROUNDABOUT_STRAIGHT", 10);
        Y = bgl1Var11;
        bgl1 bgl1Var12 = new bgl1("ROUNDABOUT_EXIT_STRAIGHT", 11);
        Z = bgl1Var12;
        bgl1 bgl1Var13 = new bgl1("ROUNDABOUT_RIGHT", 12);
        N0 = bgl1Var13;
        bgl1 bgl1Var14 = new bgl1("ROUNDABOUT_EXIT_RIGHT", 13);
        O0 = bgl1Var14;
        bgl1 bgl1Var15 = new bgl1("ROUNDABOUT_U", 14);
        P0 = bgl1Var15;
        bgl1 bgl1Var16 = new bgl1("ROUNDABOUT_EXIT_U", 15);
        Q0 = bgl1Var16;
        bgl1 bgl1Var17 = new bgl1("APPROACHING_DESTINATION", 16);
        R0 = bgl1Var17;
        bgl1 bgl1Var18 = new bgl1("EXIT_LEFT", 17);
        S0 = bgl1Var18;
        bgl1 bgl1Var19 = new bgl1("EXIT_RIGHT", 18);
        T0 = bgl1Var19;
        bgl1 bgl1Var20 = new bgl1("WAYPOINT_DELAY", 19);
        U0 = bgl1Var20;
        bgl1 bgl1Var21 = new bgl1("U_TURN", 20);
        V0 = bgl1Var21;
        W0 = new bgl1[]{bgl1Var, bgl1Var2, bgl1Var3, bgl1Var4, bgl1Var5, bgl1Var6, bgl1Var7, bgl1Var8, bgl1Var9, bgl1Var10, bgl1Var11, bgl1Var12, bgl1Var13, bgl1Var14, bgl1Var15, bgl1Var16, bgl1Var17, bgl1Var18, bgl1Var19, bgl1Var20, bgl1Var21, new bgl1("NAV_INSTR_COUNT", 21)};
        bgl1[] bgl1VarArrValues = values();
        a = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(bgl1VarArrValues, bgl1VarArrValues.length)));
    }

    public static bgl1 valueOf(String str) {
        return (bgl1) Enum.valueOf(bgl1.class, str);
    }

    public static bgl1[] values() {
        return (bgl1[]) W0.clone();
    }
}

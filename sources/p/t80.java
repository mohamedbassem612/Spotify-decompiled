package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t80 {
    public static final t80 N0;
    public static final t80 O0;
    public static final t80 P0;
    public static final t80 Q0;
    public static final t80 R0;
    public static final /* synthetic */ t80[] S0;
    public static final t80 X;
    public static final t80 Y;
    public static final t80 Z;
    public static final t80 a;
    public static final t80 b;
    public static final t80 c;
    public static final t80 d;
    public static final t80 e;
    public static final t80 f;
    public static final t80 g;
    public static final t80 h;
    public static final t80 i;
    public static final t80 t;

    static {
        t80 t80Var = new t80("CancelFlow", 0);
        a = t80Var;
        t80 t80Var2 = new t80("AvailablePlans", 1);
        b = t80Var2;
        t80 t80Var3 = new t80("InviteUser", 2);
        c = t80Var3;
        t80 t80Var4 = new t80("EditAddress", 3);
        d = t80Var4;
        t80 t80Var5 = new t80("PrepaidTopUp", 4);
        e = t80Var5;
        t80 t80Var6 = new t80("RenewSubscription", 5);
        f = t80Var6;
        t80 t80Var7 = new t80("Unrecognized", 6);
        g = t80Var7;
        t80 t80Var8 = new t80("ChangePin", 7);
        h = t80Var8;
        t80 t80Var9 = new t80("InviteHelp", 8);
        i = t80Var9;
        t80 t80Var10 = new t80("AudiobookEntry", 9);
        t = t80Var10;
        t80 t80Var11 = new t80("InviteOrRemoveSubaccount", 10);
        X = t80Var11;
        t80 t80Var12 = new t80("AddSubaccount", 11);
        Y = t80Var12;
        t80 t80Var13 = new t80("RemoveSubaccount", 12);
        Z = t80Var13;
        t80 t80Var14 = new t80("InviteSubaccount", 13);
        N0 = t80Var14;
        t80 t80Var15 = new t80("ManageAos", 14);
        O0 = t80Var15;
        t80 t80Var16 = new t80("RemoveExpiringAccount", 15);
        P0 = t80Var16;
        t80 t80Var17 = new t80("MultiUserPlanVerification", 16);
        Q0 = t80Var17;
        t80 t80Var18 = new t80("ParentalControls", 17);
        R0 = t80Var18;
        S0 = new t80[]{t80Var, t80Var2, t80Var3, t80Var4, t80Var5, t80Var6, t80Var7, t80Var8, t80Var9, t80Var10, t80Var11, t80Var12, t80Var13, t80Var14, t80Var15, t80Var16, t80Var17, t80Var18};
    }

    public static t80 valueOf(String str) {
        return (t80) Enum.valueOf(t80.class, str);
    }

    public static t80[] values() {
        return (t80[]) S0.clone();
    }
}

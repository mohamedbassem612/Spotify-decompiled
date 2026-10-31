package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wz20 {
    public static final wz20 a;
    public static final wz20 b;
    public static final wz20 c;
    public static final /* synthetic */ wz20[] d;

    static {
        wz20 wz20Var = new wz20("Active", 0);
        a = wz20Var;
        wz20 wz20Var2 = new wz20("ActiveParent", 1);
        b = wz20Var2;
        wz20 wz20Var3 = new wz20("Captured", 2);
        wz20 wz20Var4 = new wz20("Inactive", 3);
        c = wz20Var4;
        d = new wz20[]{wz20Var, wz20Var2, wz20Var3, wz20Var4};
    }

    public static wz20 valueOf(String str) {
        return (wz20) Enum.valueOf(wz20.class, str);
    }

    public static wz20[] values() {
        return (wz20[]) d.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean a() throws NoWhenBranchMatchedException {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        eg.o();
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean b() throws NoWhenBranchMatchedException {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                eg.o();
                return false;
            }
        }
        return true;
    }
}

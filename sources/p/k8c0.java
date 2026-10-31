package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k8c0 {
    private static final /* synthetic */ r0z $ENTRIES;
    private static final /* synthetic */ k8c0[] $VALUES;
    public static final i8c0 Companion;
    public static final k8c0 ON_ANY;
    public static final k8c0 ON_CREATE;
    public static final k8c0 ON_DESTROY;
    public static final k8c0 ON_PAUSE;
    public static final k8c0 ON_RESUME;
    public static final k8c0 ON_START;
    public static final k8c0 ON_STOP;

    static {
        k8c0 k8c0Var = new k8c0("ON_CREATE", 0);
        ON_CREATE = k8c0Var;
        k8c0 k8c0Var2 = new k8c0("ON_START", 1);
        ON_START = k8c0Var2;
        k8c0 k8c0Var3 = new k8c0("ON_RESUME", 2);
        ON_RESUME = k8c0Var3;
        k8c0 k8c0Var4 = new k8c0("ON_PAUSE", 3);
        ON_PAUSE = k8c0Var4;
        k8c0 k8c0Var5 = new k8c0("ON_STOP", 4);
        ON_STOP = k8c0Var5;
        k8c0 k8c0Var6 = new k8c0("ON_DESTROY", 5);
        ON_DESTROY = k8c0Var6;
        k8c0 k8c0Var7 = new k8c0("ON_ANY", 6);
        ON_ANY = k8c0Var7;
        k8c0[] k8c0VarArr = {k8c0Var, k8c0Var2, k8c0Var3, k8c0Var4, k8c0Var5, k8c0Var6, k8c0Var7};
        $VALUES = k8c0VarArr;
        $ENTRIES = new t0z(k8c0VarArr);
        Companion = new i8c0();
    }

    public static k8c0 valueOf(String str) {
        return (k8c0) Enum.valueOf(k8c0.class, str);
    }

    public static k8c0[] values() {
        return (k8c0[]) $VALUES.clone();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final w8c0 a() throws NoWhenBranchMatchedException {
        switch (j8c0.a[ordinal()]) {
            case 1:
            case 2:
                return w8c0.c;
            case 3:
            case 4:
                return w8c0.d;
            case 5:
                return w8c0.e;
            case 6:
                return w8c0.a;
            case 7:
                k220.g(this, " has no target state");
                return null;
            default:
                eg.o();
                return null;
        }
    }
}

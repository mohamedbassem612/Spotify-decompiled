package p;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class czy0 {
    public static final czy0 a;
    public static final /* synthetic */ czy0[] b;

    static {
        czy0 czy0Var = new czy0("DEFAULT", 0);
        a = czy0Var;
        czy0 czy0Var2 = new czy0("UNMETERED_ONLY", 1);
        czy0 czy0Var3 = new czy0("UNMETERED_OR_DAILY", 2);
        czy0 czy0Var4 = new czy0("FAST_IF_RADIO_AWAKE", 3);
        czy0 czy0Var5 = new czy0("NEVER", 4);
        czy0 czy0Var6 = new czy0("UNRECOGNIZED", 5);
        b = new czy0[]{czy0Var, czy0Var2, czy0Var3, czy0Var4, czy0Var5, czy0Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, czy0Var);
        sparseArray.put(1, czy0Var2);
        sparseArray.put(2, czy0Var3);
        sparseArray.put(3, czy0Var4);
        sparseArray.put(4, czy0Var5);
        sparseArray.put(-1, czy0Var6);
    }

    public static czy0 valueOf(String str) {
        return (czy0) Enum.valueOf(czy0.class, str);
    }

    public static czy0[] values() {
        return (czy0[]) b.clone();
    }
}

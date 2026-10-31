package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s39 {
    public static final s39 a;
    public static final s39 b;
    public static final s39 c;
    public static final /* synthetic */ s39[] d;

    static {
        s39 s39Var = new s39("RowClicked", 0);
        a = s39Var;
        s39 s39Var2 = new s39("TapAheadClicked", 1);
        b = s39Var2;
        s39 s39Var3 = new s39("RowSwiped", 2);
        c = s39Var3;
        d = new s39[]{s39Var, s39Var2, s39Var3};
    }

    public static s39 valueOf(String str) {
        return (s39) Enum.valueOf(s39.class, str);
    }

    public static s39[] values() {
        return (s39[]) d.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ums0 {
    public static final ums0 a;
    public static final ums0 b;
    public static final ums0 c;
    public static final /* synthetic */ ums0[] d;

    static {
        ums0 ums0Var = new ums0("RequestClicked", 0);
        a = ums0Var;
        ums0 ums0Var2 = new ums0("LeaveJamClicked", 1);
        b = ums0Var2;
        ums0 ums0Var3 = new ums0("SystemDismissed", 2);
        c = ums0Var3;
        d = new ums0[]{ums0Var, ums0Var2, ums0Var3};
    }

    public static ums0 valueOf(String str) {
        return (ums0) Enum.valueOf(ums0.class, str);
    }

    public static ums0[] values() {
        return (ums0[]) d.clone();
    }
}

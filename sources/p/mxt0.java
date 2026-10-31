package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mxt0 {
    public static final mxt0 a;
    public static final mxt0 b;
    public static final /* synthetic */ mxt0[] c;

    static {
        mxt0 mxt0Var = new mxt0("SkipPrevious", 0);
        a = mxt0Var;
        mxt0 mxt0Var2 = new mxt0("SkipNext", 1);
        b = mxt0Var2;
        c = new mxt0[]{mxt0Var, mxt0Var2, new mxt0("SeekBackward", 2), new mxt0("SeekForward", 3), new mxt0("ChapterSkip", 4)};
    }

    public static mxt0 valueOf(String str) {
        return (mxt0) Enum.valueOf(mxt0.class, str);
    }

    public static mxt0[] values() {
        return (mxt0[]) c.clone();
    }
}

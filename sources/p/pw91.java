package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pw91 {
    public static final pw91 a;
    public static final /* synthetic */ pw91[] b;

    static {
        pw91 pw91Var = new pw91("UndoClicked", 0);
        a = pw91Var;
        b = new pw91[]{pw91Var};
    }

    public static pw91 valueOf(String str) {
        return (pw91) Enum.valueOf(pw91.class, str);
    }

    public static pw91[] values() {
        return (pw91[]) b.clone();
    }
}

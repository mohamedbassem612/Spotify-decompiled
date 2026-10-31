package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p191 {
    public static final p191 a;
    public static final p191 b;
    public static final p191 c;
    public static final /* synthetic */ p191[] d;

    static {
        p191 p191Var = new p191("CardViewTapped", 0);
        a = p191Var;
        p191 p191Var2 = new p191("PrimaryButtonTapped", 1);
        b = p191Var2;
        p191 p191Var3 = new p191("AatEntryPointClicked", 2);
        c = p191Var3;
        d = new p191[]{p191Var, p191Var2, p191Var3};
    }

    public static p191 valueOf(String str) {
        return (p191) Enum.valueOf(p191.class, str);
    }

    public static p191[] values() {
        return (p191[]) d.clone();
    }
}

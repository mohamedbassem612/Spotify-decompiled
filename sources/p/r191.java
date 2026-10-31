package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r191 {
    public static final r191 a;
    public static final r191 b;
    public static final r191 c;
    public static final /* synthetic */ r191[] d;

    static {
        r191 r191Var = new r191("CardViewTapped", 0);
        a = r191Var;
        r191 r191Var2 = new r191("PrimaryButtonTapped", 1);
        b = r191Var2;
        r191 r191Var3 = new r191("AatEntryPointClicked", 2);
        c = r191Var3;
        d = new r191[]{r191Var, r191Var2, r191Var3};
    }

    public static r191 valueOf(String str) {
        return (r191) Enum.valueOf(r191.class, str);
    }

    public static r191[] values() {
        return (r191[]) d.clone();
    }
}

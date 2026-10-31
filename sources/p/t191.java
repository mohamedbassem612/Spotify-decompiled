package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t191 {
    public static final t191 a;
    public static final t191 b;
    public static final t191 c;
    public static final /* synthetic */ t191[] d;

    static {
        t191 t191Var = new t191("CardViewTapped", 0);
        a = t191Var;
        t191 t191Var2 = new t191("PrimaryButtonTapped", 1);
        b = t191Var2;
        t191 t191Var3 = new t191("AatEntryPointClicked", 2);
        c = t191Var3;
        d = new t191[]{t191Var, t191Var2, t191Var3};
    }

    public static t191 valueOf(String str) {
        return (t191) Enum.valueOf(t191.class, str);
    }

    public static t191[] values() {
        return (t191[]) d.clone();
    }
}

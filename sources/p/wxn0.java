package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wxn0 {
    public static final wxn0 a;
    public static final wxn0 b;
    public static final wxn0 c;
    public static final /* synthetic */ wxn0[] d;

    static {
        wxn0 wxn0Var = new wxn0("MANAGED_SUB", 0);
        a = wxn0Var;
        wxn0 wxn0Var2 = new wxn0("REGULAR_SUB", 1);
        b = wxn0Var2;
        wxn0 wxn0Var3 = new wxn0("LEGACY", 2);
        c = wxn0Var3;
        d = new wxn0[]{wxn0Var, wxn0Var2, wxn0Var3};
    }

    public static wxn0 valueOf(String str) {
        return (wxn0) Enum.valueOf(wxn0.class, str);
    }

    public static wxn0[] values() {
        return (wxn0[]) d.clone();
    }
}

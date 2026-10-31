package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d1o0 {
    public static final d1o0 a;
    public static final d1o0 b;
    public static final /* synthetic */ d1o0[] c;

    static {
        d1o0 d1o0Var = new d1o0("AllowAccessClicked", 0);
        a = d1o0Var;
        d1o0 d1o0Var2 = new d1o0("GoToSettingsClicked", 1);
        b = d1o0Var2;
        c = new d1o0[]{d1o0Var, d1o0Var2};
    }

    public static d1o0 valueOf(String str) {
        return (d1o0) Enum.valueOf(d1o0.class, str);
    }

    public static d1o0[] values() {
        return (d1o0[]) c.clone();
    }
}

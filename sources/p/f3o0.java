package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f3o0 {
    public static final f3o0 a;
    public static final /* synthetic */ f3o0[] b;

    static {
        f3o0 f3o0Var = new f3o0("OnClick", 0);
        a = f3o0Var;
        b = new f3o0[]{f3o0Var};
    }

    public static f3o0 valueOf(String str) {
        return (f3o0) Enum.valueOf(f3o0.class, str);
    }

    public static f3o0[] values() {
        return (f3o0[]) b.clone();
    }
}

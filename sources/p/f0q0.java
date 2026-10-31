package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f0q0 {
    public static final f0q0 a;
    public static final /* synthetic */ f0q0[] b;

    static {
        f0q0 f0q0Var = new f0q0("OnClicked", 0);
        a = f0q0Var;
        b = new f0q0[]{f0q0Var};
    }

    public static f0q0 valueOf(String str) {
        return (f0q0) Enum.valueOf(f0q0.class, str);
    }

    public static f0q0[] values() {
        return (f0q0[]) b.clone();
    }
}

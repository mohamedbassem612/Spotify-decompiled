package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jbb1 {
    public static final jbb1 a;
    public static final /* synthetic */ jbb1[] b;

    static {
        jbb1 jbb1Var = new jbb1("OnClicked", 0);
        a = jbb1Var;
        b = new jbb1[]{jbb1Var};
    }

    public static jbb1 valueOf(String str) {
        return (jbb1) Enum.valueOf(jbb1.class, str);
    }

    public static jbb1[] values() {
        return (jbb1[]) b.clone();
    }
}

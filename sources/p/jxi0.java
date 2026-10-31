package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jxi0 {
    public static final jxi0 a;
    public static final /* synthetic */ jxi0[] b;

    static {
        jxi0 jxi0Var = new jxi0("OnClicked", 0);
        a = jxi0Var;
        b = new jxi0[]{jxi0Var};
    }

    public static jxi0 valueOf(String str) {
        return (jxi0) Enum.valueOf(jxi0.class, str);
    }

    public static jxi0[] values() {
        return (jxi0[]) b.clone();
    }
}

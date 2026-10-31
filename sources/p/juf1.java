package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class juf1 {
    public static final juf1 a;
    public static final /* synthetic */ juf1[] b;

    static {
        juf1 juf1Var = new juf1("ExplorePremiumClicked", 0);
        a = juf1Var;
        b = new juf1[]{juf1Var};
    }

    public static juf1 valueOf(String str) {
        return (juf1) Enum.valueOf(juf1.class, str);
    }

    public static juf1[] values() {
        return (juf1[]) b.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jh91 {
    public static final jh91 a;
    public static final jh91 b;
    public static final /* synthetic */ jh91[] c;

    static {
        jh91 jh91Var = new jh91("KEYBOARD_VISIBLE", 0);
        a = jh91Var;
        jh91 jh91Var2 = new jh91("NAVIGATION_OVERLAY_VISIBLE", 1);
        b = jh91Var2;
        c = new jh91[]{jh91Var, jh91Var2};
    }

    public static jh91 valueOf(String str) {
        return (jh91) Enum.valueOf(jh91.class, str);
    }

    public static jh91[] values() {
        return (jh91[]) c.clone();
    }
}

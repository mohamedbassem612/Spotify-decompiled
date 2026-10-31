package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m7c1 {
    public static final m7c1 a;
    public static final m7c1 b;
    public static final m7c1 c;
    public static final m7c1 d;
    public static final m7c1 e;
    public static final /* synthetic */ m7c1[] f;

    static {
        m7c1 m7c1Var = new m7c1("SCREEN_PRESS", 0);
        a = m7c1Var;
        m7c1 m7c1Var2 = new m7c1("SCREEN_PRESS_RELEASE", 1);
        b = m7c1Var2;
        m7c1 m7c1Var3 = new m7c1("LEFT_CLICK", 2);
        c = m7c1Var3;
        m7c1 m7c1Var4 = new m7c1("RIGHT_CLICK", 3);
        d = m7c1Var4;
        m7c1 m7c1Var5 = new m7c1("SWIPE_TOP_DOWN", 4);
        e = m7c1Var5;
        f = new m7c1[]{m7c1Var, m7c1Var2, m7c1Var3, m7c1Var4, m7c1Var5};
    }

    public static m7c1 valueOf(String str) {
        return (m7c1) Enum.valueOf(m7c1.class, str);
    }

    public static m7c1[] values() {
        return (m7c1[]) f.clone();
    }
}

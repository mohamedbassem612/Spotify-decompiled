package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pa81 {
    public static final pa81 a;
    public static final pa81 b;
    public static final pa81 c;
    public static final /* synthetic */ pa81[] d;

    static {
        pa81 pa81Var = new pa81("OTHER", 0);
        a = pa81Var;
        pa81 pa81Var2 = new pa81("AUDIOBOOK", 1);
        b = pa81Var2;
        pa81 pa81Var3 = new pa81("AUDIOBOOK_PRE_RELEASE", 2);
        c = pa81Var3;
        d = new pa81[]{pa81Var, pa81Var2, pa81Var3};
    }

    public static pa81 valueOf(String str) {
        return (pa81) Enum.valueOf(pa81.class, str);
    }

    public static pa81[] values() {
        return (pa81[]) d.clone();
    }
}

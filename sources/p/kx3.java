package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kx3 {
    public static final kx3 a;
    public static final kx3 b;
    public static final kx3 c;
    public static final kx3 d;
    public static final kx3 e;
    public static final /* synthetic */ kx3[] f;

    static {
        kx3 kx3Var = new kx3("CHAT", 0);
        a = kx3Var;
        kx3 kx3Var2 = new kx3("SPEAK", 1);
        b = kx3Var2;
        kx3 kx3Var3 = new kx3("MODERATION_CONTROLS", 2);
        c = kx3Var3;
        kx3 kx3Var4 = new kx3("HOST_CONTROLS", 3);
        d = kx3Var4;
        kx3 kx3Var5 = new kx3("VIEW_CHAT_MESSAGES", 4);
        e = kx3Var5;
        f = new kx3[]{kx3Var, kx3Var2, kx3Var3, kx3Var4, kx3Var5};
    }

    public static kx3 valueOf(String str) {
        return (kx3) Enum.valueOf(kx3.class, str);
    }

    public static kx3[] values() {
        return (kx3[]) f.clone();
    }
}

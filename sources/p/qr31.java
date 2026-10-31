package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qr31 {
    public static final qr31 a;
    public static final qr31 b;
    public static final qr31 c;
    public static final qr31 d;
    public static final qr31 e;
    public static final /* synthetic */ qr31[] f;

    static {
        qr31 qr31Var = new qr31("Rootlist", 0);
        a = qr31Var;
        qr31 qr31Var2 = new qr31("Folder", 1);
        b = qr31Var2;
        qr31 qr31Var3 = new qr31("Events", 2);
        c = qr31Var3;
        qr31 qr31Var4 = new qr31("Liked", 3);
        d = qr31Var4;
        qr31 qr31Var5 = new qr31("Presave", 4);
        e = qr31Var5;
        f = new qr31[]{qr31Var, qr31Var2, qr31Var3, qr31Var4, qr31Var5};
    }

    public static qr31 valueOf(String str) {
        return (qr31) Enum.valueOf(qr31.class, str);
    }

    public static qr31[] values() {
        return (qr31[]) f.clone();
    }
}

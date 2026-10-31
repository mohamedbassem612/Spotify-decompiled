package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ko90 {
    public static final ko90 a;
    public static final ko90 b;
    public static final ko90 c;
    public static final ko90 d;
    public static final ko90 e;
    public static final /* synthetic */ ko90[] f;

    static {
        ko90 ko90Var = new ko90("M_DNS", 0);
        a = ko90Var;
        ko90 ko90Var2 = new ko90("CONNECT", 1);
        b = ko90Var2;
        ko90 ko90Var3 = new ko90("SOCIALRADAR_NEARBY", 2);
        c = ko90Var3;
        ko90 ko90Var4 = new ko90("LINK", 3);
        d = ko90Var4;
        ko90 ko90Var5 = new ko90("LISTENING_ACTIVITY", 4);
        e = ko90Var5;
        f = new ko90[]{ko90Var, ko90Var2, ko90Var3, ko90Var4, ko90Var5};
    }

    public static ko90 valueOf(String str) {
        return (ko90) Enum.valueOf(ko90.class, str);
    }

    public static ko90[] values() {
        return (ko90[]) f.clone();
    }
}

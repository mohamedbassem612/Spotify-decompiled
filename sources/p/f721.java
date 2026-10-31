package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f721 {
    public static final f721 a;
    public static final f721 b;
    public static final f721 c;
    public static final /* synthetic */ f721[] d;

    static {
        f721 f721Var = new f721("EXPLAINER", 0);
        a = f721Var;
        f721 f721Var2 = new f721("REMOVING", 1);
        b = f721Var2;
        f721 f721Var3 = new f721("UNFOLLOW_PROMPT", 2);
        c = f721Var3;
        d = new f721[]{f721Var, f721Var2, f721Var3};
    }

    public static f721 valueOf(String str) {
        return (f721) Enum.valueOf(f721.class, str);
    }

    public static f721[] values() {
        return (f721[]) d.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f841 {
    public static final f841 a;
    public static final f841 b;
    public static final /* synthetic */ f841[] c;

    static {
        f841 f841Var = new f841("SPOTIFY_OPENING", 0);
        a = f841Var;
        f841 f841Var2 = new f841("SAMSUNG_DEVICE_DETECTED", 1);
        b = f841Var2;
        c = new f841[]{f841Var, f841Var2};
    }

    public static f841 valueOf(String str) {
        return (f841) Enum.valueOf(f841.class, str);
    }

    public static f841[] values() {
        return (f841[]) c.clone();
    }
}

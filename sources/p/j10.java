package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j10 {
    public static final j10 a;
    public static final j10 b;
    public static final /* synthetic */ j10[] c;

    static {
        j10 j10Var = new j10("Download", 0);
        a = j10Var;
        j10 j10Var2 = new j10("RemoveDownload", 1);
        b = j10Var2;
        c = new j10[]{j10Var, j10Var2};
    }

    public static j10 valueOf(String str) {
        return (j10) Enum.valueOf(j10.class, str);
    }

    public static j10[] values() {
        return (j10[]) c.clone();
    }
}

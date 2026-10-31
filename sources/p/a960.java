package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a960 {
    public static final a960 a;
    public static final /* synthetic */ a960[] b;

    static {
        a960 a960Var = new a960("OnHideClicked", 0);
        a = a960Var;
        b = new a960[]{a960Var};
    }

    public static a960 valueOf(String str) {
        return (a960) Enum.valueOf(a960.class, str);
    }

    public static a960[] values() {
        return (a960[]) b.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wya1 {
    public static final wya1 a;
    public static final /* synthetic */ wya1[] b;

    static {
        wya1 wya1Var = new wya1("HelpClicked", 0);
        a = wya1Var;
        b = new wya1[]{wya1Var};
    }

    public static wya1 valueOf(String str) {
        return (wya1) Enum.valueOf(wya1.class, str);
    }

    public static wya1[] values() {
        return (wya1[]) b.clone();
    }
}

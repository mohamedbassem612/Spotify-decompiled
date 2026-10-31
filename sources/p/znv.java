package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class znv {
    public static final znv a;
    public static final /* synthetic */ znv[] b;

    static {
        znv znvVar = new znv("ButtonClicked", 0);
        a = znvVar;
        b = new znv[]{znvVar};
    }

    public static znv valueOf(String str) {
        return (znv) Enum.valueOf(znv.class, str);
    }

    public static znv[] values() {
        return (znv[]) b.clone();
    }
}

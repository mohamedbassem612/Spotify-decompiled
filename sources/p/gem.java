package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gem {
    public static final gem a;
    public static final /* synthetic */ gem[] b;

    static {
        gem gemVar = new gem("OnClicked", 0);
        a = gemVar;
        b = new gem[]{gemVar};
    }

    public static gem valueOf(String str) {
        return (gem) Enum.valueOf(gem.class, str);
    }

    public static gem[] values() {
        return (gem[]) b.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kcz {
    public static final kcz a;
    public static final kcz b;
    public static final /* synthetic */ kcz[] c;

    static {
        kcz kczVar = new kcz("Audio", 0);
        a = kczVar;
        kcz kczVar2 = new kcz("Video", 1);
        b = kczVar2;
        c = new kcz[]{kczVar, kczVar2};
    }

    public static kcz valueOf(String str) {
        return (kcz) Enum.valueOf(kcz.class, str);
    }

    public static kcz[] values() {
        return (kcz[]) c.clone();
    }
}

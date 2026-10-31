package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ay {
    public static final ay a;
    public static final /* synthetic */ ay[] b;

    static {
        ay ayVar = new ay("CardClicked", 0);
        a = ayVar;
        b = new ay[]{ayVar};
    }

    public static ay valueOf(String str) {
        return (ay) Enum.valueOf(ay.class, str);
    }

    public static ay[] values() {
        return (ay[]) b.clone();
    }
}

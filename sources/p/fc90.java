package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fc90 {
    public static final fc90 a;
    public static final /* synthetic */ fc90[] b;

    static {
        fc90 fc90Var = new fc90("Clicked", 0);
        a = fc90Var;
        b = new fc90[]{fc90Var};
    }

    public static fc90 valueOf(String str) {
        return (fc90) Enum.valueOf(fc90.class, str);
    }

    public static fc90[] values() {
        return (fc90[]) b.clone();
    }
}

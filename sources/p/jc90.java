package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jc90 {
    public static final jc90 a;
    public static final /* synthetic */ jc90[] b;

    static {
        jc90 jc90Var = new jc90("Clicked", 0);
        a = jc90Var;
        b = new jc90[]{jc90Var};
    }

    public static jc90 valueOf(String str) {
        return (jc90) Enum.valueOf(jc90.class, str);
    }

    public static jc90[] values() {
        return (jc90[]) b.clone();
    }
}

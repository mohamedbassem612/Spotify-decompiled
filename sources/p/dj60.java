package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dj60 {
    public static final dj60 a;
    public static final /* synthetic */ dj60[] b;

    static {
        dj60 dj60Var = new dj60("Clicked", 0);
        a = dj60Var;
        b = new dj60[]{dj60Var};
    }

    public static dj60 valueOf(String str) {
        return (dj60) Enum.valueOf(dj60.class, str);
    }

    public static dj60[] values() {
        return (dj60[]) b.clone();
    }
}

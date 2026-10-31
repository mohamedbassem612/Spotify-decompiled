package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class riv0 {
    public static final riv0 a;
    public static final /* synthetic */ riv0[] b;

    static {
        riv0 riv0Var = new riv0("Clicked", 0);
        a = riv0Var;
        b = new riv0[]{riv0Var};
    }

    public static riv0 valueOf(String str) {
        return (riv0) Enum.valueOf(riv0.class, str);
    }

    public static riv0[] values() {
        return (riv0[]) b.clone();
    }
}

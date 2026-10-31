package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r7d0 {
    public static final r7d0 a;
    public static final /* synthetic */ r7d0[] b;

    static {
        r7d0 r7d0Var = new r7d0("Clicked", 0);
        a = r7d0Var;
        b = new r7d0[]{r7d0Var};
    }

    public static r7d0 valueOf(String str) {
        return (r7d0) Enum.valueOf(r7d0.class, str);
    }

    public static r7d0[] values() {
        return (r7d0[]) b.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n8e {
    public static final n8e a;
    public static final /* synthetic */ n8e[] b;

    static {
        n8e n8eVar = new n8e("Click", 0);
        a = n8eVar;
        b = new n8e[]{n8eVar};
    }

    public static n8e valueOf(String str) {
        return (n8e) Enum.valueOf(n8e.class, str);
    }

    public static n8e[] values() {
        return (n8e[]) b.clone();
    }
}

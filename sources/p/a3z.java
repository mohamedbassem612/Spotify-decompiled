package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a3z {
    public static final a3z a;
    public static final /* synthetic */ a3z[] b;

    static {
        a3z a3zVar = new a3z("HOST_RECOMMENDS", 0);
        a = a3zVar;
        b = new a3z[]{a3zVar};
    }

    public static a3z valueOf(String str) {
        return (a3z) Enum.valueOf(a3z.class, str);
    }

    public static a3z[] values() {
        return (a3z[]) b.clone();
    }
}

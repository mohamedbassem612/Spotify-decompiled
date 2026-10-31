package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z9z {
    public static final z9z a;
    public static final /* synthetic */ z9z[] b;

    static {
        z9z z9zVar = new z9z("OnTagLineClick", 0);
        a = z9zVar;
        b = new z9z[]{z9zVar};
    }

    public static z9z valueOf(String str) {
        return (z9z) Enum.valueOf(z9z.class, str);
    }

    public static z9z[] values() {
        return (z9z[]) b.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e0u {
    public static final e0u a;
    public static final e0u b;
    public static final /* synthetic */ e0u[] c;

    static {
        e0u e0uVar = new e0u("HOURS_12", 0);
        a = e0uVar;
        e0u e0uVar2 = new e0u("HOURS_24", 1);
        b = e0uVar2;
        c = new e0u[]{e0uVar, e0uVar2};
    }

    public static e0u valueOf(String str) {
        return (e0u) Enum.valueOf(e0u.class, str);
    }

    public static e0u[] values() {
        return (e0u[]) c.clone();
    }
}

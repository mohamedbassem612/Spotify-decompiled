package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class n1u {
    public static final m1u Companion;
    public static final znb0 a;
    public static final n1u b;
    public static final /* synthetic */ n1u[] c;

    static {
        n1u n1uVar = new n1u("ANDROID_ANR_PROFILE", 0);
        b = n1uVar;
        c = new n1u[]{n1uVar};
        Companion = new m1u();
        a = dm5.S(2, u6t.R0);
    }

    public static n1u valueOf(String str) {
        return (n1u) Enum.valueOf(n1u.class, str);
    }

    public static n1u[] values() {
        return (n1u[]) c.clone();
    }
}

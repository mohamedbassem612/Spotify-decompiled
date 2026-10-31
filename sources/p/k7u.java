package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k7u {
    public static final k7u a;
    public static final /* synthetic */ k7u[] b;

    static {
        k7u k7uVar = new k7u("RowClicked", 0);
        a = k7uVar;
        b = new k7u[]{k7uVar};
    }

    public static k7u valueOf(String str) {
        return (k7u) Enum.valueOf(k7u.class, str);
    }

    public static k7u[] values() {
        return (k7u[]) b.clone();
    }
}

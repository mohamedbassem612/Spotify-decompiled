package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qaz {
    public static final qaz a;
    public static final /* synthetic */ qaz[] b;

    static {
        qaz qazVar = new qaz("RowClicked", 0);
        a = qazVar;
        b = new qaz[]{qazVar};
    }

    public static qaz valueOf(String str) {
        return (qaz) Enum.valueOf(qaz.class, str);
    }

    public static qaz[] values() {
        return (qaz[]) b.clone();
    }
}

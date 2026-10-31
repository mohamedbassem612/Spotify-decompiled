package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zmo {
    public static final zmo a;
    public static final /* synthetic */ zmo[] b;

    static {
        zmo zmoVar = new zmo("RowClicked", 0);
        a = zmoVar;
        b = new zmo[]{zmoVar, new zmo("ContextMenuClicked", 1)};
    }

    public static zmo valueOf(String str) {
        return (zmo) Enum.valueOf(zmo.class, str);
    }

    public static zmo[] values() {
        return (zmo[]) b.clone();
    }
}

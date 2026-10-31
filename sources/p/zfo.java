package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zfo {
    public static final zfo a;
    public static final /* synthetic */ zfo[] b;

    static {
        zfo zfoVar = new zfo("CardClicked", 0);
        a = zfoVar;
        b = new zfo[]{zfoVar};
    }

    public static zfo valueOf(String str) {
        return (zfo) Enum.valueOf(zfo.class, str);
    }

    public static zfo[] values() {
        return (zfo[]) b.clone();
    }
}

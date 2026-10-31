package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zea0 {
    public static final zea0 a;
    public static final /* synthetic */ zea0[] b;

    static {
        zea0 zea0Var = new zea0("PrimaryClicked", 0);
        a = zea0Var;
        b = new zea0[]{zea0Var};
    }

    public static zea0 valueOf(String str) {
        return (zea0) Enum.valueOf(zea0.class, str);
    }

    public static zea0[] values() {
        return (zea0[]) b.clone();
    }
}

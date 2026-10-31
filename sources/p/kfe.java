package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kfe {
    public static final kfe a;
    public static final kfe b;
    public static final /* synthetic */ kfe[] c;

    static {
        kfe kfeVar = new kfe("PUSH", 0);
        a = kfeVar;
        kfe kfeVar2 = new kfe("EMAIL", 1);
        b = kfeVar2;
        c = new kfe[]{kfeVar, kfeVar2};
    }

    public static kfe valueOf(String str) {
        return (kfe) Enum.valueOf(kfe.class, str);
    }

    public static kfe[] values() {
        return (kfe[]) c.clone();
    }
}

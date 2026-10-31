package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class usd {
    public static final usd a;
    public static final usd b;
    public static final /* synthetic */ usd[] c;

    static {
        usd usdVar = new usd("Track", 0);
        a = usdVar;
        usd usdVar2 = new usd("Episode", 1);
        b = usdVar2;
        c = new usd[]{usdVar, usdVar2};
    }

    public static usd valueOf(String str) {
        return (usd) Enum.valueOf(usd.class, str);
    }

    public static usd[] values() {
        return (usd[]) c.clone();
    }
}

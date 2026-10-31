package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lzx {
    public static final lzx a;
    public static final lzx b;
    public static final /* synthetic */ lzx[] c;

    static {
        lzx lzxVar = new lzx("CBCS", 0);
        a = lzxVar;
        lzx lzxVar2 = new lzx("CTR", 1);
        b = lzxVar2;
        c = new lzx[]{lzxVar, lzxVar2};
    }

    public static lzx valueOf(String str) {
        return (lzx) Enum.valueOf(lzx.class, str);
    }

    public static lzx[] values() {
        return (lzx[]) c.clone();
    }
}

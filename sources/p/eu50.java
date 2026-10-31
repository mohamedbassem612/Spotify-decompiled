package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class eu50 implements v0d1 {
    public static final cu50 b;
    public static final /* synthetic */ eu50[] c;
    public final dzf a;

    static {
        cu50 cu50Var = new cu50("CRC_32", 0, "Hashing.crc32()");
        b = cu50Var;
        c = new eu50[]{cu50Var, new du50("ADLER_32", 1, "Hashing.adler32()")};
    }

    public eu50(String str, int i, String str2) {
        super(str, i);
        this.a = new dzf(this, str2);
    }

    public static eu50 valueOf(String str) {
        return (eu50) Enum.valueOf(eu50.class, str);
    }

    public static eu50[] values() {
        return (eu50[]) c.clone();
    }
}

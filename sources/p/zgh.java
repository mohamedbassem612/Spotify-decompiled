package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zgh {
    public static final zgh a;
    public static final zgh b;
    public static final zgh c;
    public static final /* synthetic */ zgh[] d;

    static {
        zgh zghVar = new zgh("BLOCK_AUTHOR", 0);
        a = zghVar;
        zgh zghVar2 = new zgh("REPORT_COMMENT", 1);
        b = zghVar2;
        zgh zghVar3 = new zgh("DELETE_COMMENT", 2);
        c = zghVar3;
        d = new zgh[]{zghVar, zghVar2, zghVar3};
    }

    public static zgh valueOf(String str) {
        return (zgh) Enum.valueOf(zgh.class, str);
    }

    public static zgh[] values() {
        return (zgh[]) d.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xzx {
    public static final xzx a;
    public static final xzx b;
    public static final xzx c;
    public static final /* synthetic */ xzx[] d;

    static {
        xzx xzxVar = new xzx("AVAILABLE", 0);
        a = xzxVar;
        xzx xzxVar2 = new xzx("NOT_AVAILABLE", 1);
        b = xzxVar2;
        xzx xzxVar3 = new xzx("UNKNOWN", 2);
        c = xzxVar3;
        d = new xzx[]{xzxVar, xzxVar2, xzxVar3};
    }

    public static xzx valueOf(String str) {
        return (xzx) Enum.valueOf(xzx.class, str);
    }

    public static xzx[] values() {
        return (xzx[]) d.clone();
    }
}

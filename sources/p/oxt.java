package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oxt {
    public static final oxt a;
    public static final /* synthetic */ oxt[] b;
    public static final /* synthetic */ t0z c;

    static {
        oxt oxtVar = new oxt("DEFAULT", 0);
        a = oxtVar;
        oxt[] oxtVarArr = {oxtVar, new oxt("ML_BASED", 1), new oxt("BLE_PROXIMITY", 2)};
        b = oxtVarArr;
        c = new t0z(oxtVarArr);
    }

    public static oxt valueOf(String str) {
        return (oxt) Enum.valueOf(oxt.class, str);
    }

    public static oxt[] values() {
        return (oxt[]) b.clone();
    }
}

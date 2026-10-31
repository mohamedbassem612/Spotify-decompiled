package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ouu {
    public static final ouu a;
    public static final ouu b;
    public static final ouu c;
    public static final /* synthetic */ ouu[] d;

    static {
        ouu ouuVar = new ouu("HANDLE_DOWNLOAD", 0);
        a = ouuVar;
        ouu ouuVar2 = new ouu("REMOVE_DOWNLOAD", 1);
        b = ouuVar2;
        ouu ouuVar3 = new ouu("HANDLE_REMOVE_DOWNLOAD", 2);
        c = ouuVar3;
        d = new ouu[]{ouuVar, ouuVar2, ouuVar3};
    }

    public static ouu valueOf(String str) {
        return (ouu) Enum.valueOf(ouu.class, str);
    }

    public static ouu[] values() {
        return (ouu[]) d.clone();
    }
}

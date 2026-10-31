package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xuu {
    public static final xuu a;
    public static final xuu b;
    public static final xuu c;
    public static final /* synthetic */ xuu[] d;

    static {
        xuu xuuVar = new xuu("Loading", 0);
        a = xuuVar;
        xuu xuuVar2 = new xuu("Disabled", 1);
        b = xuuVar2;
        xuu xuuVar3 = new xuu("Enabled", 2);
        c = xuuVar3;
        d = new xuu[]{xuuVar, xuuVar2, xuuVar3};
    }

    public static xuu valueOf(String str) {
        return (xuu) Enum.valueOf(xuu.class, str);
    }

    public static xuu[] values() {
        return (xuu[]) d.clone();
    }
}

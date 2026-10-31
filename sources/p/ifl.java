package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ifl {
    public static final ifl a;
    public static final ifl b;
    public static final /* synthetic */ ifl[] c;

    static {
        ifl iflVar = new ifl("Availability", 0);
        a = iflVar;
        ifl iflVar2 = new ifl("Selection", 1);
        b = iflVar2;
        c = new ifl[]{iflVar, iflVar2};
    }

    public static ifl valueOf(String str) {
        return (ifl) Enum.valueOf(ifl.class, str);
    }

    public static ifl[] values() {
        return (ifl[]) c.clone();
    }
}

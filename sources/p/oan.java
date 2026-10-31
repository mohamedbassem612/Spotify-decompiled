package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oan {
    public static final oan a;
    public static final oan b;
    public static final oan c;
    public static final /* synthetic */ oan[] d;

    static {
        oan oanVar = new oan("SUBDUED", 0);
        a = oanVar;
        oan oanVar2 = new oan("WARNING", 1);
        b = oanVar2;
        oan oanVar3 = new oan("NEGATIVE", 2);
        c = oanVar3;
        d = new oan[]{oanVar, oanVar2, oanVar3};
    }

    public static oan valueOf(String str) {
        return (oan) Enum.valueOf(oan.class, str);
    }

    public static oan[] values() {
        return (oan[]) d.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sid {
    public static final sid a;
    public static final sid b;
    public static final sid c;
    public static final sid d;
    public static final /* synthetic */ sid[] e;

    static {
        sid sidVar = new sid("IMAGE", 0);
        a = sidVar;
        sid sidVar2 = new sid("VIDEO", 1);
        b = sidVar2;
        sid sidVar3 = new sid("VIDEO_LOOPING", 2);
        c = sidVar3;
        sid sidVar4 = new sid("VIDEO_LOOPING_RANDOM", 3);
        d = sidVar4;
        e = new sid[]{sidVar, sidVar2, sidVar3, sidVar4};
    }

    public static sid valueOf(String str) {
        return (sid) Enum.valueOf(sid.class, str);
    }

    public static sid[] values() {
        return (sid[]) e.clone();
    }
}

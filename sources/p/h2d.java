package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h2d {
    public static final h2d a;
    public static final h2d b;
    public static final h2d c;
    public static final h2d d;
    public static final h2d e;
    public static final h2d f;
    public static final h2d g;
    public static final /* synthetic */ h2d[] h;

    static {
        h2d h2dVar = new h2d("UNKNOWN", 0);
        a = h2dVar;
        h2d h2dVar2 = new h2d("INACTIVE", 1);
        b = h2dVar2;
        h2d h2dVar3 = new h2d("SCANNING", 2);
        c = h2dVar3;
        h2d h2dVar4 = new h2d("PASSIVE_FOCUSED", 3);
        d = h2dVar4;
        h2d h2dVar5 = new h2d("PASSIVE_NOT_FOCUSED", 4);
        e = h2dVar5;
        h2d h2dVar6 = new h2d("LOCKED_FOCUSED", 5);
        f = h2dVar6;
        h2d h2dVar7 = new h2d("LOCKED_NOT_FOCUSED", 6);
        g = h2dVar7;
        h = new h2d[]{h2dVar, h2dVar2, h2dVar3, h2dVar4, h2dVar5, h2dVar6, h2dVar7};
    }

    public static h2d valueOf(String str) {
        return (h2d) Enum.valueOf(h2d.class, str);
    }

    public static h2d[] values() {
        return (h2d[]) h.clone();
    }
}

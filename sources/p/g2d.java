package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g2d {
    public static final g2d a;
    public static final g2d b;
    public static final g2d c;
    public static final g2d d;
    public static final g2d e;
    public static final g2d f;
    public static final /* synthetic */ g2d[] g;

    static {
        g2d g2dVar = new g2d("UNKNOWN", 0);
        a = g2dVar;
        g2d g2dVar2 = new g2d("INACTIVE", 1);
        b = g2dVar2;
        g2d g2dVar3 = new g2d("SEARCHING", 2);
        c = g2dVar3;
        g2d g2dVar4 = new g2d("FLASH_REQUIRED", 3);
        d = g2dVar4;
        g2d g2dVar5 = new g2d("CONVERGED", 4);
        e = g2dVar5;
        g2d g2dVar6 = new g2d("LOCKED", 5);
        f = g2dVar6;
        g = new g2d[]{g2dVar, g2dVar2, g2dVar3, g2dVar4, g2dVar5, g2dVar6};
    }

    public static g2d valueOf(String str) {
        return (g2d) Enum.valueOf(g2d.class, str);
    }

    public static g2d[] values() {
        return (g2d[]) g.clone();
    }
}

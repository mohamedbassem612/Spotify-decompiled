package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i2d {
    public static final i2d a;
    public static final i2d b;
    public static final i2d c;
    public static final i2d d;
    public static final i2d e;
    public static final /* synthetic */ i2d[] f;

    static {
        i2d i2dVar = new i2d("UNKNOWN", 0);
        a = i2dVar;
        i2d i2dVar2 = new i2d("INACTIVE", 1);
        b = i2dVar2;
        i2d i2dVar3 = new i2d("METERING", 2);
        c = i2dVar3;
        i2d i2dVar4 = new i2d("CONVERGED", 3);
        d = i2dVar4;
        i2d i2dVar5 = new i2d("LOCKED", 4);
        e = i2dVar5;
        f = new i2d[]{i2dVar, i2dVar2, i2dVar3, i2dVar4, i2dVar5};
    }

    public static i2d valueOf(String str) {
        return (i2d) Enum.valueOf(i2d.class, str);
    }

    public static i2d[] values() {
        return (i2d[]) f.clone();
    }
}

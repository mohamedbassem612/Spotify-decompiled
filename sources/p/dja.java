package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dja {
    public static final dja a;
    public static final dja b;
    public static final dja c;
    public static final /* synthetic */ dja[] d;

    static {
        dja djaVar = new dja("ENABLE", 0);
        a = djaVar;
        dja djaVar2 = new dja("ENABLED", 1);
        b = djaVar2;
        dja djaVar3 = new dja("ENABLE_WITH_UPDATES", 2);
        c = djaVar3;
        d = new dja[]{djaVar, djaVar2, djaVar3};
    }

    public static dja valueOf(String str) {
        return (dja) Enum.valueOf(dja.class, str);
    }

    public static dja[] values() {
        return (dja[]) d.clone();
    }
}

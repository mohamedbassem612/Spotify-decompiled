package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fbl {
    public static final fbl a;
    public static final fbl b;
    public static final fbl c;
    public static final fbl d;
    public static final /* synthetic */ fbl[] e;

    static {
        fbl fblVar = new fbl("BLUETOOTH", 0);
        a = fblVar;
        fbl fblVar2 = new fbl("WIRED", 1);
        b = fblVar2;
        fbl fblVar3 = new fbl("BLUETOOTH_AND_WIRED", 2);
        c = fblVar3;
        fbl fblVar4 = new fbl("NOTHING", 3);
        d = fblVar4;
        e = new fbl[]{fblVar, fblVar2, fblVar3, fblVar4};
    }

    public static fbl valueOf(String str) {
        return (fbl) Enum.valueOf(fbl.class, str);
    }

    public static fbl[] values() {
        return (fbl[]) e.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fkb {
    public static final fkb a;
    public static final fkb b;
    public static final fkb c;
    public static final fkb d;
    public static final fkb e;
    public static final /* synthetic */ fkb[] f;

    static {
        fkb fkbVar = new fkb("OFF", 0);
        a = fkbVar;
        fkb fkbVar2 = new fkb("TURNING_OFF", 1);
        b = fkbVar2;
        fkb fkbVar3 = new fkb("ON", 2);
        c = fkbVar3;
        fkb fkbVar4 = new fkb("TURNING_ON", 3);
        d = fkbVar4;
        fkb fkbVar5 = new fkb("UNKNOWN", 4);
        e = fkbVar5;
        f = new fkb[]{fkbVar, fkbVar2, fkbVar3, fkbVar4, fkbVar5};
    }

    public static fkb valueOf(String str) {
        return (fkb) Enum.valueOf(fkb.class, str);
    }

    public static fkb[] values() {
        return (fkb[]) f.clone();
    }
}

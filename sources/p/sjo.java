package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sjo {
    public static final sjo a;
    public static final sjo b;
    public static final sjo c;
    public static final sjo d;
    public static final /* synthetic */ sjo[] e;

    static {
        sjo sjoVar = new sjo("None", 0);
        a = sjoVar;
        sjo sjoVar2 = new sjo("Added", 1);
        b = sjoVar2;
        sjo sjoVar3 = new sjo("Hidden", 2);
        c = sjoVar3;
        sjo sjoVar4 = new sjo("Blocked", 3);
        d = sjoVar4;
        e = new sjo[]{sjoVar, sjoVar2, sjoVar3, sjoVar4};
    }

    public static sjo valueOf(String str) {
        return (sjo) Enum.valueOf(sjo.class, str);
    }

    public static sjo[] values() {
        return (sjo[]) e.clone();
    }
}

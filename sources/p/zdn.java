package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zdn {
    public static final zdn a;
    public static final zdn b;
    public static final zdn c;
    public static final zdn d;
    public static final /* synthetic */ zdn[] e;

    static {
        zdn zdnVar = new zdn("NORMAL", 0);
        a = zdnVar;
        zdn zdnVar2 = new zdn("SMALL", 1);
        b = zdnVar2;
        zdn zdnVar3 = new zdn("LARGE", 2);
        c = zdnVar3;
        zdn zdnVar4 = new zdn("XLARGE", 3);
        d = zdnVar4;
        e = new zdn[]{zdnVar, zdnVar2, zdnVar3, zdnVar4};
    }

    public static zdn valueOf(String str) {
        return (zdn) Enum.valueOf(zdn.class, str);
    }

    public static zdn[] values() {
        return (zdn[]) e.clone();
    }
}

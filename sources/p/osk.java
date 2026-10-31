package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class osk {
    public static final osk a;
    public static final osk b;
    public static final osk c;
    public static final /* synthetic */ osk[] d;

    static {
        osk oskVar = new osk("ALWAYS_OVERRIDE", 0);
        a = oskVar;
        osk oskVar2 = new osk("HIGH_PRIORITY_REQUIRED", 1);
        osk oskVar3 = new osk("REQUIRED", 2);
        b = oskVar3;
        osk oskVar4 = new osk("OPTIONAL", 3);
        c = oskVar4;
        d = new osk[]{oskVar, oskVar2, oskVar3, oskVar4};
    }

    public static osk valueOf(String str) {
        return (osk) Enum.valueOf(osk.class, str);
    }

    public static osk[] values() {
        return (osk[]) d.clone();
    }
}

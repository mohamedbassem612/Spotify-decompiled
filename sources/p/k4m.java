package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k4m {
    public static final k4m a;
    public static final k4m b;
    public static final k4m c;
    public static final k4m d;
    public static final /* synthetic */ k4m[] e;

    static {
        k4m k4mVar = new k4m("Over19Only", 0);
        a = k4mVar;
        k4m k4mVar2 = new k4m("Explicit", 1);
        b = k4mVar2;
        k4m k4mVar3 = new k4m("ExplicitLong", 2);
        c = k4mVar3;
        k4m k4mVar4 = new k4m("None", 3);
        d = k4mVar4;
        e = new k4m[]{k4mVar, k4mVar2, k4mVar3, k4mVar4};
    }

    public static k4m valueOf(String str) {
        return (k4m) Enum.valueOf(k4m.class, str);
    }

    public static k4m[] values() {
        return (k4m[]) e.clone();
    }
}

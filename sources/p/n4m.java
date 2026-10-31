package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n4m {
    public static final n4m a;
    public static final n4m b;
    public static final n4m c;
    public static final /* synthetic */ n4m[] d;

    static {
        n4m n4mVar = new n4m("Over19Only", 0);
        a = n4mVar;
        n4m n4mVar2 = new n4m("Explicit", 1);
        b = n4mVar2;
        n4m n4mVar3 = new n4m("ExplicitLong", 2);
        n4m n4mVar4 = new n4m("None", 3);
        c = n4mVar4;
        d = new n4m[]{n4mVar, n4mVar2, n4mVar3, n4mVar4};
    }

    public static n4m valueOf(String str) {
        return (n4m) Enum.valueOf(n4m.class, str);
    }

    public static n4m[] values() {
        return (n4m[]) d.clone();
    }
}

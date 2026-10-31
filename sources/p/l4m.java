package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l4m {
    public static final l4m a;
    public static final l4m b;
    public static final l4m c;
    public static final /* synthetic */ l4m[] d;

    static {
        l4m l4mVar = new l4m("Over19Only", 0);
        a = l4mVar;
        l4m l4mVar2 = new l4m("Explicit", 1);
        b = l4mVar2;
        l4m l4mVar3 = new l4m("None", 2);
        c = l4mVar3;
        d = new l4m[]{l4mVar, l4mVar2, l4mVar3};
    }

    public static l4m valueOf(String str) {
        return (l4m) Enum.valueOf(l4m.class, str);
    }

    public static l4m[] values() {
        return (l4m[]) d.clone();
    }
}

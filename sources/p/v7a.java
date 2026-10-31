package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v7a {
    public static final v7a a;
    public static final v7a b;
    public static final v7a c;
    public static final v7a d;
    public static final /* synthetic */ v7a[] e;

    static {
        v7a v7aVar = new v7a("QUEUED", 0);
        a = v7aVar;
        v7a v7aVar2 = new v7a("PRESENTED", 1);
        b = v7aVar2;
        v7a v7aVar3 = new v7a("DISMISSED", 2);
        c = v7aVar3;
        v7a v7aVar4 = new v7a("CANCELLED", 3);
        d = v7aVar4;
        e = new v7a[]{v7aVar, v7aVar2, v7aVar3, v7aVar4};
    }

    public static v7a valueOf(String str) {
        return (v7a) Enum.valueOf(v7a.class, str);
    }

    public static v7a[] values() {
        return (v7a[]) e.clone();
    }
}

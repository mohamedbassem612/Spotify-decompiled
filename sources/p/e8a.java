package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e8a {
    public static final e8a X;
    public static final /* synthetic */ e8a[] Y;
    public static final e8a a;
    public static final e8a b;
    public static final e8a c;
    public static final e8a d;
    public static final e8a e;
    public static final e8a f;
    public static final e8a g;
    public static final e8a h;
    public static final e8a i;
    public static final e8a t;

    static {
        e8a e8aVar = new e8a("ALL_SUCCESS", 0);
        a = e8aVar;
        e8a e8aVar2 = new e8a("PARTIAL_SUCCESS", 1);
        b = e8aVar2;
        e8a e8aVar3 = new e8a("ALL_FAIL", 2);
        c = e8aVar3;
        e8a e8aVar4 = new e8a("PARTIAL", 3);
        d = e8aVar4;
        e8a e8aVar5 = new e8a("PARTIAL_FAIL", 4);
        e = e8aVar5;
        e8a e8aVar6 = new e8a("SUCCESSFUL_FAIL", 5);
        f = e8aVar6;
        e8a e8aVar7 = new e8a("SUCCESSFUL_PARTIAL_FAIL", 6);
        g = e8aVar7;
        e8a e8aVar8 = new e8a("PARTIAL_24H", 7);
        h = e8aVar8;
        e8a e8aVar9 = new e8a("PARTIAL_48H", 8);
        i = e8aVar9;
        e8a e8aVar10 = new e8a("PARTIAL_FAIL_24H", 9);
        t = e8aVar10;
        e8a e8aVar11 = new e8a("PARTIAL_FAIL_48H", 10);
        X = e8aVar11;
        Y = new e8a[]{e8aVar, e8aVar2, e8aVar3, e8aVar4, e8aVar5, e8aVar6, e8aVar7, e8aVar8, e8aVar9, e8aVar10, e8aVar11};
    }

    public static e8a valueOf(String str) {
        return (e8a) Enum.valueOf(e8a.class, str);
    }

    public static e8a[] values() {
        return (e8a[]) Y.clone();
    }
}

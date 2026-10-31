package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l1u {
    public static final /* synthetic */ l1u[] X;
    public static final l1u a;
    public static final l1u b;
    public static final l1u c;
    public static final l1u d;
    public static final l1u e;
    public static final l1u f;
    public static final l1u g;
    public static final l1u h;
    public static final l1u i;
    public static final l1u t;

    static {
        l1u l1uVar = new l1u("STORED", 0);
        a = l1uVar;
        l1u l1uVar2 = new l1u("INVALID_ID", 1);
        b = l1uVar2;
        l1u l1uVar3 = new l1u("MISSING_PAYLOAD", 2);
        c = l1uVar3;
        l1u l1uVar4 = new l1u("INVALID_SIZE", 3);
        d = l1uVar4;
        l1u l1uVar5 = new l1u("PAYLOAD_CHANGED", 4);
        e = l1uVar5;
        l1u l1uVar6 = new l1u("CONFLICT", 5);
        f = l1uVar6;
        l1u l1uVar7 = new l1u("BUSY", 6);
        g = l1uVar7;
        l1u l1uVar8 = new l1u("CAPACITY_EXCEEDED", 7);
        h = l1uVar8;
        l1u l1uVar9 = new l1u("IO_FAILURE", 8);
        i = l1uVar9;
        l1u l1uVar10 = new l1u("ACCESS_DENIED", 9);
        t = l1uVar10;
        X = new l1u[]{l1uVar, l1uVar2, l1uVar3, l1uVar4, l1uVar5, l1uVar6, l1uVar7, l1uVar8, l1uVar9, l1uVar10};
    }

    public static l1u valueOf(String str) {
        return (l1u) Enum.valueOf(l1u.class, str);
    }

    public static l1u[] values() {
        return (l1u[]) X.clone();
    }
}

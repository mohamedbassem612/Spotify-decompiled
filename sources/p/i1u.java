package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i1u {
    public static final i1u a;
    public static final i1u b;
    public static final i1u c;
    public static final /* synthetic */ i1u[] d;

    static {
        i1u i1uVar = new i1u("NOTHING_PENDING", 0);
        a = i1uVar;
        i1u i1uVar2 = new i1u("COMPLETED", 1);
        b = i1uVar2;
        i1u i1uVar3 = new i1u("RETRY", 2);
        c = i1uVar3;
        d = new i1u[]{i1uVar, i1uVar2, i1uVar3};
    }

    public static i1u valueOf(String str) {
        return (i1u) Enum.valueOf(i1u.class, str);
    }

    public static i1u[] values() {
        return (i1u[]) d.clone();
    }
}

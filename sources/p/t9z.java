package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t9z {
    public static final t9z a;
    public static final t9z b;
    public static final t9z c;
    public static final t9z d;
    public static final /* synthetic */ t9z[] e;

    static {
        t9z t9zVar = new t9z("RowClicked", 0);
        a = t9zVar;
        t9z t9zVar2 = new t9z("AddClicked", 1);
        b = t9zVar2;
        t9z t9zVar3 = new t9z("PreviewPlayClicked", 2);
        c = t9zVar3;
        t9z t9zVar4 = new t9z("PreviewPauseClicked", 3);
        d = t9zVar4;
        e = new t9z[]{t9zVar, t9zVar2, t9zVar3, t9zVar4};
    }

    public static t9z valueOf(String str) {
        return (t9z) Enum.valueOf(t9z.class, str);
    }

    public static t9z[] values() {
        return (t9z[]) e.clone();
    }
}

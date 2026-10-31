package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s2z {
    public static final s2z a;
    public static final s2z b;
    public static final s2z c;
    public static final s2z d;
    public static final /* synthetic */ s2z[] e;

    static {
        s2z s2zVar = new s2z("RowClicked", 0);
        a = s2zVar;
        s2z s2zVar2 = new s2z("ExpandableDescriptionClicked", 1);
        b = s2zVar2;
        s2z s2zVar3 = new s2z("AddToLibraryClicked", 2);
        c = s2zVar3;
        s2z s2zVar4 = new s2z("ContextMenuClicked", 3);
        d = s2zVar4;
        e = new s2z[]{s2zVar, s2zVar2, s2zVar3, s2zVar4};
    }

    public static s2z valueOf(String str) {
        return (s2z) Enum.valueOf(s2z.class, str);
    }

    public static s2z[] values() {
        return (s2z[]) e.clone();
    }
}

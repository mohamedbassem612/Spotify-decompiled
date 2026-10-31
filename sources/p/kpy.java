package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kpy {
    public static final kpy a;
    public static final kpy b;
    public static final kpy c;
    public static final kpy d;
    public static final kpy e;
    public static final kpy f;
    public static final kpy g;
    public static final /* synthetic */ kpy[] h;

    static {
        kpy kpyVar = new kpy("Swiped", 0);
        a = kpyVar;
        kpy kpyVar2 = new kpy("RowClicked", 1);
        b = kpyVar2;
        kpy kpyVar3 = new kpy("PinClicked", 2);
        kpy kpyVar4 = new kpy("RowLongClicked", 3);
        c = kpyVar4;
        kpy kpyVar5 = new kpy("DismissClicked", 4);
        d = kpyVar5;
        kpy kpyVar6 = new kpy("ContextMenuClicked", 5);
        e = kpyVar6;
        kpy kpyVar7 = new kpy("FollowClicked", 6);
        f = kpyVar7;
        kpy kpyVar8 = new kpy("SelectionToggled", 7);
        g = kpyVar8;
        h = new kpy[]{kpyVar, kpyVar2, kpyVar3, kpyVar4, kpyVar5, kpyVar6, kpyVar7, kpyVar8};
    }

    public static kpy valueOf(String str) {
        return (kpy) Enum.valueOf(kpy.class, str);
    }

    public static kpy[] values() {
        return (kpy[]) h.clone();
    }
}

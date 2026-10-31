package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bst {
    public static final bst a;
    public static final bst b;
    public static final /* synthetic */ bst[] c;

    static {
        bst bstVar = new bst("CONSENT_ONLY", 0);
        a = bstVar;
        bst bstVar2 = new bst("CONSENT_AND_PERMISSION", 1);
        b = bstVar2;
        c = new bst[]{bstVar, bstVar2};
    }

    public static bst valueOf(String str) {
        return (bst) Enum.valueOf(bst.class, str);
    }

    public static bst[] values() {
        return (bst[]) c.clone();
    }
}

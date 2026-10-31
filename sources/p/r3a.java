package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r3a {
    public static final r3a a;
    public static final r3a b;
    public static final /* synthetic */ r3a[] c;

    static {
        r3a r3aVar = new r3a("OnDislikeClicked", 0);
        a = r3aVar;
        r3a r3aVar2 = new r3a("OnRemoveDislikeClicked", 1);
        b = r3aVar2;
        c = new r3a[]{r3aVar, r3aVar2};
    }

    public static r3a valueOf(String str) {
        return (r3a) Enum.valueOf(r3a.class, str);
    }

    public static r3a[] values() {
        return (r3a[]) c.clone();
    }
}

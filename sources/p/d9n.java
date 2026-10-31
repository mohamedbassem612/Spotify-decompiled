package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d9n {
    public static final d9n a;
    public static final d9n b;
    public static final d9n c;
    public static final /* synthetic */ d9n[] d;

    static {
        d9n d9nVar = new d9n("COROUTINE_SUSPENDED", 0);
        a = d9nVar;
        d9n d9nVar2 = new d9n("UNDECIDED", 1);
        b = d9nVar2;
        d9n d9nVar3 = new d9n("RESUMED", 2);
        c = d9nVar3;
        d = new d9n[]{d9nVar, d9nVar2, d9nVar3};
    }

    public static d9n valueOf(String str) {
        return (d9n) Enum.valueOf(d9n.class, str);
    }

    public static d9n[] values() {
        return (d9n[]) d.clone();
    }
}

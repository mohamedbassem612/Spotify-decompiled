package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nbl {
    public static final nbl a;
    public static final nbl b;
    public static final nbl c;
    public static final /* synthetic */ nbl[] d;

    static {
        nbl nblVar = new nbl("OFFLINE", 0);
        a = nblVar;
        nbl nblVar2 = new nbl("ONLINE_UNAUTHENTICATED", 1);
        b = nblVar2;
        nbl nblVar3 = new nbl("ONLINE_AUTHENTICATED", 2);
        c = nblVar3;
        d = new nbl[]{nblVar, nblVar2, nblVar3};
    }

    public static nbl valueOf(String str) {
        return (nbl) Enum.valueOf(nbl.class, str);
    }

    public static nbl[] values() {
        return (nbl[]) d.clone();
    }
}

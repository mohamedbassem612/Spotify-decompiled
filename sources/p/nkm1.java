package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nkm1 {
    public static final /* synthetic */ nkm1[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    nkm1 EF5;

    static {
        nkm1[] nkm1VarArr = {new nkm1("GOOGLE", 0)};
        a = nkm1VarArr;
        b = new t0z(nkm1VarArr);
    }

    public static nkm1 valueOf(String str) {
        return (nkm1) Enum.valueOf(nkm1.class, str);
    }

    public static nkm1[] values() {
        return (nkm1[]) a.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q3a {
    public static final q3a a;
    public static final q3a b;
    public static final /* synthetic */ q3a[] c;

    static {
        q3a q3aVar = new q3a("BanHit", 0);
        a = q3aVar;
        q3a q3aVar2 = new q3a("UnbanHit", 1);
        b = q3aVar2;
        c = new q3a[]{q3aVar, q3aVar2};
    }

    public static q3a valueOf(String str) {
        return (q3a) Enum.valueOf(q3a.class, str);
    }

    public static q3a[] values() {
        return (q3a[]) c.clone();
    }
}

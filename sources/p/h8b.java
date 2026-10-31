package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h8b {
    public static final h8b a;
    public static final h8b b;
    public static final /* synthetic */ h8b[] c;
    public static final /* synthetic */ t0z d;

    static {
        h8b h8bVar = new h8b("PENDING_DISABLED", 0);
        a = h8bVar;
        h8b h8bVar2 = new h8b("REACTIVATED", 1);
        b = h8bVar2;
        h8b[] h8bVarArr = {h8bVar, h8bVar2};
        c = h8bVarArr;
        d = new t0z(h8bVarArr);
    }

    public static h8b valueOf(String str) {
        return (h8b) Enum.valueOf(h8b.class, str);
    }

    public static h8b[] values() {
        return (h8b[]) c.clone();
    }
}

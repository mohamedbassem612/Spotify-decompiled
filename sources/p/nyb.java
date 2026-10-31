package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nyb {
    public static final nyb a;
    public static final nyb b;
    public static final nyb c;
    public static final nyb d;
    public static final /* synthetic */ nyb[] e;

    static {
        nyb nybVar = new nyb("HIDDEN", 0);
        a = nybVar;
        nyb nybVar2 = new nyb("SHOW_PICKER", 1);
        b = nybVar2;
        nyb nybVar3 = new nyb("CREATE_SHOW", 2);
        c = nybVar3;
        nyb nybVar4 = new nyb("CONNECTOR_APPS", 3);
        d = nybVar4;
        e = new nyb[]{nybVar, nybVar2, nybVar3, nybVar4};
    }

    public static nyb valueOf(String str) {
        return (nyb) Enum.valueOf(nyb.class, str);
    }

    public static nyb[] values() {
        return (nyb[]) e.clone();
    }
}

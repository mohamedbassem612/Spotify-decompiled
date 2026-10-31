package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ova {
    public static final ova a;
    public static final ova b;
    public static final ova c;
    public static final /* synthetic */ ova[] d;

    static {
        ova ovaVar = new ova("SELF_ONLY", 0);
        a = ovaVar;
        ova ovaVar2 = new ova("CONNECTIONS_ONLY", 1);
        b = ovaVar2;
        ova ovaVar3 = new ova("PUBLIC", 2);
        c = ovaVar3;
        d = new ova[]{ovaVar, ovaVar2, ovaVar3};
    }

    public static ova valueOf(String str) {
        return (ova) Enum.valueOf(ova.class, str);
    }

    public static ova[] values() {
        return (ova[]) d.clone();
    }
}

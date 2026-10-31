package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ixb {
    public static final ixb a;
    public static final ixb b;
    public static final ixb c;
    public static final /* synthetic */ ixb[] d;

    static {
        ixb ixbVar = new ixb("Collapsed", 0);
        a = ixbVar;
        ixb ixbVar2 = new ixb("Expanded", 1);
        b = ixbVar2;
        ixb ixbVar3 = new ixb("Hidden", 2);
        c = ixbVar3;
        d = new ixb[]{ixbVar, ixbVar2, ixbVar3};
    }

    public static ixb valueOf(String str) {
        return (ixb) Enum.valueOf(ixb.class, str);
    }

    public static ixb[] values() {
        return (ixb[]) d.clone();
    }
}

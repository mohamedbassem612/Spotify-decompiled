package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class zpc1 {

    /* JADX INFO: Fake field, exist only in values array */
    zpc1 EF5;
    public static final /* synthetic */ zpc1[] b = {new zpc1("HUMAN", 0), new zpc1("MACHINE", 1)};
    public static final ypc1 Companion = new ypc1();
    public static final znb0 a = dm5.S(2, l4b1.Z0);

    public static zpc1 valueOf(String str) {
        return (zpc1) Enum.valueOf(zpc1.class, str);
    }

    public static zpc1[] values() {
        return (zpc1[]) b.clone();
    }
}

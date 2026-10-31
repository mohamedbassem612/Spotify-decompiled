package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kfc {
    public static final /* synthetic */ kfc[] a = {new kfc("LARGE", 0), new kfc("SMALL", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    kfc EF5;

    public static kfc valueOf(String str) {
        return (kfc) Enum.valueOf(kfc.class, str);
    }

    public static kfc[] values() {
        return (kfc[]) a.clone();
    }
}

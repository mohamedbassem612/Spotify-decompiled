package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pet {
    public static final pet a;
    public static final /* synthetic */ pet[] b;

    static {
        pet petVar = new pet("LINK_TAPPED", 0);
        a = petVar;
        b = new pet[]{petVar};
    }

    public static pet valueOf(String str) {
        return (pet) Enum.valueOf(pet.class, str);
    }

    public static pet[] values() {
        return (pet[]) b.clone();
    }
}

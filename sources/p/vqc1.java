package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class vqc1 {

    /* JADX INFO: Fake field, exist only in values array */
    vqc1 EF5;
    public static final /* synthetic */ vqc1[] b = {new vqc1("CREATOR", 0), new vqc1("SPOTIFY", 1)};
    public static final uqc1 Companion = new uqc1();
    public static final znb0 a = dm5.S(2, l4b1.a1);

    public static vqc1 valueOf(String str) {
        return (vqc1) Enum.valueOf(vqc1.class, str);
    }

    public static vqc1[] values() {
        return (vqc1[]) b.clone();
    }
}

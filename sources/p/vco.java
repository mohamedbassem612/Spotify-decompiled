package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vco {
    public static final vco a;
    public static final vco b;
    public static final /* synthetic */ vco[] c;

    static {
        vco vcoVar = new vco("CardClicked", 0);
        a = vcoVar;
        vco vcoVar2 = new vco("CTAButtonClicked", 1);
        b = vcoVar2;
        c = new vco[]{vcoVar, vcoVar2};
    }

    public static vco valueOf(String str) {
        return (vco) Enum.valueOf(vco.class, str);
    }

    public static vco[] values() {
        return (vco[]) c.clone();
    }
}

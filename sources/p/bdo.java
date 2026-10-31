package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bdo {
    public static final bdo a;
    public static final bdo b;
    public static final /* synthetic */ bdo[] c;

    static {
        bdo bdoVar = new bdo("CardClicked", 0);
        a = bdoVar;
        bdo bdoVar2 = new bdo("CTAButtonClicked", 1);
        b = bdoVar2;
        c = new bdo[]{bdoVar, bdoVar2};
    }

    public static bdo valueOf(String str) {
        return (bdo) Enum.valueOf(bdo.class, str);
    }

    public static bdo[] values() {
        return (bdo[]) c.clone();
    }
}

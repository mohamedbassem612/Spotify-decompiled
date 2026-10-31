package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mdo {
    public static final mdo a;
    public static final mdo b;
    public static final /* synthetic */ mdo[] c;

    static {
        mdo mdoVar = new mdo("CardClicked", 0);
        a = mdoVar;
        mdo mdoVar2 = new mdo("CTAButtonClicked", 1);
        b = mdoVar2;
        c = new mdo[]{mdoVar, mdoVar2};
    }

    public static mdo valueOf(String str) {
        return (mdo) Enum.valueOf(mdo.class, str);
    }

    public static mdo[] values() {
        return (mdo[]) c.clone();
    }
}

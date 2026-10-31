package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h2x {
    public static final h2x a;
    public static final h2x b;
    public static final h2x c;
    public static final h2x d;
    public static final h2x e;
    public static final /* synthetic */ h2x[] f;

    static {
        h2x h2xVar = new h2x("CardClicked", 0);
        a = h2xVar;
        h2x h2xVar2 = new h2x("CallToActionClicked", 1);
        b = h2xVar2;
        h2x h2xVar3 = new h2x("CloseClicked", 2);
        c = h2xVar3;
        h2x h2xVar4 = new h2x("VideoActionClicked", 3);
        d = h2xVar4;
        h2x h2xVar5 = new h2x("VolumeClicked", 4);
        e = h2xVar5;
        f = new h2x[]{h2xVar, h2xVar2, h2xVar3, h2xVar4, h2xVar5};
    }

    public static h2x valueOf(String str) {
        return (h2x) Enum.valueOf(h2x.class, str);
    }

    public static h2x[] values() {
        return (h2x[]) f.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fll {
    public static final fll a;
    public static final fll b;
    public static final fll c;
    public static final fll d;
    public static final fll e;
    public static final fll f;
    public static final fll g;
    public static final /* synthetic */ fll[] h;

    static {
        fll fllVar = new fll("Unspecified", 0);
        a = fllVar;
        fll fllVar2 = new fll("Audio", 1);
        b = fllVar2;
        fll fllVar3 = new fll("Video", 2);
        c = fllVar3;
        fll fllVar4 = new fll("Parrot", 3);
        d = fllVar4;
        fll fllVar5 = new fll("Lossless", 4);
        e = fllVar5;
        fll fllVar6 = new fll("Generated", 5);
        f = fllVar6;
        fll fllVar7 = new fll("Unrecognized", 6);
        g = fllVar7;
        h = new fll[]{fllVar, fllVar2, fllVar3, fllVar4, fllVar5, fllVar6, fllVar7};
    }

    public static fll valueOf(String str) {
        return (fll) Enum.valueOf(fll.class, str);
    }

    public static fll[] values() {
        return (fll[]) h.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d3x {
    public static final d3x a;
    public static final d3x b;
    public static final d3x c;
    public static final d3x d;
    public static final /* synthetic */ d3x[] e;

    static {
        d3x d3xVar = new d3x("INITIAL", 0);
        a = d3xVar;
        d3x d3xVar2 = new d3x("PENDING", 1);
        b = d3xVar2;
        d3x d3xVar3 = new d3x("AD_AVAILABLE", 2);
        c = d3xVar3;
        d3x d3xVar4 = new d3x("NO_AD_AVAILABLE", 3);
        d = d3xVar4;
        e = new d3x[]{d3xVar, d3xVar2, d3xVar3, d3xVar4};
    }

    public static d3x valueOf(String str) {
        return (d3x) Enum.valueOf(d3x.class, str);
    }

    public static d3x[] values() {
        return (d3x[]) e.clone();
    }
}

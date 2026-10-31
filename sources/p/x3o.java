package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x3o {
    public static final x3o a;
    public static final x3o b;
    public static final /* synthetic */ x3o[] c;

    static {
        x3o x3oVar = new x3o("CLIENT_PRODUCED", 0);
        a = x3oVar;
        x3o x3oVar2 = new x3o("INFERRED", 1);
        b = x3oVar2;
        c = new x3o[]{x3oVar, x3oVar2};
    }

    public static x3o valueOf(String str) {
        return (x3o) Enum.valueOf(x3o.class, str);
    }

    public static x3o[] values() {
        return (x3o[]) c.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6o {
    public static final c6o a;
    public static final c6o b;
    public static final /* synthetic */ c6o[] c;

    static {
        c6o c6oVar = new c6o("ALL", 0);
        a = c6oVar;
        c6o c6oVar2 = new c6o("PASSKEY_ONLY", 1);
        b = c6oVar2;
        c = new c6o[]{c6oVar, c6oVar2};
    }

    public static c6o valueOf(String str) {
        return (c6o) Enum.valueOf(c6o.class, str);
    }

    public static c6o[] values() {
        return (c6o[]) c.clone();
    }
}

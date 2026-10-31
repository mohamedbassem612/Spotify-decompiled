package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c5h {
    public static final c5h a;
    public static final c5h b;
    public static final /* synthetic */ c5h[] c;

    static {
        c5h c5hVar = new c5h("NORMAL", 0);
        a = c5hVar;
        c5h c5hVar2 = new c5h("COMPACT", 1);
        b = c5hVar2;
        c = new c5h[]{c5hVar, c5hVar2};
    }

    public static c5h valueOf(String str) {
        return (c5h) Enum.valueOf(c5h.class, str);
    }

    public static c5h[] values() {
        return (c5h[]) c.clone();
    }
}

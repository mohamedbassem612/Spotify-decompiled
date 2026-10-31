package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a7h {
    public static final a7h a;
    public static final a7h b;
    public static final /* synthetic */ a7h[] c;

    static {
        a7h a7hVar = new a7h("SWATCHES", 0);
        a = a7hVar;
        a7h a7hVar2 = new a7h("INVITE_COLLABORATORS", 1);
        b = a7hVar2;
        c = new a7h[]{a7hVar, a7hVar2};
    }

    public static a7h valueOf(String str) {
        return (a7h) Enum.valueOf(a7h.class, str);
    }

    public static a7h[] values() {
        return (a7h[]) c.clone();
    }
}

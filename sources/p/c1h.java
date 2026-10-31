package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c1h {
    public static final c1h[] a;
    public static final c1h b;
    public static final c1h c;
    public static final c1h d;
    public static final /* synthetic */ c1h[] e;

    static {
        c1h c1hVar = new c1h("TRACK", 0);
        b = c1hVar;
        c1h c1hVar2 = new c1h("LIKED_RELEASES_HEADING", 1);
        c = c1hVar2;
        c1h c1hVar3 = new c1h("ALBUM", 2);
        d = c1hVar3;
        c1h[] c1hVarArr = {c1hVar, c1hVar2, c1hVar3};
        e = c1hVarArr;
        a = (c1h[]) bmq0.d0(new t0z(c1hVarArr), new c1h[0]);
    }

    public static c1h valueOf(String str) {
        return (c1h) Enum.valueOf(c1h.class, str);
    }

    public static c1h[] values() {
        return (c1h[]) e.clone();
    }
}

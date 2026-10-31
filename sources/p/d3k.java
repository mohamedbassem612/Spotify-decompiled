package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d3k {
    public static final d3k a;
    public static final d3k b;
    public static final d3k c;
    public static final d3k d;
    public static final d3k e;
    public static final /* synthetic */ d3k[] f;

    static {
        d3k d3kVar = new d3k("NETWORK_ERROR", 0);
        a = d3kVar;
        d3k d3kVar2 = new d3k("SERVER_ERROR", 1);
        d3k d3kVar3 = new d3k("TIMEOUT", 2);
        b = d3kVar3;
        d3k d3kVar4 = new d3k("ASSET_LOAD_FAILURE", 3);
        c = d3kVar4;
        d3k d3kVar5 = new d3k("CONTENT_PARSE_ERROR", 4);
        d = d3kVar5;
        d3k d3kVar6 = new d3k("UNKNOWN", 5);
        e = d3kVar6;
        f = new d3k[]{d3kVar, d3kVar2, d3kVar3, d3kVar4, d3kVar5, d3kVar6};
    }

    public static d3k valueOf(String str) {
        return (d3k) Enum.valueOf(d3k.class, str);
    }

    public static d3k[] values() {
        return (d3k[]) f.clone();
    }
}

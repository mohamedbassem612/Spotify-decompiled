package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sjz {
    public static final sjz a;
    public static final sjz b;
    public static final sjz c;
    public static final sjz d;
    public static final sjz e;
    public static final sjz f;
    public static final /* synthetic */ sjz[] g;

    static {
        sjz sjzVar = new sjz("NETWORK_ERROR", 0);
        a = sjzVar;
        sjz sjzVar2 = new sjz("SERVER_ERROR", 1);
        b = sjzVar2;
        sjz sjzVar3 = new sjz("TIMEOUT", 2);
        c = sjzVar3;
        sjz sjzVar4 = new sjz("ASSET_LOAD_FAILURE", 3);
        d = sjzVar4;
        sjz sjzVar5 = new sjz("CONTENT_PARSE_ERROR", 4);
        e = sjzVar5;
        sjz sjzVar6 = new sjz("UNKNOWN", 5);
        f = sjzVar6;
        g = new sjz[]{sjzVar, sjzVar2, sjzVar3, sjzVar4, sjzVar5, sjzVar6};
    }

    public static sjz valueOf(String str) {
        return (sjz) Enum.valueOf(sjz.class, str);
    }

    public static sjz[] values() {
        return (sjz[]) g.clone();
    }
}

package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y7o {
    public static final y7o a;
    public static final y7o b;
    public static final y7o c;
    public static final y7o d;
    public static final y7o e;
    public static final /* synthetic */ y7o[] f;

    static {
        y7o y7oVar = new y7o("CRONET_SOURCE_UNSPECIFIED", 0);
        a = y7oVar;
        y7o y7oVar2 = new y7o("CRONET_SOURCE_STATICALLY_LINKED", 1);
        b = y7oVar2;
        y7o y7oVar3 = new y7o("CRONET_SOURCE_PLAY_SERVICES", 2);
        c = y7oVar3;
        y7o y7oVar4 = new y7o("CRONET_SOURCE_FALLBACK", 3);
        d = y7oVar4;
        y7o y7oVar5 = new y7o("CRONET_SOURCE_PLATFORM", 4);
        e = y7oVar5;
        f = new y7o[]{y7oVar, y7oVar2, y7oVar3, y7oVar4, y7oVar5, new y7o("CRONET_SOURCE_FAKE", 5)};
    }

    public static y7o valueOf(String str) {
        return (y7o) Enum.valueOf(y7o.class, str);
    }

    public static y7o[] values() {
        return (y7o[]) f.clone();
    }
}

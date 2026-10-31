package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uhm {
    public static final uhm a;
    public static final uhm b;
    public static final uhm c;
    public static final uhm d;
    public static final uhm e;
    public static final /* synthetic */ uhm[] f;

    static {
        uhm uhmVar = new uhm("Puffin", 0);
        a = uhmVar;
        uhm uhmVar2 = new uhm("Lossless", 1);
        b = uhmVar2;
        uhm uhmVar3 = new uhm("ConnectLogout", 2);
        c = uhmVar3;
        uhm uhmVar4 = new uhm("ConnectThirdParty", 3);
        d = uhmVar4;
        uhm uhmVar5 = new uhm("ConnectIncarnation", 4);
        e = uhmVar5;
        f = new uhm[]{uhmVar, uhmVar2, uhmVar3, uhmVar4, uhmVar5};
    }

    public static uhm valueOf(String str) {
        return (uhm) Enum.valueOf(uhm.class, str);
    }

    public static uhm[] values() {
        return (uhm[]) f.clone();
    }
}

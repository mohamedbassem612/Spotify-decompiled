package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class agv {
    public static final agv a;
    public static final agv b;
    public static final /* synthetic */ agv[] c;

    static {
        agv agvVar = new agv("TOTAL_DURATION", 0);
        a = agvVar;
        agv agvVar2 = new agv("REMAINING_TIME", 1);
        b = agvVar2;
        c = new agv[]{agvVar, agvVar2};
    }

    public static agv valueOf(String str) {
        return (agv) Enum.valueOf(agv.class, str);
    }

    public static agv[] values() {
        return (agv[]) c.clone();
    }
}

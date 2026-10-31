package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hhm {
    public static final hhm a;
    public static final hhm b;
    public static final hhm c;
    public static final /* synthetic */ hhm[] d;

    static {
        hhm hhmVar = new hhm("DEFAULT", 0);
        a = hhmVar;
        hhm hhmVar2 = new hhm("ACTIVE", 1);
        b = hhmVar2;
        hhm hhmVar3 = new hhm("DESTRUCTIVE", 2);
        c = hhmVar3;
        d = new hhm[]{hhmVar, hhmVar2, hhmVar3};
    }

    public static hhm valueOf(String str) {
        return (hhm) Enum.valueOf(hhm.class, str);
    }

    public static hhm[] values() {
        return (hhm[]) d.clone();
    }
}

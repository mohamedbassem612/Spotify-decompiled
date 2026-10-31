package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ake {
    public static final ake a;
    public static final ake b;
    public static final ake c;
    public static final /* synthetic */ ake[] d;

    static {
        ake akeVar = new ake("FINISHED", 0);
        a = akeVar;
        ake akeVar2 = new ake("NOT_STARTED", 1);
        b = akeVar2;
        ake akeVar3 = new ake("IN_PROGRESS", 2);
        c = akeVar3;
        d = new ake[]{akeVar, akeVar2, akeVar3};
    }

    public static ake valueOf(String str) {
        return (ake) Enum.valueOf(ake.class, str);
    }

    public static ake[] values() {
        return (ake[]) d.clone();
    }
}

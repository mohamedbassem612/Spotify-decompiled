package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bke {
    public static final bke a;
    public static final /* synthetic */ bke[] b;
    public static final /* synthetic */ t0z c;

    static {
        bke bkeVar = new bke("MARK_AS_FINISHED", 0);
        a = bkeVar;
        bke[] bkeVarArr = {bkeVar, new bke("MARK_AS_NOT_STARTED", 1), new bke("MARK_AS_FINISHED_UP_TO_HERE", 2), new bke("MARK_AS_NOT_STARTED_FROM_HERE", 3)};
        b = bkeVarArr;
        c = new t0z(bkeVarArr);
    }

    public static bke valueOf(String str) {
        return (bke) Enum.valueOf(bke.class, str);
    }

    public static bke[] values() {
        return (bke[]) b.clone();
    }
}

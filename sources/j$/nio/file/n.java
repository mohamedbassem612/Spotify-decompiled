package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class n {
    public static final n END_DIRECTORY;
    public static final n ENTRY;
    public static final n START_DIRECTORY;
    public static final /* synthetic */ n[] a;

    static {
        n nVar = new n("START_DIRECTORY", 0);
        START_DIRECTORY = nVar;
        n nVar2 = new n("END_DIRECTORY", 1);
        END_DIRECTORY = nVar2;
        n nVar3 = new n("ENTRY", 2);
        ENTRY = nVar3;
        a = new n[]{nVar, nVar2, nVar3};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) a.clone();
    }
}

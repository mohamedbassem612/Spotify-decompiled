package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.x64[], still in use, count: 1, list:
  (r0v1 p.x64[]) from 0x001c: CONSTRUCTOR (r0v1 p.x64[]) A[WRAPPED] (LINE:29) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x64 {
    /* JADX INFO: Fake field, exist only in values array */
    OfflineLibraryUri("spotify:android-auto:offline-library"),
    /* JADX INFO: Fake field, exist only in values array */
    NonPlayableItem("non-playable-item");

    public static final /* synthetic */ t0z c;
    public final String a;

    static {
        c = new t0z(x64VarArr);
    }

    public x64(String str) {
        super(str, i);
        this.a = str;
    }

    public static x64 valueOf(String str) {
        return (x64) Enum.valueOf(x64.class, str);
    }

    public static x64[] values() {
        return (x64[]) b.clone();
    }
}

package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.qkg[], still in use, count: 1, list:
  (r0v1 p.qkg[]) from 0x00ac: CONSTRUCTOR (r0v1 p.qkg[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:173) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qkg {
    DEFAULT(0, "default"),
    MUSIC(1, "music-chip"),
    MUSIC_FOLLOWING(2, "music-following-chip"),
    PODCASTS(3, "podcasts-chip"),
    AUDIOBOOKS(4, "audiobooks-chip"),
    PODCASTS_FOLLOWING(5, "podcasts-following-chip"),
    WRAPPED(6, "wrapped-chip"),
    VIDEO(7, "video-chip"),
    /* JADX INFO: Fake field, exist only in values array */
    QUINCY(8, "rh-quincy"),
    /* JADX INFO: Fake field, exist only in values array */
    RH_PICKER_FEED(9, "rh-picker-feed"),
    /* JADX INFO: Fake field, exist only in values array */
    RH_TANGO_FEED(10, "rh-tango-feed"),
    /* JADX INFO: Fake field, exist only in values array */
    SLOT(11, "slot");

    public static final /* synthetic */ t0z Y;
    public final String a;
    public final String b;

    static {
        Y = new t0z(qkgVarArr);
    }

    public qkg(int i, String str) {
        super(str, i);
        this.a = str;
        this.b = str;
    }

    public static qkg valueOf(String str) {
        return (qkg) Enum.valueOf(qkg.class, str);
    }

    public static qkg[] values() {
        return (qkg[]) X.clone();
    }
}

package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 p.mo21[], still in use, count: 1, list:
  (r0v17 p.mo21[]) from 0x00e9: CONSTRUCTOR (r0v17 p.mo21[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:234) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mo21 {
    ALBUM("album"),
    ARTIST("artist"),
    GENRE("genre"),
    PLAYLIST("playlist"),
    USER_PROFILE("user_profile"),
    TRACK("track"),
    AUDIO_SHOW("show"),
    AUDIO_EPISODE("audio_episode"),
    AUDIOBOOK("audiobook"),
    /* JADX INFO: Fake field, exist only in values array */
    SECTION("section"),
    AUTHOR("author"),
    /* JADX INFO: Fake field, exist only in values array */
    CONCERT("concert"),
    KALLAX("kallax"),
    /* JADX INFO: Fake field, exist only in values array */
    VENUE("venue"),
    PODCAST_CHAPTER("podcast_chapter"),
    CONTENT_AGNOSTIC("content_agnostic"),
    QUERY("query");

    public static final /* synthetic */ t0z Q0;
    public final String a;

    static {
        Q0 = new t0z(mo21VarArr);
    }

    public mo21(String str) {
        super(str, i);
        this.a = str;
    }

    public static mo21 valueOf(String str) {
        return (mo21) Enum.valueOf(mo21.class, str);
    }

    public static mo21[] values() {
        return (mo21[]) P0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}

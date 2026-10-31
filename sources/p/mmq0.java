package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v16 p.mmq0[], still in use, count: 1, list:
  (r0v16 p.mmq0[]) from 0x00ca: CONSTRUCTOR (r0v16 p.mmq0[]) A[WRAPPED] (LINE:203) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mmq0 {
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_ARTIST_RECOMMENDATIONS("notify-music-and-artist-recommendations"),
    CONCERTS_EVENTS("notify-in-person-concerts-and-events"),
    /* JADX INFO: Fake field, exist only in values array */
    OFFERS_AND_BUNDLES("notify-spotify-offers-and-bundles"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPERIENCES_MADE_FOR_YOU("notify-spotify-experiences-made-for-you"),
    /* JADX INFO: Fake field, exist only in values array */
    PODCAST_SHOW_RECOMMENDATIONS("notify-podcast-and-show-recommendations"),
    PODCAST_COMMENTS_REPLIES("notify-comments-replies"),
    PODCAST_COMMENTS_REACTIONS("notify-comments-reactions"),
    /* JADX INFO: Fake field, exist only in values array */
    LIVESTREAM_VIRTUAL_EVENTS("notify-livestream-and-virtual-events"),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURES_AND_TIPS("notify-spotify-features-and-tips"),
    /* JADX INFO: Fake field, exist only in values array */
    SURVEYS("notify-surveys"),
    /* JADX INFO: Fake field, exist only in values array */
    NEWS_AND_CULTURAL_MOMENTS("notify-news-and-cultural-moments"),
    /* JADX INFO: Fake field, exist only in values array */
    ARTIST_CREATOR_MERCHANDISE("notify-artist-and-creator-merchandise"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIOBOOKS("notify-audiobooks"),
    JAM("notify-jam"),
    MESSAGES("notify-messages"),
    PROMPTED_EXPERIENCES("notify-prompted-experiences");

    public static final /* synthetic */ t0z i;
    public final String a;

    static {
        i = new t0z(mmq0VarArr);
    }

    public mmq0(String str) {
        super(str, i);
        this.a = str;
    }

    public static mmq0 valueOf(String str) {
        return (mmq0) Enum.valueOf(mmq0.class, str);
    }

    public static mmq0[] values() {
        return (mmq0[]) h.clone();
    }
}

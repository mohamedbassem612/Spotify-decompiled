package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF7' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lfx {
    public static final ypa c;
    public static final /* synthetic */ lfx[] d;
    public static final /* synthetic */ t0z e;
    public final String a;
    public final hux b;

    /* JADX INFO: Fake field, exist only in values array */
    lfx EF7;

    static {
        ilx ilxVar = ilx.c;
        lfx[] lfxVarArr = {new lfx("Unknown", 0, "Unknown", ilxVar), new lfx("Offline", 1, "Offline", mpx.c), new lfx("Dj", 2, "Dj", smx.c), new lfx("GroupSession", 3, "GroupSession", tnx.c), new lfx("Video", 4, "Video", xtx.c), new lfx("Soundwave", 5, "Soundwave", ssx.c), new lfx("CheckAltFill", 6, "CheckAltFill", klx.c), new lfx("Check", 7, "Check", ilxVar), new lfx("Shuffle", 8, "Shuffle", gsx.c), new lfx("Download", 9, "Download", tmx.c), new lfx("AdFree", 10, "AdFree", ojx.c), new lfx("Headphones", 11, "Headphones", unx.c), new lfx("Group", 12, "Group", rnx.c), new lfx("Enhance", 13, "Enhance", zmx.c), new lfx("Tune", 14, "Tune", ptx.c), new lfx("SpotifyLogo", 15, "SpotifyLogo", wsx.c), new lfx("Audiobook", 16, "Audiobook", pkx.c)};
        d = lfxVarArr;
        e = new t0z(lfxVarArr);
        c = new ypa((byte) 9, false);
    }

    public lfx(String str, int i, String str2, hux huxVar) {
        super(str, i);
        this.a = str2;
        this.b = huxVar;
    }

    public static lfx valueOf(String str) {
        return (lfx) Enum.valueOf(lfx.class, str);
    }

    public static lfx[] values() {
        return (lfx[]) d.clone();
    }
}

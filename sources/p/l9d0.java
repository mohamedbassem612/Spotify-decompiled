package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l9d0 extends m9d0 {
    public static final l9d0 b = new l9d0(0);
    public static final l9d0 c = new l9d0(1);
    public static final l9d0 d = new l9d0(2);
    public static final l9d0 e = new l9d0(3);
    public static final l9d0 f = new l9d0(4);
    public final /* synthetic */ byte a;

    public /* synthetic */ l9d0(byte b2) {
        this.a = b2;
    }

    public final String a() {
        switch (this.a) {
            case 0:
                return "access";
            case 1:
                return "modify_publish_setting";
            case 2:
                return "modify_view_setting";
            case 3:
                return "publish";
            default:
                return "view";
        }
    }
}

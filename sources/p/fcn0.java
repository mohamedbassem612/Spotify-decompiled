package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fcn0 extends m9d0 {
    public static final fcn0 b = new fcn0(0);
    public static final fcn0 c = new fcn0(1);
    public static final fcn0 d = new fcn0(2);
    public static final fcn0 e = new fcn0(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ fcn0(byte b2) {
        this.a = b2;
    }

    public final String a() {
        switch (this.a) {
            case 0:
                return "discover";
            case 1:
                return "modifyDisableMusicVideos";
            case 2:
                return "queue";
            default:
                return "view";
        }
    }
}

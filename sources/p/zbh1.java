package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zbh1 extends m9d0 {
    public static final zbh1 b = new zbh1(0);
    public static final zbh1 c = new zbh1(1);
    public static final zbh1 d = new zbh1(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ zbh1(byte b2) {
        this.a = b2;
    }

    public final String a() {
        switch (this.a) {
            case 0:
                return "add";
            case 1:
                return "edit";
            default:
                return "view";
        }
    }
}

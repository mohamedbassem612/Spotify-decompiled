package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jmv0 implements hmv0 {
    public static final jmv0 b = new jmv0(0);
    public static final jmv0 c = new jmv0(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ jmv0(byte b2) {
        this.a = b2;
    }

    public final boolean a(String str) {
        switch (this.a) {
            case 0:
                return str.equals("spotify:local-files");
            default:
                return str.equals("spotify:collection:podcasts:episodes");
        }
    }
}

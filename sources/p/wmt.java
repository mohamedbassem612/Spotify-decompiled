package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wmt {
    public static final wmt b = new wmt(0);
    public static final wmt c = new wmt(1);
    public static final wmt d = new wmt(2);
    public static final wmt e = new wmt(3);
    public static final wmt f = new wmt(4);
    public final /* synthetic */ byte a;

    public /* synthetic */ wmt(byte b2) {
        this.a = b2;
    }

    public final vmt a(List list) {
        switch (this.a) {
            case 0:
                return new ios((byte) 0);
            case 1:
                return new qz70((byte) 0);
            case 2:
                return new b6j0((byte) 0);
            case 3:
                return new cq41((byte) 0);
            default:
                return new j9c1(list);
        }
    }
}

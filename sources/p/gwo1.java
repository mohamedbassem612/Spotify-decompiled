package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class gwo1 implements lly0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hog1 b;

    public /* synthetic */ gwo1(hog1 hog1Var, byte b) {
        this.a = b;
        this.b = hog1Var;
    }

    public final Object get() {
        byte b = this.a;
        hog1 hog1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return hog1Var.a("FIREBASE_ML_SDK", new bbx("json"), hgx0.a1);
            case 1:
                return hog1Var.a("FIREBASE_ML_SDK", new bbx("proto"), rdx0.Z0);
            case 2:
                return hog1Var.a("FIREBASE_ML_SDK", new bbx("json"), new kum1((byte) 4));
            case 3:
                return hog1Var.a("FIREBASE_ML_SDK", new bbx("proto"), new ism1());
            case 4:
                return hog1Var.a("FIREBASE_ML_SDK", new bbx("json"), new p4n1());
            default:
                return hog1Var.a("FIREBASE_ML_SDK", new bbx("proto"), new f2n1());
        }
    }
}

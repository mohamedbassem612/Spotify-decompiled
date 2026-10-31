package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iuh extends kuh {
    public final /* synthetic */ byte f;
    public final /* synthetic */ muh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iuh(muh muhVar, byte b) {
        super(muhVar);
        this.f = b;
        this.g = muhVar;
    }

    @Override // p.kuh
    public final Object a(int i) {
        byte b = this.f;
        muh muhVar = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return muhVar.k()[i];
            case 1:
                return new luh(muhVar, i);
            default:
                return muhVar.l()[i];
        }
    }
}

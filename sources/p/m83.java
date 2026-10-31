package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m83 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wto b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m83(wto wtoVar, byte b) {
        super(2);
        this.a = b;
        this.b = wtoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        wto wtoVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return wtoVar.f.a;
            default:
                return new jpg0(f6o1.A(new rm0((zob1) obj), null, null, 3), new k83(wtoVar, (byte) 2));
        }
    }
}

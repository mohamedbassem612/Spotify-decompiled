package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class taf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e3f b;
    public final /* synthetic */ ncf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ taf(e3f e3fVar, ncf ncfVar, byte b) {
        super(1);
        this.a = b;
        this.b = e3fVar;
        this.c = ncfVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ncf ncfVar = this.c;
        e3f e3fVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return gxz0.a(e3fVar.c, ncfVar.b, 27);
            default:
                tom tomVar = (tom) obj;
                return tom.a(tomVar, (w4i1) null, (upl) null, (rom) null, lro1.o(tomVar.h, new saf(e3fVar, (byte) 1), new taf(e3fVar, ncfVar, (byte) 0)), (List) null, (nom) null, false, 3967);
        }
    }
}

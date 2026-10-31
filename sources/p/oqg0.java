package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oqg0 extends bgg1 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oqg0(Iterator it, byte b) {
        super(it, (byte) 0);
        this.c = b;
    }

    @Override // p.bgg1
    public final Object a(Object obj) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Map.Entry) obj).getKey();
            default:
                return ((Map.Entry) obj).getValue();
        }
    }
}

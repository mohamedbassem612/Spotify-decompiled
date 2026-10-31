package p;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w9n1 implements ohs0 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ frl1 b;

    public w9n1(frl1 frl1Var, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        this.b = frl1Var;
    }

    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}

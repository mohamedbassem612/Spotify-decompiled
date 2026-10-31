package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x6w0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6w0(ArrayList arrayList, int i, byte b) {
        super(2);
        this.a = b;
        this.b = arrayList;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                kkn.d(arrayList, (b0k) obj, czo1.p(i | 1));
                return rih1.a;
            case 1:
                return Next.h(new km71(arrayList, i));
            default:
                return First.b(new km71(arrayList, i));
        }
    }
}

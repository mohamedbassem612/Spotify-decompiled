package p;

import android.util.LruCache;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xoa extends LruCache {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoa(koh0 koh0Var) {
        super(20);
        this.b = koh0Var;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Object obj4 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uoa uoaVar = (uoa) obj2;
                if (uoaVar != null) {
                    ((yoa) obj4).d(uoaVar, z);
                }
                break;
            default:
                Integer num = (Integer) obj;
                if (z) {
                    ArrayList arrayList = (ArrayList) ((koh0) obj4).g;
                    zod.s(arrayList);
                    arrayList.add(num);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoa(yoa yoaVar, int i) {
        super(i);
        this.b = yoaVar;
    }
}

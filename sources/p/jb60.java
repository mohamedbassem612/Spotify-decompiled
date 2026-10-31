package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jb60 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb60(ArrayList arrayList, byte b) {
        super(0);
        this.a = b;
        this.b = arrayList;
    }

    public final Object invoke() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Integer.valueOf(arrayList.size());
            default:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).dispose();
                }
                return rih1.a;
        }
    }
}

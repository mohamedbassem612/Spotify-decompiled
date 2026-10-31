package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a1e extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1e(List list, byte b) {
        super(0);
        this.a = b;
        this.b = list;
    }

    public final Object invoke() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Integer.valueOf(list.size());
            case 1:
                return Integer.valueOf(list.size());
            case 2:
                return f220.a(list);
            case 3:
                list.clear();
                return rih1.a;
            default:
                return new px2(list, (Locale) null);
        }
    }
}

package p;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hto0 implements jbh0 {
    public final /* synthetic */ byte a;

    public final String description() {
        switch (this.a) {
        }
        return "Match open url intent actions from notifications";
    }

    public final boolean match(Object obj) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                Intent intent = ((js31) obj).a;
                if (!u890.j(intent.getAction(), "OPEN_URL_INTENT_ACTION")) {
                    return false;
                }
                vjq0 vjq0Var = (vjq0) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("push_data", vjq0.class) : intent.getParcelableExtra("push_data"));
                if (vjq0Var == null || (str = vjq0Var.d) == null) {
                    return false;
                }
                Set set = s4b1.f;
                return uic.x(str).c != blc0.o6;
            default:
                Intent intent2 = ((js31) obj).a;
                if (!u890.j(intent2.getAction(), "OPEN_URL_INTENT_ACTION")) {
                    return false;
                }
                vjq0 vjq0Var2 = (vjq0) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent2.getParcelableExtra("push_data", vjq0.class) : intent2.getParcelableExtra("push_data"));
                if (vjq0Var2 == null || (str2 = vjq0Var2.d) == null) {
                    return false;
                }
                Set set2 = s4b1.f;
                return uic.x(str2).c == blc0.o6;
        }
    }
}

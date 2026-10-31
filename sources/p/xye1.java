package p;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xye1 {
    public final Context a;

    public xye1(Context context) {
        this.a = context;
    }

    public final void a(int i, Object... objArr) {
        int length = objArr.length;
        Context context = this.a;
        (length > 0 ? Toast.makeText(context, context.getString(i, objArr), 1) : Toast.makeText(context, i, 1)).show();
    }
}

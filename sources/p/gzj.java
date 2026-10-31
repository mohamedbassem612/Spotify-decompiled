package p;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gzj implements f4h1, ihr0 {
    public final j2i a;
    public final ArrayList b;
    public final jc9 c;
    public final ComposeView d;

    static {
        int i = ComposeView.P0;
    }

    public gzj(Context context, int i, j2i j2iVar) {
        this.a = j2iVar;
        this.b = new ArrayList();
        this.c = new jc9(this, (byte) 23);
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        hrr0 hrr0VarQ = v8r.q((Object) null);
        composeView.setTag(2131428151, hrr0VarQ);
        composeView.setId(i);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(new j2i(-225733533, new fzj(this, hrr0VarQ, composeView), true));
        this.d = composeView;
    }

    public final boolean b(ehr0 ehr0Var) {
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((fhr0) it.next()).a(ehr0Var)) {
                return true;
            }
        }
        return false;
    }

    public final Object getView() {
        return this.d;
    }

    public final void start() {
    }

    public final void stop() {
    }

    public /* synthetic */ gzj(Context context, j2i j2iVar) {
        this(context, 2131428155, j2iVar);
    }
}

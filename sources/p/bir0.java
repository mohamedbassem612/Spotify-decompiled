package p;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bir0 implements cf41 {
    public final dcr0 a;
    public final b6r0 b;
    public final ezc c;
    public final Context d;
    public final ViewGroup e;

    public bir0(dcr0 dcr0Var, b6r0 b6r0Var, ezc ezcVar, Context context, ViewGroup viewGroup) {
        this.a = dcr0Var;
        this.b = b6r0Var;
        this.c = ezcVar;
        this.d = context;
        this.e = viewGroup;
    }

    public final Object a(Object obj) {
        Bundle bundle = (Bundle) obj;
        return new air0(this.a, this.b.l, this.c, (mr20) null, this.d, this.e, bundle, (x8c0) null, 136);
    }

    public final Object b(id41 id41Var, Object obj) {
        return ((air0) obj).d();
    }
}

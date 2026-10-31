package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qdv0 implements rsw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ qdv0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final isw a(Context context, ViewGroup viewGroup, lsw lswVar, iu30 iu30Var) {
        switch (this.a) {
            case 0:
                return new ttw(context, ((kt11) this.b).d1.a(context, viewGroup, lswVar, iu30Var), (osw) this.c, lswVar, iu30Var);
            default:
                return new wc3(context, viewGroup, this, iu30Var);
        }
    }
}

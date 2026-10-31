package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hqd0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gjf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hqd0(gjf1 gjf1Var, byte b) {
        super(1);
        this.a = b;
        this.b = gjf1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gjf1 gjf1Var = this.b;
        switch (b) {
            case 0:
                return gjf1Var.c;
            default:
                Resources resources = (Resources) obj;
                String str = gjf1Var.d;
                if (ihc1.y0(str)) {
                    str = null;
                }
                return str == null ? o7h.y0(t2p1.k(gjf1Var.k), resources.getString(2131956633), (String) null, (String) null, (iu30) null, 62) : str;
        }
    }
}

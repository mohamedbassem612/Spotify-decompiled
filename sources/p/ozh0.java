package p;

import android.text.TextUtils;
import androidx.media3.session.legacy.MediaDescriptionCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ozh0 implements d0i0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e0i0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ozh0(e0i0 e0i0Var, Object obj, byte b) {
        this.a = b;
        this.b = e0i0Var;
        this.c = obj;
    }

    public final void a(ixh0 ixh0Var) {
        byte b = this.a;
        Object obj = this.c;
        e0i0 e0i0Var = this.b;
        switch (b) {
            case 0:
                esz0 esz0Var = (esz0) obj;
                fzh0 fzh0Var = e0i0Var.d;
                fzh0Var.C();
                if (fzh0Var.t.h1() != null) {
                    fzh0Var.e.a(fzh0Var.A(ixh0Var), esz0Var);
                    break;
                }
                break;
            case 1:
                fzh0 fzh0Var2 = e0i0Var.d;
                fzh0Var2.C();
                ((udh) obj).g(fzh0Var2.t);
                break;
            default:
                String mediaId = ((MediaDescriptionCompat) obj).getMediaId();
                if (TextUtils.isEmpty(mediaId)) {
                    oon1.H("onRemoveQueueItem(): Media ID shouldn't be null");
                } else {
                    fzh0 fzh0Var3 = e0i0Var.d;
                    fzh0Var3.C();
                    ffu0 ffu0Var = fzh0Var3.t;
                    if (ffu0Var.Y(17)) {
                        sqe1 sqe1VarD0 = ffu0Var.d0();
                        oqe1 oqe1Var = new oqe1();
                        for (int i = 0; i < sqe1VarD0.o(); i++) {
                            if (TextUtils.equals(sqe1VarD0.n(i, oqe1Var, 0L).c.a, mediaId)) {
                                ffu0Var.F(i);
                            }
                        }
                    } else {
                        oon1.H("Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    }
                }
                break;
        }
    }
}

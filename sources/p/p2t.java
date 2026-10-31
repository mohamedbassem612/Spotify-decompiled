package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p2t implements pxc {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public Object d;

    public p2t(x6o0 x6o0Var, ycc1 ycc1Var, i5w i5wVar) {
        this.b = x6o0Var;
        this.c = ycc1Var;
        this.d = i5wVar;
    }

    public final void b(ki0 ki0Var, Long l, String str, String str2) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                this.d = new o2t(ki0Var, l, str, str2);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961334});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                ((kt91) obj).k(new er91((fs91) null, "", 2131961334, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                ((x6o0) this.b).s(ki0Var, l, str, str2);
                ((ycc1) obj).l(ki0Var, new dr91(this, (byte) 27));
                break;
        }
    }

    public p2t(pxc pxcVar, kt91 kt91Var) {
        this.b = pxcVar;
        this.c = kt91Var;
    }
}

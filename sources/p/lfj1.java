package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lfj1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lfj1(Object obj, Object obj2, String str, byte b) {
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((mfj1) obj2).d.invoke(new uej1(this.b, (String) obj));
                break;
            default:
                w9i1 w9i1Var = (w9i1) obj2;
                fn31.T(ack1.a(w9i1Var), w9i1Var.d, 0, new xoh1(w9i1Var, this.b, (qx10) obj, (lnm) null, (byte) 3), 2);
                break;
        }
    }
}

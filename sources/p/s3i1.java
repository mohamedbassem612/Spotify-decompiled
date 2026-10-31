package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s3i1 implements Handler.Callback {
    public final Handler a;
    public final Context b;
    public final Uri c;
    public final xye1 d;
    public final rku e;

    public s3i1(Context context, g341 g341Var, Uri uri, xye1 xye1Var) {
        Handler handler = new Handler(this);
        this.a = handler;
        rku rkuVar = new rku();
        this.e = rkuVar;
        this.b = context;
        this.c = uri;
        this.d = xye1Var;
        rkuVar.b(g341Var.b(uri).subscribe(new fv5(this, (byte) 29)));
        handler.sendEmptyMessageDelayed(1, 500L);
        handler.sendEmptyMessageDelayed(2, 5000L);
    }

    public final void a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        this.b.startActivity(intent);
        this.e.a();
        Handler handler = this.a;
        handler.removeMessages(1);
        handler.removeMessages(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.d.a(2131963277, new Object[0]);
            return true;
        }
        if (i != 2) {
            return false;
        }
        a(this.c);
        return true;
    }
}

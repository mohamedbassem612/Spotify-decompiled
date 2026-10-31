package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d37 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public static final d37 b = new d37(0);
    public static final d37 c = new d37(1);
    public static final d37 d = new d37(2);
    public static final d37 e = new d37(3);
    public static final d37 f = new d37(4);
    public static final d37 g = new d37(5);
    public static final d37 h = new d37(6);
    public static final d37 i = new d37(7);
    public static final d37 t = new d37(8);
    public static final d37 X = new d37(9);
    public static final d37 Y = new d37(10);
    public static final d37 Z = new d37(11);

    public /* synthetic */ d37(byte b2) {
        this.a = b2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        switch (this.a) {
            case 10:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(nik1.b2.a));
                intent.setFlags(268435456);
                if (view != null && (context = view.getContext()) != null) {
                    context.startActivity(intent);
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }
}

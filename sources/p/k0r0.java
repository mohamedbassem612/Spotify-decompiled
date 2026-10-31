package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k0r0 implements gs31 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ru9 b;

    public /* synthetic */ k0r0(ru9 ru9Var, byte b) {
        this.a = b;
        this.b = ru9Var;
    }

    public final void a(Intent intent, th61 th61Var) {
        byte b = this.a;
        ru9 ru9Var = this.b;
        switch (b) {
            case 0:
                ((mwn0) ru9Var.d).f(new yrn0((ou80) null));
                ((w0r0) ru9Var.b).a();
                break;
            case 1:
                ((mwn0) ru9Var.d).f(new yrn0((ou80) null));
                ((w0r0) ru9Var.b).f();
                break;
            case 2:
                ((mwn0) ru9Var.d).f(new yrn0((ou80) null));
                ((w0r0) ru9Var.b).m();
                break;
            case 3:
                ((ywn0) ru9Var.c).c();
                break;
            case 4:
                ((mwn0) ru9Var.d).f(new yrn0((ou80) null));
                blc0 blc0VarT = ila0.t(intent, "link_type", blc0.class);
                if (blc0VarT != null) {
                    ((ywn0) ru9Var.c).d(blc0VarT);
                }
                break;
            default:
                ((mwn0) ru9Var.d).f(new yrn0((ou80) null));
                String stringExtra = intent.getStringExtra("uri_type");
                if (stringExtra != null) {
                    c7b1 c7b1Var = (c7b1) d7b1.b.get();
                    if (c7b1Var == null) {
                        c7b1Var = (c7b1) d7b1.a.getValue();
                    }
                    b3i1 b3i1Var = (b3i1) c7b1Var.b.get(stringExtra);
                    if (b3i1Var != null) {
                        ((ywn0) ru9Var.c).b(b3i1Var);
                    }
                }
                break;
        }
    }
}

package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qu9 implements gs31 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it80 b;

    public /* synthetic */ qu9(it80 it80Var, byte b) {
        this.a = b;
        this.b = it80Var;
    }

    public final void a(Intent intent, th61 th61Var) {
        byte b = this.a;
        b72 b72Var = this.b;
        switch (b) {
            case 0:
                zwg zwgVar = (zwg) ((ru9) b72Var).d;
                String stringExtra = intent.getStringExtra("fragment_key");
                ug30 ug30VarC = ((mmo) zwgVar.d).c();
                if (ug30VarC instanceof ug30) {
                    if (stringExtra == null || stringExtra.equals(ug30VarC.s())) {
                        ((mwn0) zwgVar.e).f(new yrn0((ou80) null));
                        ((pwn0) zwgVar.b).f();
                        if (!((rsn0) zwgVar.c).g()) {
                            ((dg30) zwgVar.a).finish();
                        }
                    }
                }
                break;
            case 1:
                ((ywn0) ((ru9) b72Var).c).c();
                break;
            case 2:
                blc0 blc0VarT = ila0.t(intent, "link_type", blc0.class);
                if (blc0VarT != null) {
                    ((ywn0) ((ru9) b72Var).c).d(blc0VarT);
                }
                break;
            case 3:
                String stringExtra2 = intent.getStringExtra("uri_type");
                if (stringExtra2 != null) {
                    c7b1 c7b1Var = (c7b1) d7b1.b.get();
                    if (c7b1Var == null) {
                        c7b1Var = (c7b1) d7b1.a.getValue();
                    }
                    b3i1 b3i1Var = (b3i1) c7b1Var.b.get(stringExtra2);
                    if (b3i1Var != null) {
                        ((ywn0) ((ru9) b72Var).c).b(b3i1Var);
                    }
                }
                break;
            default:
                fn31.T(cto1.q(krw0.i), (o8n) null, 0, new awe(b72Var, (lnm) null, (byte) 7), 3);
                break;
        }
    }
}

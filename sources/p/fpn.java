package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fpn implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gpn b;

    public /* synthetic */ fpn(gpn gpnVar, byte b) {
        this.a = b;
        this.b = gpnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        gpn gpnVar = this.b;
        switch (b) {
            case 0:
                mtx0 mtx0Var = gpnVar.V1;
                i8h1 i8h1Var = mtx0Var.a;
                x6h1 x6h1VarC = mtx0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("create_playlist_error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                mtx0 mtx0Var2 = gpnVar.V1;
                i8h1 i8h1Var2 = mtx0Var2.a;
                x6h1 x6h1VarC3 = mtx0Var2.b.b.c();
                x6h1VarC3.i.add(new a7h1("create_playlist_error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                gpnVar.N0().e0().i0(mno1.h(new mmr0[]{new mmr0("create_playlist_failure_fragment_result_key", epn.a)}), "req_create_playlist_failure_fragment_key");
                break;
        }
    }
}

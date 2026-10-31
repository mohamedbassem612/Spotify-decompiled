package p;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qfm implements DialogInterface.OnKeyListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t2u b;

    public /* synthetic */ qfm(t2u t2uVar, byte b) {
        this.a = b;
        this.b = t2uVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        byte b = this.a;
        u0a1 u0a1Var = this.b;
        switch (b) {
            case 0:
                rfm rfmVar = (rfm) u0a1Var;
                if (i == 111 && keyEvent.getAction() == 0) {
                    i8h1 i8h1VarR1 = rfmVar.r1();
                    ynb0 ynb0Var = rfmVar.i2;
                    if (ynb0Var == null) {
                        u890.C("eventFactory");
                        throw null;
                    }
                    i3l0 i3l0Var = (i3l0) ynb0Var.get();
                    i3l0Var.getClass();
                    x6h1 x6h1VarC = i3l0Var.a.c();
                    x6h1VarC.i.add(new a7h1("sheet", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    b7x b7xVar = b7x.a;
                    rfmVar.q1().e(new yrn0(i8h1VarR1.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                }
                return false;
            case 1:
                zzs zzsVarI1 = ((j421) u0a1Var).i1();
                keyEvent.getClass();
                return zzsVarI1.c.a(keyEvent, "volume_on_key_down_remote_volume_widget", new vas(zzsVarI1, (byte) 22));
            default:
                if (i == 4) {
                    u0a1Var.g2.invoke(s0a1.a);
                }
                return false;
        }
    }
}

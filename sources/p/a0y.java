package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a0y implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b0y b;

    public /* synthetic */ a0y(b0y b0yVar, byte b) {
        this.a = b;
        this.b = b0yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b0y b0yVar = this.b;
        switch (b) {
            case 0:
                m4c0 m4c0Var = b0yVar.Z1;
                if (m4c0Var != null) {
                    m4c0Var.invoke();
                }
                b0yVar.Z0(false, false);
                break;
            default:
                m4c0 m4c0Var2 = b0yVar.Y1;
                if (m4c0Var2 != null) {
                    m4c0Var2.invoke();
                }
                b0yVar.Z0(false, false);
                break;
        }
    }
}

package p;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public class zog {
    public boolean a;
    public final int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public zog(boolean z, int i, q8n q8nVar, q8n q8nVar2, qo71 qo71Var, dmr dmrVar, ltf1 ltf1Var, yqg yqgVar, drj0 drj0Var) {
        this.a = z;
        this.b = i;
        this.c = q8nVar;
        this.d = q8nVar2;
        this.e = qo71Var;
        this.f = dmrVar;
        this.g = ltf1Var;
        this.h = yqgVar;
        this.i = drj0Var;
    }

    public p7s0 a() {
        p7s0 p7s0VarC = c();
        p7s0VarC.setCancelable(true);
        p7s0VarC.setOnCancelListener((vqt0) this.h);
        p7s0VarC.setOnDismissListener((DialogInterface.OnDismissListener) this.i);
        b3u b3uVar = new b3u(p7s0VarC.getContext(), this.a);
        CharSequence charSequence = (CharSequence) this.f;
        if (charSequence != null) {
            t230 t230Var = new t230(this, p7s0VarC);
            b3uVar.Q0 = charSequence;
            b3uVar.R0 = t230Var;
            b3uVar.g.setVisibility(0);
            b3uVar.d.setVisibility(8);
            b3uVar.c.setVisibility(8);
            if (b3uVar.Q0 != null) {
                Button button = b3uVar.e;
                button.setVisibility(0);
                b3uVar.f.setVisibility(8);
                button.setText(b3uVar.Q0);
                button.setOnClickListener(b3uVar.R0);
                b3uVar.a = button;
                b3uVar.b = null;
            }
        }
        CharSequence charSequence2 = (CharSequence) this.d;
        if (charSequence2 != null) {
            b3uVar.setTitle(charSequence2);
        }
        CharSequence charSequence3 = (CharSequence) this.e;
        if (charSequence3 != null) {
            b3uVar.setBody(charSequence3);
        }
        b3uVar.getNegativeButton();
        b3uVar.getPositiveButton();
        p7s0VarC.setContentView(b3uVar);
        return p7s0VarC;
    }

    public Object b(mey0 mey0Var, hob1 hob1Var, tqw tqwVar, Long l, lcm lcmVar) {
        ytp0 ytp0Var = (ytp0) this.f;
        String str = mey0Var.d;
        Object objM = ytp0Var.m(this.a ? mey0Var.c : "", hob1Var.H, tqwVar != null ? n3o1.y(tqwVar) : null, new ela((byte) 3, this, hob1Var, mey0Var, tqwVar, l, (lnm) null), lcmVar);
        return objM == d9n.a ? objM : rih1.a;
    }

    public p7s0 c() {
        return new p7s0((Context) this.c, this.b);
    }

    public zog d() {
        this.e = ((Context) this.c).getResources().getText(2131956886);
        return this;
    }

    public zog e(DialogInterface.OnClickListener onClickListener) {
        this.f = ((Context) this.c).getResources().getText(2131956887);
        this.g = (oad) onClickListener;
        return this;
    }

    public zog f() {
        this.d = ((Context) this.c).getResources().getText(2131956888);
        return this;
    }

    public zog(Context context, int i) {
        this.c = context;
        this.b = i;
    }

    public zog(lzn0 lzn0Var, vgm vgmVar, dnc dncVar, ytp0 ytp0Var, p731 p731Var, boolean z, int i, vu30 vu30Var, vu30 vu30Var2) {
        this.c = lzn0Var;
        this.d = vgmVar;
        this.e = dncVar;
        this.f = ytp0Var;
        this.g = p731Var;
        this.a = z;
        this.b = i;
        this.h = vu30Var;
        this.i = vu30Var2;
    }
}

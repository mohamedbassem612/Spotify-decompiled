package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mq80 extends e711 {
    public final /* synthetic */ byte U0 = 1;
    public final Object V0;
    public final Object W0;

    public mq80(ViewGroup viewGroup, n4b n4bVar) {
        View viewL = eqq.l(viewGroup, 2131625050, viewGroup, false);
        viewL.getClass();
        bti1 bti1Var = new bti1(viewL);
        viewL.setTag(2131429011, bti1Var);
        super(viewL);
        this.V0 = bti1Var;
        this.W0 = n4bVar;
    }

    public final void E(int i, Object obj) {
        byte b = this.U0;
        Object obj2 = this.V0;
        switch (b) {
            case 0:
                m0d m0dVar = (m0d) obj;
                bti1 bti1Var = (bti1) obj2;
                bti1Var.b.setText(m0dVar.c);
                bti1Var.c.setText(l1d.m("\u200e", m0dVar.b));
                ((w611) this).a.setOnClickListener(new cg1(this, m0dVar, (byte) 16));
                break;
            default:
                ImageView imageView = (ImageView) this.W0;
                String strR = l4o1.r((ContextTrack) obj);
                if (strR != null) {
                    ixg ixgVarF = ((gw70) obj2).f(strR);
                    ixgVarF.l(2131233988);
                    ixgVarF.s(new kcg());
                    ixgVarF.k(imageView, (ird1) null);
                } else {
                    imageView.setImageResource(2131233988);
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mq80(LayoutInflater layoutInflater, ViewGroup viewGroup, gw70 gw70Var) {
        View viewInflate = layoutInflater.inflate(2131625334, viewGroup, false);
        super(viewInflate);
        this.V0 = gw70Var;
        this.W0 = (ImageView) viewInflate.findViewById(2131429612);
    }
}

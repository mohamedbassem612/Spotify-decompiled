package p;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.highlightsstats.statsdetails.uiusecases.bubblegraph.BubbleView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gac extends ConstraintLayout {
    public final fac[] T0;
    public List U0;

    /* JADX WARN: Multi-variable type inference failed */
    public gac(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        this.U0 = z6x.a;
        View.inflate(context, 2131624302, this);
        this.T0 = new fac[]{new fac((TextView) b8k1.n(this, 2131429716), (TextView) b8k1.n(this, 2131431287), (BubbleView) b8k1.n(this, 2131427831)), new fac((TextView) b8k1.n(this, 2131429719), (TextView) b8k1.n(this, 2131431292), (BubbleView) b8k1.n(this, 2131427833)), new fac((TextView) b8k1.n(this, 2131429718), (TextView) b8k1.n(this, 2131431291), (BubbleView) b8k1.n(this, 2131427832)), new fac((TextView) b8k1.n(this, 2131429713), (TextView) b8k1.n(this, 2131431277), (BubbleView) b8k1.n(this, 2131427830))};
    }

    public final List<eac> getBubbleData() {
        return this.U0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBubbleData(List<eac> list) {
        float f;
        this.U0 = list;
        kil kilVar = new kil();
        kilVar.f(this);
        List list2 = this.U0;
        fac[] facVarArr = this.T0;
        int length = facVarArr.length;
        ArrayList<mmr0> arrayList = new ArrayList(Math.min(q7h.U(list2, 10), length));
        int i = 0;
        for (Object obj : list2) {
            if (i >= length) {
                break;
            }
            arrayList.add(new mmr0(obj, facVarArr[i]));
            i++;
        }
        for (mmr0 mmr0Var : arrayList) {
            eac eacVar = (eac) mmr0Var.a;
            fac facVar = (fac) mmr0Var.b;
            int iC = l1d.C(eacVar.c);
            if (iC == 0) {
                f = 0.17f;
            } else if (iC == 1) {
                f = 0.21f;
            } else if (iC == 2) {
                f = 0.26f;
            } else {
                if (iC != 3) {
                    eg.o();
                    return;
                }
                f = 0.36f;
            }
            BubbleView bubbleView = facVar.c;
            TextView textView = facVar.b;
            bubbleView.setBubbleColors(new kac(Color.parseColor(eacVar.d), uah.l(Color.parseColor(eacVar.e), 127)));
            kilVar.l(bubbleView.getId()).e.V = f;
            if (eacVar.c == 4) {
                kilVar.l(bubbleView.getId()).c.d = 1.0f;
                textView.setTextAppearance(getContext(), 2132018024);
            } else {
                kilVar.l(bubbleView.getId()).c.d = 0.3f;
            }
            textView.setText(eacVar.b);
            facVar.a.setText(eacVar.a);
        }
        kilVar.b(this);
    }
}

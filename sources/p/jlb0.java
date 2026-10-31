package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jlb0 extends hab0 implements iu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlb0(int i, int i2) {
        super(1);
        this.a = i;
        this.b = i2;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        qhl qhlVar = (qhl) obj;
        if (this.a == 0) {
            qhlVar.setMargins(this.b, ((ViewGroup.MarginLayoutParams) qhlVar).topMargin, ((ViewGroup.MarginLayoutParams) qhlVar).rightMargin, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin);
        }
        return rih1.a;
    }
}

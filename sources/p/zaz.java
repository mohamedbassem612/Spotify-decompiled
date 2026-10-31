package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class zaz extends FrameLayout implements tlv {
    public yaz a;
    public final idd1 b;

    public zaz(Context context) {
        super(context, null, 0);
        this.b = new idd1(new pdy(this, (byte) 11));
    }

    private final View getQuickActionView() {
        return (View) this.b.getValue();
    }

    public View a() {
        return new AddToButtonView(getContext(), null, 0, 6, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        view.setDuplicateParentStateEnabled(true);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void f(yaz yazVar) {
        removeAllViews();
        addView(getQuickActionView());
        this.a = yazVar;
        setEnabled(yazVar.a());
        Object objInvoke = getActionModelExtractor().invoke(yazVar);
        getQuickActionView().f(objInvoke);
        c(getQuickActionView(), objInvoke);
    }

    public abstract iu30 getActionModelExtractor();

    public final void n(iu30 iu30Var) {
        getQuickActionView().setOnClickListener(new cvr(iu30Var, this, (byte) 26));
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        getQuickActionView().setPadding(i, i2, i3, i4);
    }

    public void c(View view, Object obj) {
    }
}

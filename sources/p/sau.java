package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sau implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sau(View view, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = view;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        View view2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                rwq0.s((ViewGroup) view2, new nzd((gmt) obj, (tau) obj3, (Context) obj2, view));
                break;
            default:
                ((hdn0) obj3).t(view2.getBottom());
                ((hdn0) obj2).t(((View) obj).getTop());
                break;
        }
    }
}

package p;

import android.content.Context;
import android.view.ViewGroup;
import app.p000rive.runtime.kotlin.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xh31 extends ViewGroup {
    public final byte a;
    public final ArrayList b;
    public final ArrayList c;
    public final dc31 d;
    public int e;

    public xh31(Context context) {
        super(context);
        this.a = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new dc31((byte) 1);
        setClipChildren(false);
        yh31 yh31Var = new yh31(context);
        addView(yh31Var);
        arrayList.add(yh31Var);
        arrayList2.add(yh31Var);
        this.e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

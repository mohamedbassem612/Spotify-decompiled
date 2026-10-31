package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v4x extends FrameLayout {
    public static final Set e = Collections.singleton("👪");
    public final View a;
    public final List b;
    public final LinearLayout c;
    public final k9 d;

    public v4x(Context context, View view, p5x p5xVar, p4x p4xVar) {
        k9 t4xVar;
        super(context, null, 0);
        this.a = view;
        List list = p5xVar.b;
        this.b = list;
        String str = p5xVar.a;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, 2131626293, null).findViewById(2131431566);
        this.c = linearLayout;
        int iOrdinal = getLayout().ordinal();
        if (iOrdinal == 0) {
            t4xVar = new t4x(context, view, list, linearLayout, p4xVar, (byte) 1);
        } else if (iOrdinal == 1) {
            t4xVar = new t4x(context, view, list, linearLayout, p4xVar, (byte) 0);
        } else if (iOrdinal == 2) {
            t4xVar = new s4x(context, view, list, linearLayout, p4xVar, str);
        } else {
            if (iOrdinal != 3) {
                eg.o();
                throw null;
            }
            t4xVar = new q4x(context, view, list, linearLayout, p4xVar);
        }
        this.d = t4xVar;
        t4xVar.v0();
        t4xVar.w0();
        t4xVar.u0();
        addView(linearLayout);
    }

    private final u4x getLayout() {
        List list = this.b;
        if (list.size() == 26) {
            return e.contains(list.get(0)) ? u4x.b : u4x.c;
        }
        return list.size() == 36 ? u4x.d : u4x.a;
    }

    public final int getPopupViewHeight() {
        int height = this.a.getHeight() * this.d.T0();
        LinearLayout linearLayout = this.c;
        return linearLayout.getPaddingBottom() + linearLayout.getPaddingTop() + height;
    }

    public final int getPopupViewWidth() {
        int width = this.a.getWidth() * this.d.S0();
        LinearLayout linearLayout = this.c;
        return linearLayout.getPaddingEnd() + linearLayout.getPaddingStart() + width;
    }
}

package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t10 extends rf {
    public final ViewGroup a;
    public List b;
    public boolean c;
    public final s10 d = new s10(this, (byte) 0);

    public t10(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(View view) {
        CharSequence contentDescription;
        if (!view.isEnabled() || view.getVisibility() != 0) {
            return;
        }
        if (view.hasOnClickListeners() && (contentDescription = view.getContentDescription()) != null && (!ihc1.y0(contentDescription)) && view.getVisibility() == 0 && view.isClickable() && view.isEnabled()) {
            b8k1.a(this.a, view.getContentDescription(), new r10(view));
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                a(childAt);
                i = i2;
            }
        }
    }

    public final void b(List list) {
        this.b = list;
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.post(this.d);
    }
}

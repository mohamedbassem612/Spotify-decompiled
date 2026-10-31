package p;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bml extends z511 {
    public final /* synthetic */ byte d;
    public boolean e;
    public boolean f;
    public final Object g;
    public Object h;

    public bml() {
        this.d = (byte) 0;
        this.g = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        sparseArray.put(1, new eg1(null, (byte) 1));
        sparseArray.put(6, new omc0((byte) 2));
        sparseArray.put(2, new eg1(null, (byte) 5));
        sparseArray.put(3, new eg1(null, (byte) 6));
        sparseArray.put(4, new eg1(null, (byte) 3));
        sparseArray.put(5, new eg1(null, (byte) 4));
        sparseArray.put(7, new eg1(null, (byte) 0));
        sparseArray.put(8, new eg1(null, (byte) 2));
    }

    public final int e() {
        switch (this.d) {
            case 0:
                return ((ArrayList) this.g).size();
            default:
                return 1;
        }
    }

    public long f(int i) {
        switch (this.d) {
            case 1:
                return ((View) this.g).hashCode();
            default:
                return super.f(i);
        }
    }

    public final int g(int i) {
        byte b = this.d;
        Object obj = this.g;
        switch (b) {
            case 0:
                return ((aik1) ((ArrayList) obj).get(i)).a();
            default:
                return ((View) obj).hashCode();
        }
    }

    public final void n(int i, w611 w611Var) {
        switch (this.d) {
            case 0:
                bik1 bik1Var = (bik1) ((SparseArray) this.h).get(g(i));
                if (bik1Var != null) {
                    bik1Var.b(w611Var, (aik1) ((ArrayList) this.g).get(i));
                }
                break;
            default:
                w611Var.a.setEnabled(this.e);
                break;
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        switch (this.d) {
            case 0:
                return ((bik1) ((SparseArray) this.h).get(i)).a(viewGroup);
            default:
                FrameLayout frameLayout = (FrameLayout) this.h;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
                this.h = frameLayout2;
                boolean z = this.f;
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(z ? -1 : -2, !z ? -1 : -2));
                ((FrameLayout) this.h).addView((View) this.g);
                return new l4x((FrameLayout) this.h);
        }
    }

    public bml(View view, boolean z) {
        this.d = (byte) 1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.g = view;
        view.setLayoutParams(layoutParams);
        this.e = z;
        x(true);
        this.f = true;
    }
}

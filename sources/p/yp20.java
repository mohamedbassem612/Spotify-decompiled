package p;

import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yp20 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public yp20(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.k() && flexboxLayoutManager.V0) {
            this.c = this.e ? flexboxLayoutManager.d1.i() : ((a) flexboxLayoutManager).O0 - flexboxLayoutManager.d1.m();
            return;
        }
        boolean z = this.e;
        dyb0 dyb0Var = flexboxLayoutManager.d1;
        this.c = z ? dyb0Var.i() : dyb0Var.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = os00.INVALID_ID;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        boolean zK = flexboxLayoutManager.k();
        boolean z = flexboxLayoutManager.R0;
        if (zK) {
            if (z == 0) {
                this.e = flexboxLayoutManager.Q0 == 1;
                return;
            } else {
                this.e = z == 2;
                return;
            }
        }
        if (z == 0) {
            this.e = flexboxLayoutManager.Q0 == 3;
        } else {
            this.e = z == 2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.a);
        sb.append(", mFlexLinePosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.d);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.e);
        sb.append(", mValid=");
        sb.append(this.f);
        sb.append(", mAssignedFromSavedState=");
        return f4i1.g(sb, this.g, '}');
    }
}

package p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q4x extends k9 {
    public final Context c;
    public final View d;
    public final List e;
    public final LinearLayout f;
    public final p4x g;
    public boolean h;

    public q4x(Context context, View view, List list, LinearLayout linearLayout, p4x p4xVar) {
        super((byte) 6);
        this.c = context;
        this.d = view;
        this.e = list;
        this.f = linearLayout;
        this.g = p4xVar;
        this.h = true;
        v1();
    }

    @Override // p.k9
    public final Context O0() {
        return this.c;
    }

    @Override // p.k9
    public final View.OnClickListener Q0() {
        return this.g;
    }

    @Override // p.k9
    public final int T0() {
        return ((this.e.size() / 2) / 6) + 1;
    }

    @Override // p.k9
    public final LinearLayout W0() {
        return this.f;
    }

    @Override // p.k9
    public final View X0() {
        return this.d;
    }

    @Override // p.k9
    public final List c1() {
        return this.e;
    }

    @Override // p.k9
    public final void v0() {
        Context context = this.c;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        AppCompatImageView appCompatImageViewFindViewById = View.inflate(context, 2131624562, linearLayout).findViewById(2131428610);
        View view = this.d;
        appCompatImageViewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        this.f.addView(linearLayout);
        AppCompatImageView appCompatImageViewFindViewById2 = linearLayout.findViewById(2131428610);
        appCompatImageViewFindViewById2.setOnClickListener(new p4x(this, appCompatImageViewFindViewById2, (byte) 0));
    }

    public final void v1() {
        int[][] iArr;
        boolean z = this.h;
        List list = this.e;
        if (z) {
            tr80 tr80VarK = p7h.K(list);
            ArrayList arrayList = new ArrayList();
            lr80 it = tr80VarK.iterator();
            while (((sr80) it).c) {
                Object next = it.next();
                if (((Number) next).intValue() % 12 < 6) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) it2.next()).intValue() + 1));
            }
            iArr = new int[][]{o7h.k1(arrayList2)};
        } else {
            tr80 tr80VarK2 = p7h.K(list);
            ArrayList arrayList3 = new ArrayList();
            lr80 it3 = tr80VarK2.iterator();
            while (((sr80) it3).c) {
                Object next2 = it3.next();
                if (((Number) next2).intValue() % 12 >= 6) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(((Number) it4.next()).intValue() + 1));
            }
            iArr = new int[][]{o7h.k1(arrayList4)};
        }
        this.b = iArr;
        int iT0 = T0() - 1;
        int[][] iArr2 = new int[iT0][];
        for (int i = 0; i < iT0; i++) {
            iArr2[i] = new int[6];
        }
        int i2 = 0;
        for (int i3 = 0; i3 < iT0; i3++) {
            for (int i4 = 0; i4 < 6; i4++) {
                if (i2 < Z0()[0].length) {
                    iArr2[i3][i4] = Z0()[0][i2];
                    i2++;
                }
            }
        }
        this.b = iArr2;
    }
}

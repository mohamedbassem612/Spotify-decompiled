package p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t4x extends k9 {
    public static final int[][] i = {new int[]{0, 2, 3, 4, 5, 6}, new int[]{0, 7, 8, 9, 10, 11}, new int[]{0, 12, 13, 14, 15, 16}, new int[]{0, 17, 18, 19, 20, 21}, new int[]{1, 22, 23, 24, 25, 26}};
    public final /* synthetic */ byte c;
    public final Context d;
    public final View e;
    public final List f;
    public final LinearLayout g;
    public final p4x h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4x(Context context, View view, List list, LinearLayout linearLayout, p4x p4xVar, byte b) {
        super((byte) 6);
        this.c = b;
        switch (b) {
            case 1:
                super((byte) 6);
                this.d = context;
                this.e = view;
                this.f = list;
                this.g = linearLayout;
                this.h = p4xVar;
                tr80 tr80VarK = p7h.K(list);
                ArrayList arrayList = new ArrayList(q7h.U(tr80VarK, 10));
                lr80 it = tr80VarK.iterator();
                while (((sr80) it).c) {
                    arrayList.add(Integer.valueOf(it.nextInt() + 1));
                }
                this.b = new int[][]{o7h.k1(arrayList)};
                int iT0 = T0();
                int iS0 = S0();
                int[][] iArr = new int[iT0][];
                for (int i2 = 0; i2 < iT0; i2++) {
                    iArr[i2] = new int[iS0];
                }
                int i3 = 0;
                for (int i4 = 0; i4 < iT0; i4++) {
                    for (int i5 = 0; i5 < iS0; i5++) {
                        if (i3 < Z0()[0].length) {
                            iArr[i4][i5] = Z0()[0][i3];
                            i3++;
                        }
                    }
                }
                this.b = iArr;
                break;
            default:
                this.d = context;
                this.e = view;
                this.f = list;
                this.g = linearLayout;
                this.h = p4xVar;
                this.b = i;
                break;
        }
    }

    @Override // p.k9
    public final Context O0() {
        byte b = this.c;
        return this.d;
    }

    @Override // p.k9
    public final View.OnClickListener Q0() {
        byte b = this.c;
        return this.h;
    }

    @Override // p.k9
    public final int S0() {
        switch (this.c) {
            case 0:
                return i[0].length;
            default:
                return Math.min(6, Z0()[0].length);
        }
    }

    @Override // p.k9
    public final int T0() {
        switch (this.c) {
            case 0:
                return 5;
            default:
                int iS0 = S0();
                List list = this.f;
                return (list.size() / iS0) + (list.size() % iS0 == 0 ? 0 : 1);
        }
    }

    @Override // p.k9
    public final LinearLayout W0() {
        byte b = this.c;
        return this.g;
    }

    @Override // p.k9
    public final View X0() {
        byte b = this.c;
        return this.e;
    }

    @Override // p.k9
    public final List c1() {
        byte b = this.c;
        return this.f;
    }
}

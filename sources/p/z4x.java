package p;

import android.text.format.DateUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z4x extends k611 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ z511 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public z4x(o4x o4xVar, b5x b5xVar, GridLayoutManager gridLayoutManager) {
        this.b = o4xVar;
        this.c = b5xVar;
        this.d = gridLayoutManager;
    }

    public void c(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    recyclerView.announceForAccessibility(this.c.getText());
                }
                break;
        }
    }

    public final void h(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        MaterialButton materialButton = this.c;
        Object obj = this.d;
        c cVar = this.b;
        switch (b) {
            case 0:
                GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
                o4x o4xVar = (o4x) cVar;
                b5x b5xVar = (b5x) materialButton;
                h46 h46Var = b5xVar.i;
                if (h46Var == null) {
                    u890.C("emojiPickerItems");
                    throw null;
                }
                int iC1 = gridLayoutManager.c1();
                int i3 = 0;
                for (lj90 lj90Var : (List) h46Var.b) {
                    if (iC1 < lj90Var.b()) {
                        int i4 = o4xVar.g;
                        if (i3 != i4) {
                            o4xVar.i(i4);
                            o4xVar.i(i3);
                            o4xVar.g = i3;
                        }
                        if (b5xVar.f) {
                            h46 h46Var2 = b5xVar.i;
                            if (h46Var2 == null) {
                                u890.C("emojiPickerItems");
                                throw null;
                            }
                            lj90 lj90Var2 = b5xVar.h;
                            if (lj90Var2 == null) {
                                u890.C("recentItemGroup");
                                throw null;
                            }
                            tr80 tr80VarD = h46Var2.d(lj90Var2);
                            int i5 = ((rr80) tr80VarD).a;
                            int i6 = ((rr80) tr80VarD).b;
                            int iF1 = gridLayoutManager.f1();
                            if (i5 > iF1 || iF1 > i6) {
                                fn31.T(b5xVar.d, null, 0, new y4x(b5xVar, null, (byte) 1), 3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    iC1 -= lj90Var.b();
                    i3++;
                }
                tw20.p();
                return;
            default:
                c cVar2 = cVar;
                vwc vwcVar = cVar2.e;
                zbh0 zbh0Var = (zbh0) obj;
                RecyclerView recyclerView2 = zbh0Var.M1;
                int iF2 = i < 0 ? recyclerView2.getLayoutManager().f1() : recyclerView2.getLayoutManager().h1();
                Calendar calendarA = foi1.a(vwcVar.a.a);
                calendarA.add(2, iF2);
                zbh0Var.I1 = new tjm0(calendarA);
                Calendar calendarA2 = foi1.a(vwcVar.a.a);
                calendarA2.add(2, iF2);
                calendarA2.set(5, 1);
                Calendar calendarA3 = foi1.a(calendarA2);
                calendarA3.get(2);
                calendarA3.get(1);
                calendarA3.getMaximum(7);
                calendarA3.getActualMaximum(5);
                calendarA3.getTimeInMillis();
                ContextThemeWrapper contextThemeWrapper = cVar2.d;
                long timeInMillis = calendarA3.getTimeInMillis();
                materialButton.setText(DateUtils.formatDateTime(contextThemeWrapper, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36));
                return;
        }
    }

    public z4x(zbh0 zbh0Var, c cVar, MaterialButton materialButton) {
        this.d = zbh0Var;
        this.b = cVar;
        this.c = materialButton;
    }
}

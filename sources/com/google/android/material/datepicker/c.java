package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Calendar;
import p.ech0;
import p.eqq;
import p.foi1;
import p.g611;
import p.hhg1;
import p.tjm0;
import p.ujm0;
import p.vwc;
import p.w611;
import p.z511;
import p.zc80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c extends z511 {
    public final ContextThemeWrapper d;
    public final vwc e;
    public final zc80 f;
    public final int g;

    public c(ContextThemeWrapper contextThemeWrapper, vwc vwcVar, zc80 zc80Var) {
        tjm0 tjm0Var = vwcVar.a;
        tjm0 tjm0Var2 = vwcVar.b;
        tjm0 tjm0Var3 = vwcVar.d;
        if (tjm0Var.compareTo(tjm0Var3) > 0) {
            hhg1.n("firstPage cannot be after currentPage");
            throw null;
        }
        if (tjm0Var3.compareTo(tjm0Var2) > 0) {
            hhg1.n("currentPage cannot be after lastPage");
            throw null;
        }
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(2131166586) * ujm0.d;
        int dimensionPixelSize2 = ech0.k1(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(2131166586) : 0;
        this.d = contextThemeWrapper;
        this.g = dimensionPixelSize + dimensionPixelSize2;
        this.e = vwcVar;
        this.f = zc80Var;
        x(true);
    }

    public final int e() {
        return this.e.f;
    }

    public final long f(int i) {
        Calendar calendarA = foi1.a(this.e.a.a);
        calendarA.add(2, i);
        calendarA.set(5, 1);
        Calendar calendarA2 = foi1.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    public final void n(int i, w611 w611Var) {
        b bVar = (b) w611Var;
        vwc vwcVar = this.e;
        Calendar calendarA = foi1.a(vwcVar.a.a);
        calendarA.add(2, i);
        tjm0 tjm0Var = new tjm0(calendarA);
        bVar.U0.setText(tjm0Var.j(((w611) bVar).a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.V0.findViewById(2131429993);
        if (materialCalendarGridView.a() == null || !tjm0Var.equals(materialCalendarGridView.a().a)) {
            new ujm0(tjm0Var, vwcVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) eqq.l(viewGroup, 2131625266, viewGroup, false);
        if (!ech0.k1(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new g611(-1, this.g));
        return new b(linearLayout, true);
    }
}

package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import p.ujm0;
import p.zbh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ c b;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = cVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        ujm0 ujm0VarA = materialCalendarGridView.a();
        if (i < ujm0VarA.a.h() || i > ujm0VarA.b()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((zbh0) this.b.f.b).H1.c.a) {
            throw null;
        }
    }
}

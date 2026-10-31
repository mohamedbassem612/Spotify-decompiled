package p;

import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iav implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ jav a;

    public iav(jav javVar) {
        this.a = javVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        jav javVar = this.a;
        javVar.j = true;
        javVar.l = System.currentTimeMillis();
        javVar.e(false);
    }
}

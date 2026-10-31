package p;

import android.view.View;
import android.widget.AdapterView;
import com.spotify.messaging.messagingplatformdebug.items.PriorityPicker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bow0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ PriorityPicker b;

    public bow0(iu30 iu30Var, PriorityPicker priorityPicker) {
        this.a = iu30Var;
        this.b = priorityPicker;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.invoke(wnw0.valueOf((String) this.b.a.getAdapter().getItem(i)));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.a.invoke(wnw0.DEFAULT);
    }
}

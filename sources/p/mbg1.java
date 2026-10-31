package p;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.spotify.transcript.list.TranscriptListView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mbg1 {
    public final TranscriptListView a;
    public final qj0 b;
    public final ou8 c;
    public final zhy d;
    public final u710 e;
    public final d83 f;
    public final rt01 g;
    public final et90 h;
    public final ldo i;
    public final dfm j;
    public final smp0 k;
    public final xv81 l;
    public final ibf1 m;
    public final boolean n;

    public mbg1(TranscriptListView transcriptListView, qj0 qj0Var, ou8 ou8Var, zhy zhyVar, u710 u710Var, d83 d83Var, rt01 rt01Var, et90 et90Var, ldo ldoVar, dfm dfmVar, smp0 smp0Var, xv81 xv81Var, ibf1 ibf1Var, boolean z) {
        this.a = transcriptListView;
        this.b = qj0Var;
        this.c = ou8Var;
        this.d = zhyVar;
        this.e = u710Var;
        this.f = d83Var;
        this.g = rt01Var;
        this.h = et90Var;
        this.i = ldoVar;
        this.j = dfmVar;
        this.k = smp0Var;
        this.l = xv81Var;
        this.m = ibf1Var;
        this.n = z;
    }

    public final void a(List list, tcd1 tcd1Var, boolean z, int i) {
        this.m.invoke(tcd1Var);
        TranscriptListView transcriptListView = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(transcriptListView.getLayoutParams());
        marginLayoutParams.height = -2;
        marginLayoutParams.topMargin = transcriptListView.getContext().getResources().getDimensionPixelSize(2131167033);
        marginLayoutParams.bottomMargin = transcriptListView.getContext().getResources().getDimensionPixelSize(2131167022);
        ne neVar = new ne(3, new yjb(i, this, list, marginLayoutParams, z, tcd1Var));
        transcriptListView.getContext();
        neVar.f(transcriptListView, new LinearLayoutManager(1), false);
    }
}

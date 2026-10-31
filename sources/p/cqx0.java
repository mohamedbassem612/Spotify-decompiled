package p;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cqx0 {
    public final m021 a;
    public final y11 b;
    public final Observable c;
    public final qxx0 d;
    public final PublishSubject e;
    public final vku f;
    public final r4u g;

    public cqx0(m021 m021Var, y11 y11Var, kiu0 kiu0Var, Observable observable) {
        this.a = m021Var;
        this.b = y11Var;
        this.c = observable;
        qxx0 qxx0Var = new qxx0(new hox0(this, (byte) 2));
        this.d = qxx0Var;
        PublishSubject publishSubject = new PublishSubject();
        this.e = publishSubject;
        this.f = new vku();
        RecyclerView recyclerView = (RecyclerView) m021Var.c;
        recyclerView.getRootView().getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.y1(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(qxx0Var);
        if (kiu0Var.b.c()) {
            recyclerView.m(new zl7(publishSubject, (byte) 12));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ConstraintLayout constraintLayout = (ConstraintLayout) m021Var.b;
            constraintLayout.setAccessibilityPaneTitle(constraintLayout.getContext().getString(2131953706));
        }
        bqx0 bqx0Var = bqx0.b;
        this.g = r4u.c(new r4u[]{r4u.d(new sua((byte) 21), r4u.a(new vgq0(this, (byte) 22)))});
    }
}

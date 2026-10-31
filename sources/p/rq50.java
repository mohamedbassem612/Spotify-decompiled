package p;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.spotify.creativework.v1.Release;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rq50 implements r1v0 {
    public final v5l a;
    public final String b;
    public final lzn0 c;

    public rq50(v5l v5lVar, String str, lzn0 lzn0Var) {
        this.a = v5lVar;
        this.b = str;
        this.c = lzn0Var;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, java.lang.Object, p.dh10] */
    public final yrg0 f(vi11 vi11Var) {
        hv41 hv41Var = new hv41(new oql(this.a.a, new fjl0(this.b, ((Release) vi11Var.b).getUri(), (r6h1) vi11Var.e), (byte) 19));
        Context context = (Context) vi11Var.f;
        ?? dh10Var = new dh10(context);
        dh10Var.setLayoutManager(new LinearLayoutManager(0));
        dh10Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
        dh10Var.setPaddingRelative(iApplyDimension, 0, iApplyDimension, 0);
        dh10Var.setClipToPadding(false);
        dh10Var.setClipChildren(false);
        dh10Var.setHorizontalFadingEdgeEnabled(true);
        dh10Var.setAdapter(hv41Var);
        dh10Var.j(new j1e(context, (byte) 4));
        dh10Var.setContentDescription(context.getString(2131960179));
        dh10Var.setNestedScrollingEnabled(false);
        fn31.T(cto1.q((iac0) vi11Var.d), (o8n) null, 0, new qq50(vi11Var, dh10Var, hv41Var, null, (byte) 1), 3);
        hv41Var.g = new c4z(2, this, rq50.class, "onGuestChipClick", "onGuestChipClick(Lcom/spotify/episodepage/cwpplugins/guestchips/ChipModel;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0, (byte) 12);
        return new yrg0((Object) dh10Var, (byte) 7);
    }
}

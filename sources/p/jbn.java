package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.functions.Consumer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jbn implements h8l {
    public final dsk0 X;
    public final phi0 a;
    public final cir0 b;
    public final EventSource c;
    public final m021 d;
    public final amy0 e;
    public final i8h1 f;
    public final gik1 g;
    public final FrameLayout h;
    public final qxx0 i;
    public Consumer t;

    public jbn(phi0 phi0Var, cir0 cir0Var, EventSource eventSource, m021 m021Var, amy0 amy0Var, i8h1 i8h1Var, gik1 gik1Var) {
        RecyclerView recyclerView = (RecyclerView) phi0Var.d;
        SearchView searchView = (SearchView) phi0Var.e;
        this.a = phi0Var;
        this.b = cir0Var;
        this.c = eventSource;
        this.d = m021Var;
        this.e = amy0Var;
        this.f = i8h1Var;
        this.g = gik1Var;
        FrameLayout frameLayout = (FrameLayout) phi0Var.b;
        this.h = frameLayout;
        Context context = frameLayout.getContext();
        this.X = new dsk0((byte) 5);
        Toolbar toolbar = (Toolbar) phi0Var.f;
        Drawable drawable = context.getDrawable(2131232946);
        if (drawable != null) {
            drawable.mutate().setTint(context.getColor(2131104462));
        } else {
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
        toolbar.setNavigationOnClickListener(new c20(this, (byte) 23));
        searchView.setOnQueryTextFocusChangeListener(new x29(this, (byte) 4));
        searchView.setOnQueryTextListener(new jc9(this, (byte) 29));
        qxx0 qxx0Var = new qxx0(new v7l(this, (byte) 27));
        this.i = qxx0Var;
        recyclerView.setAdapter(qxx0Var);
        recyclerView.m(new zl7(this, (byte) 4));
        i6b i6bVar = new i6b(this, (byte) 20);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(frameLayout, i6bVar);
    }

    public final Connection L(Consumer consumer) {
        this.t = consumer;
        return new ibn(this, this.c.a(new y11(this, (byte) 5)), this.g.a((FrameLayout) this.a.b, new j3m(this, (byte) 20)), (byte) 0);
    }

    public final Object getView() {
        return this.h;
    }

    public final Bundle serialize() {
        return mno1.g();
    }

    public final void start() {
    }

    public final void stop() {
    }
}
